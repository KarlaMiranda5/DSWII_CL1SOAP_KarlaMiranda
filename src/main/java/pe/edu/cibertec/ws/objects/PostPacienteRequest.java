//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.09.30 a las 11:31:22 AM PET 
//


package pe.edu.cibertec.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paciento" type="{cibertec.edu.pe/ws/objects}pacientews"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paciento"
})
@XmlRootElement(name = "postPacienteRequest")
public class PostPacienteRequest {

    @XmlElement(required = true)
    protected Pacientews paciento;

    /**
     * Obtiene el valor de la propiedad paciento.
     * 
     * @return
     *     possible object is
     *     {@link Pacientews }
     *     
     */
    public Pacientews getPaciento() {
        return paciento;
    }

    /**
     * Define el valor de la propiedad paciento.
     * 
     * @param value
     *     allowed object is
     *     {@link Pacientews }
     *     
     */
    public void setPaciento(Pacientews value) {
        this.paciento = value;
    }

}
