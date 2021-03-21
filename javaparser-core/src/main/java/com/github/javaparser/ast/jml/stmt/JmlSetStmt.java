package com.github.javaparser.ast.jml.stmt;

import com.github.javaparser.ast.AllFieldsConstructor;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.expr.AssignExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.visitor.GenericVisitor;
import com.github.javaparser.ast.visitor.VoidVisitor;
import java.util.Optional;
import java.util.function.Consumer;
import com.github.javaparser.ast.visitor.CloneVisitor;
import com.github.javaparser.metamodel.JmlSetStmtMetaModel;
import com.github.javaparser.metamodel.JavaParserMetaModel;
import com.github.javaparser.TokenRange;
import com.github.javaparser.ast.Generated;
import com.github.javaparser.ast.observer.ObservableProperty;
import static com.github.javaparser.utils.Utils.assertNotNull;

/**
 * @author Alexander Weigl
 * @version 1 (2/21/21)
 */
@Deprecated
public class JmlSetStmt extends JmlStatement {

    private Expression rhs;

    private Expression lhs;

    public JmlSetStmt() {
        this(null, null, null);
    }

    @AllFieldsConstructor
    public JmlSetStmt(Expression rhs, Expression lhs) {
        this.rhs = rhs;
        this.lhs = lhs;
    }

    /**
     * This constructor is used by the parser and is considered private.
     */
    @Generated("com.github.javaparser.generator.core.node.MainConstructorGenerator")
    public JmlSetStmt(TokenRange tokenRange, Expression rhs, Expression lhs) {
        super(tokenRange);
        setRhs(rhs);
        setLhs(lhs);
        customInitialization();
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.AcceptGenerator")
    public <R, A> R accept(final GenericVisitor<R, A> v, final A arg) {
        return v.visit(this, arg);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.AcceptGenerator")
    public <A> void accept(final VoidVisitor<A> v, final A arg) {
        v.visit(this, arg);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isJmlSetStmt() {
        return true;
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public JmlSetStmt asJmlSetStmt() {
        return this;
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<JmlSetStmt> toJmlSetStmt() {
        return Optional.of(this);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifJmlSetStmt(Consumer<JmlSetStmt> action) {
        action.accept(this);
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public Expression getLhs() {
        return lhs;
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public JmlSetStmt setLhs(final Expression lhs) {
        assertNotNull(lhs);
        if (lhs == this.lhs) {
            return this;
        }
        notifyPropertyChange(ObservableProperty.LHS, this.lhs, lhs);
        if (this.lhs != null)
            this.lhs.setParentNode(null);
        this.lhs = lhs;
        setAsParentNodeOf(lhs);
        return this;
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public Expression getRhs() {
        return rhs;
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public JmlSetStmt setRhs(final Expression rhs) {
        assertNotNull(rhs);
        if (rhs == this.rhs) {
            return this;
        }
        notifyPropertyChange(ObservableProperty.RHS, this.rhs, rhs);
        if (this.rhs != null)
            this.rhs.setParentNode(null);
        this.rhs = rhs;
        setAsParentNodeOf(rhs);
        return this;
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
        if (node == lhs) {
            setLhs((Expression) replacementNode);
            return true;
        }
        if (node == rhs) {
            setRhs((Expression) replacementNode);
            return true;
        }
        return super.replace(node, replacementNode);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.CloneGenerator")
    public JmlSetStmt clone() {
        return (JmlSetStmt) accept(new CloneVisitor(), null);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.GetMetaModelGenerator")
    public JmlSetStmtMetaModel getMetaModel() {
        return JavaParserMetaModel.jmlSetStmtMetaModel;
    }
}
