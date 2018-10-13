# Oberon0Parser

A parser for Oberon-0 programming language

Oberon-0语言逆向分析工具

## 运行效果

对以下代码进行分析：([samples/sort.obr](samples/sort.obr))
```
module Sort;

    (* Calculates the length of an array. *)
    procedure length(a: array 100 of integer; endingValue: integer; var result: integer);
        var
            i: integer;
        begin
            i := 0;
            (* Loop until the ending value in the given array is found. *)
            while i < 100 do
                if a[i] = endingValue then
                    result := i + 1;
                    i := 100
                end;
                i := i + 1
            end;
        end length;

    (* Swap two integers. *)
    procedure swap(var a: integer; var b: integer);
        var
            temp: integer;
        begin
            temp := a;
            a := b;
            b := temp;
        end swap;

    (* Do bubble sort on an array. *)
    procedure bubbleSort(var a: array 100 of integer);
        var
            n, swapped, i: integer;
        begin
            length(A, -1, n);
            swapped := 1;
            i := 0;
            while swapped = 1 do
                swapped := 0;
                while i < n do
                    if a[i-1] > a[i] then
                        swap(a[i-1], a[i]);
                        swapped := 1
                    end;
                    i := i + 1
                end
            end;
        end bubbleSort;

end Sort.
```

![Demo](resources/demo.png)

## 使用方法

```bash
./deployment/build.sh
java Main -f ./samples/sort.obr
```

## 目录结构

flex: JFlex词法分析定义文件
cup: JavaCUP语法分析定义文件
src: 逆向分析器Java代码
samples: Oberon-0示例代码
deployment: 部署脚本
lib: 项目依赖包
resources: README展示所需的资源文件

## 项目展示

![Pic 01 / 19](resources/presentation/01.png)
![Pic 02 / 19](resources/presentation/02.png)
![Pic 03 / 19](resources/presentation/03.png)
![Pic 04 / 19](resources/presentation/04.png)
![Pic 05 / 19](resources/presentation/05.png)
![Pic 06 / 19](resources/presentation/06.png)
![Pic 07 / 19](resources/presentation/07.png)
![Pic 08 / 19](resources/presentation/08.png)
![Pic 09 / 19](resources/presentation/09.png)
![Pic 10 / 19](resources/presentation/10.png)
![Pic 11 / 19](resources/presentation/11.png)
![Pic 12 / 19](resources/presentation/12.png)
![Pic 13 / 19](resources/presentation/13.png)
![Pic 14 / 19](resources/presentation/14.png)
![Pic 15 / 19](resources/presentation/15.png)
![Pic 16 / 19](resources/presentation/16.png)
![Pic 17 / 19](resources/presentation/17.png)
![Pic 18 / 19](resources/presentation/18.png)
![Pic 19 / 19](resources/presentation/19.png)
