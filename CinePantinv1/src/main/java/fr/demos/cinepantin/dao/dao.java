package fr.demos.cinepantin.dao;

import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



import javax.inject.Qualifier;
// jusqua quand conserve t -on l annotation
@Retention(RetentionPolicy.RUNTIME)
//ou placer l annotation
@Target({ElementType.TYPE, ElementType.FIELD})
// qualification de l injection
@Qualifier
public @interface dao {

}