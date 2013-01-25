/*
 * Copyright 2010-2012 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jetbrains.jet.codegen.generated;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.codegen.generated.AbstractBlackBoxCodegenTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.GenerateTests}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/visibility/withJava/protected_static")
public class VisibilityGenWithJavaTestGenerated extends AbstractBlackBoxCodegenTest {
    public void testAllFilesPresentInProtected_static() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/codegen/visibility/withJava/protected_static"), "kt", true);
    }
    
    @TestMetadata("protectedStaticClass.kt")
    public void testProtectedStaticClass() throws Exception {
        blackBoxFileWithJavaByFullPath("compiler/testData/codegen/visibility/withJava/protected_static/protectedStaticClass.kt");
    }
    
    @TestMetadata("protectedStaticClass2.kt")
    public void testProtectedStaticClass2() throws Exception {
        blackBoxFileWithJavaByFullPath("compiler/testData/codegen/visibility/withJava/protected_static/protectedStaticClass2.kt");
    }
    
    @TestMetadata("protectedStaticFun.kt")
    public void testProtectedStaticFun() throws Exception {
        blackBoxFileWithJavaByFullPath("compiler/testData/codegen/visibility/withJava/protected_static/protectedStaticFun.kt");
    }
    
    @TestMetadata("protectedStaticFunCallInConstructor.kt")
    public void testProtectedStaticFunCallInConstructor() throws Exception {
        blackBoxFileWithJavaByFullPath("compiler/testData/codegen/visibility/withJava/protected_static/protectedStaticFunCallInConstructor.kt");
    }
    
    @TestMetadata("protectedStaticFunClassObject.kt")
    public void testProtectedStaticFunClassObject() throws Exception {
        blackBoxFileWithJavaByFullPath("compiler/testData/codegen/visibility/withJava/protected_static/protectedStaticFunClassObject.kt");
    }
    
    @TestMetadata("protectedStaticFunGenericClass.kt")
    public void testProtectedStaticFunGenericClass() throws Exception {
        blackBoxFileWithJavaByFullPath("compiler/testData/codegen/visibility/withJava/protected_static/protectedStaticFunGenericClass.kt");
    }
    
    @TestMetadata("protectedStaticFunNestedStaticClass.kt")
    public void testProtectedStaticFunNestedStaticClass() throws Exception {
        blackBoxFileWithJavaByFullPath("compiler/testData/codegen/visibility/withJava/protected_static/protectedStaticFunNestedStaticClass.kt");
    }
    
    @TestMetadata("protectedStaticFunNestedStaticClass2.kt")
    public void testProtectedStaticFunNestedStaticClass2() throws Exception {
        blackBoxFileWithJavaByFullPath("compiler/testData/codegen/visibility/withJava/protected_static/protectedStaticFunNestedStaticClass2.kt");
    }
    
    @TestMetadata("protectedStaticFunNestedStaticGenericClass.kt")
    public void testProtectedStaticFunNestedStaticGenericClass() throws Exception {
        blackBoxFileWithJavaByFullPath("compiler/testData/codegen/visibility/withJava/protected_static/protectedStaticFunNestedStaticGenericClass.kt");
    }
    
    @TestMetadata("protectedStaticFunNotDirectSuperClass.kt")
    public void testProtectedStaticFunNotDirectSuperClass() throws Exception {
        blackBoxFileWithJavaByFullPath("compiler/testData/codegen/visibility/withJava/protected_static/protectedStaticFunNotDirectSuperClass.kt");
    }
    
    @TestMetadata("protectedStaticFunObject.kt")
    public void testProtectedStaticFunObject() throws Exception {
        blackBoxFileWithJavaByFullPath("compiler/testData/codegen/visibility/withJava/protected_static/protectedStaticFunObject.kt");
    }
    
    @TestMetadata("protectedStaticProperty.kt")
    public void testProtectedStaticProperty() throws Exception {
        blackBoxFileWithJavaByFullPath("compiler/testData/codegen/visibility/withJava/protected_static/protectedStaticProperty.kt");
    }
    
}
