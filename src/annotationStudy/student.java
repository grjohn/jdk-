package annotationStudy;

import sun.security.util.Length;

/**
 * @Classname student
 * @Description TODO
 * @Author John
 * @Date 2019/4/21 15:22
 * @Version 1.0
 */
@stutable("tb_student")
public class student {
    @stufield(columnName="name",type="varchar",length=10)
    String name;
    @stufield(columnName="id",type="int",length=10)
    int id;
    @stufield(columnName="age",type="int",length=10)
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
