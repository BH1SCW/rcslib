/* 
The NIST RCS (Real-time Control Systems) 
 library is public domain software, however it is preferred
 that the following disclaimers be attached.

Software Copywrite/Warranty Disclaimer

   This software was developed at the National Institute of Standards and
Technology by employees of the Federal Government in the course of their
official duties. Pursuant to title 17 Section 105 of the United States
Code this software is not subject to copyright protection and is in the
public domain. NIST Real-Time Control System software is an experimental
system. NIST assumes no responsibility whatsoever for its use by other
parties, and makes no guarantees, expressed or implied, about its
quality, reliability, or any other characteristic. We would appreciate
acknowledgement if the software is used. This software can be
redistributed and/or modified freely provided that any derivative works
bear some notice that they are derived from it, and any modified
versions bear some notice that they have been modified.



*/ 


package diagapplet.CodeGen;

/**
 * Objects of this class are passed from the diagnositcs tool and design tool to the CodeGen 
 * objects as a way of indirectly passing DiagNMLMsgDicts() without introducing
 * unnecessary compile-time dependancies.
 * 
 * The need to eliminate circular dependancies came from seperately compiling each java
 * file in a Makefile with a variety of compilers. It is likely no longer necessary
 * to eliminate the circular dependancies.
 * 
 * @author Will Shackleford
 */
public class DiagNMLMsgDictCreator implements DiagNMLMsgDictCreatorInterface
{

     /**
     * Create a new DiagNMLMsgDict() object and set the fields cmd_stream and
     * stat_stream.
     * @param cmd_stream is this a command stream
     * @param stat_stream is this a status stream
     * @return ane DiagNMLMsgDict object.
     */
    public DiagNMLMsgDictInterface create(boolean cmd_stream, boolean stat_stream)
    {
	DiagNMLMsgDict dict = new DiagNMLMsgDict();
	dict.cmd_stream = cmd_stream;
	dict.stat_stream = stat_stream;
	return dict;
    }
}
