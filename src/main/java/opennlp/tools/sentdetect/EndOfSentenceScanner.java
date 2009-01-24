/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreemnets.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */



package opennlp.tools.sentdetect;

import java.util.List;

/**
 * Scans Strings, StringBuffers, and char[] arrays for the offsets of
 * sentence ending characters.
 *
 * <p>Implementations of this interface can use regular expressions,
 * hand-coded DFAs, and other scanning techniques to locate end of
 * sentence offsets.</p>
 *
 * Created: Sat Oct 27 11:42:07 2001
 *
 * @author Eric D. Friedman
 * @version $Id: EndOfSentenceScanner.java,v 1.2 2009/01/24 01:32:19 joernkottmann Exp $
 */

public interface EndOfSentenceScanner {

  /**
   * Returns an array of character which can indicate the end of a sentence.
   * @return an array of character which can indicate the end of a sentence.
   */
   public char[] getEndOfSentenceCharacters();

    /**
     * The receiver scans `s' for sentence ending characters and
     * returns their offsets.
     *
     * @param s a <code>String</code> value
     * @return a <code>List</code> of Integer objects.
     */
    public List<Integer> getPositions(String s);

    /**
     * The receiver scans `buf' for sentence ending characters and
     * returns their offsets.
     *
     * @param buf a <code>StringBuffer</code> value
     * @return a <code>List</code> of Integer objects.
     */
    public List<Integer> getPositions(StringBuffer buf);

    /**
     * The receiver scans `cbuf' for sentence ending characters and
     * returns their offsets.
     *
     * @param cbuf a <code>char[]</code> value
     * @return a <code>List</code> of Integer objects.
     */
    public List<Integer> getPositions(char[] cbuf);
}
