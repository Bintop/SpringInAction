package tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Ingredient {
  // Ingredient 配料
  // 每种配料都有id 名字 和 类型
  private final String id;
  private final String name;
  private final Type type;
  
  public static enum Type {
    WRAP, // 卷饼
    PROTEIN, // 蛋白质
    VEGGIES, // 蔬菜
    CHEESE, // 奶酪
    SAUCE // 酱汁
  }

}
