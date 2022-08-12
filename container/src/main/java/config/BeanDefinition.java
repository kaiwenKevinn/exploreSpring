package config;

/**
 * @author Kevin
 * @Description
 */
public class BeanDefinition {
    private Class beanClass;

    private PropertyValues propertyValues;
    // initMethodName、 destroyMethodName，这两个属性是为了在 spring.xml 配置的 Bean 对象中，可以配置
    // initMethod="initDataMethod" destroyMethod="destroyDataMethod" 操作，最终实现接口的效果是一样的。
    // 只不过一个是接口方法的直接调用，另外是一个在配置文件中读取到方法反射调用
    private String initMethodName;

    private String destroyMethodName;

    public BeanDefinition(Class beanClass){
        this.beanClass=beanClass;
        this.propertyValues = new PropertyValues();
    }
    public BeanDefinition(Class beanClass,PropertyValues propertyValues){
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    public String getInitMethodName() {
        return initMethodName;
    }

    public void setInitMethodName(String initMethodName) {
        this.initMethodName = initMethodName;
    }

    public String getDestroyMethodName() {
        return destroyMethodName;
    }

    public void setDestroyMethodName(String destroyMethodName) {
        this.destroyMethodName = destroyMethodName;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }

    public Class getBeanClass(){
        return beanClass;
    }
}
