public class Main{
    public static void main(String[] args){
        Data d = new Data(05, 02, 2004);
        Pessoa p = new Pessoa("Jão", 1234, d);

        System.out.println(p.toString());

        Data da = new Data(15, 12, 2019);
        Funcionario f = new Funcionario("Pedrin", 12345, d, da, 800);
        System.out.println(f.toString());

        ChefeDeDepartamento c = new ChefeDeDepartamento("Bob", 1234567, d, "Engenheira de Software", da);
        System.out.println(c.toString());
    }
}
