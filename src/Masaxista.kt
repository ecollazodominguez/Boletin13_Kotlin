import javax.swing.JOptionPane

/**
 *
 * @author ecollazodominguez
 */
class Masaxista(var titulacion: String?, var anosExperiencia: Int, id: Int, nome: String, apelido: String, edade: Int) :
    Seleccion(id, nome, apelido, edade) {


    fun darMasaxes() {

    }

    override fun viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxan os xogadores.\n$this")
    }

    override fun toString(): String {
        return super.toString() + "\nTitulación = $titulacion \nAños de experiencia = $anosExperiencia"
    }


}