package com.github.jmlparser.wd;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParserConfiguration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static com.github.jmlparser.wd.WellDefinednessMain.isWelldefined;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Alexander Weigl
 * @version 1 (14.06.22)
 */
class WDVisitorExprTest {
    private final JavaParser parser = new JavaParser();

    @ParameterizedTest
    @CsvFileSource(resources = "wd-expr.csv", delimiterString = "§")
    void wdExpression(String expr) {
        assertTrue(isWelldefined(parser, expr));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "not-wd-expr.csv", delimiterString = "§")
    void wdExpressionError(String expr) {
        assertFalse(isWelldefined(parser, expr));
    }
}
