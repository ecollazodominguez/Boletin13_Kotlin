import javax.swing.JOptionPane

/**
 *
 * @author ecollazodominguez
 */
// Formamos el constructor directamente al iniciar la clase.
// Indicamos que es una variable con VAR, ponemos el nombre de esta y por último el tipo
// A los atributos heredados no se indica como VAR ya que no es de esta clase y están definidas en la clase padre.
// Para indicar que hereda se indica al final con el nombre de la clase padre y sus atributos que hereda.
class Xogador(var dorsal: Int, var demarcacion: String?, id: Int, nome: String, apelido: String, edade: Int) :
    Seleccion(id, nome, apelido, edade) {


    fun xogarPartido() {

    }

    fun entrenar() {
        println("O xogador entrena.")
    }

    override fun viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxan os xogadores.\n$this")
    }

    //En el toString usamos $nombrevariable para mostrar los valores
    override fun toString(): String {
        return super.toString() + "\nDorsal = $dorsal\nDemarcación =  $demarcacion"
    }


}