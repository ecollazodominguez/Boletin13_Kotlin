
fun main(args: Array<String>) {
    //En Kotlin nos indica el nombre de cada atributo para saber qué estamos modificando
    val xog1 = Xogador(1, "Delantero", 1, "Rafa", "Perez", 23)
    val adestra = Adestrador("albar", 2, "Alfredo", "Gonzalez", 30)
    val masa1 = Masaxista("Experta", 15, 10, "Mariano", "Ramirez", 27)
    val xogador = Seleccion(2, "Javier", "Alvarez", 24)

    //O que se mostra e o mismo al coller o método da superclase.
    xog1.concentrarse()
    adestra.concentrarse()
    masa1.concentrarse()
    xogador.concentrarse()

    //O que se mostra é diferente.
    xog1.viaxar()
    adestra.viaxar()
    masa1.viaxar()
    xogador.viaxar()

    //En Kotlin no hay getter y setter por lo que accedemos directamente al atributo y lo modificamos.
    xog1.edade = 34
    System.out.println(xog1.toString())

}
