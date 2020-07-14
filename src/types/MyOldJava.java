package types;

import com.sun.istack.internal.NotNull;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class MyOldJava {

  private String nullableString;

  private String nonNullableString;

  private String noAnnotationString;

  //google findbugs jsr jar required
  @Nullable
  public String getNullableString() {
    return nullableString;
  }

  public void setNullableString(String nullableString) {
    this.nullableString = nullableString;
  }

  @Nonnull
  public String getNonNullableString() {
    return nonNullableString;
  }

  public void setNonNullableString(String nonNullableString) {
    this.nonNullableString = nonNullableString;
  }

  public String getNoAnnotationString() {
    return noAnnotationString;
  }

  public void setNoAnnotationString(String noAnnotationString) {
    this.noAnnotationString = noAnnotationString;
  }
}
