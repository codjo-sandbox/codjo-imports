/*
 * codjo.net
 *
 * Common Apache License 2.0
 */
package net.codjo.imports.common;
/**
 * Interface decrivant un filtre d'import.
 *
 * @author $Author: lopezla $
 * @version $Revision: 1.5 $
 */
public interface ImportFilter {
    /**
     * Indique si la ligne pass� en param�tre doit �tre filtr�e (cad elle n'est pas
     * import�e).
     *
     * @param line La ligne a tester
     *
     * @return <code>true</code> si la ligne est filtr�e.
     */
    public boolean filteredLine(String line);
}
