/*
 * codjo.net
 *
 * Common Apache License 2.0
 */
package net.codjo.imports.common.translator;
/**
 * Traducteur d'une cha�ne de caract�re en type SQL.
 */
public interface Translator {
    /**
     * Retourne le type SQL de l'objet produit par convertFieldToSQL.
     *
     * @return Type SQL
     *
     * @see java.sql.Types
     */
    int getSQLType();


    /**
     * Traduction avec typage du champ.
     *
     * @param field Champ � traduire.
     *
     * @return Le champ en format SQL.
     *
     * @throws BadFormatException TODO
     */
    Object translate(String field) throws BadFormatException;
}
