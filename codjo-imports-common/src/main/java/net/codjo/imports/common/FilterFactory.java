/*
 * codjo.net
 *
 * Common Apache License 2.0
 */
package net.codjo.imports.common;
import java.sql.Connection;
/**
 * Interface permettant de cr�er des filtres d'import.
 *
 * @version $Revision: 1.4 $
 */
public interface FilterFactory {
    /**
     * Cr�e un {@link net.codjo.imports.common.ImportFilter} � partir d'un type d'import ou
     * d'un syst�me source. Si le filtre associ� � cet import est vide,
     * <code>null</code> est renvoy�.
     *
     * @param connection la connexion JDBC
     * @param fileType type d'import
     * @param sourceSystem le syst�me source de l'import
     *
     * @return le filtre d'import
     *
     * @throws ImportFailureException s'il y a eu un probl�me
     */
    public ImportFilter createFilter(Connection connection, String fileType,
        String sourceSystem) throws ImportFailureException;
}
