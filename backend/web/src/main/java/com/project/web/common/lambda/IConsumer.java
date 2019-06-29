package com.project.web.common.lambda;

import java.util.function.Consumer;

@FunctionalInterface
public interface IConsumer {
    public abstract void accept(Object o);
}
   