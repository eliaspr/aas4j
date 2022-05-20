//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.07.19 um 12:09:30 PM CEST 
//


package org.opcfoundation.ua._2008._02.types;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für ComplexNumberType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ComplexNumberType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Real" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Imaginary" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplexNumberType", propOrder = {
    "real",
    "imaginary"
})
public class ComplexNumberType {

    @XmlElement(name = "Real")
    protected Float real;
    @XmlElement(name = "Imaginary")
    protected Float imaginary;

    /**
     * Ruft den Wert der real-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getReal() {
        return real;
    }

    /**
     * Legt den Wert der real-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setReal(Float value) {
        this.real = value;
    }

    /**
     * Ruft den Wert der imaginary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getImaginary() {
        return imaginary;
    }

    /**
     * Legt den Wert der imaginary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setImaginary(Float value) {
        this.imaginary = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ComplexNumberType.Builder<_B> _other) {
        _other.real = this.real;
        _other.imaginary = this.imaginary;
    }

    public<_B >ComplexNumberType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ComplexNumberType.Builder<_B>(_parentBuilder, this, true);
    }

    public ComplexNumberType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ComplexNumberType.Builder<Void> builder() {
        return new ComplexNumberType.Builder<Void>(null, null, false);
    }

    public static<_B >ComplexNumberType.Builder<_B> copyOf(final ComplexNumberType _other) {
        final ComplexNumberType.Builder<_B> _newBuilder = new ComplexNumberType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ComplexNumberType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree realPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("real"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(realPropertyTree!= null):((realPropertyTree == null)||(!realPropertyTree.isLeaf())))) {
            _other.real = this.real;
        }
        final PropertyTree imaginaryPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("imaginary"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(imaginaryPropertyTree!= null):((imaginaryPropertyTree == null)||(!imaginaryPropertyTree.isLeaf())))) {
            _other.imaginary = this.imaginary;
        }
    }

    public<_B >ComplexNumberType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ComplexNumberType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ComplexNumberType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ComplexNumberType.Builder<_B> copyOf(final ComplexNumberType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ComplexNumberType.Builder<_B> _newBuilder = new ComplexNumberType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ComplexNumberType.Builder<Void> copyExcept(final ComplexNumberType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ComplexNumberType.Builder<Void> copyOnly(final ComplexNumberType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ComplexNumberType _storedValue;
        private Float real;
        private Float imaginary;

        public Builder(final _B _parentBuilder, final ComplexNumberType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.real = _other.real;
                    this.imaginary = _other.imaginary;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ComplexNumberType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree realPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("real"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(realPropertyTree!= null):((realPropertyTree == null)||(!realPropertyTree.isLeaf())))) {
                        this.real = _other.real;
                    }
                    final PropertyTree imaginaryPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("imaginary"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(imaginaryPropertyTree!= null):((imaginaryPropertyTree == null)||(!imaginaryPropertyTree.isLeaf())))) {
                        this.imaginary = _other.imaginary;
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public _B end() {
            return this._parentBuilder;
        }

        protected<_P extends ComplexNumberType >_P init(final _P _product) {
            _product.real = this.real;
            _product.imaginary = this.imaginary;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "real" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param real
         *     Neuer Wert der Eigenschaft "real".
         */
        public ComplexNumberType.Builder<_B> withReal(final Float real) {
            this.real = real;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "imaginary" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param imaginary
         *     Neuer Wert der Eigenschaft "imaginary".
         */
        public ComplexNumberType.Builder<_B> withImaginary(final Float imaginary) {
            this.imaginary = imaginary;
            return this;
        }

        @Override
        public ComplexNumberType build() {
            if (_storedValue == null) {
                return this.init(new ComplexNumberType());
            } else {
                return ((ComplexNumberType) _storedValue);
            }
        }

        public ComplexNumberType.Builder<_B> copyOf(final ComplexNumberType _other) {
            _other.copyTo(this);
            return this;
        }

        public ComplexNumberType.Builder<_B> copyOf(final ComplexNumberType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ComplexNumberType.Selector<ComplexNumberType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ComplexNumberType.Select _root() {
            return new ComplexNumberType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ComplexNumberType.Selector<TRoot, TParent>> real = null;
        private com.kscs.util.jaxb.Selector<TRoot, ComplexNumberType.Selector<TRoot, TParent>> imaginary = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.real!= null) {
                products.put("real", this.real.init());
            }
            if (this.imaginary!= null) {
                products.put("imaginary", this.imaginary.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ComplexNumberType.Selector<TRoot, TParent>> real() {
            return ((this.real == null)?this.real = new com.kscs.util.jaxb.Selector<TRoot, ComplexNumberType.Selector<TRoot, TParent>>(this._root, this, "real"):this.real);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ComplexNumberType.Selector<TRoot, TParent>> imaginary() {
            return ((this.imaginary == null)?this.imaginary = new com.kscs.util.jaxb.Selector<TRoot, ComplexNumberType.Selector<TRoot, TParent>>(this._root, this, "imaginary"):this.imaginary);
        }

    }

}
