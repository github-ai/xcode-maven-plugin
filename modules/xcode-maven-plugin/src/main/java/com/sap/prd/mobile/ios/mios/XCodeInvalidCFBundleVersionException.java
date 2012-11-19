/*
 * #%L
 * xcode-maven-plugin
 * %%
 * Copyright (C) 2012 SAP AG
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.sap.prd.mobile.ios.mios;

public class XCodeInvalidCFBundleVersionException extends XCodeException
{

  /**
   * 
   */
  private static final long serialVersionUID = 2939512543487296403L;

  public XCodeInvalidCFBundleVersionException()
  {
    this((String)null);
  }

  public XCodeInvalidCFBundleVersionException(String message, Throwable cause)
  {
    super(message, cause);
  }

  public XCodeInvalidCFBundleVersionException(String message)
  {
    this(message, null);
  }

  public XCodeInvalidCFBundleVersionException(Throwable cause)
  {
    super(null, cause);
  }
}
