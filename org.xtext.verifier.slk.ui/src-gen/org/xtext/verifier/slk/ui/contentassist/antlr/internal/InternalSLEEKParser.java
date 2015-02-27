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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSLEEKParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SLK", "RULE_WS", "RULE_ML_COMMENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'data'", "'lemma'", "'pred'", "'checkentail'", "'print'"
    };
    public static final int RULE_ID=7;
    public static final int RULE_STRING=9;
    public static final int RULE_SLK=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=8;
    public static final int RULE_WS=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=6;

    // delegates
    // delegators


        public InternalSLEEKParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSLEEKParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSLEEKParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g"; }


     
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




    // $ANTLR start "entryRuleSLEEK"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:60:1: entryRuleSLEEK : ruleSLEEK EOF ;
    public final void entryRuleSLEEK() throws RecognitionException {
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:61:1: ( ruleSLEEK EOF )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:62:1: ruleSLEEK EOF
            {
             before(grammarAccess.getSLEEKRule()); 
            pushFollow(FOLLOW_ruleSLEEK_in_entryRuleSLEEK61);
            ruleSLEEK();

            state._fsp--;

             after(grammarAccess.getSLEEKRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSLEEK68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSLEEK"


    // $ANTLR start "ruleSLEEK"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:69:1: ruleSLEEK : ( ( rule__SLEEK__KeywordsAssignment )* ) ;
    public final void ruleSLEEK() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:73:2: ( ( ( rule__SLEEK__KeywordsAssignment )* ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:74:1: ( ( rule__SLEEK__KeywordsAssignment )* )
            {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:74:1: ( ( rule__SLEEK__KeywordsAssignment )* )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:75:1: ( rule__SLEEK__KeywordsAssignment )*
            {
             before(grammarAccess.getSLEEKAccess().getKeywordsAssignment()); 
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:76:1: ( rule__SLEEK__KeywordsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:76:2: rule__SLEEK__KeywordsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__SLEEK__KeywordsAssignment_in_ruleSLEEK94);
            	    rule__SLEEK__KeywordsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSLEEKAccess().getKeywordsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSLEEK"


    // $ANTLR start "entryRuleArgu"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:88:1: entryRuleArgu : ruleArgu EOF ;
    public final void entryRuleArgu() throws RecognitionException {
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:89:1: ( ruleArgu EOF )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:90:1: ruleArgu EOF
            {
             before(grammarAccess.getArguRule()); 
            pushFollow(FOLLOW_ruleArgu_in_entryRuleArgu122);
            ruleArgu();

            state._fsp--;

             after(grammarAccess.getArguRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgu129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArgu"


    // $ANTLR start "ruleArgu"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:97:1: ruleArgu : ( ( rule__Argu__Alternatives ) ) ;
    public final void ruleArgu() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:101:2: ( ( ( rule__Argu__Alternatives ) ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:102:1: ( ( rule__Argu__Alternatives ) )
            {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:102:1: ( ( rule__Argu__Alternatives ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:103:1: ( rule__Argu__Alternatives )
            {
             before(grammarAccess.getArguAccess().getAlternatives()); 
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:104:1: ( rule__Argu__Alternatives )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:104:2: rule__Argu__Alternatives
            {
            pushFollow(FOLLOW_rule__Argu__Alternatives_in_ruleArgu155);
            rule__Argu__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArguAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgu"


    // $ANTLR start "entryRuleData"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:116:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:117:1: ( ruleData EOF )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:118:1: ruleData EOF
            {
             before(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_ruleData_in_entryRuleData182);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleData189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:125:1: ruleData : ( ( rule__Data__Group__0 ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:129:2: ( ( ( rule__Data__Group__0 ) ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:130:1: ( ( rule__Data__Group__0 ) )
            {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:130:1: ( ( rule__Data__Group__0 ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:131:1: ( rule__Data__Group__0 )
            {
             before(grammarAccess.getDataAccess().getGroup()); 
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:132:1: ( rule__Data__Group__0 )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:132:2: rule__Data__Group__0
            {
            pushFollow(FOLLOW_rule__Data__Group__0_in_ruleData215);
            rule__Data__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleLemma"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:144:1: entryRuleLemma : ruleLemma EOF ;
    public final void entryRuleLemma() throws RecognitionException {
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:145:1: ( ruleLemma EOF )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:146:1: ruleLemma EOF
            {
             before(grammarAccess.getLemmaRule()); 
            pushFollow(FOLLOW_ruleLemma_in_entryRuleLemma242);
            ruleLemma();

            state._fsp--;

             after(grammarAccess.getLemmaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLemma249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLemma"


    // $ANTLR start "ruleLemma"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:153:1: ruleLemma : ( ( rule__Lemma__Group__0 ) ) ;
    public final void ruleLemma() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:157:2: ( ( ( rule__Lemma__Group__0 ) ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:158:1: ( ( rule__Lemma__Group__0 ) )
            {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:158:1: ( ( rule__Lemma__Group__0 ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:159:1: ( rule__Lemma__Group__0 )
            {
             before(grammarAccess.getLemmaAccess().getGroup()); 
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:160:1: ( rule__Lemma__Group__0 )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:160:2: rule__Lemma__Group__0
            {
            pushFollow(FOLLOW_rule__Lemma__Group__0_in_ruleLemma275);
            rule__Lemma__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLemmaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLemma"


    // $ANTLR start "entryRulePrecodition"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:172:1: entryRulePrecodition : rulePrecodition EOF ;
    public final void entryRulePrecodition() throws RecognitionException {
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:173:1: ( rulePrecodition EOF )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:174:1: rulePrecodition EOF
            {
             before(grammarAccess.getPrecoditionRule()); 
            pushFollow(FOLLOW_rulePrecodition_in_entryRulePrecodition302);
            rulePrecodition();

            state._fsp--;

             after(grammarAccess.getPrecoditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrecodition309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrecodition"


    // $ANTLR start "rulePrecodition"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:181:1: rulePrecodition : ( ( rule__Precodition__Group__0 ) ) ;
    public final void rulePrecodition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:185:2: ( ( ( rule__Precodition__Group__0 ) ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:186:1: ( ( rule__Precodition__Group__0 ) )
            {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:186:1: ( ( rule__Precodition__Group__0 ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:187:1: ( rule__Precodition__Group__0 )
            {
             before(grammarAccess.getPrecoditionAccess().getGroup()); 
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:188:1: ( rule__Precodition__Group__0 )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:188:2: rule__Precodition__Group__0
            {
            pushFollow(FOLLOW_rule__Precodition__Group__0_in_rulePrecodition335);
            rule__Precodition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrecoditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrecodition"


    // $ANTLR start "entryRuleArgument"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:200:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:201:1: ( ruleArgument EOF )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:202:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument362);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:209:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:213:2: ( ( ( rule__Argument__Group__0 ) ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:214:1: ( ( rule__Argument__Group__0 ) )
            {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:214:1: ( ( rule__Argument__Group__0 ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:215:1: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:216:1: ( rule__Argument__Group__0 )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:216:2: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_rule__Argument__Group__0_in_ruleArgument395);
            rule__Argument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRulePrint"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:228:1: entryRulePrint : rulePrint EOF ;
    public final void entryRulePrint() throws RecognitionException {
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:229:1: ( rulePrint EOF )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:230:1: rulePrint EOF
            {
             before(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_rulePrint_in_entryRulePrint422);
            rulePrint();

            state._fsp--;

             after(grammarAccess.getPrintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrint429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:237:1: rulePrint : ( ( rule__Print__Group__0 ) ) ;
    public final void rulePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:241:2: ( ( ( rule__Print__Group__0 ) ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:242:1: ( ( rule__Print__Group__0 ) )
            {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:242:1: ( ( rule__Print__Group__0 ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:243:1: ( rule__Print__Group__0 )
            {
             before(grammarAccess.getPrintAccess().getGroup()); 
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:244:1: ( rule__Print__Group__0 )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:244:2: rule__Print__Group__0
            {
            pushFollow(FOLLOW_rule__Print__Group__0_in_rulePrint455);
            rule__Print__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrint"


    // $ANTLR start "rule__Argu__Alternatives"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:256:1: rule__Argu__Alternatives : ( ( rulePrecodition ) | ( ruleData ) | ( ruleLemma ) | ( ruleArgument ) | ( rulePrint ) );
    public final void rule__Argu__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:260:1: ( ( rulePrecodition ) | ( ruleData ) | ( ruleLemma ) | ( ruleArgument ) | ( rulePrint ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            case 16:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:261:1: ( rulePrecodition )
                    {
                    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:261:1: ( rulePrecodition )
                    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:262:1: rulePrecodition
                    {
                     before(grammarAccess.getArguAccess().getPrecoditionParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePrecodition_in_rule__Argu__Alternatives491);
                    rulePrecodition();

                    state._fsp--;

                     after(grammarAccess.getArguAccess().getPrecoditionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:267:6: ( ruleData )
                    {
                    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:267:6: ( ruleData )
                    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:268:1: ruleData
                    {
                     before(grammarAccess.getArguAccess().getDataParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleData_in_rule__Argu__Alternatives508);
                    ruleData();

                    state._fsp--;

                     after(grammarAccess.getArguAccess().getDataParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:273:6: ( ruleLemma )
                    {
                    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:273:6: ( ruleLemma )
                    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:274:1: ruleLemma
                    {
                     before(grammarAccess.getArguAccess().getLemmaParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleLemma_in_rule__Argu__Alternatives525);
                    ruleLemma();

                    state._fsp--;

                     after(grammarAccess.getArguAccess().getLemmaParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:279:6: ( ruleArgument )
                    {
                    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:279:6: ( ruleArgument )
                    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:280:1: ruleArgument
                    {
                     before(grammarAccess.getArguAccess().getArgumentParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleArgument_in_rule__Argu__Alternatives542);
                    ruleArgument();

                    state._fsp--;

                     after(grammarAccess.getArguAccess().getArgumentParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:285:6: ( rulePrint )
                    {
                    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:285:6: ( rulePrint )
                    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:286:1: rulePrint
                    {
                     before(grammarAccess.getArguAccess().getPrintParserRuleCall_4()); 
                    pushFollow(FOLLOW_rulePrint_in_rule__Argu__Alternatives559);
                    rulePrint();

                    state._fsp--;

                     after(grammarAccess.getArguAccess().getPrintParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argu__Alternatives"


    // $ANTLR start "rule__Data__Group__0"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:298:1: rule__Data__Group__0 : rule__Data__Group__0__Impl rule__Data__Group__1 ;
    public final void rule__Data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:302:1: ( rule__Data__Group__0__Impl rule__Data__Group__1 )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:303:2: rule__Data__Group__0__Impl rule__Data__Group__1
            {
            pushFollow(FOLLOW_rule__Data__Group__0__Impl_in_rule__Data__Group__0589);
            rule__Data__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Data__Group__1_in_rule__Data__Group__0592);
            rule__Data__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__0"


    // $ANTLR start "rule__Data__Group__0__Impl"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:310:1: rule__Data__Group__0__Impl : ( 'data' ) ;
    public final void rule__Data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:314:1: ( ( 'data' ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:315:1: ( 'data' )
            {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:315:1: ( 'data' )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:316:1: 'data'
            {
             before(grammarAccess.getDataAccess().getDataKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Data__Group__0__Impl620); 
             after(grammarAccess.getDataAccess().getDataKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__0__Impl"


    // $ANTLR start "rule__Data__Group__1"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:329:1: rule__Data__Group__1 : rule__Data__Group__1__Impl ;
    public final void rule__Data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:333:1: ( rule__Data__Group__1__Impl )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:334:2: rule__Data__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Data__Group__1__Impl_in_rule__Data__Group__1651);
            rule__Data__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__1"


    // $ANTLR start "rule__Data__Group__1__Impl"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:340:1: rule__Data__Group__1__Impl : ( ( rule__Data__NameAssignment_1 ) ) ;
    public final void rule__Data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:344:1: ( ( ( rule__Data__NameAssignment_1 ) ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:345:1: ( ( rule__Data__NameAssignment_1 ) )
            {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:345:1: ( ( rule__Data__NameAssignment_1 ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:346:1: ( rule__Data__NameAssignment_1 )
            {
             before(grammarAccess.getDataAccess().getNameAssignment_1()); 
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:347:1: ( rule__Data__NameAssignment_1 )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:347:2: rule__Data__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Data__NameAssignment_1_in_rule__Data__Group__1__Impl678);
            rule__Data__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__1__Impl"


    // $ANTLR start "rule__Lemma__Group__0"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:361:1: rule__Lemma__Group__0 : rule__Lemma__Group__0__Impl rule__Lemma__Group__1 ;
    public final void rule__Lemma__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:365:1: ( rule__Lemma__Group__0__Impl rule__Lemma__Group__1 )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:366:2: rule__Lemma__Group__0__Impl rule__Lemma__Group__1
            {
            pushFollow(FOLLOW_rule__Lemma__Group__0__Impl_in_rule__Lemma__Group__0712);
            rule__Lemma__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Lemma__Group__1_in_rule__Lemma__Group__0715);
            rule__Lemma__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lemma__Group__0"


    // $ANTLR start "rule__Lemma__Group__0__Impl"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:373:1: rule__Lemma__Group__0__Impl : ( 'lemma' ) ;
    public final void rule__Lemma__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:377:1: ( ( 'lemma' ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:378:1: ( 'lemma' )
            {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:378:1: ( 'lemma' )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:379:1: 'lemma'
            {
             before(grammarAccess.getLemmaAccess().getLemmaKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Lemma__Group__0__Impl743); 
             after(grammarAccess.getLemmaAccess().getLemmaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lemma__Group__0__Impl"


    // $ANTLR start "rule__Lemma__Group__1"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:392:1: rule__Lemma__Group__1 : rule__Lemma__Group__1__Impl ;
    public final void rule__Lemma__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:396:1: ( rule__Lemma__Group__1__Impl )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:397:2: rule__Lemma__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Lemma__Group__1__Impl_in_rule__Lemma__Group__1774);
            rule__Lemma__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lemma__Group__1"


    // $ANTLR start "rule__Lemma__Group__1__Impl"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:403:1: rule__Lemma__Group__1__Impl : ( ( rule__Lemma__NameAssignment_1 ) ) ;
    public final void rule__Lemma__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:407:1: ( ( ( rule__Lemma__NameAssignment_1 ) ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:408:1: ( ( rule__Lemma__NameAssignment_1 ) )
            {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:408:1: ( ( rule__Lemma__NameAssignment_1 ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:409:1: ( rule__Lemma__NameAssignment_1 )
            {
             before(grammarAccess.getLemmaAccess().getNameAssignment_1()); 
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:410:1: ( rule__Lemma__NameAssignment_1 )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:410:2: rule__Lemma__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Lemma__NameAssignment_1_in_rule__Lemma__Group__1__Impl801);
            rule__Lemma__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLemmaAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lemma__Group__1__Impl"


    // $ANTLR start "rule__Precodition__Group__0"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:424:1: rule__Precodition__Group__0 : rule__Precodition__Group__0__Impl rule__Precodition__Group__1 ;
    public final void rule__Precodition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:428:1: ( rule__Precodition__Group__0__Impl rule__Precodition__Group__1 )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:429:2: rule__Precodition__Group__0__Impl rule__Precodition__Group__1
            {
            pushFollow(FOLLOW_rule__Precodition__Group__0__Impl_in_rule__Precodition__Group__0835);
            rule__Precodition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precodition__Group__1_in_rule__Precodition__Group__0838);
            rule__Precodition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precodition__Group__0"


    // $ANTLR start "rule__Precodition__Group__0__Impl"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:436:1: rule__Precodition__Group__0__Impl : ( 'pred' ) ;
    public final void rule__Precodition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:440:1: ( ( 'pred' ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:441:1: ( 'pred' )
            {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:441:1: ( 'pred' )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:442:1: 'pred'
            {
             before(grammarAccess.getPrecoditionAccess().getPredKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Precodition__Group__0__Impl866); 
             after(grammarAccess.getPrecoditionAccess().getPredKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precodition__Group__0__Impl"


    // $ANTLR start "rule__Precodition__Group__1"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:455:1: rule__Precodition__Group__1 : rule__Precodition__Group__1__Impl ;
    public final void rule__Precodition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:459:1: ( rule__Precodition__Group__1__Impl )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:460:2: rule__Precodition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Precodition__Group__1__Impl_in_rule__Precodition__Group__1897);
            rule__Precodition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precodition__Group__1"


    // $ANTLR start "rule__Precodition__Group__1__Impl"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:466:1: rule__Precodition__Group__1__Impl : ( ( rule__Precodition__NameAssignment_1 ) ) ;
    public final void rule__Precodition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:470:1: ( ( ( rule__Precodition__NameAssignment_1 ) ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:471:1: ( ( rule__Precodition__NameAssignment_1 ) )
            {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:471:1: ( ( rule__Precodition__NameAssignment_1 ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:472:1: ( rule__Precodition__NameAssignment_1 )
            {
             before(grammarAccess.getPrecoditionAccess().getNameAssignment_1()); 
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:473:1: ( rule__Precodition__NameAssignment_1 )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:473:2: rule__Precodition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Precodition__NameAssignment_1_in_rule__Precodition__Group__1__Impl924);
            rule__Precodition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrecoditionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precodition__Group__1__Impl"


    // $ANTLR start "rule__Argument__Group__0"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:487:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:491:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:492:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__0958);
            rule__Argument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__0961);
            rule__Argument__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__0"


    // $ANTLR start "rule__Argument__Group__0__Impl"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:499:1: rule__Argument__Group__0__Impl : ( 'checkentail' ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:503:1: ( ( 'checkentail' ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:504:1: ( 'checkentail' )
            {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:504:1: ( 'checkentail' )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:505:1: 'checkentail'
            {
             before(grammarAccess.getArgumentAccess().getCheckentailKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Argument__Group__0__Impl989); 
             after(grammarAccess.getArgumentAccess().getCheckentailKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__0__Impl"


    // $ANTLR start "rule__Argument__Group__1"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:518:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:522:1: ( rule__Argument__Group__1__Impl )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:523:2: rule__Argument__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__11020);
            rule__Argument__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__1"


    // $ANTLR start "rule__Argument__Group__1__Impl"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:529:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__NameAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:533:1: ( ( ( rule__Argument__NameAssignment_1 ) ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:534:1: ( ( rule__Argument__NameAssignment_1 ) )
            {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:534:1: ( ( rule__Argument__NameAssignment_1 ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:535:1: ( rule__Argument__NameAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_1()); 
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:536:1: ( rule__Argument__NameAssignment_1 )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:536:2: rule__Argument__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Argument__NameAssignment_1_in_rule__Argument__Group__1__Impl1047);
            rule__Argument__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__1__Impl"


    // $ANTLR start "rule__Print__Group__0"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:550:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:554:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:555:2: rule__Print__Group__0__Impl rule__Print__Group__1
            {
            pushFollow(FOLLOW_rule__Print__Group__0__Impl_in_rule__Print__Group__01081);
            rule__Print__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Print__Group__1_in_rule__Print__Group__01084);
            rule__Print__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__0"


    // $ANTLR start "rule__Print__Group__0__Impl"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:562:1: rule__Print__Group__0__Impl : ( 'print' ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:566:1: ( ( 'print' ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:567:1: ( 'print' )
            {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:567:1: ( 'print' )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:568:1: 'print'
            {
             before(grammarAccess.getPrintAccess().getPrintKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Print__Group__0__Impl1112); 
             after(grammarAccess.getPrintAccess().getPrintKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__0__Impl"


    // $ANTLR start "rule__Print__Group__1"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:581:1: rule__Print__Group__1 : rule__Print__Group__1__Impl ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:585:1: ( rule__Print__Group__1__Impl )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:586:2: rule__Print__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Print__Group__1__Impl_in_rule__Print__Group__11143);
            rule__Print__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__1"


    // $ANTLR start "rule__Print__Group__1__Impl"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:592:1: rule__Print__Group__1__Impl : ( ( rule__Print__NameAssignment_1 ) ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:596:1: ( ( ( rule__Print__NameAssignment_1 ) ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:597:1: ( ( rule__Print__NameAssignment_1 ) )
            {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:597:1: ( ( rule__Print__NameAssignment_1 ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:598:1: ( rule__Print__NameAssignment_1 )
            {
             before(grammarAccess.getPrintAccess().getNameAssignment_1()); 
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:599:1: ( rule__Print__NameAssignment_1 )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:599:2: rule__Print__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Print__NameAssignment_1_in_rule__Print__Group__1__Impl1170);
            rule__Print__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrintAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__1__Impl"


    // $ANTLR start "rule__SLEEK__KeywordsAssignment"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:614:1: rule__SLEEK__KeywordsAssignment : ( ruleArgu ) ;
    public final void rule__SLEEK__KeywordsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:618:1: ( ( ruleArgu ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:619:1: ( ruleArgu )
            {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:619:1: ( ruleArgu )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:620:1: ruleArgu
            {
             before(grammarAccess.getSLEEKAccess().getKeywordsArguParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleArgu_in_rule__SLEEK__KeywordsAssignment1209);
            ruleArgu();

            state._fsp--;

             after(grammarAccess.getSLEEKAccess().getKeywordsArguParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SLEEK__KeywordsAssignment"


    // $ANTLR start "rule__Data__NameAssignment_1"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:629:1: rule__Data__NameAssignment_1 : ( RULE_SLK ) ;
    public final void rule__Data__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:633:1: ( ( RULE_SLK ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:634:1: ( RULE_SLK )
            {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:634:1: ( RULE_SLK )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:635:1: RULE_SLK
            {
             before(grammarAccess.getDataAccess().getNameSLKTerminalRuleCall_1_0()); 
            match(input,RULE_SLK,FOLLOW_RULE_SLK_in_rule__Data__NameAssignment_11240); 
             after(grammarAccess.getDataAccess().getNameSLKTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__NameAssignment_1"


    // $ANTLR start "rule__Lemma__NameAssignment_1"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:644:1: rule__Lemma__NameAssignment_1 : ( RULE_SLK ) ;
    public final void rule__Lemma__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:648:1: ( ( RULE_SLK ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:649:1: ( RULE_SLK )
            {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:649:1: ( RULE_SLK )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:650:1: RULE_SLK
            {
             before(grammarAccess.getLemmaAccess().getNameSLKTerminalRuleCall_1_0()); 
            match(input,RULE_SLK,FOLLOW_RULE_SLK_in_rule__Lemma__NameAssignment_11271); 
             after(grammarAccess.getLemmaAccess().getNameSLKTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lemma__NameAssignment_1"


    // $ANTLR start "rule__Precodition__NameAssignment_1"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:659:1: rule__Precodition__NameAssignment_1 : ( RULE_SLK ) ;
    public final void rule__Precodition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:663:1: ( ( RULE_SLK ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:664:1: ( RULE_SLK )
            {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:664:1: ( RULE_SLK )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:665:1: RULE_SLK
            {
             before(grammarAccess.getPrecoditionAccess().getNameSLKTerminalRuleCall_1_0()); 
            match(input,RULE_SLK,FOLLOW_RULE_SLK_in_rule__Precodition__NameAssignment_11302); 
             after(grammarAccess.getPrecoditionAccess().getNameSLKTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precodition__NameAssignment_1"


    // $ANTLR start "rule__Argument__NameAssignment_1"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:674:1: rule__Argument__NameAssignment_1 : ( RULE_SLK ) ;
    public final void rule__Argument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:678:1: ( ( RULE_SLK ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:679:1: ( RULE_SLK )
            {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:679:1: ( RULE_SLK )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:680:1: RULE_SLK
            {
             before(grammarAccess.getArgumentAccess().getNameSLKTerminalRuleCall_1_0()); 
            match(input,RULE_SLK,FOLLOW_RULE_SLK_in_rule__Argument__NameAssignment_11333); 
             after(grammarAccess.getArgumentAccess().getNameSLKTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__NameAssignment_1"


    // $ANTLR start "rule__Print__NameAssignment_1"
    // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:689:1: rule__Print__NameAssignment_1 : ( RULE_SLK ) ;
    public final void rule__Print__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:693:1: ( ( RULE_SLK ) )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:694:1: ( RULE_SLK )
            {
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:694:1: ( RULE_SLK )
            // ../org.xtext.verifier.slk.ui/src-gen/org/xtext/verifier/slk/ui/contentassist/antlr/internal/InternalSLEEK.g:695:1: RULE_SLK
            {
             before(grammarAccess.getPrintAccess().getNameSLKTerminalRuleCall_1_0()); 
            match(input,RULE_SLK,FOLLOW_RULE_SLK_in_rule__Print__NameAssignment_11364); 
             after(grammarAccess.getPrintAccess().getNameSLKTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSLEEK_in_entryRuleSLEEK61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSLEEK68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SLEEK__KeywordsAssignment_in_ruleSLEEK94 = new BitSet(new long[]{0x000000000001F002L});
    public static final BitSet FOLLOW_ruleArgu_in_entryRuleArgu122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgu129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argu__Alternatives_in_ruleArgu155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_entryRuleData182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleData189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__0_in_ruleData215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLemma_in_entryRuleLemma242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLemma249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lemma__Group__0_in_ruleLemma275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecodition_in_entryRulePrecodition302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrecodition309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precodition__Group__0_in_rulePrecodition335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0_in_ruleArgument395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrint_in_entryRulePrint422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrint429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Print__Group__0_in_rulePrint455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecodition_in_rule__Argu__Alternatives491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_rule__Argu__Alternatives508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLemma_in_rule__Argu__Alternatives525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Argu__Alternatives542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrint_in_rule__Argu__Alternatives559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__0__Impl_in_rule__Data__Group__0589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Data__Group__1_in_rule__Data__Group__0592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Data__Group__0__Impl620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__1__Impl_in_rule__Data__Group__1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__NameAssignment_1_in_rule__Data__Group__1__Impl678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lemma__Group__0__Impl_in_rule__Lemma__Group__0712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Lemma__Group__1_in_rule__Lemma__Group__0715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Lemma__Group__0__Impl743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lemma__Group__1__Impl_in_rule__Lemma__Group__1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lemma__NameAssignment_1_in_rule__Lemma__Group__1__Impl801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precodition__Group__0__Impl_in_rule__Precodition__Group__0835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precodition__Group__1_in_rule__Precodition__Group__0838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Precodition__Group__0__Impl866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precodition__Group__1__Impl_in_rule__Precodition__Group__1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precodition__NameAssignment_1_in_rule__Precodition__Group__1__Impl924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__0958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__0961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Argument__Group__0__Impl989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__11020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__NameAssignment_1_in_rule__Argument__Group__1__Impl1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Print__Group__0__Impl_in_rule__Print__Group__01081 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Print__Group__1_in_rule__Print__Group__01084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Print__Group__0__Impl1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Print__Group__1__Impl_in_rule__Print__Group__11143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Print__NameAssignment_1_in_rule__Print__Group__1__Impl1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgu_in_rule__SLEEK__KeywordsAssignment1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SLK_in_rule__Data__NameAssignment_11240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SLK_in_rule__Lemma__NameAssignment_11271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SLK_in_rule__Precodition__NameAssignment_11302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SLK_in_rule__Argument__NameAssignment_11333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SLK_in_rule__Print__NameAssignment_11364 = new BitSet(new long[]{0x0000000000000002L});

}