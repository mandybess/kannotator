package org.jetbrains.kannotator.index

import org.jetbrains.kannotator.declarations.AnnotationPosition
import java.util.regex.Pattern
import kotlinlib.*
import org.jetbrains.kannotator.annotations.io.parseMethodAnnotationKey

class AnnotationKeyIndexImpl(private val declarationIndex: DeclarationIndex): AnnotationKeyIndex {
    override fun findPositionByAnnotationKeyString(annotationKey: String): AnnotationPosition? {
        val (canonicalClassName, _, methodName) = parseMethodAnnotationKey(annotationKey)

        return null
    }

}