package springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Hugh.Hu
 * @Date: 2020/3/29 10:11 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T>
{

    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message)
    {
       this(code,message,null);
    }
}
