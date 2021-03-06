/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vectorsearch.faiss.swig;

public class ScalarQuantizer {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ScalarQuantizer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ScalarQuantizer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_ScalarQuantizer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setQtype(QuantizerType value) {
    swigfaissJNI.ScalarQuantizer_qtype_set(swigCPtr, this, value.swigValue());
  }

  public QuantizerType getQtype() {
    return QuantizerType.swigToEnum(
        swigfaissJNI.ScalarQuantizer_qtype_get(swigCPtr, this));
  }

  public void setRangestat(RangeStat value) {
    swigfaissJNI.ScalarQuantizer_rangestat_set(swigCPtr, this, value.swigValue());
  }

  public RangeStat getRangestat() {
    return RangeStat.swigToEnum(
        swigfaissJNI.ScalarQuantizer_rangestat_get(swigCPtr, this));
  }

  public void setRangestat_arg(float value) {
    swigfaissJNI.ScalarQuantizer_rangestat_arg_set(swigCPtr, this, value);
  }

  public float getRangestat_arg() {
    return swigfaissJNI.ScalarQuantizer_rangestat_arg_get(swigCPtr, this);
  }

  public void setD(long value) {
    swigfaissJNI.ScalarQuantizer_d_set(swigCPtr, this, value);
  }

  public long getD() {
    return swigfaissJNI.ScalarQuantizer_d_get(swigCPtr, this);
  }

  public void setCode_size(long value) {
    swigfaissJNI.ScalarQuantizer_code_size_set(swigCPtr, this, value);
  }

  public long getCode_size() {
    return swigfaissJNI.ScalarQuantizer_code_size_get(swigCPtr, this);
  }

  public void setTrained(FloatVector value) {
    swigfaissJNI.ScalarQuantizer_trained_set(swigCPtr, this, FloatVector.getCPtr(value), value);
  }

  public FloatVector getTrained() {
    long cPtr = swigfaissJNI.ScalarQuantizer_trained_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FloatVector(cPtr, false);
  }

  public ScalarQuantizer(long d, QuantizerType qtype) {
    this(swigfaissJNI.new_ScalarQuantizer__SWIG_0(d, qtype.swigValue()), true);
  }

  public ScalarQuantizer() {
    this(swigfaissJNI.new_ScalarQuantizer__SWIG_1(), true);
  }

  public void train(long n, SWIGTYPE_p_float x) {
    swigfaissJNI.ScalarQuantizer_train(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x));
  }

  public void train_residual(
      long n, SWIGTYPE_p_float x, Index quantizer, boolean by_residual, boolean verbose) {
    swigfaissJNI.ScalarQuantizer_train_residual(
        swigCPtr,
        this,
        n,
        SWIGTYPE_p_float.getCPtr(x),
        Index.getCPtr(quantizer),
        quantizer,
        by_residual,
        verbose);
  }

  public void compute_codes(SWIGTYPE_p_float x, SWIGTYPE_p_unsigned_char codes, long n) {
    swigfaissJNI.ScalarQuantizer_compute_codes(
        swigCPtr, this, SWIGTYPE_p_float.getCPtr(x), SWIGTYPE_p_unsigned_char.getCPtr(codes), n);
  }

  public void decode(SWIGTYPE_p_unsigned_char code, SWIGTYPE_p_float x, long n) {
    swigfaissJNI.ScalarQuantizer_decode(
        swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(code), SWIGTYPE_p_float.getCPtr(x), n);
  }

  public static class Quantizer {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;

    protected Quantizer(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }

    protected static long getCPtr(Quantizer obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
      delete();
    }

    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          swigfaissJNI.delete_ScalarQuantizer_Quantizer(swigCPtr);
        }
        swigCPtr = 0;
      }
    }

    public void encode_vector(SWIGTYPE_p_float x, SWIGTYPE_p_unsigned_char code) {
      swigfaissJNI.ScalarQuantizer_Quantizer_encode_vector(
          swigCPtr, this, SWIGTYPE_p_float.getCPtr(x), SWIGTYPE_p_unsigned_char.getCPtr(code));
    }

    public void decode_vector(SWIGTYPE_p_unsigned_char code, SWIGTYPE_p_float x) {
      swigfaissJNI.ScalarQuantizer_Quantizer_decode_vector(
          swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(code), SWIGTYPE_p_float.getCPtr(x));
    }
  }

  public Quantizer select_quantizer() {
    long cPtr = swigfaissJNI.ScalarQuantizer_select_quantizer(swigCPtr, this);
    return (cPtr == 0) ? null : new Quantizer(cPtr, false);
  }

  public SWIGTYPE_p_faiss__ScalarQuantizer__SQDistanceComputer get_distance_computer(
      MetricType metric) {
    long cPtr =
        swigfaissJNI.ScalarQuantizer_get_distance_computer__SWIG_0(
            swigCPtr, this, metric.swigValue());
    return (cPtr == 0)
        ? null
        : new SWIGTYPE_p_faiss__ScalarQuantizer__SQDistanceComputer(cPtr, false);
  }

  public SWIGTYPE_p_faiss__ScalarQuantizer__SQDistanceComputer get_distance_computer() {
    long cPtr = swigfaissJNI.ScalarQuantizer_get_distance_computer__SWIG_1(swigCPtr, this);
    return (cPtr == 0)
        ? null
        : new SWIGTYPE_p_faiss__ScalarQuantizer__SQDistanceComputer(cPtr, false);
  }

  public SWIGTYPE_p_faiss__InvertedListScanner select_InvertedListScanner(
      MetricType mt, Index quantizer, boolean store_pairs, boolean by_residual) {
    long cPtr =
        swigfaissJNI.ScalarQuantizer_select_InvertedListScanner__SWIG_0(
            swigCPtr,
            this,
            mt.swigValue(),
            Index.getCPtr(quantizer),
            quantizer,
            store_pairs,
            by_residual);
    return (cPtr == 0) ? null : new SWIGTYPE_p_faiss__InvertedListScanner(cPtr, false);
  }

  public SWIGTYPE_p_faiss__InvertedListScanner select_InvertedListScanner(
      MetricType mt, Index quantizer, boolean store_pairs) {
    long cPtr =
        swigfaissJNI.ScalarQuantizer_select_InvertedListScanner__SWIG_1(
            swigCPtr, this, mt.swigValue(), Index.getCPtr(quantizer), quantizer, store_pairs);
    return (cPtr == 0) ? null : new SWIGTYPE_p_faiss__InvertedListScanner(cPtr, false);
  }

  public static final class QuantizerType {
    public static final QuantizerType QT_8bit =
        new QuantizerType("QT_8bit");
    public static final QuantizerType QT_4bit =
        new QuantizerType("QT_4bit");
    public static final QuantizerType QT_8bit_uniform =
        new QuantizerType("QT_8bit_uniform");
    public static final QuantizerType QT_4bit_uniform =
        new QuantizerType("QT_4bit_uniform");
    public static final QuantizerType QT_fp16 =
        new QuantizerType("QT_fp16");
    public static final QuantizerType QT_8bit_direct =
        new QuantizerType("QT_8bit_direct");
    public static final QuantizerType QT_6bit =
        new QuantizerType("QT_6bit");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static QuantizerType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length
          && swigValue >= 0
          && swigValues[swigValue].swigValue == swigValue) return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue) return swigValues[i];
      throw new IllegalArgumentException(
          "No enum " + QuantizerType.class + " with value " + swigValue);
    }

    private QuantizerType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private QuantizerType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue + 1;
    }

    private QuantizerType(String swigName, QuantizerType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue + 1;
    }

    private static QuantizerType[] swigValues = {
      QT_8bit, QT_4bit, QT_8bit_uniform, QT_4bit_uniform, QT_fp16, QT_8bit_direct, QT_6bit
    };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public static final class RangeStat {
    public static final RangeStat RS_minmax =
        new RangeStat("RS_minmax");
    public static final RangeStat RS_meanstd =
        new RangeStat("RS_meanstd");
    public static final RangeStat RS_quantiles =
        new RangeStat("RS_quantiles");
    public static final RangeStat RS_optim =
        new RangeStat("RS_optim");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static RangeStat swigToEnum(int swigValue) {
      if (swigValue < swigValues.length
          && swigValue >= 0
          && swigValues[swigValue].swigValue == swigValue) return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue) return swigValues[i];
      throw new IllegalArgumentException("No enum " + RangeStat.class + " with value " + swigValue);
    }

    private RangeStat(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private RangeStat(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue + 1;
    }

    private RangeStat(String swigName, RangeStat swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue + 1;
    }

    private static RangeStat[] swigValues = {RS_minmax, RS_meanstd, RS_quantiles, RS_optim};
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }
}
