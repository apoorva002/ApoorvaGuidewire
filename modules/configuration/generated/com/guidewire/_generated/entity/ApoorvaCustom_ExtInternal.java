package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ApoorvaCustom_Ext.eti;ApoorvaCustom_Ext.eix;ApoorvaCustom_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ApoorvaCustom_ExtInternal extends com.guidewire._generated.entity.RetireableInternal {
  /**
   * Gets the value of the FirstName field.
   * FirstName
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFirstName();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Sets the value of the FirstName field.
   */
  public void setFirstName(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  
}