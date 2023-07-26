package com.zobaze.mealsearch.domain.model;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\bZ\u0018\u00002\u00020\u0001B\u00e5\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010\'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u0003\u0012\u0006\u0010,\u001a\u00020\u0003\u0012\u0006\u0010-\u001a\u00020\u0003\u0012\u0006\u0010.\u001a\u00020\u0003\u00a2\u0006\u0002\u0010/R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00101R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00101R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00101R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00101R\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00101R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00101R\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00101R\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00101R\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00101R\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u00101R\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00101R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00101R\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00101R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u00101R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u00101R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u00101R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00101R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u00101R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u00101R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u00101R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00101R\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00101R\u0011\u0010$\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u00101R\u0011\u0010%\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u00101R\u0011\u0010&\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u00101R\u0011\u0010\'\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u00101R\u0011\u0010(\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u00101R\u0011\u0010)\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u00101R\u0011\u0010*\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u00101R\u0011\u0010+\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u00101R\u0011\u0010,\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u00101R\u0011\u0010-\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u00101R\u0011\u0010\u001c\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u00101R\u0011\u0010.\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u00101R\u0011\u0010\u001d\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u00101R\u0011\u0010\u001e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u00101R\u0011\u0010\u001f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u00101R\u0011\u0010 \u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u00101R\u0011\u0010!\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u00101R\u0011\u0010\"\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u00101R\u0011\u0010#\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u00101R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u00101\u00a8\u0006]"}, d2 = {"Lcom/zobaze/mealsearch/domain/model/MealDetails;", "", "name", "", "image", "category", "instructions", "ingredient1", "ingredient2", "ingredient3", "ingredient4", "ingredient5", "ingredient6", "ingredient7", "ingredient8", "ingredient9", "ingredient10", "ingredient11", "ingredient12", "ingredient13", "ingredient14", "ingredient15", "ingredient16", "ingredient17", "ingredient18", "ingredient19", "ingredient20", "measure1", "measure2", "measure3", "measure4", "measure5", "measure6", "measure7", "measure8", "measure9", "measure10", "measure11", "measure12", "measure13", "measure14", "measure15", "measure16", "measure17", "measure18", "measure19", "measure20", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getImage", "getIngredient1", "getIngredient10", "getIngredient11", "getIngredient12", "getIngredient13", "getIngredient14", "getIngredient15", "getIngredient16", "getIngredient17", "getIngredient18", "getIngredient19", "getIngredient2", "getIngredient20", "getIngredient3", "getIngredient4", "getIngredient5", "getIngredient6", "getIngredient7", "getIngredient8", "getIngredient9", "getInstructions", "getMeasure1", "getMeasure10", "getMeasure11", "getMeasure12", "getMeasure13", "getMeasure14", "getMeasure15", "getMeasure16", "getMeasure17", "getMeasure18", "getMeasure19", "getMeasure2", "getMeasure20", "getMeasure3", "getMeasure4", "getMeasure5", "getMeasure6", "getMeasure7", "getMeasure8", "getMeasure9", "getName", "app_debug"})
public final class MealDetails {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String image = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String category = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String instructions = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ingredient1 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ingredient2 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ingredient3 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ingredient4 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ingredient5 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ingredient6 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ingredient7 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ingredient8 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ingredient9 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ingredient10 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ingredient11 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ingredient12 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ingredient13 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ingredient14 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ingredient15 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ingredient16 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ingredient17 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ingredient18 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ingredient19 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ingredient20 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String measure1 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String measure2 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String measure3 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String measure4 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String measure5 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String measure6 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String measure7 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String measure8 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String measure9 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String measure10 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String measure11 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String measure12 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String measure13 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String measure14 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String measure15 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String measure16 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String measure17 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String measure18 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String measure19 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String measure20 = null;
    
    public MealDetails(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String image, @org.jetbrains.annotations.NotNull
    java.lang.String category, @org.jetbrains.annotations.NotNull
    java.lang.String instructions, @org.jetbrains.annotations.NotNull
    java.lang.String ingredient1, @org.jetbrains.annotations.NotNull
    java.lang.String ingredient2, @org.jetbrains.annotations.NotNull
    java.lang.String ingredient3, @org.jetbrains.annotations.NotNull
    java.lang.String ingredient4, @org.jetbrains.annotations.NotNull
    java.lang.String ingredient5, @org.jetbrains.annotations.NotNull
    java.lang.String ingredient6, @org.jetbrains.annotations.NotNull
    java.lang.String ingredient7, @org.jetbrains.annotations.NotNull
    java.lang.String ingredient8, @org.jetbrains.annotations.NotNull
    java.lang.String ingredient9, @org.jetbrains.annotations.NotNull
    java.lang.String ingredient10, @org.jetbrains.annotations.NotNull
    java.lang.String ingredient11, @org.jetbrains.annotations.NotNull
    java.lang.String ingredient12, @org.jetbrains.annotations.NotNull
    java.lang.String ingredient13, @org.jetbrains.annotations.NotNull
    java.lang.String ingredient14, @org.jetbrains.annotations.NotNull
    java.lang.String ingredient15, @org.jetbrains.annotations.NotNull
    java.lang.String ingredient16, @org.jetbrains.annotations.NotNull
    java.lang.String ingredient17, @org.jetbrains.annotations.NotNull
    java.lang.String ingredient18, @org.jetbrains.annotations.NotNull
    java.lang.String ingredient19, @org.jetbrains.annotations.NotNull
    java.lang.String ingredient20, @org.jetbrains.annotations.NotNull
    java.lang.String measure1, @org.jetbrains.annotations.NotNull
    java.lang.String measure2, @org.jetbrains.annotations.NotNull
    java.lang.String measure3, @org.jetbrains.annotations.NotNull
    java.lang.String measure4, @org.jetbrains.annotations.NotNull
    java.lang.String measure5, @org.jetbrains.annotations.NotNull
    java.lang.String measure6, @org.jetbrains.annotations.NotNull
    java.lang.String measure7, @org.jetbrains.annotations.NotNull
    java.lang.String measure8, @org.jetbrains.annotations.NotNull
    java.lang.String measure9, @org.jetbrains.annotations.NotNull
    java.lang.String measure10, @org.jetbrains.annotations.NotNull
    java.lang.String measure11, @org.jetbrains.annotations.NotNull
    java.lang.String measure12, @org.jetbrains.annotations.NotNull
    java.lang.String measure13, @org.jetbrains.annotations.NotNull
    java.lang.String measure14, @org.jetbrains.annotations.NotNull
    java.lang.String measure15, @org.jetbrains.annotations.NotNull
    java.lang.String measure16, @org.jetbrains.annotations.NotNull
    java.lang.String measure17, @org.jetbrains.annotations.NotNull
    java.lang.String measure18, @org.jetbrains.annotations.NotNull
    java.lang.String measure19, @org.jetbrains.annotations.NotNull
    java.lang.String measure20) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getInstructions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIngredient1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIngredient2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIngredient3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIngredient4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIngredient5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIngredient6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIngredient7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIngredient8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIngredient9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIngredient10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIngredient11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIngredient12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIngredient13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIngredient14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIngredient15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIngredient16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIngredient17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIngredient18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIngredient19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIngredient20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMeasure1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMeasure2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMeasure3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMeasure4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMeasure5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMeasure6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMeasure7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMeasure8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMeasure9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMeasure10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMeasure11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMeasure12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMeasure13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMeasure14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMeasure15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMeasure16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMeasure17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMeasure18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMeasure19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMeasure20() {
        return null;
    }
}