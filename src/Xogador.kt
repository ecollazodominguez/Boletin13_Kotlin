import javax.swing.JOptionPane

/**
 *
 * @author ecollazodominguez
 */
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

    override fun toString(): String {
        return super.toString() + "\nDorsal = $dorsal\nDemarcación =  $demarcacion"
    }


}