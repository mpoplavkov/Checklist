package com.poplavkov.lexical

import com.poplavkov.lexical.Typ.Typ

//TODO: 'optional' flag
case class Parameter(typ: Typ, name: String, description: String)
