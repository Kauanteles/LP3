public class Date {
    private int day, month, year;

    // date setter
    public void setDate(int day, int month, int year) {
        if (validDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("Error: invalid date!\n");
        }
    }

    // date getters
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // date validation
    private boolean validDate(int insertDay, int insertMonth, int insertYear) {
        if (insertMonth >= 1 && insertMonth <= 12) {
            if ((insertMonth == 2) && ((insertDay >= 1) && (insertDay <= 29))
                    && ((insertYear % 4 == 0) && (insertYear % 100 == 0) && (insertYear % 400 == 0))) {
                return true;
            } else if ((insertMonth == 2) && ((insertDay >= 1) && (insertDay <= 28))) {
                return true;
            } else if (((insertDay >= 1) && (insertDay <= 31)) && ((insertMonth % 2 != 0) || (insertMonth == 8))) {
                return true;
            } else if ((insertDay >= 1) && (insertDay <= 30) && (insertMonth % 2 == 0) && (insertMonth != 8)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void defaultDate() {
        this.day = getDay();
        this.month = getMonth();
        this.year = getYear();
    }

    public boolean isPrevious(Date otherDate) {
        if (validDate(otherDate.day, otherDate.month, otherDate.year)) {
            if (otherDate.year > year) {
                return false;
            } else {
                if (otherDate.year == year && otherDate.month > month) {
                    return false;
                } else {
                    if (otherDate.year == year && otherDate.month == month && otherDate.day > day) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        } else {
            return false;
        }
    }

    public String dayOfWeek(){
        int d = getDay();
        int m = getMonth();
        int y = getYear();
        int k = 0;
        String[] daysWeek = {"Sabado", "Domingo","Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira"};

        if(m == 1){
            k = d + 2 * 13 + (3 * (13 + 1) / 5) + (y - 1) + ((y - 1) / 4) - ((y - 1) / 100) + ((y - 1) / 400) + 2;
        }else if(m == 2){
            k = d + 2 * 14 + (3 * (14 + 1) / 5) + (y - 1) + ((y - 1) / 4) - ((y - 1) / 100) + ((y - 1) / 400) + 2;
        }else{
            k = d + 2 * m + (3 * (m + 1) / 5) + y + (y / 4) - (y / 100) + (y / 400) + 2;
        }

        return daysWeek[k % 7];
    }

    public int amountOfDaysInMonth(int month, int year) {
        if (isLeapYear(year) && month == 2) {
            return 29;
        } else {
            if (month == 2) {
                return 28;
            } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
                    || month == 12) {
                return 31;
            } else
                return 30;
        }
    }

    public boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public int howManyDays(Date otherDate) {
        if (isPrevious(otherDate)) {
            int diffYears = year - otherDate.year;
            int diffMonths;

            if (year > otherDate.year && month < otherDate.month) {
                diffMonths = (12 - otherDate.month) + month;
            } else {
                diffMonths = Math.abs(month - otherDate.month);
            }

            if (diffMonths > 0) {
                diffMonths--;
            }

            if (diffYears > 1) {
                diffYears--;
            }

            if (diffYears == 1 && month < otherDate.month) {
                diffYears--;
            }

            if (year > otherDate.year && month > otherDate.month) {
                diffYears = year - otherDate.year;
            }

            int monthsToDays = 0;
            int z = otherDate.month;
            int k = otherDate.year;

            if (diffMonths == 0) {
                if(year > otherDate.year && month == otherDate.month){
                    if (z == 12) {
                        z = 1;
                        k++;
                    } else {
                        z++;
                    }
                    do {
                        if (z == 13) {
                            z = 1;
                            k++;
                        }
                        monthsToDays = monthsToDays + amountOfDaysInMonth(z, k);
                        z++;
                        
                    } while (k != year || z != month+1);
                    monthsToDays = monthsToDays - diffYears * 365;
                }
            } else {
                if (month < otherDate.month) {
                     
                        if (z == 12) {
                            z = 1;
                            k++;
                        } else {
                            z++;
                        }
                        do {
                            if (z == 13) {
                                z = 1;
                                k++;
                            }
                            monthsToDays = monthsToDays + amountOfDaysInMonth(z, k);
                            z++;
                        } while (k != year || z != month);
                    
                } else {      
                    if (z == 12) {
                        z = 1;
                        k++;
                    } else {
                        z++;
                    }
                    do {
                        if (z == 13) {
                            z = 1;
                            k++;
                        }
                        monthsToDays = monthsToDays + amountOfDaysInMonth(z, k);
                        z++;
                    } while (k != year || z != month);
                }
            }
            z = otherDate.month;
            k = otherDate.year;
            int amountDays;

            if (year == otherDate.year && month == otherDate.month) {
                return -(day - otherDate.day);
            } else {
                if (year > otherDate.year && month == otherDate.month) {
            
                    amountDays = monthsToDays + ((day - otherDate.day) + (diffYears*365));
                    return -amountDays;

                } else {
                    if (year > otherDate.year && month < otherDate.month) {
                        amountDays = (amountOfDaysInMonth(otherDate.month, otherDate.year) - otherDate.day) + day
                                + monthsToDays;
                        return -amountDays;
                    } else {
                        amountDays = (amountOfDaysInMonth(otherDate.month, otherDate.year) - otherDate.day) + day
                                + monthsToDays;
                        return -amountDays;
                    }
                }
            }

        } else {
            Date date = new Date();
            date.day = this.day;
            date.month = this.month;
            date.year = this.year;
            return -otherDate.howManyDays(date);
        }
    }

    // Date printing
    public void printDate() {
        System.out.printf("%d,%d,%d\n", day, month, year);
    }

    // Date written in full
    public void printFullDate() {
        String months_names[] = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
                "Setembro", "Outubro", "Novembro", "Dezembro" };
        System.out.printf("%d de %s de %d\n", day, months_names[getMonth() - 1], year);
    }
}
