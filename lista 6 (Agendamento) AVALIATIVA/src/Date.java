public class Date {
    private int day, month, year;

    public Date(int day, int month, int year) {
        if (validDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("Error: invalid date!\n");
        }
    }

    public Date(){
        this.day = 1;
        this.month = 1;
        this.year = 1970;
    }

    public Date(Date data){
        this.day = data.day;
        this.month = data.month;
        this.year = data.year;
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

    public static String dayOfWeek(Date data){
        int d = data.getDay();
        int m = data.getMonth();
        int y = data.getYear();
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

    public static int amountOfDaysInMonth(int month, int year) {
        if (Date.isLeapYear(year) && month == 2) {
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

    public static boolean isLeapYear(int year) {
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

    public int howManyDays(int day,int month, int year) {
        Date otherDate = new Date(day,month,year);
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
                        monthsToDays = monthsToDays + Date.amountOfDaysInMonth(z, k);
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
                            monthsToDays = monthsToDays + Date.amountOfDaysInMonth(z, k);
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
                        monthsToDays = monthsToDays + Date.amountOfDaysInMonth(z, k);
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
                        amountDays = (Date.amountOfDaysInMonth(otherDate.month, otherDate.year) - otherDate.day) + day
                                + monthsToDays;
                        return -amountDays;
                    } else {
                        amountDays = (Date.amountOfDaysInMonth(otherDate.month, otherDate.year) - otherDate.day) + day
                                + monthsToDays;
                        return -amountDays;
                    }
                }
            }

        } else {
            Date date = new Date(this.day,this.month,this.year);
            return -otherDate.howManyDays(date);
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
                        monthsToDays = monthsToDays + Date.amountOfDaysInMonth(z, k);
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
                            monthsToDays = monthsToDays + Date.amountOfDaysInMonth(z, k);
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
                        monthsToDays = monthsToDays + Date.amountOfDaysInMonth(z, k);
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
                        amountDays = (Date.amountOfDaysInMonth(otherDate.month, otherDate.year) - otherDate.day) + day
                                + monthsToDays;
                        return -amountDays;
                    } else {
                        amountDays = (Date.amountOfDaysInMonth(otherDate.month, otherDate.year) - otherDate.day) + day
                                + monthsToDays;
                        return -amountDays;
                    }
                }
            }

        } else {
            Date date = new Date(this.day,this.month,this.year);
            return -otherDate.howManyDays(date);
        }
    }

    public static int howManyDaysUntilEndYear(Date d) {
        Date fimAno = new Date(31,12,d.year);
        return fimAno.howManyDays(d);
    }

    public static int howManyDaysUntilNextMonth(Date d){
        Date fimMes = new Date(Date.amountOfDaysInMonth(d.month, d.year),d.month,d.year);
        return fimMes.howManyDays(d);
    }

    // Date printing
    public static void printDate(Date date) {
        System.out.printf("%d,%d,%d\n", date.day, date.month, date.year);
    }

    // Date written in full
    public static void printFullDate(Date date) {
        String months_names[] = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
                "Setembro", "Outubro", "Novembro", "Dezembro" };
        System.out.printf("%d de %s de %d\n", date.day, months_names[date.getMonth() - 1], date.year);
    }

    public String toString(){
        String months_names[] = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
                "Setembro", "Outubro", "Novembro", "Dezembro" };
        return this.day+" de "+months_names[this.getMonth() - 1]+" de "+this.year;
    }
}
