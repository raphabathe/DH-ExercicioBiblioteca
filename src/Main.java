public class Main {

    public static void main(String[] args) {

// MELHORAR COM UM METODO QUE NAO PERMITE ADICIONAR UM EXEMPLAR QUE JA FOI ADICIONADO.

        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("A Cabana",	858046345,"William P");
        Livro livro2 = new Livro("Depois de Voce",	393948200,"William g");
        Livro livro3 = new Livro("Como eu era antes de voce",	28389392,"William f");
        Livro livro4 = new Livro("Hebe: A biografia",	299382903,"William h");
        Livro livro5 = new Livro("Prisioneiras",	50590499,"William i");
        Livro livro6 = new Livro("Extraordinario",	939898,"William a");
        Livro livro7 = new Livro("A Bela e a Fera",	10909202,"William q");
        Livro livro8 = new Livro("Lord of Shadows",	29839840,"William t");
        Livro livro9 = new Livro("That hat u give",	80380983,"William b");
        Livro livro10 = new Livro("Come Sundown",	93893894,"William x");
        Livro livro11 = new Livro("Come Sundown",	93893894,"William x");


        Exemplar exemplar1 = new Exemplar(livro1);
        Exemplar exemplar2 = new Exemplar(livro1);
        Exemplar exemplar3 = new Exemplar(livro1);
        Exemplar exemplar5 = new Exemplar(livro1);
        Exemplar exemplar6 = new Exemplar(livro2);
        Exemplar exemplar7 = new Exemplar(livro3);
        Exemplar exemplar8 = new Exemplar(livro4);
        Exemplar exemplar9 = new Exemplar(livro5);
        Exemplar exemplar10 = new Exemplar(livro6);
        Exemplar exemplar11= new Exemplar(livro7);
        Exemplar exemplar12 = new Exemplar(livro8);
        Exemplar exemplar13 = new Exemplar(livro9);
        Exemplar exemplar15 = new Exemplar(livro10);
        Exemplar exemplar43= new Exemplar(livro10);
        Exemplar exemplar445= new Exemplar(livro10);
        Exemplar exemplar446 = new Exemplar(livro2);
        Exemplar exemplar466 = new Exemplar(livro2);
        Exemplar exemplar478 = new Exemplar(livro3);
        Exemplar exemplar487 = new Exemplar(livro3);
        Exemplar exemplar455 = new Exemplar(livro4);
        Exemplar exemplar422 = new Exemplar(livro5);



        Socio socio1 = new Socio("Beto","Souza", 001);
        Socio socio2 = new SocioVip("Monica", "Gerheim",002);
        Socio socio3 = new Socio("Rubens", "Martins", 003);


        livro1.emprestarExemplar();
        livro11.emprestarExemplar();
    //
//        biblioteca.emprestar(858046345,001);
//        biblioteca.emprestar(858046345,002);
//        biblioteca.emprestar(858046345,001);
//        biblioteca.emprestar(858046345,001);
//        biblioteca.emprestar(393948200,002);
//        biblioteca.emprestar(858046345,002);
//







    }
}
