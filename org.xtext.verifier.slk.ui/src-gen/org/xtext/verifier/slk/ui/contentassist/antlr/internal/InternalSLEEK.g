/*
* generated by Xtext
*/
grammar InternalSLEEK;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.xtext.verifier.slk.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.verifier.slk.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.verifier.slk.services.SLEEKGrammarAccess;

}

@parser::members {
 
 	private SLEEKGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(SLEEKGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleSLEEK
entryRuleSLEEK 
:
{ before(grammarAccess.getSLEEKRule()); }
	 ruleSLEEK
{ after(grammarAccess.getSLEEKRule()); } 
	 EOF 
;

// Rule SLEEK
ruleSLEEK
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSLEEKAccess().getKeywordsAssignment()); }
(rule__SLEEK__KeywordsAssignment)*
{ after(grammarAccess.getSLEEKAccess().getKeywordsAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleArgu
entryRuleArgu 
:
{ before(grammarAccess.getArguRule()); }
	 ruleArgu
{ after(grammarAccess.getArguRule()); } 
	 EOF 
;

// Rule Argu
ruleArgu
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getArguAccess().getAlternatives()); }
(rule__Argu__Alternatives)
{ after(grammarAccess.getArguAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleData
entryRuleData 
:
{ before(grammarAccess.getDataRule()); }
	 ruleData
{ after(grammarAccess.getDataRule()); } 
	 EOF 
;

// Rule Data
ruleData
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDataAccess().getGroup()); }
(rule__Data__Group__0)
{ after(grammarAccess.getDataAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleLemma
entryRuleLemma 
:
{ before(grammarAccess.getLemmaRule()); }
	 ruleLemma
{ after(grammarAccess.getLemmaRule()); } 
	 EOF 
;

// Rule Lemma
ruleLemma
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getLemmaAccess().getGroup()); }
(rule__Lemma__Group__0)
{ after(grammarAccess.getLemmaAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePrecodition
entryRulePrecodition 
:
{ before(grammarAccess.getPrecoditionRule()); }
	 rulePrecodition
{ after(grammarAccess.getPrecoditionRule()); } 
	 EOF 
;

// Rule Precodition
rulePrecodition
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPrecoditionAccess().getGroup()); }
(rule__Precodition__Group__0)
{ after(grammarAccess.getPrecoditionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleArgument
entryRuleArgument 
:
{ before(grammarAccess.getArgumentRule()); }
	 ruleArgument
{ after(grammarAccess.getArgumentRule()); } 
	 EOF 
;

// Rule Argument
ruleArgument
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getArgumentAccess().getGroup()); }
(rule__Argument__Group__0)
{ after(grammarAccess.getArgumentAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePrint
entryRulePrint 
:
{ before(grammarAccess.getPrintRule()); }
	 rulePrint
{ after(grammarAccess.getPrintRule()); } 
	 EOF 
;

// Rule Print
rulePrint
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPrintAccess().getGroup()); }
(rule__Print__Group__0)
{ after(grammarAccess.getPrintAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Argu__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArguAccess().getPrecoditionParserRuleCall_0()); }
	rulePrecodition
{ after(grammarAccess.getArguAccess().getPrecoditionParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getArguAccess().getDataParserRuleCall_1()); }
	ruleData
{ after(grammarAccess.getArguAccess().getDataParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getArguAccess().getLemmaParserRuleCall_2()); }
	ruleLemma
{ after(grammarAccess.getArguAccess().getLemmaParserRuleCall_2()); }
)

    |(
{ before(grammarAccess.getArguAccess().getArgumentParserRuleCall_3()); }
	ruleArgument
{ after(grammarAccess.getArguAccess().getArgumentParserRuleCall_3()); }
)

    |(
{ before(grammarAccess.getArguAccess().getPrintParserRuleCall_4()); }
	rulePrint
{ after(grammarAccess.getArguAccess().getPrintParserRuleCall_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Data__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Data__Group__0__Impl
	rule__Data__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Data__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataAccess().getDataKeyword_0()); }

	'data' 

{ after(grammarAccess.getDataAccess().getDataKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Data__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Data__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Data__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataAccess().getNameAssignment_1()); }
(rule__Data__NameAssignment_1)
{ after(grammarAccess.getDataAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Lemma__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Lemma__Group__0__Impl
	rule__Lemma__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Lemma__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLemmaAccess().getLemmaKeyword_0()); }

	'lemma' 

{ after(grammarAccess.getLemmaAccess().getLemmaKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Lemma__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Lemma__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Lemma__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLemmaAccess().getNameAssignment_1()); }
(rule__Lemma__NameAssignment_1)
{ after(grammarAccess.getLemmaAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Precodition__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Precodition__Group__0__Impl
	rule__Precodition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Precodition__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrecoditionAccess().getPredKeyword_0()); }

	'pred' 

{ after(grammarAccess.getPrecoditionAccess().getPredKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Precodition__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Precodition__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Precodition__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrecoditionAccess().getNameAssignment_1()); }
(rule__Precodition__NameAssignment_1)
{ after(grammarAccess.getPrecoditionAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Argument__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group__0__Impl
	rule__Argument__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getCheckentailKeyword_0()); }

	'checkentail' 

{ after(grammarAccess.getArgumentAccess().getCheckentailKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getNameAssignment_1()); }
(rule__Argument__NameAssignment_1)
{ after(grammarAccess.getArgumentAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Print__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Print__Group__0__Impl
	rule__Print__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Print__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrintAccess().getPrintKeyword_0()); }

	'print' 

{ after(grammarAccess.getPrintAccess().getPrintKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Print__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Print__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Print__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrintAccess().getNameAssignment_1()); }
(rule__Print__NameAssignment_1)
{ after(grammarAccess.getPrintAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__SLEEK__KeywordsAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSLEEKAccess().getKeywordsArguParserRuleCall_0()); }
	ruleArgu{ after(grammarAccess.getSLEEKAccess().getKeywordsArguParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Data__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataAccess().getNameSLKTerminalRuleCall_1_0()); }
	RULE_SLK{ after(grammarAccess.getDataAccess().getNameSLKTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Lemma__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLemmaAccess().getNameSLKTerminalRuleCall_1_0()); }
	RULE_SLK{ after(grammarAccess.getLemmaAccess().getNameSLKTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Precodition__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrecoditionAccess().getNameSLKTerminalRuleCall_1_0()); }
	RULE_SLK{ after(grammarAccess.getPrecoditionAccess().getNameSLKTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getNameSLKTerminalRuleCall_1_0()); }
	RULE_SLK{ after(grammarAccess.getArgumentAccess().getNameSLKTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Print__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrintAccess().getNameSLKTerminalRuleCall_1_0()); }
	RULE_SLK{ after(grammarAccess.getPrintAccess().getNameSLKTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_SLK : RULE_WS+ ~('.')* '|-'? ~('.')* '.' RULE_WS*;

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


