/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package FiftyOneDegreesTrieV3;

public class Match {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Match(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Match obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FiftyOneDegreesTrieV3JNI.delete_Match(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public VectorString getValues(String propertyName) {
    return new VectorString(FiftyOneDegreesTrieV3JNI.Match_getValues__SWIG_0(swigCPtr, this, propertyName), true);
  }

  public VectorString getValues(SWIGTYPE_p_std__string propertyName) {
    return new VectorString(FiftyOneDegreesTrieV3JNI.Match_getValues__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(propertyName)), true);
  }

  public VectorString getValues(int propertyIndex) {
    return new VectorString(FiftyOneDegreesTrieV3JNI.Match_getValues__SWIG_2(swigCPtr, this, propertyIndex), true);
  }

  public String getValue(String propertyName) {
    return FiftyOneDegreesTrieV3JNI.Match_getValue__SWIG_0(swigCPtr, this, propertyName);
  }

  public String getValue(SWIGTYPE_p_std__string propertyName) {
    return FiftyOneDegreesTrieV3JNI.Match_getValue__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(propertyName));
  }

  public String getValue(int propertyIndex) {
    return FiftyOneDegreesTrieV3JNI.Match_getValue__SWIG_2(swigCPtr, this, propertyIndex);
  }

  public String getDeviceId() {
    return FiftyOneDegreesTrieV3JNI.Match_getDeviceId(swigCPtr, this);
  }

  public int getRank() {
    return FiftyOneDegreesTrieV3JNI.Match_getRank(swigCPtr, this);
  }

  public int getDifference() {
    return FiftyOneDegreesTrieV3JNI.Match_getDifference(swigCPtr, this);
  }

  public int getMethod() {
    return FiftyOneDegreesTrieV3JNI.Match_getMethod(swigCPtr, this);
  }

  public String getUserAgent() {
    return FiftyOneDegreesTrieV3JNI.Match_getUserAgent(swigCPtr, this);
  }

}