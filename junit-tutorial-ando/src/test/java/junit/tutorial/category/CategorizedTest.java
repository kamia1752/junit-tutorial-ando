// Copyright(c) 2013 GROWTH XPARTNERS, Incorporated.
//
//
package junit.tutorial.category;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

    @RunWith(Categories.class)
    @IncludeCategory(FastTests.class)
    @ExcludeCategory(SlowTests.class)
    @SuiteClasses({ FooTest.class, BarTest.class })
    public class CategorizedTest{
    }
