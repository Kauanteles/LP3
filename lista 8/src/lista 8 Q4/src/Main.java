public class Main {
    public static void main(String[] args) throws Exception {
        Data data = new Data(05,02,2004);
        Pessoa pessoaFisica = new Pessoa("kakau",12345,data,"rua 2",40028922, "uuuuu@gmail.com");
        PessoaJuridica[] pessoaJuridica = new PessoaJuridica[3];
        pessoaJuridica[0] = new PessoaJuridica("kakau",12345,data,"rua 2",40028922, "uuuuu@gmail.com",11111111,2222222);
        pessoaJuridica[1] = new PessoaJuridica("kakau2",12346,data,"rua 2",40028922, "uuuuu@gmail.com",11111111,2222222);
        pessoaJuridica[2] = new PessoaJuridica("kakau3",12347,data,"rua 2",40028922, "uuuuu@gmail.com",11111111,2222222);


        System.out.println(pessoaFisica.toString());
        for(int i=0; i < 3; i ++){
            if(pessoaJuridica[i].getCpf()==1236){
                System.out.println(pessoaJuridica[i].toString());
            }
        }


    }
}
