/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.demo.kafka.consumer.poc.dto;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class MessageValue extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2558664255048743589L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MessageValue\",\"namespace\":\"com.citi.genesis.api.poc.dto\",\"fields\":[{\"name\":\"productId\",\"type\":\"string\"},{\"name\":\"Name\",\"type\":\"string\"},{\"name\":\"rating\",\"type\":\"int\"},{\"name\":\"comment\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<MessageValue> ENCODER =
      new BinaryMessageEncoder<MessageValue>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<MessageValue> DECODER =
      new BinaryMessageDecoder<MessageValue>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<MessageValue> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<MessageValue> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<MessageValue>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this MessageValue to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a MessageValue from a ByteBuffer. */
  public static MessageValue fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public CharSequence productId;
  @Deprecated public CharSequence Name;
  @Deprecated public int rating;
  @Deprecated public CharSequence comment;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MessageValue() {}

  /**
   * All-args constructor.
   * @param productId The new value for productId
   * @param Name The new value for Name
   * @param rating The new value for rating
   * @param comment The new value for comment
   */
  public MessageValue(CharSequence productId, CharSequence Name, Integer rating, CharSequence comment) {
    this.productId = productId;
    this.Name = Name;
    this.rating = rating;
    this.comment = comment;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return productId;
    case 1: return Name;
    case 2: return rating;
    case 3: return comment;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: productId = (CharSequence)value$; break;
    case 1: Name = (CharSequence)value$; break;
    case 2: rating = (Integer)value$; break;
    case 3: comment = (CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'productId' field.
   * @return The value of the 'productId' field.
   */
  public CharSequence getProductId() {
    return productId;
  }

  /**
   * Sets the value of the 'productId' field.
   * @param value the value to set.
   */
  public void setProductId(CharSequence value) {
    this.productId = value;
  }

  /**
   * Gets the value of the 'Name' field.
   * @return The value of the 'Name' field.
   */
  public CharSequence getName() {
    return Name;
  }

  /**
   * Sets the value of the 'Name' field.
   * @param value the value to set.
   */
  public void setName(CharSequence value) {
    this.Name = value;
  }

  /**
   * Gets the value of the 'rating' field.
   * @return The value of the 'rating' field.
   */
  public Integer getRating() {
    return rating;
  }

  /**
   * Sets the value of the 'rating' field.
   * @param value the value to set.
   */
  public void setRating(Integer value) {
    this.rating = value;
  }

  /**
   * Gets the value of the 'comment' field.
   * @return The value of the 'comment' field.
   */
  public CharSequence getComment() {
    return comment;
  }

  /**
   * Sets the value of the 'comment' field.
   * @param value the value to set.
   */
  public void setComment(CharSequence value) {
    this.comment = value;
  }

  /**
   * Creates a new MessageValue RecordBuilder.
   * @return A new MessageValue RecordBuilder
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Creates a new MessageValue RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new MessageValue RecordBuilder
   */
  public static Builder newBuilder(Builder other) {
    return new Builder(other);
  }

  /**
   * Creates a new MessageValue RecordBuilder by copying an existing MessageValue instance.
   * @param other The existing instance to copy.
   * @return A new MessageValue RecordBuilder
   */
  public static Builder newBuilder(MessageValue other) {
    return new Builder(other);
  }

  /**
   * RecordBuilder for MessageValue instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MessageValue>
    implements org.apache.avro.data.RecordBuilder<MessageValue> {

    private CharSequence productId;
    private CharSequence Name;
    private int rating;
    private CharSequence comment;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.productId)) {
        this.productId = data().deepCopy(fields()[0].schema(), other.productId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Name)) {
        this.Name = data().deepCopy(fields()[1].schema(), other.Name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.rating)) {
        this.rating = data().deepCopy(fields()[2].schema(), other.rating);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.comment)) {
        this.comment = data().deepCopy(fields()[3].schema(), other.comment);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing MessageValue instance
     * @param other The existing instance to copy.
     */
    private Builder(MessageValue other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.productId)) {
        this.productId = data().deepCopy(fields()[0].schema(), other.productId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Name)) {
        this.Name = data().deepCopy(fields()[1].schema(), other.Name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.rating)) {
        this.rating = data().deepCopy(fields()[2].schema(), other.rating);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.comment)) {
        this.comment = data().deepCopy(fields()[3].schema(), other.comment);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'productId' field.
      * @return The value.
      */
    public CharSequence getProductId() {
      return productId;
    }

    /**
      * Sets the value of the 'productId' field.
      * @param value The value of 'productId'.
      * @return This builder.
      */
    public Builder setProductId(CharSequence value) {
      validate(fields()[0], value);
      this.productId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'productId' field has been set.
      * @return True if the 'productId' field has been set, false otherwise.
      */
    public boolean hasProductId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'productId' field.
      * @return This builder.
      */
    public Builder clearProductId() {
      productId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'Name' field.
      * @return The value.
      */
    public CharSequence getName() {
      return Name;
    }

    /**
      * Sets the value of the 'Name' field.
      * @param value The value of 'Name'.
      * @return This builder.
      */
    public Builder setName(CharSequence value) {
      validate(fields()[1], value);
      this.Name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'Name' field has been set.
      * @return True if the 'Name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'Name' field.
      * @return This builder.
      */
    public Builder clearName() {
      Name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'rating' field.
      * @return The value.
      */
    public Integer getRating() {
      return rating;
    }

    /**
      * Sets the value of the 'rating' field.
      * @param value The value of 'rating'.
      * @return This builder.
      */
    public Builder setRating(int value) {
      validate(fields()[2], value);
      this.rating = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'rating' field has been set.
      * @return True if the 'rating' field has been set, false otherwise.
      */
    public boolean hasRating() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'rating' field.
      * @return This builder.
      */
    public Builder clearRating() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'comment' field.
      * @return The value.
      */
    public CharSequence getComment() {
      return comment;
    }

    /**
      * Sets the value of the 'comment' field.
      * @param value The value of 'comment'.
      * @return This builder.
      */
    public Builder setComment(CharSequence value) {
      validate(fields()[3], value);
      this.comment = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'comment' field has been set.
      * @return True if the 'comment' field has been set, false otherwise.
      */
    public boolean hasComment() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'comment' field.
      * @return This builder.
      */
    public Builder clearComment() {
      comment = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public MessageValue build() {
      try {
        MessageValue record = new MessageValue();
        record.productId = fieldSetFlags()[0] ? this.productId : (CharSequence) defaultValue(fields()[0]);
        record.Name = fieldSetFlags()[1] ? this.Name : (CharSequence) defaultValue(fields()[1]);
        record.rating = fieldSetFlags()[2] ? this.rating : (Integer) defaultValue(fields()[2]);
        record.comment = fieldSetFlags()[3] ? this.comment : (CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<MessageValue>
    WRITER$ = (org.apache.avro.io.DatumWriter<MessageValue>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<MessageValue>
    READER$ = (org.apache.avro.io.DatumReader<MessageValue>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
