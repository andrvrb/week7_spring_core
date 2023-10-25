package ru.egartech.bpp;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Перед вызовом методов в классах помеченных аннотацией открывается транзакция.
 * После выполнения методов транзакция закрывается.
 * !! имитация
 * */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Transaction {
}
