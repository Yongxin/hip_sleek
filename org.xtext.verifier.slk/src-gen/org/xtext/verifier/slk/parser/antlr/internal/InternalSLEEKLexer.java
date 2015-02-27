package org.xtext.verifier.slk.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSLEEKLexer extends Lexer {
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

    public InternalSLEEKLexer() {;} 
    public InternalSLEEKLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSLEEKLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:11:7: ( 'data' )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:11:9: 'data'
            {
            match("data"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:12:7: ( 'lemma' )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:12:9: 'lemma'
            {
            match("lemma"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:13:7: ( 'pred' )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:13:9: 'pred'
            {
            match("pred"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:14:7: ( 'checkentail' )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:14:9: 'checkentail'
            {
            match("checkentail"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:15:7: ( 'print' )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:15:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "RULE_SLK"
    public final void mRULE_SLK() throws RecognitionException {
        try {
            int _type = RULE_SLK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:390:10: ( ( RULE_WS )+ (~ ( '.' ) )* ( '|-' )? (~ ( '.' ) )* '.' ( RULE_WS )* )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:390:12: ( RULE_WS )+ (~ ( '.' ) )* ( '|-' )? (~ ( '.' ) )* '.' ( RULE_WS )*
            {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:390:12: ( RULE_WS )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\t' && LA1_0<='\n')||LA1_0=='\r'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:390:12: RULE_WS
            	    {
            	    mRULE_WS(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:390:21: (~ ( '.' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='|') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='-')||(LA2_0>='/' && LA2_0<='{')||(LA2_0>='}' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:390:21: ~ ( '.' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='-')||(input.LA(1)>='/' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:390:29: ( '|-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='|') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='-') ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:390:29: '|-'
                    {
                    match("|-"); 


                    }
                    break;

            }

            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:390:35: (~ ( '.' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='-')||(LA4_0>='/' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:390:35: ~ ( '.' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='-')||(input.LA(1)>='/' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('.'); 
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:390:47: ( RULE_WS )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:390:47: RULE_WS
            	    {
            	    mRULE_WS(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SLK"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:392:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:392:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:392:24: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:392:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:394:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:394:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:394:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:394:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:394:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:396:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:396:12: ( '0' .. '9' )+
            {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:396:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:396:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:398:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:398:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:398:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:398:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:398:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:398:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:398:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:398:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:398:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:398:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:398:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:400:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:400:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:400:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:400:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:400:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:400:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:400:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:400:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:402:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:402:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:402:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:404:16: ( . )
            // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:404:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | RULE_SLK | RULE_ML_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=13;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:1:40: RULE_SLK
                {
                mRULE_SLK(); 

                }
                break;
            case 7 :
                // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:1:49: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 8 :
                // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:1:65: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 9 :
                // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:1:73: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 10 :
                // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:1:82: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 11 :
                // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:1:94: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 12 :
                // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:1:110: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 13 :
                // ../org.xtext.verifier.slk/src-gen/org/xtext/verifier/slk/parser/antlr/internal/InternalSLEEK.g:1:118: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\4\16\1\22\2\14\2\uffff\2\14\1\uffff\1\16\1\uffff\3\16\2\uffff\1\22\4\uffff\5\16\1\43\1\16\1\45\2\16\1\uffff\1\50\1\uffff\1\51\1\16\2\uffff\5\16\1\60\1\uffff";
    static final String DFA17_eofS =
        "\61\uffff";
    static final String DFA17_minS =
        "\1\0\1\141\1\145\1\162\1\150\1\0\1\52\1\101\2\uffff\2\0\1\uffff\1\164\1\uffff\1\155\2\145\2\uffff\1\0\4\uffff\1\141\1\155\1\144\1\156\1\143\1\60\1\141\1\60\1\164\1\153\1\uffff\1\60\1\uffff\1\60\1\145\2\uffff\1\156\1\164\1\141\1\151\1\154\1\60\1\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\141\1\145\1\162\1\150\1\uffff\1\57\1\172\2\uffff\2\uffff\1\uffff\1\164\1\uffff\1\155\1\151\1\145\2\uffff\1\uffff\4\uffff\1\141\1\155\1\144\1\156\1\143\1\172\1\141\1\172\1\164\1\153\1\uffff\1\172\1\uffff\1\172\1\145\2\uffff\1\156\1\164\1\141\1\151\1\154\1\172\1\uffff";
    static final String DFA17_acceptS =
        "\10\uffff\1\10\1\11\2\uffff\1\15\1\uffff\1\10\3\uffff\1\14\1\6\1\uffff\1\7\1\13\1\11\1\12\12\uffff\1\1\1\uffff\1\3\2\uffff\1\2\1\5\6\uffff\1\4";
    static final String DFA17_specialS =
        "\1\3\4\uffff\1\4\4\uffff\1\0\1\2\10\uffff\1\1\34\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\14\2\5\2\14\1\5\22\14\1\5\1\14\1\12\4\14\1\13\7\14\1\6\12\11\7\14\32\10\3\14\1\7\1\10\1\14\2\10\1\4\1\1\7\10\1\2\3\10\1\3\12\10\uff85\14",
            "\1\15",
            "\1\17",
            "\1\20",
            "\1\21",
            "\11\23\2\24\2\23\1\24\22\23\1\24\uffdf\23",
            "\1\25\4\uffff\1\26",
            "\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "",
            "\0\30",
            "\0\30",
            "",
            "\1\31",
            "",
            "\1\32",
            "\1\33\3\uffff\1\34",
            "\1\35",
            "",
            "",
            "\11\23\2\24\2\23\1\24\22\23\1\24\uffdf\23",
            "",
            "",
            "",
            "",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\44",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\46",
            "\1\47",
            "",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\52",
            "",
            "",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | RULE_SLK | RULE_ML_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_10 = input.LA(1);

                        s = -1;
                        if ( ((LA17_10>='\u0000' && LA17_10<='\uFFFF')) ) {s = 24;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_20 = input.LA(1);

                        s = -1;
                        if ( ((LA17_20>='\u0000' && LA17_20<='\b')||(LA17_20>='\u000B' && LA17_20<='\f')||(LA17_20>='\u000E' && LA17_20<='\u001F')||(LA17_20>='!' && LA17_20<='\uFFFF')) ) {s = 19;}

                        else if ( ((LA17_20>='\t' && LA17_20<='\n')||LA17_20=='\r'||LA17_20==' ') ) {s = 20;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_11 = input.LA(1);

                        s = -1;
                        if ( ((LA17_11>='\u0000' && LA17_11<='\uFFFF')) ) {s = 24;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='d') ) {s = 1;}

                        else if ( (LA17_0=='l') ) {s = 2;}

                        else if ( (LA17_0=='p') ) {s = 3;}

                        else if ( (LA17_0=='c') ) {s = 4;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 5;}

                        else if ( (LA17_0=='/') ) {s = 6;}

                        else if ( (LA17_0=='^') ) {s = 7;}

                        else if ( ((LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='b')||(LA17_0>='e' && LA17_0<='k')||(LA17_0>='m' && LA17_0<='o')||(LA17_0>='q' && LA17_0<='z')) ) {s = 8;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 9;}

                        else if ( (LA17_0=='\"') ) {s = 10;}

                        else if ( (LA17_0=='\'') ) {s = 11;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='.')||(LA17_0>=':' && LA17_0<='@')||(LA17_0>='[' && LA17_0<=']')||LA17_0=='`'||(LA17_0>='{' && LA17_0<='\uFFFF')) ) {s = 12;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_5 = input.LA(1);

                        s = -1;
                        if ( ((LA17_5>='\u0000' && LA17_5<='\b')||(LA17_5>='\u000B' && LA17_5<='\f')||(LA17_5>='\u000E' && LA17_5<='\u001F')||(LA17_5>='!' && LA17_5<='\uFFFF')) ) {s = 19;}

                        else if ( ((LA17_5>='\t' && LA17_5<='\n')||LA17_5=='\r'||LA17_5==' ') ) {s = 20;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}