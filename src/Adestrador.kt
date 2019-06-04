import javax.swing.JOptionPane

/**
 *
 * @author ecollazodominguez
 */
class Adestrador(var idFederacion: String?, id: Int, nome: String, apelido: String, edade: Int) :
    Seleccion(id, nome, apelido, edade) {


    fun dirixirPartido() {

    }

    fun dirixirAdestramento() {

    }

    override fun viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxan os xogadores.\n$this")
    }

    override fun toString(): String {
        return super.toString() + "\nID Federación = $idFederacion"
    }


}
