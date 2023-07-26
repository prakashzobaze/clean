package com.zobaze.mealsearch.presentation;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/zobaze/mealsearch/presentation/APIExceptionEvent;", "", "()V", "Forbidden", "Unauthorized", "Unknown", "Lcom/zobaze/mealsearch/presentation/APIExceptionEvent$Forbidden;", "Lcom/zobaze/mealsearch/presentation/APIExceptionEvent$Unauthorized;", "Lcom/zobaze/mealsearch/presentation/APIExceptionEvent$Unknown;", "app_debug"})
public abstract class APIExceptionEvent {
    
    private APIExceptionEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/zobaze/mealsearch/presentation/APIExceptionEvent$Forbidden;", "Lcom/zobaze/mealsearch/presentation/APIExceptionEvent;", "()V", "app_debug"})
    public static final class Forbidden extends com.zobaze.mealsearch.presentation.APIExceptionEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.zobaze.mealsearch.presentation.APIExceptionEvent.Forbidden INSTANCE = null;
        
        private Forbidden() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/zobaze/mealsearch/presentation/APIExceptionEvent$Unauthorized;", "Lcom/zobaze/mealsearch/presentation/APIExceptionEvent;", "()V", "app_debug"})
    public static final class Unauthorized extends com.zobaze.mealsearch.presentation.APIExceptionEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.zobaze.mealsearch.presentation.APIExceptionEvent.Unauthorized INSTANCE = null;
        
        private Unauthorized() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/zobaze/mealsearch/presentation/APIExceptionEvent$Unknown;", "Lcom/zobaze/mealsearch/presentation/APIExceptionEvent;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "app_debug"})
    public static final class Unknown extends com.zobaze.mealsearch.presentation.APIExceptionEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String message = null;
        
        public Unknown(@org.jetbrains.annotations.NotNull
        java.lang.String message) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getMessage() {
            return null;
        }
    }
}