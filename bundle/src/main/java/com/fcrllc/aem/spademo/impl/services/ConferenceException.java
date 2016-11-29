package com.fcrllc.aem.spademo.impl.services;

/**
 * Run-time exception, indicating that something wrong has happened related to the conference.
 * 
 * @author David Parker (dfparker@gmail.com)
 * @author andon.sikavica
 */
public class ConferenceException extends RuntimeException {

  private static final long serialVersionUID = -4985886317413739664L;

  /**
   * Constructor for this {@link ConferenceException}.
   * 
   * @param message the message indicating the error.
   */
  public ConferenceException(String message) {
    super(message);
  }

}
