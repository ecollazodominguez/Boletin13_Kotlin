import javax.swing.JOptionPane

/**
 *
 * @author ecollazodominguez
 */
// Formamos el constructor directamente al iniciar la clase.
// Indicamos que es una variable con VAR, ponemos el nombre de esta y por último el tipo
// escribimos la propiedad OPEN para poder heredar de esta clase.
open class Seleccion(var id: Int, var nome: String?, var apelido: String?, var edade: Int) {


    fun concentrarse() {
        JOptionPane.showMessageDialog(null, "Concéntrase a Selección.")
    }

    //Escribimos OPEN para poder herederar este método
    open fun viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxa a Selección.")
    }

    //En el toString usamos $nombrevariable para mostrar los valores
    override fun toString(): String {
        return "ID = $id\nNome = $nome\nApelido = $apelido\nEdade = $edade"
    }


}