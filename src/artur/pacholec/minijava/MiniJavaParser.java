// $ANTLR 3.2 Sep 23, 2009 12:02:23 E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g 2013-12-13 15:46:20

package artur.pacholec.minijava;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class MiniJavaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM", "NAME", "ARRAY_CREATION", "ARRAY_ACCESS", "OBJECT_CREATION", "METHOD_CALL", "PARENTHESES", "ARGUMENTS", "MAINCLASS", "CLASS", "SUPER", "BODY", "METHODS", "METHOD", "VISIBILITY", "PARAMETERS", "RETURN_TYPE", "RETURN", "VARIABLES", "VARIABLE", "STATEMENTS", "IF", "WHILE", "BLOCK", "PRINTLN_CALL", "EQ", "MUL", "ADD", "OR", "AND", "NOT", "SUB", "LESS", "THIS", "DOT", "Alpha", "PosDigit", "Digit", "AlphaNum", "Boolean", "Identifier", "Integer", "Whitespace", "Comment", "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", "'String'", "'['", "']'", "'...'", "')'", "'}'", "'extends'", "','", "'return'", "';'", "'while'", "'if'", "'else'", "'System.out.println'", "'new'", "'int'", "'boolean'"
    };
    public static final int T__68=68;
    public static final int PosDigit=40;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int CLASS=13;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int WHILE=26;
    public static final int PARAMETERS=19;
    public static final int T__63=63;
    public static final int SUB=35;
    public static final int NOT=34;
    public static final int AND=33;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
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
    public static final int MUL=30;
    public static final int METHOD_CALL=9;
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


        public MiniJavaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public MiniJavaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return MiniJavaParser.tokenNames; }
    public String getGrammarFileName() { return "E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:75:1: program : mainClass ( classDeclaration )* -> ^( PROGRAM mainClass ( classDeclaration )* ) ;
    public final MiniJavaParser.program_return program() throws RecognitionException {
        MiniJavaParser.program_return retval = new MiniJavaParser.program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MiniJavaParser.mainClass_return mainClass1 = null;

        MiniJavaParser.classDeclaration_return classDeclaration2 = null;


        RewriteRuleSubtreeStream stream_mainClass=new RewriteRuleSubtreeStream(adaptor,"rule mainClass");
        RewriteRuleSubtreeStream stream_classDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule classDeclaration");
        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:75:8: ( mainClass ( classDeclaration )* -> ^( PROGRAM mainClass ( classDeclaration )* ) )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:76:2: mainClass ( classDeclaration )*
            {
            pushFollow(FOLLOW_mainClass_in_program444);
            mainClass1=mainClass();

            state._fsp--;

            stream_mainClass.add(mainClass1.getTree());
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:76:12: ( classDeclaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==48) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:76:13: classDeclaration
            	    {
            	    pushFollow(FOLLOW_classDeclaration_in_program447);
            	    classDeclaration2=classDeclaration();

            	    state._fsp--;

            	    stream_classDeclaration.add(classDeclaration2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);



            // AST REWRITE
            // elements: classDeclaration, mainClass
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 76:32: -> ^( PROGRAM mainClass ( classDeclaration )* )
            {
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:76:35: ^( PROGRAM mainClass ( classDeclaration )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);

                adaptor.addChild(root_1, stream_mainClass.nextTree());
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:76:55: ( classDeclaration )*
                while ( stream_classDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_classDeclaration.nextTree());

                }
                stream_classDeclaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class mainClass_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mainClass"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:78:1: mainClass : 'class' className= Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' ( '[' ']' | '...' ) argName= Identifier ')' '{' statement '}' '}' -> ^( MAINCLASS ^( NAME $className) ^( VARIABLE $argName) ^( BODY statement ) ) ;
    public final MiniJavaParser.mainClass_return mainClass() throws RecognitionException {
        MiniJavaParser.mainClass_return retval = new MiniJavaParser.mainClass_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token className=null;
        Token argName=null;
        Token string_literal3=null;
        Token char_literal4=null;
        Token string_literal5=null;
        Token string_literal6=null;
        Token string_literal7=null;
        Token string_literal8=null;
        Token char_literal9=null;
        Token string_literal10=null;
        Token char_literal11=null;
        Token char_literal12=null;
        Token string_literal13=null;
        Token char_literal14=null;
        Token char_literal15=null;
        Token char_literal17=null;
        Token char_literal18=null;
        MiniJavaParser.statement_return statement16 = null;


        Object className_tree=null;
        Object argName_tree=null;
        Object string_literal3_tree=null;
        Object char_literal4_tree=null;
        Object string_literal5_tree=null;
        Object string_literal6_tree=null;
        Object string_literal7_tree=null;
        Object string_literal8_tree=null;
        Object char_literal9_tree=null;
        Object string_literal10_tree=null;
        Object char_literal11_tree=null;
        Object char_literal12_tree=null;
        Object string_literal13_tree=null;
        Object char_literal14_tree=null;
        Object char_literal15_tree=null;
        Object char_literal17_tree=null;
        Object char_literal18_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:78:10: ( 'class' className= Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' ( '[' ']' | '...' ) argName= Identifier ')' '{' statement '}' '}' -> ^( MAINCLASS ^( NAME $className) ^( VARIABLE $argName) ^( BODY statement ) ) )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:79:2: 'class' className= Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' ( '[' ']' | '...' ) argName= Identifier ')' '{' statement '}' '}'
            {
            string_literal3=(Token)match(input,48,FOLLOW_48_in_mainClass469);  
            stream_48.add(string_literal3);

            className=(Token)match(input,Identifier,FOLLOW_Identifier_in_mainClass473);  
            stream_Identifier.add(className);

            char_literal4=(Token)match(input,49,FOLLOW_49_in_mainClass475);  
            stream_49.add(char_literal4);

            string_literal5=(Token)match(input,50,FOLLOW_50_in_mainClass476);  
            stream_50.add(string_literal5);

            string_literal6=(Token)match(input,51,FOLLOW_51_in_mainClass478);  
            stream_51.add(string_literal6);

            string_literal7=(Token)match(input,52,FOLLOW_52_in_mainClass480);  
            stream_52.add(string_literal7);

            string_literal8=(Token)match(input,53,FOLLOW_53_in_mainClass482);  
            stream_53.add(string_literal8);

            char_literal9=(Token)match(input,54,FOLLOW_54_in_mainClass484);  
            stream_54.add(char_literal9);

            string_literal10=(Token)match(input,55,FOLLOW_55_in_mainClass486);  
            stream_55.add(string_literal10);

            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:79:79: ( '[' ']' | '...' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==56) ) {
                alt2=1;
            }
            else if ( (LA2_0==58) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:79:80: '[' ']'
                    {
                    char_literal11=(Token)match(input,56,FOLLOW_56_in_mainClass489);  
                    stream_56.add(char_literal11);

                    char_literal12=(Token)match(input,57,FOLLOW_57_in_mainClass490);  
                    stream_57.add(char_literal12);


                    }
                    break;
                case 2 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:79:89: '...'
                    {
                    string_literal13=(Token)match(input,58,FOLLOW_58_in_mainClass494);  
                    stream_58.add(string_literal13);


                    }
                    break;

            }

            argName=(Token)match(input,Identifier,FOLLOW_Identifier_in_mainClass499);  
            stream_Identifier.add(argName);

            char_literal14=(Token)match(input,59,FOLLOW_59_in_mainClass501);  
            stream_59.add(char_literal14);

            char_literal15=(Token)match(input,49,FOLLOW_49_in_mainClass503);  
            stream_49.add(char_literal15);

            pushFollow(FOLLOW_statement_in_mainClass505);
            statement16=statement();

            state._fsp--;

            stream_statement.add(statement16.getTree());
            char_literal17=(Token)match(input,60,FOLLOW_60_in_mainClass507);  
            stream_60.add(char_literal17);

            char_literal18=(Token)match(input,60,FOLLOW_60_in_mainClass509);  
            stream_60.add(char_literal18);



            // AST REWRITE
            // elements: className, argName, statement
            // token labels: className, argName
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_className=new RewriteRuleTokenStream(adaptor,"token className",className);
            RewriteRuleTokenStream stream_argName=new RewriteRuleTokenStream(adaptor,"token argName",argName);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 79:141: -> ^( MAINCLASS ^( NAME $className) ^( VARIABLE $argName) ^( BODY statement ) )
            {
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:79:144: ^( MAINCLASS ^( NAME $className) ^( VARIABLE $argName) ^( BODY statement ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MAINCLASS, "MAINCLASS"), root_1);

                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:79:156: ^( NAME $className)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(NAME, "NAME"), root_2);

                adaptor.addChild(root_2, stream_className.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:79:175: ^( VARIABLE $argName)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLE, "VARIABLE"), root_2);

                adaptor.addChild(root_2, stream_argName.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:79:196: ^( BODY statement )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);

                adaptor.addChild(root_2, stream_statement.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mainClass"

    public static class classDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDeclaration"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:81:1: classDeclaration : 'class' className= Identifier ( 'extends' parentName= Identifier )? '{' classBody '}' -> ^( CLASS ^( NAME $className) ^( SUPER ( $parentName)? ) classBody ) ;
    public final MiniJavaParser.classDeclaration_return classDeclaration() throws RecognitionException {
        MiniJavaParser.classDeclaration_return retval = new MiniJavaParser.classDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token className=null;
        Token parentName=null;
        Token string_literal19=null;
        Token string_literal20=null;
        Token char_literal21=null;
        Token char_literal23=null;
        MiniJavaParser.classBody_return classBody22 = null;


        Object className_tree=null;
        Object parentName_tree=null;
        Object string_literal19_tree=null;
        Object string_literal20_tree=null;
        Object char_literal21_tree=null;
        Object char_literal23_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_classBody=new RewriteRuleSubtreeStream(adaptor,"rule classBody");
        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:81:17: ( 'class' className= Identifier ( 'extends' parentName= Identifier )? '{' classBody '}' -> ^( CLASS ^( NAME $className) ^( SUPER ( $parentName)? ) classBody ) )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:82:2: 'class' className= Identifier ( 'extends' parentName= Identifier )? '{' classBody '}'
            {
            string_literal19=(Token)match(input,48,FOLLOW_48_in_classDeclaration544);  
            stream_48.add(string_literal19);

            className=(Token)match(input,Identifier,FOLLOW_Identifier_in_classDeclaration548);  
            stream_Identifier.add(className);

            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:82:31: ( 'extends' parentName= Identifier )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==61) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:82:32: 'extends' parentName= Identifier
                    {
                    string_literal20=(Token)match(input,61,FOLLOW_61_in_classDeclaration551);  
                    stream_61.add(string_literal20);

                    parentName=(Token)match(input,Identifier,FOLLOW_Identifier_in_classDeclaration555);  
                    stream_Identifier.add(parentName);


                    }
                    break;

            }

            char_literal21=(Token)match(input,49,FOLLOW_49_in_classDeclaration559);  
            stream_49.add(char_literal21);

            pushFollow(FOLLOW_classBody_in_classDeclaration561);
            classBody22=classBody();

            state._fsp--;

            stream_classBody.add(classBody22.getTree());
            char_literal23=(Token)match(input,60,FOLLOW_60_in_classDeclaration563);  
            stream_60.add(char_literal23);



            // AST REWRITE
            // elements: className, parentName, classBody
            // token labels: className, parentName
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_className=new RewriteRuleTokenStream(adaptor,"token className",className);
            RewriteRuleTokenStream stream_parentName=new RewriteRuleTokenStream(adaptor,"token parentName",parentName);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 82:84: -> ^( CLASS ^( NAME $className) ^( SUPER ( $parentName)? ) classBody )
            {
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:82:87: ^( CLASS ^( NAME $className) ^( SUPER ( $parentName)? ) classBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CLASS, "CLASS"), root_1);

                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:82:95: ^( NAME $className)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(NAME, "NAME"), root_2);

                adaptor.addChild(root_2, stream_className.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:82:114: ^( SUPER ( $parentName)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SUPER, "SUPER"), root_2);

                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:82:122: ( $parentName)?
                if ( stream_parentName.hasNext() ) {
                    adaptor.addChild(root_2, stream_parentName.nextNode());

                }
                stream_parentName.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_classBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classDeclaration"

    public static class classBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classBody"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:84:1: classBody : varDeclarations methodDeclarations -> ^( BODY varDeclarations methodDeclarations ) ;
    public final MiniJavaParser.classBody_return classBody() throws RecognitionException {
        MiniJavaParser.classBody_return retval = new MiniJavaParser.classBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MiniJavaParser.varDeclarations_return varDeclarations24 = null;

        MiniJavaParser.methodDeclarations_return methodDeclarations25 = null;


        RewriteRuleSubtreeStream stream_varDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule varDeclarations");
        RewriteRuleSubtreeStream stream_methodDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule methodDeclarations");
        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:84:10: ( varDeclarations methodDeclarations -> ^( BODY varDeclarations methodDeclarations ) )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:85:2: varDeclarations methodDeclarations
            {
            pushFollow(FOLLOW_varDeclarations_in_classBody595);
            varDeclarations24=varDeclarations();

            state._fsp--;

            stream_varDeclarations.add(varDeclarations24.getTree());
            pushFollow(FOLLOW_methodDeclarations_in_classBody597);
            methodDeclarations25=methodDeclarations();

            state._fsp--;

            stream_methodDeclarations.add(methodDeclarations25.getTree());


            // AST REWRITE
            // elements: methodDeclarations, varDeclarations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 85:37: -> ^( BODY varDeclarations methodDeclarations )
            {
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:85:40: ^( BODY varDeclarations methodDeclarations )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                adaptor.addChild(root_1, stream_varDeclarations.nextTree());
                adaptor.addChild(root_1, stream_methodDeclarations.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classBody"

    public static class methodDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodDeclaration"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:87:1: methodDeclaration : (visibility= 'public' )? returnType= type methodName= Identifier '(' methodParameters ')' '{' varDeclarations statements returnStatement '}' -> ^( METHOD ^( VISIBILITY ( 'public' )? ) ^( RETURN_TYPE $returnType) ^( NAME $methodName) methodParameters varDeclarations statements returnStatement ) ;
    public final MiniJavaParser.methodDeclaration_return methodDeclaration() throws RecognitionException {
        MiniJavaParser.methodDeclaration_return retval = new MiniJavaParser.methodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token visibility=null;
        Token methodName=null;
        Token char_literal26=null;
        Token char_literal28=null;
        Token char_literal29=null;
        Token char_literal33=null;
        MiniJavaParser.type_return returnType = null;

        MiniJavaParser.methodParameters_return methodParameters27 = null;

        MiniJavaParser.varDeclarations_return varDeclarations30 = null;

        MiniJavaParser.statements_return statements31 = null;

        MiniJavaParser.returnStatement_return returnStatement32 = null;


        Object visibility_tree=null;
        Object methodName_tree=null;
        Object char_literal26_tree=null;
        Object char_literal28_tree=null;
        Object char_literal29_tree=null;
        Object char_literal33_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_methodParameters=new RewriteRuleSubtreeStream(adaptor,"rule methodParameters");
        RewriteRuleSubtreeStream stream_varDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule varDeclarations");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        RewriteRuleSubtreeStream stream_returnStatement=new RewriteRuleSubtreeStream(adaptor,"rule returnStatement");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:87:18: ( (visibility= 'public' )? returnType= type methodName= Identifier '(' methodParameters ')' '{' varDeclarations statements returnStatement '}' -> ^( METHOD ^( VISIBILITY ( 'public' )? ) ^( RETURN_TYPE $returnType) ^( NAME $methodName) methodParameters varDeclarations statements returnStatement ) )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:88:2: (visibility= 'public' )? returnType= type methodName= Identifier '(' methodParameters ')' '{' varDeclarations statements returnStatement '}'
            {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:88:12: (visibility= 'public' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==50) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:88:12: visibility= 'public'
                    {
                    visibility=(Token)match(input,50,FOLLOW_50_in_methodDeclaration619);  
                    stream_50.add(visibility);


                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_methodDeclaration624);
            returnType=type();

            state._fsp--;

            stream_type.add(returnType.getTree());
            methodName=(Token)match(input,Identifier,FOLLOW_Identifier_in_methodDeclaration628);  
            stream_Identifier.add(methodName);

            char_literal26=(Token)match(input,54,FOLLOW_54_in_methodDeclaration630);  
            stream_54.add(char_literal26);

            pushFollow(FOLLOW_methodParameters_in_methodDeclaration632);
            methodParameters27=methodParameters();

            state._fsp--;

            stream_methodParameters.add(methodParameters27.getTree());
            char_literal28=(Token)match(input,59,FOLLOW_59_in_methodDeclaration634);  
            stream_59.add(char_literal28);

            char_literal29=(Token)match(input,49,FOLLOW_49_in_methodDeclaration636);  
            stream_49.add(char_literal29);

            pushFollow(FOLLOW_varDeclarations_in_methodDeclaration638);
            varDeclarations30=varDeclarations();

            state._fsp--;

            stream_varDeclarations.add(varDeclarations30.getTree());
            pushFollow(FOLLOW_statements_in_methodDeclaration640);
            statements31=statements();

            state._fsp--;

            stream_statements.add(statements31.getTree());
            pushFollow(FOLLOW_returnStatement_in_methodDeclaration642);
            returnStatement32=returnStatement();

            state._fsp--;

            stream_returnStatement.add(returnStatement32.getTree());
            char_literal33=(Token)match(input,60,FOLLOW_60_in_methodDeclaration644);  
            stream_60.add(char_literal33);



            // AST REWRITE
            // elements: varDeclarations, methodParameters, statements, methodName, 50, returnStatement, returnType
            // token labels: methodName
            // rule labels: retval, returnType
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_methodName=new RewriteRuleTokenStream(adaptor,"token methodName",methodName);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_returnType=new RewriteRuleSubtreeStream(adaptor,"rule returnType",returnType!=null?returnType.tree:null);

            root_0 = (Object)adaptor.nil();
            // 88:137: -> ^( METHOD ^( VISIBILITY ( 'public' )? ) ^( RETURN_TYPE $returnType) ^( NAME $methodName) methodParameters varDeclarations statements returnStatement )
            {
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:88:140: ^( METHOD ^( VISIBILITY ( 'public' )? ) ^( RETURN_TYPE $returnType) ^( NAME $methodName) methodParameters varDeclarations statements returnStatement )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD, "METHOD"), root_1);

                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:88:149: ^( VISIBILITY ( 'public' )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(VISIBILITY, "VISIBILITY"), root_2);

                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:88:162: ( 'public' )?
                if ( stream_50.hasNext() ) {
                    adaptor.addChild(root_2, stream_50.nextNode());

                }
                stream_50.reset();

                adaptor.addChild(root_1, root_2);
                }
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:88:173: ^( RETURN_TYPE $returnType)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN_TYPE, "RETURN_TYPE"), root_2);

                adaptor.addChild(root_2, stream_returnType.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:88:200: ^( NAME $methodName)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(NAME, "NAME"), root_2);

                adaptor.addChild(root_2, stream_methodName.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_methodParameters.nextTree());
                adaptor.addChild(root_1, stream_varDeclarations.nextTree());
                adaptor.addChild(root_1, stream_statements.nextTree());
                adaptor.addChild(root_1, stream_returnStatement.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "methodDeclaration"

    public static class methodDeclarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodDeclarations"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:90:1: methodDeclarations : ( methodDeclaration )* -> ^( METHODS ( methodDeclaration )* ) ;
    public final MiniJavaParser.methodDeclarations_return methodDeclarations() throws RecognitionException {
        MiniJavaParser.methodDeclarations_return retval = new MiniJavaParser.methodDeclarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MiniJavaParser.methodDeclaration_return methodDeclaration34 = null;


        RewriteRuleSubtreeStream stream_methodDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule methodDeclaration");
        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:90:19: ( ( methodDeclaration )* -> ^( METHODS ( methodDeclaration )* ) )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:91:2: ( methodDeclaration )*
            {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:91:2: ( methodDeclaration )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Identifier||LA5_0==50||(LA5_0>=70 && LA5_0<=71)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:91:2: methodDeclaration
            	    {
            	    pushFollow(FOLLOW_methodDeclaration_in_methodDeclarations688);
            	    methodDeclaration34=methodDeclaration();

            	    state._fsp--;

            	    stream_methodDeclaration.add(methodDeclaration34.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);



            // AST REWRITE
            // elements: methodDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 91:21: -> ^( METHODS ( methodDeclaration )* )
            {
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:91:24: ^( METHODS ( methodDeclaration )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODS, "METHODS"), root_1);

                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:91:34: ( methodDeclaration )*
                while ( stream_methodDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_methodDeclaration.nextTree());

                }
                stream_methodDeclaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "methodDeclarations"

    public static class methodParameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodParameters"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:93:1: methodParameters : ( varDeclarator ( ',' varDeclarator )* )? -> ^( PARAMETERS ( varDeclarator )* ) ;
    public final MiniJavaParser.methodParameters_return methodParameters() throws RecognitionException {
        MiniJavaParser.methodParameters_return retval = new MiniJavaParser.methodParameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal36=null;
        MiniJavaParser.varDeclarator_return varDeclarator35 = null;

        MiniJavaParser.varDeclarator_return varDeclarator37 = null;


        Object char_literal36_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleSubtreeStream stream_varDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule varDeclarator");
        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:93:17: ( ( varDeclarator ( ',' varDeclarator )* )? -> ^( PARAMETERS ( varDeclarator )* ) )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:94:2: ( varDeclarator ( ',' varDeclarator )* )?
            {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:94:2: ( varDeclarator ( ',' varDeclarator )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Identifier||(LA7_0>=70 && LA7_0<=71)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:94:3: varDeclarator ( ',' varDeclarator )*
                    {
                    pushFollow(FOLLOW_varDeclarator_in_methodParameters707);
                    varDeclarator35=varDeclarator();

                    state._fsp--;

                    stream_varDeclarator.add(varDeclarator35.getTree());
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:94:17: ( ',' varDeclarator )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==62) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:94:18: ',' varDeclarator
                    	    {
                    	    char_literal36=(Token)match(input,62,FOLLOW_62_in_methodParameters710);  
                    	    stream_62.add(char_literal36);

                    	    pushFollow(FOLLOW_varDeclarator_in_methodParameters712);
                    	    varDeclarator37=varDeclarator();

                    	    state._fsp--;

                    	    stream_varDeclarator.add(varDeclarator37.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }



            // AST REWRITE
            // elements: varDeclarator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 94:40: -> ^( PARAMETERS ( varDeclarator )* )
            {
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:94:43: ^( PARAMETERS ( varDeclarator )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMETERS, "PARAMETERS"), root_1);

                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:94:56: ( varDeclarator )*
                while ( stream_varDeclarator.hasNext() ) {
                    adaptor.addChild(root_1, stream_varDeclarator.nextTree());

                }
                stream_varDeclarator.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "methodParameters"

    public static class returnStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "returnStatement"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:96:1: returnStatement : 'return' expression ';' -> ^( RETURN expression ) ;
    public final MiniJavaParser.returnStatement_return returnStatement() throws RecognitionException {
        MiniJavaParser.returnStatement_return retval = new MiniJavaParser.returnStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal38=null;
        Token char_literal40=null;
        MiniJavaParser.expression_return expression39 = null;


        Object string_literal38_tree=null;
        Object char_literal40_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:96:16: ( 'return' expression ';' -> ^( RETURN expression ) )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:97:2: 'return' expression ';'
            {
            string_literal38=(Token)match(input,63,FOLLOW_63_in_returnStatement733);  
            stream_63.add(string_literal38);

            pushFollow(FOLLOW_expression_in_returnStatement735);
            expression39=expression();

            state._fsp--;

            stream_expression.add(expression39.getTree());
            char_literal40=(Token)match(input,64,FOLLOW_64_in_returnStatement737);  
            stream_64.add(char_literal40);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 97:26: -> ^( RETURN expression )
            {
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:97:29: ^( RETURN expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "returnStatement"

    public static class varDeclarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclarator"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:100:1: varDeclarator : type Identifier -> ^( VARIABLE type Identifier ) ;
    public final MiniJavaParser.varDeclarator_return varDeclarator() throws RecognitionException {
        MiniJavaParser.varDeclarator_return retval = new MiniJavaParser.varDeclarator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier42=null;
        MiniJavaParser.type_return type41 = null;


        Object Identifier42_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:100:14: ( type Identifier -> ^( VARIABLE type Identifier ) )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:101:2: type Identifier
            {
            pushFollow(FOLLOW_type_in_varDeclarator755);
            type41=type();

            state._fsp--;

            stream_type.add(type41.getTree());
            Identifier42=(Token)match(input,Identifier,FOLLOW_Identifier_in_varDeclarator757);  
            stream_Identifier.add(Identifier42);



            // AST REWRITE
            // elements: type, Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 101:18: -> ^( VARIABLE type Identifier )
            {
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:101:21: ^( VARIABLE type Identifier )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLE, "VARIABLE"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_Identifier.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varDeclarator"

    public static class varDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclaration"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:103:1: varDeclaration : varDeclarator ';' -> varDeclarator ;
    public final MiniJavaParser.varDeclaration_return varDeclaration() throws RecognitionException {
        MiniJavaParser.varDeclaration_return retval = new MiniJavaParser.varDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal44=null;
        MiniJavaParser.varDeclarator_return varDeclarator43 = null;


        Object char_literal44_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleSubtreeStream stream_varDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule varDeclarator");
        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:103:15: ( varDeclarator ';' -> varDeclarator )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:104:2: varDeclarator ';'
            {
            pushFollow(FOLLOW_varDeclarator_in_varDeclaration776);
            varDeclarator43=varDeclarator();

            state._fsp--;

            stream_varDeclarator.add(varDeclarator43.getTree());
            char_literal44=(Token)match(input,64,FOLLOW_64_in_varDeclaration778);  
            stream_64.add(char_literal44);



            // AST REWRITE
            // elements: varDeclarator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 104:20: -> varDeclarator
            {
                adaptor.addChild(root_0, stream_varDeclarator.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varDeclaration"

    public static class varDeclarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclarations"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:106:1: varDeclarations : ( varDeclaration )* -> ^( VARIABLES ( varDeclaration )* ) ;
    public final MiniJavaParser.varDeclarations_return varDeclarations() throws RecognitionException {
        MiniJavaParser.varDeclarations_return retval = new MiniJavaParser.varDeclarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MiniJavaParser.varDeclaration_return varDeclaration45 = null;


        RewriteRuleSubtreeStream stream_varDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule varDeclaration");
        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:106:16: ( ( varDeclaration )* -> ^( VARIABLES ( varDeclaration )* ) )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:107:2: ( varDeclaration )*
            {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:107:2: ( varDeclaration )*
            loop8:
            do {
                int alt8=2;
                switch ( input.LA(1) ) {
                case 70:
                    {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==56) ) {
                        int LA8_5 = input.LA(3);

                        if ( (LA8_5==57) ) {
                            int LA8_7 = input.LA(4);

                            if ( (LA8_7==Identifier) ) {
                                int LA8_6 = input.LA(5);

                                if ( (LA8_6==64) ) {
                                    alt8=1;
                                }


                            }


                        }


                    }
                    else if ( (LA8_2==Identifier) ) {
                        int LA8_6 = input.LA(3);

                        if ( (LA8_6==64) ) {
                            alt8=1;
                        }


                    }


                    }
                    break;
                case 71:
                    {
                    int LA8_3 = input.LA(2);

                    if ( (LA8_3==Identifier) ) {
                        int LA8_6 = input.LA(3);

                        if ( (LA8_6==64) ) {
                            alt8=1;
                        }


                    }


                    }
                    break;
                case Identifier:
                    {
                    int LA8_4 = input.LA(2);

                    if ( (LA8_4==Identifier) ) {
                        int LA8_6 = input.LA(3);

                        if ( (LA8_6==64) ) {
                            alt8=1;
                        }


                    }


                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:107:2: varDeclaration
            	    {
            	    pushFollow(FOLLOW_varDeclaration_in_varDeclarations791);
            	    varDeclaration45=varDeclaration();

            	    state._fsp--;

            	    stream_varDeclaration.add(varDeclaration45.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);



            // AST REWRITE
            // elements: varDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 107:18: -> ^( VARIABLES ( varDeclaration )* )
            {
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:107:21: ^( VARIABLES ( varDeclaration )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLES, "VARIABLES"), root_1);

                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:107:33: ( varDeclaration )*
                while ( stream_varDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_varDeclaration.nextTree());

                }
                stream_varDeclaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varDeclarations"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:111:1: statement : ( blockStatement | whileStatement | ifStatement | printlnStatement | expression ';' -> expression | ';' );
    public final MiniJavaParser.statement_return statement() throws RecognitionException {
        MiniJavaParser.statement_return retval = new MiniJavaParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal51=null;
        Token char_literal52=null;
        MiniJavaParser.blockStatement_return blockStatement46 = null;

        MiniJavaParser.whileStatement_return whileStatement47 = null;

        MiniJavaParser.ifStatement_return ifStatement48 = null;

        MiniJavaParser.printlnStatement_return printlnStatement49 = null;

        MiniJavaParser.expression_return expression50 = null;


        Object char_literal51_tree=null;
        Object char_literal52_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:111:10: ( blockStatement | whileStatement | ifStatement | printlnStatement | expression ';' -> expression | ';' )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt9=1;
                }
                break;
            case 65:
                {
                alt9=2;
                }
                break;
            case 66:
                {
                alt9=3;
                }
                break;
            case 68:
                {
                alt9=4;
                }
                break;
            case NOT:
            case SUB:
            case THIS:
            case Boolean:
            case Identifier:
            case Integer:
            case 54:
            case 69:
                {
                alt9=5;
                }
                break;
            case 64:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:112:2: blockStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_blockStatement_in_statement814);
                    blockStatement46=blockStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, blockStatement46.getTree());

                    }
                    break;
                case 2 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:113:4: whileStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_statement819);
                    whileStatement47=whileStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, whileStatement47.getTree());

                    }
                    break;
                case 3 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:114:4: ifStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statement824);
                    ifStatement48=ifStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStatement48.getTree());

                    }
                    break;
                case 4 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:115:4: printlnStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_printlnStatement_in_statement829);
                    printlnStatement49=printlnStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, printlnStatement49.getTree());

                    }
                    break;
                case 5 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:116:4: expression ';'
                    {
                    pushFollow(FOLLOW_expression_in_statement834);
                    expression50=expression();

                    state._fsp--;

                    stream_expression.add(expression50.getTree());
                    char_literal51=(Token)match(input,64,FOLLOW_64_in_statement836);  
                    stream_64.add(char_literal51);



                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 116:19: -> expression
                    {
                        adaptor.addChild(root_0, stream_expression.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:117:4: ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal52=(Token)match(input,64,FOLLOW_64_in_statement845); 
                    char_literal52_tree = (Object)adaptor.create(char_literal52);
                    adaptor.addChild(root_0, char_literal52_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class statements_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statements"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:119:1: statements : ( statement )* -> ^( STATEMENTS ( statement )* ) ;
    public final MiniJavaParser.statements_return statements() throws RecognitionException {
        MiniJavaParser.statements_return retval = new MiniJavaParser.statements_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MiniJavaParser.statement_return statement53 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:119:11: ( ( statement )* -> ^( STATEMENTS ( statement )* ) )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:120:2: ( statement )*
            {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:120:2: ( statement )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=NOT && LA10_0<=SUB)||LA10_0==THIS||(LA10_0>=Boolean && LA10_0<=Integer)||LA10_0==49||LA10_0==54||(LA10_0>=64 && LA10_0<=66)||(LA10_0>=68 && LA10_0<=69)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:120:2: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statements854);
            	    statement53=statement();

            	    state._fsp--;

            	    stream_statement.add(statement53.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 120:13: -> ^( STATEMENTS ( statement )* )
            {
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:120:16: ^( STATEMENTS ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_1);

                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:120:29: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statements"

    public static class blockStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockStatement"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:122:1: blockStatement : '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) ;
    public final MiniJavaParser.blockStatement_return blockStatement() throws RecognitionException {
        MiniJavaParser.blockStatement_return retval = new MiniJavaParser.blockStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal54=null;
        Token char_literal56=null;
        MiniJavaParser.statement_return statement55 = null;


        Object char_literal54_tree=null;
        Object char_literal56_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:122:15: ( '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:123:2: '{' ( statement )* '}'
            {
            char_literal54=(Token)match(input,49,FOLLOW_49_in_blockStatement873);  
            stream_49.add(char_literal54);

            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:123:6: ( statement )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=NOT && LA11_0<=SUB)||LA11_0==THIS||(LA11_0>=Boolean && LA11_0<=Integer)||LA11_0==49||LA11_0==54||(LA11_0>=64 && LA11_0<=66)||(LA11_0>=68 && LA11_0<=69)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:123:6: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_blockStatement875);
            	    statement55=statement();

            	    state._fsp--;

            	    stream_statement.add(statement55.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            char_literal56=(Token)match(input,60,FOLLOW_60_in_blockStatement878);  
            stream_60.add(char_literal56);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 123:21: -> ^( BLOCK ( statement )* )
            {
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:123:24: ^( BLOCK ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:123:32: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "blockStatement"

    public static class whileStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:125:1: whileStatement : 'while' '(' expression ')' statement -> ^( WHILE expression statement ) ;
    public final MiniJavaParser.whileStatement_return whileStatement() throws RecognitionException {
        MiniJavaParser.whileStatement_return retval = new MiniJavaParser.whileStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal57=null;
        Token char_literal58=null;
        Token char_literal60=null;
        MiniJavaParser.expression_return expression59 = null;

        MiniJavaParser.statement_return statement61 = null;


        Object string_literal57_tree=null;
        Object char_literal58_tree=null;
        Object char_literal60_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:125:15: ( 'while' '(' expression ')' statement -> ^( WHILE expression statement ) )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:126:2: 'while' '(' expression ')' statement
            {
            string_literal57=(Token)match(input,65,FOLLOW_65_in_whileStatement897);  
            stream_65.add(string_literal57);

            char_literal58=(Token)match(input,54,FOLLOW_54_in_whileStatement899);  
            stream_54.add(char_literal58);

            pushFollow(FOLLOW_expression_in_whileStatement901);
            expression59=expression();

            state._fsp--;

            stream_expression.add(expression59.getTree());
            char_literal60=(Token)match(input,59,FOLLOW_59_in_whileStatement903);  
            stream_59.add(char_literal60);

            pushFollow(FOLLOW_statement_in_whileStatement905);
            statement61=statement();

            state._fsp--;

            stream_statement.add(statement61.getTree());


            // AST REWRITE
            // elements: expression, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 126:39: -> ^( WHILE expression statement )
            {
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:126:42: ^( WHILE expression statement )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                adaptor.addChild(root_1, stream_statement.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whileStatement"

    public static class ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:128:1: ifStatement : 'if' '(' expression ')' trueStatement= statement 'else' falseStatement= statement -> ^( IF expression $trueStatement $falseStatement) ;
    public final MiniJavaParser.ifStatement_return ifStatement() throws RecognitionException {
        MiniJavaParser.ifStatement_return retval = new MiniJavaParser.ifStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal62=null;
        Token char_literal63=null;
        Token char_literal65=null;
        Token string_literal66=null;
        MiniJavaParser.statement_return trueStatement = null;

        MiniJavaParser.statement_return falseStatement = null;

        MiniJavaParser.expression_return expression64 = null;


        Object string_literal62_tree=null;
        Object char_literal63_tree=null;
        Object char_literal65_tree=null;
        Object string_literal66_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:128:12: ( 'if' '(' expression ')' trueStatement= statement 'else' falseStatement= statement -> ^( IF expression $trueStatement $falseStatement) )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:129:2: 'if' '(' expression ')' trueStatement= statement 'else' falseStatement= statement
            {
            string_literal62=(Token)match(input,66,FOLLOW_66_in_ifStatement924);  
            stream_66.add(string_literal62);

            char_literal63=(Token)match(input,54,FOLLOW_54_in_ifStatement926);  
            stream_54.add(char_literal63);

            pushFollow(FOLLOW_expression_in_ifStatement928);
            expression64=expression();

            state._fsp--;

            stream_expression.add(expression64.getTree());
            char_literal65=(Token)match(input,59,FOLLOW_59_in_ifStatement930);  
            stream_59.add(char_literal65);

            pushFollow(FOLLOW_statement_in_ifStatement936);
            trueStatement=statement();

            state._fsp--;

            stream_statement.add(trueStatement.getTree());
            string_literal66=(Token)match(input,67,FOLLOW_67_in_ifStatement938);  
            stream_67.add(string_literal66);

            pushFollow(FOLLOW_statement_in_ifStatement944);
            falseStatement=statement();

            state._fsp--;

            stream_statement.add(falseStatement.getTree());


            // AST REWRITE
            // elements: expression, falseStatement, trueStatement
            // token labels: 
            // rule labels: retval, falseStatement, trueStatement
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_falseStatement=new RewriteRuleSubtreeStream(adaptor,"rule falseStatement",falseStatement!=null?falseStatement.tree:null);
            RewriteRuleSubtreeStream stream_trueStatement=new RewriteRuleSubtreeStream(adaptor,"rule trueStatement",trueStatement!=null?trueStatement.tree:null);

            root_0 = (Object)adaptor.nil();
            // 129:86: -> ^( IF expression $trueStatement $falseStatement)
            {
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:129:89: ^( IF expression $trueStatement $falseStatement)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                adaptor.addChild(root_1, stream_trueStatement.nextTree());
                adaptor.addChild(root_1, stream_falseStatement.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class printlnStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "printlnStatement"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:131:1: printlnStatement : 'System.out.println' '(' expression ')' ';' -> ^( PRINTLN_CALL expression ) ;
    public final MiniJavaParser.printlnStatement_return printlnStatement() throws RecognitionException {
        MiniJavaParser.printlnStatement_return retval = new MiniJavaParser.printlnStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal67=null;
        Token char_literal68=null;
        Token char_literal70=null;
        Token char_literal71=null;
        MiniJavaParser.expression_return expression69 = null;


        Object string_literal67_tree=null;
        Object char_literal68_tree=null;
        Object char_literal70_tree=null;
        Object char_literal71_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:131:17: ( 'System.out.println' '(' expression ')' ';' -> ^( PRINTLN_CALL expression ) )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:132:2: 'System.out.println' '(' expression ')' ';'
            {
            string_literal67=(Token)match(input,68,FOLLOW_68_in_printlnStatement966);  
            stream_68.add(string_literal67);

            char_literal68=(Token)match(input,54,FOLLOW_54_in_printlnStatement968);  
            stream_54.add(char_literal68);

            pushFollow(FOLLOW_expression_in_printlnStatement970);
            expression69=expression();

            state._fsp--;

            stream_expression.add(expression69.getTree());
            char_literal70=(Token)match(input,59,FOLLOW_59_in_printlnStatement972);  
            stream_59.add(char_literal70);

            char_literal71=(Token)match(input,64,FOLLOW_64_in_printlnStatement974);  
            stream_64.add(char_literal71);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 132:46: -> ^( PRINTLN_CALL expression )
            {
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:132:49: ^( PRINTLN_CALL expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRINTLN_CALL, "PRINTLN_CALL"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "printlnStatement"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:136:1: expression : orExpression ( '=' expression )? ;
    public final MiniJavaParser.expression_return expression() throws RecognitionException {
        MiniJavaParser.expression_return retval = new MiniJavaParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal73=null;
        MiniJavaParser.orExpression_return orExpression72 = null;

        MiniJavaParser.expression_return expression74 = null;


        Object char_literal73_tree=null;

        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:136:11: ( orExpression ( '=' expression )? )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:137:2: orExpression ( '=' expression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_orExpression_in_expression993);
            orExpression72=orExpression();

            state._fsp--;

            adaptor.addChild(root_0, orExpression72.getTree());
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:137:15: ( '=' expression )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==EQ) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:137:16: '=' expression
                    {
                    char_literal73=(Token)match(input,EQ,FOLLOW_EQ_in_expression996); 
                    char_literal73_tree = (Object)adaptor.create(char_literal73);
                    root_0 = (Object)adaptor.becomeRoot(char_literal73_tree, root_0);

                    pushFollow(FOLLOW_expression_in_expression999);
                    expression74=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression74.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class orExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orExpression"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:139:1: orExpression : andExpression ( '||' andExpression )* ;
    public final MiniJavaParser.orExpression_return orExpression() throws RecognitionException {
        MiniJavaParser.orExpression_return retval = new MiniJavaParser.orExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal76=null;
        MiniJavaParser.andExpression_return andExpression75 = null;

        MiniJavaParser.andExpression_return andExpression77 = null;


        Object string_literal76_tree=null;

        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:139:13: ( andExpression ( '||' andExpression )* )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:140:2: andExpression ( '||' andExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andExpression_in_orExpression1010);
            andExpression75=andExpression();

            state._fsp--;

            adaptor.addChild(root_0, andExpression75.getTree());
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:140:16: ( '||' andExpression )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==OR) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:140:17: '||' andExpression
            	    {
            	    string_literal76=(Token)match(input,OR,FOLLOW_OR_in_orExpression1013); 
            	    string_literal76_tree = (Object)adaptor.create(string_literal76);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal76_tree, root_0);

            	    pushFollow(FOLLOW_andExpression_in_orExpression1016);
            	    andExpression77=andExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, andExpression77.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "orExpression"

    public static class andExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andExpression"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:142:1: andExpression : comparisionExpression ( '&&' comparisionExpression )* ;
    public final MiniJavaParser.andExpression_return andExpression() throws RecognitionException {
        MiniJavaParser.andExpression_return retval = new MiniJavaParser.andExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal79=null;
        MiniJavaParser.comparisionExpression_return comparisionExpression78 = null;

        MiniJavaParser.comparisionExpression_return comparisionExpression80 = null;


        Object string_literal79_tree=null;

        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:142:14: ( comparisionExpression ( '&&' comparisionExpression )* )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:143:2: comparisionExpression ( '&&' comparisionExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_comparisionExpression_in_andExpression1026);
            comparisionExpression78=comparisionExpression();

            state._fsp--;

            adaptor.addChild(root_0, comparisionExpression78.getTree());
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:143:24: ( '&&' comparisionExpression )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==AND) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:143:25: '&&' comparisionExpression
            	    {
            	    string_literal79=(Token)match(input,AND,FOLLOW_AND_in_andExpression1029); 
            	    string_literal79_tree = (Object)adaptor.create(string_literal79);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal79_tree, root_0);

            	    pushFollow(FOLLOW_comparisionExpression_in_andExpression1032);
            	    comparisionExpression80=comparisionExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, comparisionExpression80.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "andExpression"

    public static class comparisionExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comparisionExpression"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:145:1: comparisionExpression : additionExpression ( '<' additionExpression )* ;
    public final MiniJavaParser.comparisionExpression_return comparisionExpression() throws RecognitionException {
        MiniJavaParser.comparisionExpression_return retval = new MiniJavaParser.comparisionExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal82=null;
        MiniJavaParser.additionExpression_return additionExpression81 = null;

        MiniJavaParser.additionExpression_return additionExpression83 = null;


        Object char_literal82_tree=null;

        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:145:22: ( additionExpression ( '<' additionExpression )* )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:146:2: additionExpression ( '<' additionExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additionExpression_in_comparisionExpression1046);
            additionExpression81=additionExpression();

            state._fsp--;

            adaptor.addChild(root_0, additionExpression81.getTree());
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:146:21: ( '<' additionExpression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==LESS) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:146:22: '<' additionExpression
            	    {
            	    char_literal82=(Token)match(input,LESS,FOLLOW_LESS_in_comparisionExpression1049); 
            	    char_literal82_tree = (Object)adaptor.create(char_literal82);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal82_tree, root_0);

            	    pushFollow(FOLLOW_additionExpression_in_comparisionExpression1052);
            	    additionExpression83=additionExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, additionExpression83.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comparisionExpression"

    public static class additionExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additionExpression"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:148:1: additionExpression : multiplicationExpression ( ( '+' | '-' ) multiplicationExpression )* ;
    public final MiniJavaParser.additionExpression_return additionExpression() throws RecognitionException {
        MiniJavaParser.additionExpression_return retval = new MiniJavaParser.additionExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal85=null;
        Token char_literal86=null;
        MiniJavaParser.multiplicationExpression_return multiplicationExpression84 = null;

        MiniJavaParser.multiplicationExpression_return multiplicationExpression87 = null;


        Object char_literal85_tree=null;
        Object char_literal86_tree=null;

        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:148:19: ( multiplicationExpression ( ( '+' | '-' ) multiplicationExpression )* )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:149:2: multiplicationExpression ( ( '+' | '-' ) multiplicationExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicationExpression_in_additionExpression1066);
            multiplicationExpression84=multiplicationExpression();

            state._fsp--;

            adaptor.addChild(root_0, multiplicationExpression84.getTree());
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:149:27: ( ( '+' | '-' ) multiplicationExpression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==ADD||LA17_0==SUB) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:149:28: ( '+' | '-' ) multiplicationExpression
            	    {
            	    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:149:28: ( '+' | '-' )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==ADD) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==SUB) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:149:29: '+'
            	            {
            	            char_literal85=(Token)match(input,ADD,FOLLOW_ADD_in_additionExpression1070); 
            	            char_literal85_tree = (Object)adaptor.create(char_literal85);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal85_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:149:36: '-'
            	            {
            	            char_literal86=(Token)match(input,SUB,FOLLOW_SUB_in_additionExpression1075); 
            	            char_literal86_tree = (Object)adaptor.create(char_literal86);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal86_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicationExpression_in_additionExpression1079);
            	    multiplicationExpression87=multiplicationExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiplicationExpression87.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "additionExpression"

    public static class multiplicationExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicationExpression"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:151:1: multiplicationExpression : signExpression ( '*' signExpression )* ;
    public final MiniJavaParser.multiplicationExpression_return multiplicationExpression() throws RecognitionException {
        MiniJavaParser.multiplicationExpression_return retval = new MiniJavaParser.multiplicationExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal89=null;
        MiniJavaParser.signExpression_return signExpression88 = null;

        MiniJavaParser.signExpression_return signExpression90 = null;


        Object char_literal89_tree=null;

        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:151:25: ( signExpression ( '*' signExpression )* )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:152:2: signExpression ( '*' signExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_signExpression_in_multiplicationExpression1089);
            signExpression88=signExpression();

            state._fsp--;

            adaptor.addChild(root_0, signExpression88.getTree());
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:152:17: ( '*' signExpression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==MUL) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:152:18: '*' signExpression
            	    {
            	    char_literal89=(Token)match(input,MUL,FOLLOW_MUL_in_multiplicationExpression1092); 
            	    char_literal89_tree = (Object)adaptor.create(char_literal89);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal89_tree, root_0);

            	    pushFollow(FOLLOW_signExpression_in_multiplicationExpression1095);
            	    signExpression90=signExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, signExpression90.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplicationExpression"

    public static class signExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "signExpression"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:154:1: signExpression : ( '-' signExpression | unaryExpression );
    public final MiniJavaParser.signExpression_return signExpression() throws RecognitionException {
        MiniJavaParser.signExpression_return retval = new MiniJavaParser.signExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal91=null;
        MiniJavaParser.signExpression_return signExpression92 = null;

        MiniJavaParser.unaryExpression_return unaryExpression93 = null;


        Object char_literal91_tree=null;

        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:154:15: ( '-' signExpression | unaryExpression )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==SUB) ) {
                alt19=1;
            }
            else if ( (LA19_0==NOT||LA19_0==THIS||(LA19_0>=Boolean && LA19_0<=Integer)||LA19_0==54||LA19_0==69) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:155:2: '-' signExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal91=(Token)match(input,SUB,FOLLOW_SUB_in_signExpression1113); 
                    char_literal91_tree = (Object)adaptor.create(char_literal91);
                    root_0 = (Object)adaptor.becomeRoot(char_literal91_tree, root_0);

                    pushFollow(FOLLOW_signExpression_in_signExpression1116);
                    signExpression92=signExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, signExpression92.getTree());

                    }
                    break;
                case 2 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:156:7: unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpression_in_signExpression1124);
                    unaryExpression93=unaryExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, unaryExpression93.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "signExpression"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpression"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:158:1: unaryExpression : ( '!' signExpression | ( atom -> atom ) ( ( '[' expression ']' -> ^( ARRAY_ACCESS atom expression ) ) | ( ( '.' Identifier -> ^( '.' $unaryExpression Identifier ) ) )? '(' arguments ')' -> ^( METHOD_CALL $unaryExpression arguments ) )* | literal );
    public final MiniJavaParser.unaryExpression_return unaryExpression() throws RecognitionException {
        MiniJavaParser.unaryExpression_return retval = new MiniJavaParser.unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal94=null;
        Token char_literal97=null;
        Token char_literal99=null;
        Token char_literal100=null;
        Token Identifier101=null;
        Token char_literal102=null;
        Token char_literal104=null;
        MiniJavaParser.signExpression_return signExpression95 = null;

        MiniJavaParser.atom_return atom96 = null;

        MiniJavaParser.expression_return expression98 = null;

        MiniJavaParser.arguments_return arguments103 = null;

        MiniJavaParser.literal_return literal105 = null;


        Object char_literal94_tree=null;
        Object char_literal97_tree=null;
        Object char_literal99_tree=null;
        Object char_literal100_tree=null;
        Object Identifier101_tree=null;
        Object char_literal102_tree=null;
        Object char_literal104_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:158:16: ( '!' signExpression | ( atom -> atom ) ( ( '[' expression ']' -> ^( ARRAY_ACCESS atom expression ) ) | ( ( '.' Identifier -> ^( '.' $unaryExpression Identifier ) ) )? '(' arguments ')' -> ^( METHOD_CALL $unaryExpression arguments ) )* | literal )
            int alt22=3;
            switch ( input.LA(1) ) {
            case NOT:
                {
                alt22=1;
                }
                break;
            case THIS:
            case Identifier:
            case 54:
            case 69:
                {
                alt22=2;
                }
                break;
            case Boolean:
            case Integer:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:159:2: '!' signExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal94=(Token)match(input,NOT,FOLLOW_NOT_in_unaryExpression1139); 
                    char_literal94_tree = (Object)adaptor.create(char_literal94);
                    root_0 = (Object)adaptor.becomeRoot(char_literal94_tree, root_0);

                    pushFollow(FOLLOW_signExpression_in_unaryExpression1142);
                    signExpression95=signExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, signExpression95.getTree());

                    }
                    break;
                case 2 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:160:7: ( atom -> atom ) ( ( '[' expression ']' -> ^( ARRAY_ACCESS atom expression ) ) | ( ( '.' Identifier -> ^( '.' $unaryExpression Identifier ) ) )? '(' arguments ')' -> ^( METHOD_CALL $unaryExpression arguments ) )*
                    {
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:160:7: ( atom -> atom )
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:160:8: atom
                    {
                    pushFollow(FOLLOW_atom_in_unaryExpression1151);
                    atom96=atom();

                    state._fsp--;

                    stream_atom.add(atom96.getTree());


                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 160:13: -> atom
                    {
                        adaptor.addChild(root_0, stream_atom.nextTree());

                    }

                    retval.tree = root_0;
                    }

                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:161:5: ( ( '[' expression ']' -> ^( ARRAY_ACCESS atom expression ) ) | ( ( '.' Identifier -> ^( '.' $unaryExpression Identifier ) ) )? '(' arguments ')' -> ^( METHOD_CALL $unaryExpression arguments ) )*
                    loop21:
                    do {
                        int alt21=3;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==56) ) {
                            alt21=1;
                        }
                        else if ( (LA21_0==DOT||LA21_0==54) ) {
                            alt21=2;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:162:3: ( '[' expression ']' -> ^( ARRAY_ACCESS atom expression ) )
                    	    {
                    	    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:162:3: ( '[' expression ']' -> ^( ARRAY_ACCESS atom expression ) )
                    	    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:162:4: '[' expression ']'
                    	    {
                    	    char_literal97=(Token)match(input,56,FOLLOW_56_in_unaryExpression1167);  
                    	    stream_56.add(char_literal97);

                    	    pushFollow(FOLLOW_expression_in_unaryExpression1169);
                    	    expression98=expression();

                    	    state._fsp--;

                    	    stream_expression.add(expression98.getTree());
                    	    char_literal99=(Token)match(input,57,FOLLOW_57_in_unaryExpression1171);  
                    	    stream_57.add(char_literal99);



                    	    // AST REWRITE
                    	    // elements: expression, atom
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (Object)adaptor.nil();
                    	    // 162:23: -> ^( ARRAY_ACCESS atom expression )
                    	    {
                    	        // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:162:26: ^( ARRAY_ACCESS atom expression )
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAY_ACCESS, "ARRAY_ACCESS"), root_1);

                    	        adaptor.addChild(root_1, stream_atom.nextTree());
                    	        adaptor.addChild(root_1, stream_expression.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }

                    	    retval.tree = root_0;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:163:5: ( ( '.' Identifier -> ^( '.' $unaryExpression Identifier ) ) )? '(' arguments ')'
                    	    {
                    	    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:163:5: ( ( '.' Identifier -> ^( '.' $unaryExpression Identifier ) ) )?
                    	    int alt20=2;
                    	    int LA20_0 = input.LA(1);

                    	    if ( (LA20_0==DOT) ) {
                    	        alt20=1;
                    	    }
                    	    switch (alt20) {
                    	        case 1 :
                    	            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:164:4: ( '.' Identifier -> ^( '.' $unaryExpression Identifier ) )
                    	            {
                    	            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:164:4: ( '.' Identifier -> ^( '.' $unaryExpression Identifier ) )
                    	            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:164:5: '.' Identifier
                    	            {
                    	            char_literal100=(Token)match(input,DOT,FOLLOW_DOT_in_unaryExpression1194);  
                    	            stream_DOT.add(char_literal100);

                    	            Identifier101=(Token)match(input,Identifier,FOLLOW_Identifier_in_unaryExpression1196);  
                    	            stream_Identifier.add(Identifier101);



                    	            // AST REWRITE
                    	            // elements: Identifier, DOT, unaryExpression
                    	            // token labels: 
                    	            // rule labels: retval
                    	            // token list labels: 
                    	            // rule list labels: 
                    	            // wildcard labels: 
                    	            retval.tree = root_0;
                    	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	            root_0 = (Object)adaptor.nil();
                    	            // 164:20: -> ^( '.' $unaryExpression Identifier )
                    	            {
                    	                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:164:23: ^( '.' $unaryExpression Identifier )
                    	                {
                    	                Object root_1 = (Object)adaptor.nil();
                    	                root_1 = (Object)adaptor.becomeRoot(stream_DOT.nextNode(), root_1);

                    	                adaptor.addChild(root_1, stream_retval.nextTree());
                    	                adaptor.addChild(root_1, stream_Identifier.nextNode());

                    	                adaptor.addChild(root_0, root_1);
                    	                }

                    	            }

                    	            retval.tree = root_0;
                    	            }


                    	            }
                    	            break;

                    	    }

                    	    char_literal102=(Token)match(input,54,FOLLOW_54_in_unaryExpression1215);  
                    	    stream_54.add(char_literal102);

                    	    pushFollow(FOLLOW_arguments_in_unaryExpression1217);
                    	    arguments103=arguments();

                    	    state._fsp--;

                    	    stream_arguments.add(arguments103.getTree());
                    	    char_literal104=(Token)match(input,59,FOLLOW_59_in_unaryExpression1219);  
                    	    stream_59.add(char_literal104);



                    	    // AST REWRITE
                    	    // elements: arguments, unaryExpression
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (Object)adaptor.nil();
                    	    // 165:24: -> ^( METHOD_CALL $unaryExpression arguments )
                    	    {
                    	        // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:165:27: ^( METHOD_CALL $unaryExpression arguments )
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD_CALL, "METHOD_CALL"), root_1);

                    	        adaptor.addChild(root_1, stream_retval.nextTree());
                    	        adaptor.addChild(root_1, stream_arguments.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }

                    	    retval.tree = root_0;
                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:167:7: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_unaryExpression1245);
                    literal105=literal();

                    state._fsp--;

                    adaptor.addChild(root_0, literal105.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryExpression"

    public static class parenthesesExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parenthesesExpression"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:169:1: parenthesesExpression : '(' expression ')' -> ^( PARENTHESES expression ) ;
    public final MiniJavaParser.parenthesesExpression_return parenthesesExpression() throws RecognitionException {
        MiniJavaParser.parenthesesExpression_return retval = new MiniJavaParser.parenthesesExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal106=null;
        Token char_literal108=null;
        MiniJavaParser.expression_return expression107 = null;


        Object char_literal106_tree=null;
        Object char_literal108_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:169:22: ( '(' expression ')' -> ^( PARENTHESES expression ) )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:170:2: '(' expression ')'
            {
            char_literal106=(Token)match(input,54,FOLLOW_54_in_parenthesesExpression1257);  
            stream_54.add(char_literal106);

            pushFollow(FOLLOW_expression_in_parenthesesExpression1259);
            expression107=expression();

            state._fsp--;

            stream_expression.add(expression107.getTree());
            char_literal108=(Token)match(input,59,FOLLOW_59_in_parenthesesExpression1261);  
            stream_59.add(char_literal108);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 170:21: -> ^( PARENTHESES expression )
            {
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:170:24: ^( PARENTHESES expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARENTHESES, "PARENTHESES"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parenthesesExpression"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:172:1: atom : ( parenthesesExpression | 'new' type ( '[' expression ']' -> ^( ARRAY_CREATION type expression ) | '(' ')' -> ^( OBJECT_CREATION type ) ) | 'this' ( '.' Identifier )* | Identifier ( '.' Identifier )* );
    public final MiniJavaParser.atom_return atom() throws RecognitionException {
        MiniJavaParser.atom_return retval = new MiniJavaParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal110=null;
        Token char_literal112=null;
        Token char_literal114=null;
        Token char_literal115=null;
        Token char_literal116=null;
        Token string_literal117=null;
        Token char_literal118=null;
        Token Identifier119=null;
        Token Identifier120=null;
        Token char_literal121=null;
        Token Identifier122=null;
        MiniJavaParser.parenthesesExpression_return parenthesesExpression109 = null;

        MiniJavaParser.type_return type111 = null;

        MiniJavaParser.expression_return expression113 = null;


        Object string_literal110_tree=null;
        Object char_literal112_tree=null;
        Object char_literal114_tree=null;
        Object char_literal115_tree=null;
        Object char_literal116_tree=null;
        Object string_literal117_tree=null;
        Object char_literal118_tree=null;
        Object Identifier119_tree=null;
        Object Identifier120_tree=null;
        Object char_literal121_tree=null;
        Object Identifier122_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:172:5: ( parenthesesExpression | 'new' type ( '[' expression ']' -> ^( ARRAY_CREATION type expression ) | '(' ')' -> ^( OBJECT_CREATION type ) ) | 'this' ( '.' Identifier )* | Identifier ( '.' Identifier )* )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt26=1;
                }
                break;
            case 69:
                {
                alt26=2;
                }
                break;
            case THIS:
                {
                alt26=3;
                }
                break;
            case Identifier:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:173:2: parenthesesExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parenthesesExpression_in_atom1278);
                    parenthesesExpression109=parenthesesExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, parenthesesExpression109.getTree());

                    }
                    break;
                case 2 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:174:4: 'new' type ( '[' expression ']' -> ^( ARRAY_CREATION type expression ) | '(' ')' -> ^( OBJECT_CREATION type ) )
                    {
                    string_literal110=(Token)match(input,69,FOLLOW_69_in_atom1283);  
                    stream_69.add(string_literal110);

                    pushFollow(FOLLOW_type_in_atom1285);
                    type111=type();

                    state._fsp--;

                    stream_type.add(type111.getTree());
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:174:15: ( '[' expression ']' -> ^( ARRAY_CREATION type expression ) | '(' ')' -> ^( OBJECT_CREATION type ) )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==56) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==54) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:175:3: '[' expression ']'
                            {
                            char_literal112=(Token)match(input,56,FOLLOW_56_in_atom1291);  
                            stream_56.add(char_literal112);

                            pushFollow(FOLLOW_expression_in_atom1293);
                            expression113=expression();

                            state._fsp--;

                            stream_expression.add(expression113.getTree());
                            char_literal114=(Token)match(input,57,FOLLOW_57_in_atom1295);  
                            stream_57.add(char_literal114);



                            // AST REWRITE
                            // elements: type, expression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 175:22: -> ^( ARRAY_CREATION type expression )
                            {
                                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:175:25: ^( ARRAY_CREATION type expression )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAY_CREATION, "ARRAY_CREATION"), root_1);

                                adaptor.addChild(root_1, stream_type.nextTree());
                                adaptor.addChild(root_1, stream_expression.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:176:6: '(' ')'
                            {
                            char_literal115=(Token)match(input,54,FOLLOW_54_in_atom1312);  
                            stream_54.add(char_literal115);

                            char_literal116=(Token)match(input,59,FOLLOW_59_in_atom1314);  
                            stream_59.add(char_literal116);



                            // AST REWRITE
                            // elements: type
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 176:14: -> ^( OBJECT_CREATION type )
                            {
                                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:176:17: ^( OBJECT_CREATION type )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OBJECT_CREATION, "OBJECT_CREATION"), root_1);

                                adaptor.addChild(root_1, stream_type.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:178:4: 'this' ( '.' Identifier )*
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal117=(Token)match(input,THIS,FOLLOW_THIS_in_atom1330); 
                    string_literal117_tree = (Object)adaptor.create(string_literal117);
                    adaptor.addChild(root_0, string_literal117_tree);

                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:178:11: ( '.' Identifier )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==DOT) ) {
                            int LA24_2 = input.LA(2);

                            if ( (LA24_2==Identifier) ) {
                                alt24=1;
                            }


                        }


                        switch (alt24) {
                    	case 1 :
                    	    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:178:12: '.' Identifier
                    	    {
                    	    char_literal118=(Token)match(input,DOT,FOLLOW_DOT_in_atom1333); 
                    	    char_literal118_tree = (Object)adaptor.create(char_literal118);
                    	    root_0 = (Object)adaptor.becomeRoot(char_literal118_tree, root_0);

                    	    Identifier119=(Token)match(input,Identifier,FOLLOW_Identifier_in_atom1336); 
                    	    Identifier119_tree = (Object)adaptor.create(Identifier119);
                    	    adaptor.addChild(root_0, Identifier119_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;
                case 4 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:179:5: Identifier ( '.' Identifier )*
                    {
                    root_0 = (Object)adaptor.nil();

                    Identifier120=(Token)match(input,Identifier,FOLLOW_Identifier_in_atom1344); 
                    Identifier120_tree = (Object)adaptor.create(Identifier120);
                    adaptor.addChild(root_0, Identifier120_tree);

                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:179:16: ( '.' Identifier )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==DOT) ) {
                            int LA25_2 = input.LA(2);

                            if ( (LA25_2==Identifier) ) {
                                alt25=1;
                            }


                        }


                        switch (alt25) {
                    	case 1 :
                    	    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:179:17: '.' Identifier
                    	    {
                    	    char_literal121=(Token)match(input,DOT,FOLLOW_DOT_in_atom1347); 
                    	    char_literal121_tree = (Object)adaptor.create(char_literal121);
                    	    root_0 = (Object)adaptor.becomeRoot(char_literal121_tree, root_0);

                    	    Identifier122=(Token)match(input,Identifier,FOLLOW_Identifier_in_atom1350); 
                    	    Identifier122_tree = (Object)adaptor.create(Identifier122);
                    	    adaptor.addChild(root_0, Identifier122_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:182:1: arguments : ( expression ( ',' expression )* )? -> ^( ARGUMENTS ( ( expression )+ )? ) ;
    public final MiniJavaParser.arguments_return arguments() throws RecognitionException {
        MiniJavaParser.arguments_return retval = new MiniJavaParser.arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal124=null;
        MiniJavaParser.expression_return expression123 = null;

        MiniJavaParser.expression_return expression125 = null;


        Object char_literal124_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:182:10: ( ( expression ( ',' expression )* )? -> ^( ARGUMENTS ( ( expression )+ )? ) )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:183:2: ( expression ( ',' expression )* )?
            {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:183:2: ( expression ( ',' expression )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=NOT && LA28_0<=SUB)||LA28_0==THIS||(LA28_0>=Boolean && LA28_0<=Integer)||LA28_0==54||LA28_0==69) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:183:3: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_arguments1363);
                    expression123=expression();

                    state._fsp--;

                    stream_expression.add(expression123.getTree());
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:183:14: ( ',' expression )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==62) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:183:15: ',' expression
                    	    {
                    	    char_literal124=(Token)match(input,62,FOLLOW_62_in_arguments1366);  
                    	    stream_62.add(char_literal124);

                    	    pushFollow(FOLLOW_expression_in_arguments1368);
                    	    expression125=expression();

                    	    state._fsp--;

                    	    stream_expression.add(expression125.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 183:35: -> ^( ARGUMENTS ( ( expression )+ )? )
            {
                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:183:38: ^( ARGUMENTS ( ( expression )+ )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);

                // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:183:50: ( ( expression )+ )?
                if ( stream_expression.hasNext() ) {
                    if ( !(stream_expression.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_expression.hasNext() ) {
                        adaptor.addChild(root_1, stream_expression.nextTree());

                    }
                    stream_expression.reset();

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arguments"

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:186:1: literal : ( Integer | Boolean );
    public final MiniJavaParser.literal_return literal() throws RecognitionException {
        MiniJavaParser.literal_return retval = new MiniJavaParser.literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set126=null;

        Object set126_tree=null;

        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:186:8: ( Integer | Boolean )
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:
            {
            root_0 = (Object)adaptor.nil();

            set126=(Token)input.LT(1);
            if ( input.LA(1)==Boolean||input.LA(1)==Integer ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set126));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:191:1: type : ( 'int' ( '[' ']' )? -> VARIABLE[$type.text.replaceAll(\"\\\\t| \", \"\")] | 'boolean' | Identifier );
    public final MiniJavaParser.type_return type() throws RecognitionException {
        MiniJavaParser.type_return retval = new MiniJavaParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal127=null;
        Token char_literal128=null;
        Token char_literal129=null;
        Token string_literal130=null;
        Token Identifier131=null;

        Object string_literal127_tree=null;
        Object char_literal128_tree=null;
        Object char_literal129_tree=null;
        Object string_literal130_tree=null;
        Object Identifier131_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");

        try {
            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:191:5: ( 'int' ( '[' ']' )? -> VARIABLE[$type.text.replaceAll(\"\\\\t| \", \"\")] | 'boolean' | Identifier )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt30=1;
                }
                break;
            case 71:
                {
                alt30=2;
                }
                break;
            case Identifier:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:192:2: 'int' ( '[' ']' )?
                    {
                    string_literal127=(Token)match(input,70,FOLLOW_70_in_type1418);  
                    stream_70.add(string_literal127);

                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:192:8: ( '[' ']' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==56) ) {
                        int LA29_1 = input.LA(2);

                        if ( (LA29_1==57) ) {
                            alt29=1;
                        }
                    }
                    switch (alt29) {
                        case 1 :
                            // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:192:9: '[' ']'
                            {
                            char_literal128=(Token)match(input,56,FOLLOW_56_in_type1421);  
                            stream_56.add(char_literal128);

                            char_literal129=(Token)match(input,57,FOLLOW_57_in_type1422);  
                            stream_57.add(char_literal129);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 192:18: -> VARIABLE[$type.text.replaceAll(\"\\\\t| \", \"\")]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(VARIABLE, input.toString(retval.start,input.LT(-1)).replaceAll("\\t| ", "")));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:193:4: 'boolean'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal130=(Token)match(input,71,FOLLOW_71_in_type1434); 
                    string_literal130_tree = (Object)adaptor.create(string_literal130);
                    adaptor.addChild(root_0, string_literal130_tree);


                    }
                    break;
                case 3 :
                    // E:\\Desktop\\artur_pacholec_4dv006_pa1\\MiniJava.g:194:4: Identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    Identifier131=(Token)match(input,Identifier,FOLLOW_Identifier_in_type1440); 
                    Identifier131_tree = (Object)adaptor.create(Identifier131);
                    adaptor.addChild(root_0, Identifier131_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    // Delegated rules


 

    public static final BitSet FOLLOW_mainClass_in_program444 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_program447 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_mainClass469 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_mainClass473 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_mainClass475 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_mainClass476 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_mainClass478 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_mainClass480 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_mainClass482 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_mainClass484 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_mainClass486 = new BitSet(new long[]{0x0500000000000000L});
    public static final BitSet FOLLOW_56_in_mainClass489 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_mainClass490 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_58_in_mainClass494 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_mainClass499 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_mainClass501 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_mainClass503 = new BitSet(new long[]{0x0042382C00000000L,0x0000000000000037L});
    public static final BitSet FOLLOW_statement_in_mainClass505 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_mainClass507 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_mainClass509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_classDeclaration544 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_classDeclaration548 = new BitSet(new long[]{0x2002000000000000L});
    public static final BitSet FOLLOW_61_in_classDeclaration551 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_classDeclaration555 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_classDeclaration559 = new BitSet(new long[]{0x0004100000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_classBody_in_classDeclaration561 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_classDeclaration563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclarations_in_classBody595 = new BitSet(new long[]{0x0004100000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_methodDeclarations_in_classBody597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_methodDeclaration619 = new BitSet(new long[]{0x0000100000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_type_in_methodDeclaration624 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_methodDeclaration628 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_methodDeclaration630 = new BitSet(new long[]{0x0800100000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_methodParameters_in_methodDeclaration632 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_methodDeclaration634 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_methodDeclaration636 = new BitSet(new long[]{0x8042382C00000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_varDeclarations_in_methodDeclaration638 = new BitSet(new long[]{0x8042382C00000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statements_in_methodDeclaration640 = new BitSet(new long[]{0x8042382C00000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_returnStatement_in_methodDeclaration642 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_methodDeclaration644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDeclaration_in_methodDeclarations688 = new BitSet(new long[]{0x0004100000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_varDeclarator_in_methodParameters707 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_methodParameters710 = new BitSet(new long[]{0x0000100000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_varDeclarator_in_methodParameters712 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_63_in_returnStatement733 = new BitSet(new long[]{0x0040382C00000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_expression_in_returnStatement735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_returnStatement737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_varDeclarator755 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_varDeclarator757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclarator_in_varDeclaration776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_varDeclaration778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_varDeclarations791 = new BitSet(new long[]{0x0000100000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_blockStatement_in_statement814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printlnStatement_in_statement829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_statement836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_statement845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements854 = new BitSet(new long[]{0x0042382C00000002L,0x0000000000000037L});
    public static final BitSet FOLLOW_49_in_blockStatement873 = new BitSet(new long[]{0x1042382C00000000L,0x0000000000000037L});
    public static final BitSet FOLLOW_statement_in_blockStatement875 = new BitSet(new long[]{0x1042382C00000000L,0x0000000000000037L});
    public static final BitSet FOLLOW_60_in_blockStatement878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_whileStatement897 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_whileStatement899 = new BitSet(new long[]{0x0040382C00000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_expression_in_whileStatement901 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_whileStatement903 = new BitSet(new long[]{0x0042382C00000000L,0x0000000000000037L});
    public static final BitSet FOLLOW_statement_in_whileStatement905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ifStatement924 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ifStatement926 = new BitSet(new long[]{0x0040382C00000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_expression_in_ifStatement928 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ifStatement930 = new BitSet(new long[]{0x0042382C00000000L,0x0000000000000037L});
    public static final BitSet FOLLOW_statement_in_ifStatement936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ifStatement938 = new BitSet(new long[]{0x0042382C00000000L,0x0000000000000037L});
    public static final BitSet FOLLOW_statement_in_ifStatement944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_printlnStatement966 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_printlnStatement968 = new BitSet(new long[]{0x0040382C00000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_expression_in_printlnStatement970 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_printlnStatement972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_printlnStatement974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpression_in_expression993 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_EQ_in_expression996 = new BitSet(new long[]{0x0040382C00000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_expression_in_expression999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression1010 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_OR_in_orExpression1013 = new BitSet(new long[]{0x0040382C00000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_andExpression_in_orExpression1016 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_comparisionExpression_in_andExpression1026 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_AND_in_andExpression1029 = new BitSet(new long[]{0x0040382C00000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_comparisionExpression_in_andExpression1032 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_additionExpression_in_comparisionExpression1046 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_LESS_in_comparisionExpression1049 = new BitSet(new long[]{0x0040382C00000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_additionExpression_in_comparisionExpression1052 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_multiplicationExpression_in_additionExpression1066 = new BitSet(new long[]{0x0000000880000002L});
    public static final BitSet FOLLOW_ADD_in_additionExpression1070 = new BitSet(new long[]{0x0040382C00000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_SUB_in_additionExpression1075 = new BitSet(new long[]{0x0040382C00000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_multiplicationExpression_in_additionExpression1079 = new BitSet(new long[]{0x0000000880000002L});
    public static final BitSet FOLLOW_signExpression_in_multiplicationExpression1089 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_MUL_in_multiplicationExpression1092 = new BitSet(new long[]{0x0040382C00000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_signExpression_in_multiplicationExpression1095 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_SUB_in_signExpression1113 = new BitSet(new long[]{0x0040382C00000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_signExpression_in_signExpression1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_signExpression1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryExpression1139 = new BitSet(new long[]{0x0040382C00000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_signExpression_in_unaryExpression1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_unaryExpression1151 = new BitSet(new long[]{0x0140004000000002L});
    public static final BitSet FOLLOW_56_in_unaryExpression1167 = new BitSet(new long[]{0x0040382C00000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_expression_in_unaryExpression1169 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_unaryExpression1171 = new BitSet(new long[]{0x0140004000000002L});
    public static final BitSet FOLLOW_DOT_in_unaryExpression1194 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_unaryExpression1196 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_unaryExpression1215 = new BitSet(new long[]{0x0840382C00000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_arguments_in_unaryExpression1217 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_unaryExpression1219 = new BitSet(new long[]{0x0140004000000002L});
    public static final BitSet FOLLOW_literal_in_unaryExpression1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_parenthesesExpression1257 = new BitSet(new long[]{0x0040382C00000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_expression_in_parenthesesExpression1259 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_parenthesesExpression1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenthesesExpression_in_atom1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_atom1283 = new BitSet(new long[]{0x0000100000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_type_in_atom1285 = new BitSet(new long[]{0x0140000000000000L});
    public static final BitSet FOLLOW_56_in_atom1291 = new BitSet(new long[]{0x0040382C00000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_expression_in_atom1293 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_atom1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_atom1312 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_atom1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_atom1330 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_DOT_in_atom1333 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_atom1336 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_Identifier_in_atom1344 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_DOT_in_atom1347 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_atom1350 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_expression_in_arguments1363 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_arguments1366 = new BitSet(new long[]{0x0040382C00000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_expression_in_arguments1368 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_type1418 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_type1421 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_type1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_type1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_type1440 = new BitSet(new long[]{0x0000000000000002L});

}