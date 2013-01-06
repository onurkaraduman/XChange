/**
 * Copyright (C) 2012 Xeiam LLC http://xeiam.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.xeiam.xchange.service;

/**
 * <p>
 * Enum to provide the following to {@link RunnableExchangeEventProducer}:
 * </p>
 * <ul>
 * <li>Classification of event type to allow clients to take appropriate action</li>
 * </ul>
 * 
 * @since 1.3.0  
 */
public enum ExchangeEventType {

  /**
   * Issued when the upstream server has connected
   */
  CONNECT,

  /**
   * A message encoding some plain text
   */
  MESSAGE,

  /**
   * A message encoding a JSON object representation
   */
  JSON_MESSAGE,

  /**
   * Represents an event (server specific info)
   */
  EVENT,

  /**
   * Represents an error condition
   */
  ERROR,

  /**
   * The upstream server has disconnected
   */
  DISCONNECT,

  /* End of enum */
  ;

}
