// $ANTLR 3.2 Sep 23, 2009 12:02:23 E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g 2013-12-13 15:46:20

package artur.pacholec.minijava;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class MiniJavaLexer extends Lexer {
    public static final int T__68=68;
    public static final int PosDigit=40;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int CLASS=13;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int PARAMETERS=19;
    public static final int WHILE=26;
    public static final int SUB=35;
    public static final int NOT=34;
    public static final int AND=33;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int Identifier=44;
    public static final int PRINTLN_CALL=28;
    public static final int IF=25;
    public static final int PARENTHESES=10;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int NAME=5;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int METHODS=16;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int Comment=47;
    public static final int ARRAY_CREATION=6;
    public static final int T__59=59;
    public static final int THIS=37;
    public static final int LESS=36;
    public static final int RETURN=21;
    public static final int BODY=15;
    public static final int SUPER=14;
    public static final int EQ=29;
    public static final int DOT=38;
    public static final int Whitespace=46;
    public static final int T__50=50;
    public static final int RETURN_TYPE=20;
    public static final int ADD=31;
    public static final int Alpha=39;
    public static final int VISIBILITY=18;
    public static final int ARGUMENTS=11;
    public static final int AlphaNum=42;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int ARRAY_ACCESS=7;
    public static final int Digit=41;
    public static final int METHOD_CALL=9;
    public static final int MUL=30;
    public static final int MAINCLASS=12;
    public static final int T__71=71;
    public static final int VARIABLE=23;
    public static final int T__70=70;
    public static final int Boolean=43;
    public static final int BLOCK=27;
    public static final int OR=32;
    public static final int VARIABLES=22;
    public static final int STATEMENTS=24;
    public static final int PROGRAM=4;
    public static final int OBJECT_CREATION=8;
    public static final int METHOD=17;
    public static final int Integer=45;

    // delegates
    // delegators

    public MiniJavaLexer() {;} 
    public MiniJavaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MiniJavaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g"; }

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:7:4: ( '=' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:7:6: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:8:5: ( '*' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:8:7: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:9:5: ( '+' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:9:7: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:10:4: ( '||' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:10:6: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:11:5: ( '&&' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:11:7: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:12:5: ( '!' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:12:7: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "SUB"
    public final void mSUB() throws RecognitionException {
        try {
            int _type = SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:13:5: ( '-' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:13:7: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUB"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:14:6: ( '<' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:14:8: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "THIS"
    public final void mTHIS() throws RecognitionException {
        try {
            int _type = THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:15:6: ( 'this' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:15:8: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THIS"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:16:5: ( '.' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:16:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:17:7: ( 'class' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:17:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:18:7: ( '{' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:18:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:19:7: ( 'public' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:19:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:20:7: ( 'static' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:20:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:21:7: ( 'void' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:21:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:22:7: ( 'main' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:22:9: 'main'
            {
            match("main"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:23:7: ( '(' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:23:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:24:7: ( 'String' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:24:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:25:7: ( '[' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:25:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:26:7: ( ']' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:26:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:27:7: ( '...' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:27:9: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:28:7: ( ')' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:28:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:29:7: ( '}' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:29:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:30:7: ( 'extends' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:30:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:31:7: ( ',' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:31:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:32:7: ( 'return' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:32:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:33:7: ( ';' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:33:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:34:7: ( 'while' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:34:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:35:7: ( 'if' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:35:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:36:7: ( 'else' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:36:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:37:7: ( 'System.out.println' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:37:9: 'System.out.println'
            {
            match("System.out.println"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:38:7: ( 'new' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:38:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:39:7: ( 'int' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:39:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:40:7: ( 'boolean' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:40:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "Alpha"
    public final void mAlpha() throws RecognitionException {
        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:60:15: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:60:19: ( 'A' .. 'Z' | 'a' .. 'z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Alpha"

    // $ANTLR start "PosDigit"
    public final void mPosDigit() throws RecognitionException {
        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:61:18: ( ( '1' .. '9' ) )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:61:21: ( '1' .. '9' )
            {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:61:21: ( '1' .. '9' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:61:22: '1' .. '9'
            {
            matchRange('1','9'); 

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "PosDigit"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:62:15: ( ( '0' | PosDigit ) )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:62:19: ( '0' | PosDigit )
            {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:62:19: ( '0' | PosDigit )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='0') ) {
                alt1=1;
            }
            else if ( ((LA1_0>='1' && LA1_0<='9')) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:62:20: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:62:26: PosDigit
                    {
                    mPosDigit(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "Digit"

    // $ANTLR start "AlphaNum"
    public final void mAlphaNum() throws RecognitionException {
        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:63:18: ( ( Alpha | Digit ) )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:63:21: ( Alpha | Digit )
            {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:63:21: ( Alpha | Digit )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                alt2=1;
            }
            else if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:63:22: Alpha
                    {
                    mAlpha(); 

                    }
                    break;
                case 2 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:63:30: Digit
                    {
                    mDigit(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "AlphaNum"

    // $ANTLR start "Boolean"
    public final void mBoolean() throws RecognitionException {
        try {
            int _type = Boolean;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:67:8: ( ( 'true' | 'false' ) )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:67:13: ( 'true' | 'false' )
            {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:67:13: ( 'true' | 'false' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='t') ) {
                alt3=1;
            }
            else if ( (LA3_0=='f') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:67:14: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:67:23: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "Boolean"

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:68:11: ( Alpha ( AlphaNum | '_' )* )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:68:16: Alpha ( AlphaNum | '_' )*
            {
            mAlpha(); 
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:68:22: ( AlphaNum | '_' )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }
                else if ( (LA4_0=='_') ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:68:23: AlphaNum
            	    {
            	    mAlphaNum(); 

            	    }
            	    break;
            	case 2 :
            	    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:68:34: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Identifier"

    // $ANTLR start "Integer"
    public final void mInteger() throws RecognitionException {
        try {
            int _type = Integer;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:69:8: ( ( '0' | PosDigit ( Digit )* ) )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:69:13: ( '0' | PosDigit ( Digit )* )
            {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:69:13: ( '0' | PosDigit ( Digit )* )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='0') ) {
                alt6=1;
            }
            else if ( ((LA6_0>='1' && LA6_0<='9')) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:69:14: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:69:20: PosDigit ( Digit )*
                    {
                    mPosDigit(); 
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:69:29: ( Digit )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:69:29: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


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
    // $ANTLR end "Integer"

    // $ANTLR start "Whitespace"
    public final void mWhitespace() throws RecognitionException {
        try {
            int _type = Whitespace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:70:11: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:70:16: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Whitespace"

    // $ANTLR start "Comment"
    public final void mComment() throws RecognitionException {
        try {
            int _type = Comment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:71:8: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:71:13: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:71:18: (~ ( '\\n' | '\\r' ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:71:18: ~ ( '\\n' | '\\r' )
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
            	    break loop7;
                }
            } while (true);

            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:71:32: ( '\\r' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:71:32: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comment"

    public void mTokens() throws RecognitionException {
        // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:8: ( EQ | MUL | ADD | OR | AND | NOT | SUB | LESS | THIS | DOT | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | Boolean | Identifier | Integer | Whitespace | Comment )
        int alt9=39;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:10: EQ
                {
                mEQ(); 

                }
                break;
            case 2 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:13: MUL
                {
                mMUL(); 

                }
                break;
            case 3 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:17: ADD
                {
                mADD(); 

                }
                break;
            case 4 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:21: OR
                {
                mOR(); 

                }
                break;
            case 5 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:24: AND
                {
                mAND(); 

                }
                break;
            case 6 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:28: NOT
                {
                mNOT(); 

                }
                break;
            case 7 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:32: SUB
                {
                mSUB(); 

                }
                break;
            case 8 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:36: LESS
                {
                mLESS(); 

                }
                break;
            case 9 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:41: THIS
                {
                mTHIS(); 

                }
                break;
            case 10 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:46: DOT
                {
                mDOT(); 

                }
                break;
            case 11 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:50: T__48
                {
                mT__48(); 

                }
                break;
            case 12 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:56: T__49
                {
                mT__49(); 

                }
                break;
            case 13 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:62: T__50
                {
                mT__50(); 

                }
                break;
            case 14 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:68: T__51
                {
                mT__51(); 

                }
                break;
            case 15 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:74: T__52
                {
                mT__52(); 

                }
                break;
            case 16 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:80: T__53
                {
                mT__53(); 

                }
                break;
            case 17 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:86: T__54
                {
                mT__54(); 

                }
                break;
            case 18 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:92: T__55
                {
                mT__55(); 

                }
                break;
            case 19 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:98: T__56
                {
                mT__56(); 

                }
                break;
            case 20 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:104: T__57
                {
                mT__57(); 

                }
                break;
            case 21 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:110: T__58
                {
                mT__58(); 

                }
                break;
            case 22 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:116: T__59
                {
                mT__59(); 

                }
                break;
            case 23 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:122: T__60
                {
                mT__60(); 

                }
                break;
            case 24 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:128: T__61
                {
                mT__61(); 

                }
                break;
            case 25 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:134: T__62
                {
                mT__62(); 

                }
                break;
            case 26 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:140: T__63
                {
                mT__63(); 

                }
                break;
            case 27 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:146: T__64
                {
                mT__64(); 

                }
                break;
            case 28 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:152: T__65
                {
                mT__65(); 

                }
                break;
            case 29 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:158: T__66
                {
                mT__66(); 

                }
                break;
            case 30 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:164: T__67
                {
                mT__67(); 

                }
                break;
            case 31 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:170: T__68
                {
                mT__68(); 

                }
                break;
            case 32 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:176: T__69
                {
                mT__69(); 

                }
                break;
            case 33 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:182: T__70
                {
                mT__70(); 

                }
                break;
            case 34 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:188: T__71
                {
                mT__71(); 

                }
                break;
            case 35 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:194: Boolean
                {
                mBoolean(); 

                }
                break;
            case 36 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:202: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 37 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:213: Integer
                {
                mInteger(); 

                }
                break;
            case 38 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:221: Whitespace
                {
                mWhitespace(); 

                }
                break;
            case 39 :
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:1:232: Comment
                {
                mComment(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\11\uffff\1\40\1\47\1\40\1\uffff\4\40\1\uffff\1\40\4\uffff\1\40"+
        "\1\uffff\1\40\1\uffff\5\40\4\uffff\2\40\2\uffff\13\40\1\105\21\40"+
        "\1\uffff\1\127\1\130\2\40\1\133\1\134\3\40\1\140\1\141\3\40\1\145"+
        "\2\40\2\uffff\2\40\2\uffff\1\152\2\40\2\uffff\3\40\1\uffff\1\40"+
        "\1\161\1\40\1\134\1\uffff\1\163\1\164\1\165\2\40\1\170\1\uffff\1"+
        "\40\4\uffff\1\172\1\uffff\1\173\2\uffff";
    static final String DFA9_eofS =
        "\174\uffff";
    static final String DFA9_minS =
        "\1\11\10\uffff\1\150\1\56\1\154\1\uffff\1\165\1\164\1\157\1\141"+
        "\1\uffff\1\164\4\uffff\1\154\1\uffff\1\145\1\uffff\1\150\1\146\1"+
        "\145\1\157\1\141\4\uffff\1\151\1\165\2\uffff\1\141\1\142\1\141\2"+
        "\151\1\162\1\163\1\164\1\163\1\164\1\151\1\60\1\164\1\167\1\157"+
        "\1\154\1\163\1\145\1\163\1\154\1\164\1\144\1\156\1\151\1\164\2\145"+
        "\1\165\1\154\1\uffff\2\60\1\154\1\163\2\60\1\163\2\151\2\60\1\156"+
        "\1\145\1\156\1\60\1\162\1\145\2\uffff\2\145\2\uffff\1\60\2\143\2"+
        "\uffff\1\147\1\155\1\144\1\uffff\1\156\1\60\1\141\1\60\1\uffff\3"+
        "\60\1\56\1\163\1\60\1\uffff\1\156\4\uffff\1\60\1\uffff\1\60\2\uffff";
    static final String DFA9_maxS =
        "\1\175\10\uffff\1\162\1\56\1\154\1\uffff\1\165\1\164\1\157\1\141"+
        "\1\uffff\1\171\4\uffff\1\170\1\uffff\1\145\1\uffff\1\150\1\156\1"+
        "\145\1\157\1\141\4\uffff\1\151\1\165\2\uffff\1\141\1\142\1\141\2"+
        "\151\1\162\1\163\1\164\1\163\1\164\1\151\1\172\1\164\1\167\1\157"+
        "\1\154\1\163\1\145\1\163\1\154\1\164\1\144\1\156\1\151\1\164\2\145"+
        "\1\165\1\154\1\uffff\2\172\1\154\1\163\2\172\1\163\2\151\2\172\1"+
        "\156\1\145\1\156\1\172\1\162\1\145\2\uffff\2\145\2\uffff\1\172\2"+
        "\143\2\uffff\1\147\1\155\1\144\1\uffff\1\156\1\172\1\141\1\172\1"+
        "\uffff\3\172\1\56\1\163\1\172\1\uffff\1\156\4\uffff\1\172\1\uffff"+
        "\1\172\2\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\uffff\1\14\4\uffff"+
        "\1\21\1\uffff\1\23\1\24\1\26\1\27\1\uffff\1\31\1\uffff\1\33\5\uffff"+
        "\1\44\1\45\1\46\1\47\2\uffff\1\25\1\12\35\uffff\1\35\21\uffff\1"+
        "\41\1\40\2\uffff\1\11\1\43\3\uffff\1\17\1\20\3\uffff\1\36\4\uffff"+
        "\1\13\6\uffff\1\34\1\uffff\1\15\1\16\1\22\1\37\1\uffff\1\32\1\uffff"+
        "\1\30\1\42";
    static final String DFA9_specialS =
        "\174\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\42\2\uffff\1\42\22\uffff\1\42\1\6\4\uffff\1\5\1\uffff\1"+
            "\21\1\25\1\2\1\3\1\30\1\7\1\12\1\43\12\41\1\uffff\1\32\1\10"+
            "\1\1\3\uffff\22\40\1\22\7\40\1\23\1\uffff\1\24\3\uffff\1\40"+
            "\1\36\1\13\1\40\1\27\1\37\2\40\1\34\3\40\1\20\1\35\1\40\1\15"+
            "\1\40\1\31\1\16\1\11\1\40\1\17\1\33\3\40\1\14\1\4\1\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44\11\uffff\1\45",
            "\1\46",
            "\1\50",
            "",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "",
            "\1\55\4\uffff\1\56",
            "",
            "",
            "",
            "",
            "\1\60\13\uffff\1\57",
            "",
            "\1\61",
            "",
            "\1\62",
            "\1\63\7\uffff\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "",
            "",
            "",
            "",
            "\1\70",
            "\1\71",
            "",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\131",
            "\1\132",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\135",
            "\1\136",
            "\1\137",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\146",
            "\1\147",
            "",
            "",
            "\1\150",
            "\1\151",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\153",
            "\1\154",
            "",
            "",
            "\1\155",
            "\1\156",
            "\1\157",
            "",
            "\1\160",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\162",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\166",
            "\1\167",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\171",
            "",
            "",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( EQ | MUL | ADD | OR | AND | NOT | SUB | LESS | THIS | DOT | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | Boolean | Identifier | Integer | Whitespace | Comment );";
        }
    }
 

}