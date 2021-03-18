package com.github.javaparser.ast.clauses;

import com.github.javaparser.TokenRange;
import com.github.javaparser.ast.AllFieldsConstructor;
import com.github.javaparser.ast.Generated;
import com.github.javaparser.ast.Jmlish;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.visitor.CloneVisitor;
import com.github.javaparser.ast.visitor.GenericVisitor;
import com.github.javaparser.ast.visitor.VoidVisitor;
import com.github.javaparser.metamodel.JavaParserMetaModel;
import com.github.javaparser.metamodel.JmlClauseMetaModel;
import com.github.javaparser.ast.observer.ObservableProperty;
import static com.github.javaparser.utils.Utils.assertNotNull;

/**
 * @author Alexander Weigl
 * @version 1 (2/21/21)
 */
public abstract class JmlClause extends Node implements Jmlish {

    public enum Kind {

        ENSURES,
        ENSURES_FREE,
        ENSURES_REDUNDANTLY,
        REQUIRES,
        REQUIRES_FREE,
        REQUIRES_REDUNDANTLY,
        DECREASES,
        MODIFIES,
        MODIFIABLE,
        ASSIGNABLE,
        ACCESSIBLE,
        PRE,
        POST,
        LOOP_INVARIANT,
        MEASURED_BY,
        RETURNS,
        BREAKS,
        CONTINUES,
        OLD,
        FORALL,
        SIGNALS,
        SIGNALS_ONLY,
        WHEN,
        WORKING_SPACE,
        CAPTURES,
        INITIALLY,
        INVARIANT,
        ASSIGNABLE_REDUNDANTLY,
        MODIFIABLE_REDUNDANTLY,
        MODIFIES_REDUNDANTLY,
        CAPTURES_REDUNDANTLY,
        CALLABLE,
        DIVERGES,
        DURATION;

        public final String jmlSymbol;

        Kind() {
            jmlSymbol = name();
        }

        Kind(String jmlSymbol) {
            this.jmlSymbol = jmlSymbol;
        }
    }

    private Kind kind;

    public JmlClause() {
        this((TokenRange) null);
    }

    @AllFieldsConstructor
    public JmlClause(final Kind kind) {
        this(null, kind);
    }

    /**
     * This constructor is used by the parser and is considered private.
     */
    @Generated("com.github.javaparser.generator.core.node.MainConstructorGenerator")
    public JmlClause(TokenRange tokenRange) {
        super(tokenRange);
        customInitialization();
    }

    @Override
    public <R, A> R accept(GenericVisitor<R, A> v, A arg) {
        return null;
    }

    @Override
    public <A> void accept(VoidVisitor<A> v, A arg) {
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.RemoveMethodGenerator")
    public boolean remove(Node node) {
        if (node == null)
            return false;
        return super.remove(node);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.ReplaceMethodGenerator")
    public boolean replace(Node node, Node replacementNode) {
        if (node == null)
            return false;
        return super.replace(node, replacementNode);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.CloneGenerator")
    public JmlClause clone() {
        return (JmlClause) accept(new CloneVisitor(), null);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.GetMetaModelGenerator")
    public JmlClauseMetaModel getMetaModel() {
        return JavaParserMetaModel.jmlClauseMetaModel;
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public Kind getKind() {
        return kind;
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public JmlClause setKind(final Kind kind) {
        assertNotNull(kind);
        if (kind == this.kind) {
            return this;
        }
        notifyPropertyChange(ObservableProperty.KIND, this.kind, kind);
        this.kind = kind;
        return this;
    }

    /**
     * This constructor is used by the parser and is considered private.
     */
    @Generated("com.github.javaparser.generator.core.node.MainConstructorGenerator")
    public JmlClause(TokenRange tokenRange, Kind kind) {
        super(tokenRange);
        setKind(kind);
        customInitialization();
    }
}