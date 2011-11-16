/*
 * codjo.net
 *
 * Common Apache License 2.0
 */
package net.codjo.imports.common;
/**
 * Interface � impl�menter pour d�finir une classe repr�sentant un champ cible.
 */
public interface Field {
    /**
     * Convertion du champs en "String SQL".
     * 
     * <p>
     * Cette methode extrait le champs de "fileLine" et le convertit en un Object
     * utilisable dans une requete SQL.
     * </p>
     *
     * @param fileLine Une ligne du fichier a importer
     *
     * @return Le champs convertit.
     *
     * @exception ImportFailureException probleme lors de la conversion.
     */
    public Object convertFieldToSQL(String fileLine)
            throws ImportFailureException;


    public String getDBDestFieldName();


    /**
     * Retourne le type SQL de l'objet produit par convertFieldToSQL.
     *
     * @return Le type SQL d�finit dans java.sql.Types.
     */
    public int getSQLType();
}
