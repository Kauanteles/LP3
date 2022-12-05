public class Main {
    public static void main(String[] args){
        Date data = new Date(5,12,2022);
        LivroBiblioteca livroLib = new LivroBiblioteca("ciencias2", "einstein", 1000, 1999, false, data);
        LivroLivraria livroLiv = new LivroLivraria("calculus", "elMatematico", 500, 2000,1200,1);

        System.out.println(livroLib.isAvailable());
        livroLib.borrow();
        System.out.println(livroLib.isAvailable());
        System.out.println(livroLib.toString());
        System.out.println("\n");
        System.out.println(livroLiv.isAvailable());
        livroLiv.sell();
        System.out.println(livroLiv.isAvailable());
        System.out.println(livroLiv.toString());
    }
}
