/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.herumi.mcl;

public class G2 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected G2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(G2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MclJNI.delete_G2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public G2() {
    this(MclJNI.new_G2__SWIG_0(), true);
  }

  public G2(G2 rhs) {
    this(MclJNI.new_G2__SWIG_1(G2.getCPtr(rhs), rhs), true);
  }

  public G2(Fp ax, Fp ay, Fp bx, Fp by) {
    this(MclJNI.new_G2__SWIG_2(Fp.getCPtr(ax), ax, Fp.getCPtr(ay), ay, Fp.getCPtr(bx), bx, Fp.getCPtr(by), by), true);
  }

  public boolean equals(G2 rhs) {
    return MclJNI.G2_equals(swigCPtr, this, G2.getCPtr(rhs), rhs);
  }

  public boolean isZero() {
    return MclJNI.G2_isZero(swigCPtr, this);
  }

  public void set(Fp ax, Fp ay, Fp bx, Fp by) {
    MclJNI.G2_set(swigCPtr, this, Fp.getCPtr(ax), ax, Fp.getCPtr(ay), ay, Fp.getCPtr(bx), bx, Fp.getCPtr(by), by);
  }

  public void clear() {
    MclJNI.G2_clear(swigCPtr, this);
  }

  public void setStr(String str, int radix) {
    MclJNI.G2_setStr__SWIG_0(swigCPtr, this, str, radix);
  }

  public void setStr(String str) {
    MclJNI.G2_setStr__SWIG_1(swigCPtr, this, str);
  }

  public String toString(int radix) {
    return MclJNI.G2_toString__SWIG_0(swigCPtr, this, radix);
  }

  public String toString() {
    return MclJNI.G2_toString__SWIG_1(swigCPtr, this);
  }

  public void deserialize(byte[] cbuf) {
    MclJNI.G2_deserialize(swigCPtr, this, cbuf);
  }

  public byte[] serialize() { return MclJNI.G2_serialize(swigCPtr, this); }

  public void normalize() {
    MclJNI.G2_normalize(swigCPtr, this);
  }

}
