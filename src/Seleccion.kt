import javax.swing.JOptionPane

/**
 *
 * @author ecollazodominguez
 */
open class Seleccion(var id: Int, var nome: String?, var apelido: String?, var edade: Int) {


    fun concentrarse() {
        JOptionPane.showMessageDialog(null, "Concéntrase a Selección.")
    }

    open fun viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxa a Selección.")
    }

    override fun toString(): String {
        return "ID = $id\nNome = $nome\nApelido = $apelido\nEdade = $edade"
    }


}