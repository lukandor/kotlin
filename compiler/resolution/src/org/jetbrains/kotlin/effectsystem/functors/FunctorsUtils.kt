/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.effectsystem.functors

import org.jetbrains.kotlin.effectsystem.impls.or
import org.jetbrains.kotlin.effectsystem.factories.lift
import org.jetbrains.kotlin.effectsystem.structure.*

internal fun foldConclusionsWithOr(list: List<ESClause>) =
        list.fold(false.lift() as ESBooleanExpression) { acc, esClause -> acc.or(esClause.condition) }

/**
 * Places all clauses that equal to `firstModel` into first list, and all clauses that equal to `secondModel` into second list
 */
internal fun List<ESClause>.partitionByOutcome(firstModel: ESEffect, secondModel: ESEffect): Pair<List<ESClause>, List<ESClause>> {
    val first = mutableListOf<ESClause>()
    val second = mutableListOf<ESClause>()

    forEach {
        if (it.effect == firstModel) first += it
        if (it.effect == secondModel) second += it
    }

    return first to second
}

/**
 * Object that represents absence of information about particular part of code
 */
object UnknownFunctor : ESFunctor, EffectSchema {
    override fun apply(arguments: List<EffectSchema>): EffectSchema? = this
    override val clauses: List<ESClause> = listOf()
}