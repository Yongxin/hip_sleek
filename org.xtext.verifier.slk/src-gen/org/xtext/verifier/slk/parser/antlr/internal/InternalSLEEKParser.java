package org.xtext.verifier.slk.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.verifier.slk.services.SLEEKGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSLEEKParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g"; }



     	private SLEEKGrammarAccess grammarAccess;
     	
        public InternalSLEEKParser(TokenStream input, SLEEKGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SLEEK";	
       	}
       	
       	@Override
       	protected SLEEKGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSLEEK"
    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:67:1: entryRuleSLEEK returns [EObject current=null] : iv_ruleSLEEK= ruleSLEEK EOF ;
    public final EObject entryRuleSLEEK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSLEEK = null;


        try {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:68:2: (iv_ruleSLEEK= ruleSLEEK EOF )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:69:2: iv_ruleSLEEK= ruleSLEEK EOF
            {
             newCompositeNode(grammarAccess.getSLEEKRule()); 
            pushFollow(FOLLOW_ruleSLEEK_in_entryRuleSLEEK75);
            iv_ruleSLEEK=ruleSLEEK();

            state._fsp--;

             current =iv_ruleSLEEK; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSLEEK85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSLEEK"


    // $ANTLR start "ruleSLEEK"
    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:76:1: ruleSLEEK returns [EObject current=null] : ( (lv_keywords_0_0= ruleArgu ) )* ;
    public final EObject ruleSLEEK() throws RecognitionException {
        EObject current = null;

        EObject lv_keywords_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:79:28: ( ( (lv_keywords_0_0= ruleArgu ) )* )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:80:1: ( (lv_keywords_0_0= ruleArgu ) )*
            {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:80:1: ( (lv_keywords_0_0= ruleArgu ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:81:1: (lv_keywords_0_0= ruleArgu )
            	    {
            	    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:81:1: (lv_keywords_0_0= ruleArgu )
            	    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:82:3: lv_keywords_0_0= ruleArgu
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSLEEKAccess().getKeywordsArguParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleArgu_in_ruleSLEEK130);
            	    lv_keywords_0_0=ruleArgu();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSLEEKRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"keywords",
            	            		lv_keywords_0_0, 
            	            		"Argu");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSLEEK"


    // $ANTLR start "entryRuleArgu"
    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:106:1: entryRuleArgu returns [EObject current=null] : iv_ruleArgu= ruleArgu EOF ;
    public final EObject entryRuleArgu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgu = null;


        try {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:107:2: (iv_ruleArgu= ruleArgu EOF )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:108:2: iv_ruleArgu= ruleArgu EOF
            {
             newCompositeNode(grammarAccess.getArguRule()); 
            pushFollow(FOLLOW_ruleArgu_in_entryRuleArgu166);
            iv_ruleArgu=ruleArgu();

            state._fsp--;

             current =iv_ruleArgu; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgu176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgu"


    // $ANTLR start "ruleArgu"
    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:115:1: ruleArgu returns [EObject current=null] : (this_Precodition_0= rulePrecodition | this_Data_1= ruleData | this_Lemma_2= ruleLemma | this_Argument_3= ruleArgument | this_Print_4= rulePrint ) ;
    public final EObject ruleArgu() throws RecognitionException {
        EObject current = null;

        EObject this_Precodition_0 = null;

        EObject this_Data_1 = null;

        EObject this_Lemma_2 = null;

        EObject this_Argument_3 = null;

        EObject this_Print_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:118:28: ( (this_Precodition_0= rulePrecodition | this_Data_1= ruleData | this_Lemma_2= ruleLemma | this_Argument_3= ruleArgument | this_Print_4= rulePrint ) )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:119:1: (this_Precodition_0= rulePrecodition | this_Data_1= ruleData | this_Lemma_2= ruleLemma | this_Argument_3= ruleArgument | this_Print_4= rulePrint )
            {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:119:1: (this_Precodition_0= rulePrecodition | this_Data_1= ruleData | this_Lemma_2= ruleLemma | this_Argument_3= ruleArgument | this_Print_4= rulePrint )
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
                    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:120:5: this_Precodition_0= rulePrecodition
                    {
                     
                            newCompositeNode(grammarAccess.getArguAccess().getPrecoditionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePrecodition_in_ruleArgu223);
                    this_Precodition_0=rulePrecodition();

                    state._fsp--;

                     
                            current = this_Precodition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:130:5: this_Data_1= ruleData
                    {
                     
                            newCompositeNode(grammarAccess.getArguAccess().getDataParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleData_in_ruleArgu250);
                    this_Data_1=ruleData();

                    state._fsp--;

                     
                            current = this_Data_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:140:5: this_Lemma_2= ruleLemma
                    {
                     
                            newCompositeNode(grammarAccess.getArguAccess().getLemmaParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLemma_in_ruleArgu277);
                    this_Lemma_2=ruleLemma();

                    state._fsp--;

                     
                            current = this_Lemma_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:150:5: this_Argument_3= ruleArgument
                    {
                     
                            newCompositeNode(grammarAccess.getArguAccess().getArgumentParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleArgument_in_ruleArgu304);
                    this_Argument_3=ruleArgument();

                    state._fsp--;

                     
                            current = this_Argument_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:160:5: this_Print_4= rulePrint
                    {
                     
                            newCompositeNode(grammarAccess.getArguAccess().getPrintParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulePrint_in_ruleArgu331);
                    this_Print_4=rulePrint();

                    state._fsp--;

                     
                            current = this_Print_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgu"


    // $ANTLR start "entryRuleData"
    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:176:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:177:2: (iv_ruleData= ruleData EOF )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:178:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_ruleData_in_entryRuleData366);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleData376); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:185:1: ruleData returns [EObject current=null] : (otherlv_0= 'data' ( (lv_name_1_0= RULE_SLK ) ) ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:188:28: ( (otherlv_0= 'data' ( (lv_name_1_0= RULE_SLK ) ) ) )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:189:1: (otherlv_0= 'data' ( (lv_name_1_0= RULE_SLK ) ) )
            {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:189:1: (otherlv_0= 'data' ( (lv_name_1_0= RULE_SLK ) ) )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:189:3: otherlv_0= 'data' ( (lv_name_1_0= RULE_SLK ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleData413); 

                	newLeafNode(otherlv_0, grammarAccess.getDataAccess().getDataKeyword_0());
                
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:193:1: ( (lv_name_1_0= RULE_SLK ) )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:194:1: (lv_name_1_0= RULE_SLK )
            {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:194:1: (lv_name_1_0= RULE_SLK )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:195:3: lv_name_1_0= RULE_SLK
            {
            lv_name_1_0=(Token)match(input,RULE_SLK,FOLLOW_RULE_SLK_in_ruleData430); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDataAccess().getNameSLKTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"SLK");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleLemma"
    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:219:1: entryRuleLemma returns [EObject current=null] : iv_ruleLemma= ruleLemma EOF ;
    public final EObject entryRuleLemma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLemma = null;


        try {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:220:2: (iv_ruleLemma= ruleLemma EOF )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:221:2: iv_ruleLemma= ruleLemma EOF
            {
             newCompositeNode(grammarAccess.getLemmaRule()); 
            pushFollow(FOLLOW_ruleLemma_in_entryRuleLemma471);
            iv_ruleLemma=ruleLemma();

            state._fsp--;

             current =iv_ruleLemma; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLemma481); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLemma"


    // $ANTLR start "ruleLemma"
    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:228:1: ruleLemma returns [EObject current=null] : (otherlv_0= 'lemma' ( (lv_name_1_0= RULE_SLK ) ) ) ;
    public final EObject ruleLemma() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:231:28: ( (otherlv_0= 'lemma' ( (lv_name_1_0= RULE_SLK ) ) ) )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:232:1: (otherlv_0= 'lemma' ( (lv_name_1_0= RULE_SLK ) ) )
            {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:232:1: (otherlv_0= 'lemma' ( (lv_name_1_0= RULE_SLK ) ) )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:232:3: otherlv_0= 'lemma' ( (lv_name_1_0= RULE_SLK ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleLemma518); 

                	newLeafNode(otherlv_0, grammarAccess.getLemmaAccess().getLemmaKeyword_0());
                
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:236:1: ( (lv_name_1_0= RULE_SLK ) )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:237:1: (lv_name_1_0= RULE_SLK )
            {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:237:1: (lv_name_1_0= RULE_SLK )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:238:3: lv_name_1_0= RULE_SLK
            {
            lv_name_1_0=(Token)match(input,RULE_SLK,FOLLOW_RULE_SLK_in_ruleLemma535); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLemmaAccess().getNameSLKTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLemmaRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"SLK");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLemma"


    // $ANTLR start "entryRulePrecodition"
    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:262:1: entryRulePrecodition returns [EObject current=null] : iv_rulePrecodition= rulePrecodition EOF ;
    public final EObject entryRulePrecodition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecodition = null;


        try {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:263:2: (iv_rulePrecodition= rulePrecodition EOF )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:264:2: iv_rulePrecodition= rulePrecodition EOF
            {
             newCompositeNode(grammarAccess.getPrecoditionRule()); 
            pushFollow(FOLLOW_rulePrecodition_in_entryRulePrecodition576);
            iv_rulePrecodition=rulePrecodition();

            state._fsp--;

             current =iv_rulePrecodition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrecodition586); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrecodition"


    // $ANTLR start "rulePrecodition"
    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:271:1: rulePrecodition returns [EObject current=null] : (otherlv_0= 'pred' ( (lv_name_1_0= RULE_SLK ) ) ) ;
    public final EObject rulePrecodition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:274:28: ( (otherlv_0= 'pred' ( (lv_name_1_0= RULE_SLK ) ) ) )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:275:1: (otherlv_0= 'pred' ( (lv_name_1_0= RULE_SLK ) ) )
            {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:275:1: (otherlv_0= 'pred' ( (lv_name_1_0= RULE_SLK ) ) )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:275:3: otherlv_0= 'pred' ( (lv_name_1_0= RULE_SLK ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulePrecodition623); 

                	newLeafNode(otherlv_0, grammarAccess.getPrecoditionAccess().getPredKeyword_0());
                
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:279:1: ( (lv_name_1_0= RULE_SLK ) )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:280:1: (lv_name_1_0= RULE_SLK )
            {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:280:1: (lv_name_1_0= RULE_SLK )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:281:3: lv_name_1_0= RULE_SLK
            {
            lv_name_1_0=(Token)match(input,RULE_SLK,FOLLOW_RULE_SLK_in_rulePrecodition640); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPrecoditionAccess().getNameSLKTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrecoditionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"SLK");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrecodition"


    // $ANTLR start "entryRuleArgument"
    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:305:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:306:2: (iv_ruleArgument= ruleArgument EOF )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:307:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument681);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument691); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:314:1: ruleArgument returns [EObject current=null] : (otherlv_0= 'checkentail' ( (lv_name_1_0= RULE_SLK ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:317:28: ( (otherlv_0= 'checkentail' ( (lv_name_1_0= RULE_SLK ) ) ) )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:318:1: (otherlv_0= 'checkentail' ( (lv_name_1_0= RULE_SLK ) ) )
            {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:318:1: (otherlv_0= 'checkentail' ( (lv_name_1_0= RULE_SLK ) ) )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:318:3: otherlv_0= 'checkentail' ( (lv_name_1_0= RULE_SLK ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleArgument728); 

                	newLeafNode(otherlv_0, grammarAccess.getArgumentAccess().getCheckentailKeyword_0());
                
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:322:1: ( (lv_name_1_0= RULE_SLK ) )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:323:1: (lv_name_1_0= RULE_SLK )
            {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:323:1: (lv_name_1_0= RULE_SLK )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:324:3: lv_name_1_0= RULE_SLK
            {
            lv_name_1_0=(Token)match(input,RULE_SLK,FOLLOW_RULE_SLK_in_ruleArgument745); 

            			newLeafNode(lv_name_1_0, grammarAccess.getArgumentAccess().getNameSLKTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArgumentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"SLK");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRulePrint"
    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:348:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:349:2: (iv_rulePrint= rulePrint EOF )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:350:2: iv_rulePrint= rulePrint EOF
            {
             newCompositeNode(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_rulePrint_in_entryRulePrint786);
            iv_rulePrint=rulePrint();

            state._fsp--;

             current =iv_rulePrint; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrint796); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:357:1: rulePrint returns [EObject current=null] : (otherlv_0= 'print' ( (lv_name_1_0= RULE_SLK ) ) ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:360:28: ( (otherlv_0= 'print' ( (lv_name_1_0= RULE_SLK ) ) ) )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:361:1: (otherlv_0= 'print' ( (lv_name_1_0= RULE_SLK ) ) )
            {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:361:1: (otherlv_0= 'print' ( (lv_name_1_0= RULE_SLK ) ) )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:361:3: otherlv_0= 'print' ( (lv_name_1_0= RULE_SLK ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_rulePrint833); 

                	newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPrintKeyword_0());
                
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:365:1: ( (lv_name_1_0= RULE_SLK ) )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:366:1: (lv_name_1_0= RULE_SLK )
            {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:366:1: (lv_name_1_0= RULE_SLK )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:367:3: lv_name_1_0= RULE_SLK
            {
            lv_name_1_0=(Token)match(input,RULE_SLK,FOLLOW_RULE_SLK_in_rulePrint850); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPrintAccess().getNameSLKTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrintRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"SLK");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrint"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSLEEK_in_entryRuleSLEEK75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSLEEK85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgu_in_ruleSLEEK130 = new BitSet(new long[]{0x000000000001F002L});
    public static final BitSet FOLLOW_ruleArgu_in_entryRuleArgu166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgu176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecodition_in_ruleArgu223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_ruleArgu250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLemma_in_ruleArgu277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleArgu304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrint_in_ruleArgu331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_entryRuleData366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleData376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleData413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SLK_in_ruleData430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLemma_in_entryRuleLemma471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLemma481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleLemma518 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SLK_in_ruleLemma535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecodition_in_entryRulePrecodition576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrecodition586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePrecodition623 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SLK_in_rulePrecodition640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleArgument728 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SLK_in_ruleArgument745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrint_in_entryRulePrint786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrint796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePrint833 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SLK_in_rulePrint850 = new BitSet(new long[]{0x0000000000000002L});

}