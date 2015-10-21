package org.obeonetwork.sirius.text.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSiriusTextDslLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__10=10;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_DOCUMENTATION=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=6;
    public static final int RULE_EXPRESSION=7;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalSiriusTextDslLexer() {;} 
    public InternalSiriusTextDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSiriusTextDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSiriusTextDsl.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:11:7: ( 'package' )
            // InternalSiriusTextDsl.g:11:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:12:7: ( '.' )
            // InternalSiriusTextDsl.g:12:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:13:7: ( '.*' )
            // InternalSiriusTextDsl.g:13:9: '.*'
            {
            match(".*"); 


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
            // InternalSiriusTextDsl.g:14:7: ( 'import' )
            // InternalSiriusTextDsl.g:14:9: 'import'
            {
            match("import"); 


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
            // InternalSiriusTextDsl.g:15:7: ( 'designer' )
            // InternalSiriusTextDsl.g:15:9: 'designer'
            {
            match("designer"); 


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
            // InternalSiriusTextDsl.g:16:7: ( 'as' )
            // InternalSiriusTextDsl.g:16:9: 'as'
            {
            match("as"); 


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
            // InternalSiriusTextDsl.g:17:7: ( '{' )
            // InternalSiriusTextDsl.g:17:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:18:7: ( '}' )
            // InternalSiriusTextDsl.g:18:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:19:7: ( 'viewpoint' )
            // InternalSiriusTextDsl.g:19:9: 'viewpoint'
            {
            match("viewpoint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:20:7: ( 'modelFileExtensions' )
            // InternalSiriusTextDsl.g:20:9: 'modelFileExtensions'
            {
            match("modelFileExtensions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:21:7: ( '=' )
            // InternalSiriusTextDsl.g:21:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:22:7: ( '[' )
            // InternalSiriusTextDsl.g:22:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:23:7: ( ',' )
            // InternalSiriusTextDsl.g:23:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:24:7: ( ']' )
            // InternalSiriusTextDsl.g:24:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:25:7: ( 'icon' )
            // InternalSiriusTextDsl.g:25:9: 'icon'
            {
            match("icon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:26:7: ( 'representations' )
            // InternalSiriusTextDsl.g:26:9: 'representations'
            {
            match("representations"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:27:7: ( '@Initialized' )
            // InternalSiriusTextDsl.g:27:9: '@Initialized'
            {
            match("@Initialized"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:28:7: ( '@ShowOnStartup' )
            // InternalSiriusTextDsl.g:28:9: '@ShowOnStartup'
            {
            match("@ShowOnStartup"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:29:7: ( '@EnablePopupBars' )
            // InternalSiriusTextDsl.g:29:9: '@EnablePopupBars'
            {
            match("@EnablePopupBars"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:30:7: ( '@MetamodelUris' )
            // InternalSiriusTextDsl.g:30:9: '@MetamodelUris'
            {
            match("@MetamodelUris"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:31:7: ( '({' )
            // InternalSiriusTextDsl.g:31:9: '({'
            {
            match("({"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:32:7: ( '})' )
            // InternalSiriusTextDsl.g:32:9: '})'
            {
            match("})"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:33:7: ( 'diagram' )
            // InternalSiriusTextDsl.g:33:9: 'diagram'
            {
            match("diagram"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:34:7: ( 'for' )
            // InternalSiriusTextDsl.g:34:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:35:7: ( '?' )
            // InternalSiriusTextDsl.g:35:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:36:7: ( 'documentation' )
            // InternalSiriusTextDsl.g:36:9: 'documentation'
            {
            match("documentation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:37:7: ( 'titleExpression' )
            // InternalSiriusTextDsl.g:37:9: 'titleExpression'
            {
            match("titleExpression"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:38:7: ( 'rootExpression' )
            // InternalSiriusTextDsl.g:38:9: 'rootExpression'
            {
            match("rootExpression"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:39:7: ( 'defaultLayer' )
            // InternalSiriusTextDsl.g:39:9: 'defaultLayer'
            {
            match("defaultLayer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:40:7: ( 'additionalLayers' )
            // InternalSiriusTextDsl.g:40:9: 'additionalLayers'
            {
            match("additionalLayers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:41:7: ( 'layer' )
            // InternalSiriusTextDsl.g:41:9: 'layer'
            {
            match("layer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:42:7: ( 'mappings' )
            // InternalSiriusTextDsl.g:42:9: 'mappings'
            {
            match("mappings"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:43:7: ( 'edges' )
            // InternalSiriusTextDsl.g:43:9: 'edges'
            {
            match("edges"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:44:7: ( 'list' )
            // InternalSiriusTextDsl.g:44:9: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:45:7: ( 'container' )
            // InternalSiriusTextDsl.g:45:9: 'container'
            {
            match("container"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:46:7: ( 'style' )
            // InternalSiriusTextDsl.g:46:9: 'style'
            {
            match("style"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:47:7: ( 'semanticCandidatesExpression' )
            // InternalSiriusTextDsl.g:47:9: 'semanticCandidatesExpression'
            {
            match("semanticCandidatesExpression"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:48:7: ( 'if' )
            // InternalSiriusTextDsl.g:48:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:49:7: ( 'gradient' )
            // InternalSiriusTextDsl.g:49:9: 'gradient'
            {
            match("gradient"); 


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
            // InternalSiriusTextDsl.g:50:7: ( 'from' )
            // InternalSiriusTextDsl.g:50:9: 'from'
            {
            match("from"); 


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
            // InternalSiriusTextDsl.g:51:7: ( 'to' )
            // InternalSiriusTextDsl.g:51:9: 'to'
            {
            match("to"); 


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
            // InternalSiriusTextDsl.g:52:7: ( 'label' )
            // InternalSiriusTextDsl.g:52:9: 'label'
            {
            match("label"); 


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
            // InternalSiriusTextDsl.g:53:7: ( 'in' )
            // InternalSiriusTextDsl.g:53:9: 'in'
            {
            match("in"); 


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
            // InternalSiriusTextDsl.g:54:7: ( 'border' )
            // InternalSiriusTextDsl.g:54:9: 'border'
            {
            match("border"); 


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
            // InternalSiriusTextDsl.g:55:7: ( 'size' )
            // InternalSiriusTextDsl.g:55:9: 'size'
            {
            match("size"); 


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
            // InternalSiriusTextDsl.g:56:7: ( 'heightComputationExpression' )
            // InternalSiriusTextDsl.g:56:9: 'heightComputationExpression'
            {
            match("heightComputationExpression"); 


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
            // InternalSiriusTextDsl.g:57:7: ( 'widthComputationExpression' )
            // InternalSiriusTextDsl.g:57:9: 'widthComputationExpression'
            {
            match("widthComputationExpression"); 


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
            // InternalSiriusTextDsl.g:58:7: ( 'palette' )
            // InternalSiriusTextDsl.g:58:9: 'palette'
            {
            match("palette"); 


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
            // InternalSiriusTextDsl.g:59:7: ( 'color' )
            // InternalSiriusTextDsl.g:59:9: 'color'
            {
            match("color"); 


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
            // InternalSiriusTextDsl.g:60:7: ( 'rgb(' )
            // InternalSiriusTextDsl.g:60:9: 'rgb('
            {
            match("rgb("); 


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
            // InternalSiriusTextDsl.g:61:7: ( ')' )
            // InternalSiriusTextDsl.g:61:9: ')'
            {
            match(')'); 

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
            // InternalSiriusTextDsl.g:62:7: ( 'left' )
            // InternalSiriusTextDsl.g:62:9: 'left'
            {
            match("left"); 


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
            // InternalSiriusTextDsl.g:63:7: ( 'center' )
            // InternalSiriusTextDsl.g:63:9: 'center'
            {
            match("center"); 


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
            // InternalSiriusTextDsl.g:64:7: ( 'right' )
            // InternalSiriusTextDsl.g:64:9: 'right'
            {
            match("right"); 


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
            // InternalSiriusTextDsl.g:65:7: ( 'oblique' )
            // InternalSiriusTextDsl.g:65:9: 'oblique'
            {
            match("oblique"); 


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
            // InternalSiriusTextDsl.g:66:7: ( 'lefttoright' )
            // InternalSiriusTextDsl.g:66:9: 'lefttoright'
            {
            match("lefttoright"); 


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
            // InternalSiriusTextDsl.g:67:7: ( 'toptobottom' )
            // InternalSiriusTextDsl.g:67:9: 'toptobottom'
            {
            match("toptobottom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "RULE_DOCUMENTATION"
    public final void mRULE_DOCUMENTATION() throws RecognitionException {
        try {
            int _type = RULE_DOCUMENTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:2271:20: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // InternalSiriusTextDsl.g:2271:22: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // InternalSiriusTextDsl.g:2271:28: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:2271:56: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "RULE_DOCUMENTATION"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:2273:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSiriusTextDsl.g:2273:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSiriusTextDsl.g:2273:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSiriusTextDsl.g:2273:11: '^'
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

            // InternalSiriusTextDsl.g:2273:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:
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
            	    break loop3;
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
            // InternalSiriusTextDsl.g:2275:10: ( ( '0' .. '9' )+ )
            // InternalSiriusTextDsl.g:2275:12: ( '0' .. '9' )+
            {
            // InternalSiriusTextDsl.g:2275:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:2275:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // InternalSiriusTextDsl.g:2277:13: ( '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalSiriusTextDsl.g:2277:15: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalSiriusTextDsl.g:2277:20: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\\') ) {
                    alt5=1;
                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:2277:21: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalSiriusTextDsl.g:2277:28: ~ ( ( '\\\\' | '\\'' ) )
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
            	    break loop5;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_EXPRESSION"
    public final void mRULE_EXPRESSION() throws RecognitionException {
        try {
            int _type = RULE_EXPRESSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:2279:17: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalSiriusTextDsl.g:2279:19: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalSiriusTextDsl.g:2279:23: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\\') ) {
                    alt6=1;
                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:2279:24: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalSiriusTextDsl.g:2279:31: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop6;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPRESSION"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:2281:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSiriusTextDsl.g:2281:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSiriusTextDsl.g:2281:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\t' && LA7_0<='\n')||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // InternalSiriusTextDsl.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | RULE_DOCUMENTATION | RULE_ID | RULE_INT | RULE_STRING | RULE_EXPRESSION | RULE_WS )
        int alt8=63;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // InternalSiriusTextDsl.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // InternalSiriusTextDsl.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // InternalSiriusTextDsl.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // InternalSiriusTextDsl.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // InternalSiriusTextDsl.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // InternalSiriusTextDsl.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // InternalSiriusTextDsl.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // InternalSiriusTextDsl.g:1:52: T__17
                {
                mT__17(); 

                }
                break;
            case 9 :
                // InternalSiriusTextDsl.g:1:58: T__18
                {
                mT__18(); 

                }
                break;
            case 10 :
                // InternalSiriusTextDsl.g:1:64: T__19
                {
                mT__19(); 

                }
                break;
            case 11 :
                // InternalSiriusTextDsl.g:1:70: T__20
                {
                mT__20(); 

                }
                break;
            case 12 :
                // InternalSiriusTextDsl.g:1:76: T__21
                {
                mT__21(); 

                }
                break;
            case 13 :
                // InternalSiriusTextDsl.g:1:82: T__22
                {
                mT__22(); 

                }
                break;
            case 14 :
                // InternalSiriusTextDsl.g:1:88: T__23
                {
                mT__23(); 

                }
                break;
            case 15 :
                // InternalSiriusTextDsl.g:1:94: T__24
                {
                mT__24(); 

                }
                break;
            case 16 :
                // InternalSiriusTextDsl.g:1:100: T__25
                {
                mT__25(); 

                }
                break;
            case 17 :
                // InternalSiriusTextDsl.g:1:106: T__26
                {
                mT__26(); 

                }
                break;
            case 18 :
                // InternalSiriusTextDsl.g:1:112: T__27
                {
                mT__27(); 

                }
                break;
            case 19 :
                // InternalSiriusTextDsl.g:1:118: T__28
                {
                mT__28(); 

                }
                break;
            case 20 :
                // InternalSiriusTextDsl.g:1:124: T__29
                {
                mT__29(); 

                }
                break;
            case 21 :
                // InternalSiriusTextDsl.g:1:130: T__30
                {
                mT__30(); 

                }
                break;
            case 22 :
                // InternalSiriusTextDsl.g:1:136: T__31
                {
                mT__31(); 

                }
                break;
            case 23 :
                // InternalSiriusTextDsl.g:1:142: T__32
                {
                mT__32(); 

                }
                break;
            case 24 :
                // InternalSiriusTextDsl.g:1:148: T__33
                {
                mT__33(); 

                }
                break;
            case 25 :
                // InternalSiriusTextDsl.g:1:154: T__34
                {
                mT__34(); 

                }
                break;
            case 26 :
                // InternalSiriusTextDsl.g:1:160: T__35
                {
                mT__35(); 

                }
                break;
            case 27 :
                // InternalSiriusTextDsl.g:1:166: T__36
                {
                mT__36(); 

                }
                break;
            case 28 :
                // InternalSiriusTextDsl.g:1:172: T__37
                {
                mT__37(); 

                }
                break;
            case 29 :
                // InternalSiriusTextDsl.g:1:178: T__38
                {
                mT__38(); 

                }
                break;
            case 30 :
                // InternalSiriusTextDsl.g:1:184: T__39
                {
                mT__39(); 

                }
                break;
            case 31 :
                // InternalSiriusTextDsl.g:1:190: T__40
                {
                mT__40(); 

                }
                break;
            case 32 :
                // InternalSiriusTextDsl.g:1:196: T__41
                {
                mT__41(); 

                }
                break;
            case 33 :
                // InternalSiriusTextDsl.g:1:202: T__42
                {
                mT__42(); 

                }
                break;
            case 34 :
                // InternalSiriusTextDsl.g:1:208: T__43
                {
                mT__43(); 

                }
                break;
            case 35 :
                // InternalSiriusTextDsl.g:1:214: T__44
                {
                mT__44(); 

                }
                break;
            case 36 :
                // InternalSiriusTextDsl.g:1:220: T__45
                {
                mT__45(); 

                }
                break;
            case 37 :
                // InternalSiriusTextDsl.g:1:226: T__46
                {
                mT__46(); 

                }
                break;
            case 38 :
                // InternalSiriusTextDsl.g:1:232: T__47
                {
                mT__47(); 

                }
                break;
            case 39 :
                // InternalSiriusTextDsl.g:1:238: T__48
                {
                mT__48(); 

                }
                break;
            case 40 :
                // InternalSiriusTextDsl.g:1:244: T__49
                {
                mT__49(); 

                }
                break;
            case 41 :
                // InternalSiriusTextDsl.g:1:250: T__50
                {
                mT__50(); 

                }
                break;
            case 42 :
                // InternalSiriusTextDsl.g:1:256: T__51
                {
                mT__51(); 

                }
                break;
            case 43 :
                // InternalSiriusTextDsl.g:1:262: T__52
                {
                mT__52(); 

                }
                break;
            case 44 :
                // InternalSiriusTextDsl.g:1:268: T__53
                {
                mT__53(); 

                }
                break;
            case 45 :
                // InternalSiriusTextDsl.g:1:274: T__54
                {
                mT__54(); 

                }
                break;
            case 46 :
                // InternalSiriusTextDsl.g:1:280: T__55
                {
                mT__55(); 

                }
                break;
            case 47 :
                // InternalSiriusTextDsl.g:1:286: T__56
                {
                mT__56(); 

                }
                break;
            case 48 :
                // InternalSiriusTextDsl.g:1:292: T__57
                {
                mT__57(); 

                }
                break;
            case 49 :
                // InternalSiriusTextDsl.g:1:298: T__58
                {
                mT__58(); 

                }
                break;
            case 50 :
                // InternalSiriusTextDsl.g:1:304: T__59
                {
                mT__59(); 

                }
                break;
            case 51 :
                // InternalSiriusTextDsl.g:1:310: T__60
                {
                mT__60(); 

                }
                break;
            case 52 :
                // InternalSiriusTextDsl.g:1:316: T__61
                {
                mT__61(); 

                }
                break;
            case 53 :
                // InternalSiriusTextDsl.g:1:322: T__62
                {
                mT__62(); 

                }
                break;
            case 54 :
                // InternalSiriusTextDsl.g:1:328: T__63
                {
                mT__63(); 

                }
                break;
            case 55 :
                // InternalSiriusTextDsl.g:1:334: T__64
                {
                mT__64(); 

                }
                break;
            case 56 :
                // InternalSiriusTextDsl.g:1:340: T__65
                {
                mT__65(); 

                }
                break;
            case 57 :
                // InternalSiriusTextDsl.g:1:346: T__66
                {
                mT__66(); 

                }
                break;
            case 58 :
                // InternalSiriusTextDsl.g:1:352: RULE_DOCUMENTATION
                {
                mRULE_DOCUMENTATION(); 

                }
                break;
            case 59 :
                // InternalSiriusTextDsl.g:1:371: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 60 :
                // InternalSiriusTextDsl.g:1:379: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 61 :
                // InternalSiriusTextDsl.g:1:388: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 62 :
                // InternalSiriusTextDsl.g:1:400: RULE_EXPRESSION
                {
                mRULE_EXPRESSION(); 

                }
                break;
            case 63 :
                // InternalSiriusTextDsl.g:1:416: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\1\37\1\46\3\37\1\uffff\1\61\2\37\4\uffff\1\37\2\uffff\1\37\1\uffff\11\37\1\uffff\1\37\6\uffff\1\37\2\uffff\2\37\1\123\1\124\3\37\1\131\1\37\2\uffff\7\37\4\uffff\3\37\1\146\22\37\2\uffff\4\37\1\uffff\10\37\1\u0087\3\37\1\uffff\23\37\1\u009e\12\37\1\uffff\1\37\1\uffff\1\u00aa\4\37\1\u00af\1\u00b1\6\37\1\u00b8\10\37\1\uffff\12\37\1\u00cb\1\uffff\2\37\1\u00ce\1\u00cf\1\uffff\1\37\1\uffff\1\u00d1\1\37\1\u00d3\1\37\1\u00d5\1\37\1\uffff\7\37\1\u00de\12\37\1\uffff\2\37\2\uffff\1\37\1\uffff\1\37\1\uffff\1\u00ed\1\uffff\2\37\1\u00f0\3\37\1\u00f4\1\u00f5\1\uffff\2\37\1\u00f8\13\37\1\uffff\2\37\1\uffff\2\37\1\u0108\2\uffff\1\u0109\1\37\1\uffff\4\37\1\u010f\7\37\1\u0117\2\37\2\uffff\3\37\1\u011d\1\37\1\uffff\5\37\1\u0124\1\37\1\uffff\5\37\1\uffff\6\37\1\uffff\12\37\1\u013b\1\u013c\3\37\1\u0140\6\37\2\uffff\3\37\1\uffff\1\u014a\10\37\1\uffff\3\37\1\u0156\6\37\1\u015d\1\uffff\1\u015e\3\37\1\u0162\1\37\2\uffff\3\37\1\uffff\10\37\1\u016f\3\37\1\uffff\24\37\1\u0187\1\37\1\u0189\1\uffff\1\u018a\2\uffff";
    static final String DFA8_eofS =
        "\u018b\uffff";
    static final String DFA8_minS =
        "\1\11\1\141\1\52\1\143\1\145\1\144\1\uffff\1\51\1\151\1\141\4\uffff\1\145\1\105\1\uffff\1\157\1\uffff\1\151\1\141\1\144\2\145\1\162\1\157\1\145\1\151\1\uffff\1\142\6\uffff\1\143\2\uffff\1\160\1\157\2\60\1\146\1\141\1\143\1\60\1\144\2\uffff\1\145\1\144\2\160\1\157\1\142\1\147\4\uffff\1\162\1\157\1\164\1\60\1\142\1\163\1\146\1\147\1\154\1\156\1\171\1\155\1\172\1\141\1\162\1\151\1\144\1\154\1\153\1\145\1\157\1\156\2\uffff\1\151\1\141\1\147\1\165\1\uffff\1\151\1\167\1\145\1\160\1\162\1\164\1\50\1\150\1\60\1\155\1\154\1\164\1\uffff\2\145\2\164\1\145\1\164\1\157\1\164\1\154\1\141\1\145\2\144\1\147\1\164\1\151\1\141\1\164\1\162\1\60\1\147\1\165\1\162\1\155\1\164\1\160\1\154\1\151\1\145\1\105\1\uffff\1\164\1\uffff\1\60\1\145\1\157\1\162\1\154\2\60\1\163\1\141\1\162\2\145\1\156\1\60\1\151\1\145\2\150\1\161\1\147\2\164\1\uffff\1\156\1\154\1\141\1\145\1\151\1\157\1\106\1\156\1\163\1\170\1\60\1\uffff\1\105\1\142\2\60\1\uffff\1\157\1\uffff\1\60\1\151\1\60\1\162\1\60\1\164\1\uffff\1\145\1\162\1\164\1\103\1\165\2\145\1\60\1\145\1\164\1\155\1\156\1\157\2\151\1\147\1\145\1\160\1\uffff\1\170\1\157\2\uffff\1\162\1\uffff\1\156\1\uffff\1\60\1\uffff\1\151\1\156\1\60\1\103\1\157\1\145\2\60\1\uffff\1\162\1\114\1\60\1\164\2\156\1\154\1\163\1\156\1\162\1\160\1\164\1\151\1\145\1\uffff\1\143\1\164\1\uffff\1\157\1\155\1\60\2\uffff\1\60\1\141\1\uffff\2\141\1\164\1\145\1\60\1\164\1\145\1\162\1\164\1\147\1\162\1\103\1\60\1\155\1\160\2\uffff\1\171\1\164\1\154\1\60\1\105\1\uffff\1\141\1\163\1\145\1\157\1\150\1\60\1\141\1\uffff\1\160\1\165\1\145\1\151\1\114\1\uffff\1\170\1\164\2\163\1\155\1\164\1\uffff\1\156\1\165\1\164\1\162\1\157\1\141\1\164\2\151\1\163\2\60\1\144\1\164\1\141\1\60\1\156\1\171\1\145\2\157\1\151\2\uffff\1\151\1\141\1\164\1\uffff\1\60\1\145\3\156\1\157\1\144\1\164\1\151\1\uffff\1\162\2\163\1\60\1\156\1\141\1\151\1\157\1\163\1\151\1\60\1\uffff\1\60\1\164\1\157\1\156\1\60\1\157\2\uffff\1\145\1\156\1\105\1\uffff\1\156\1\163\1\105\1\170\1\163\1\105\1\170\1\160\1\60\1\170\1\160\1\162\1\uffff\1\160\1\162\1\145\1\162\1\145\1\163\1\145\4\163\1\151\1\163\1\151\1\157\1\151\1\157\1\156\1\157\1\156\1\60\1\156\1\60\1\uffff\1\60\2\uffff";
    static final String DFA8_maxS =
        "\1\175\1\141\1\52\1\156\1\157\1\163\1\uffff\1\51\1\151\1\157\4\uffff\1\157\1\123\1\uffff\1\162\1\uffff\1\157\1\151\1\144\1\157\1\164\1\162\1\157\1\145\1\151\1\uffff\1\142\6\uffff\1\154\2\uffff\1\160\1\157\2\172\1\163\1\141\1\143\1\172\1\144\2\uffff\1\145\1\144\2\160\1\157\1\142\1\147\4\uffff\1\162\1\157\1\164\1\172\1\171\1\163\1\146\1\147\2\156\1\171\1\155\1\172\1\141\1\162\1\151\1\144\1\154\1\153\1\145\1\157\1\156\2\uffff\1\151\1\141\1\147\1\165\1\uffff\1\151\1\167\1\145\1\160\1\162\1\164\1\50\1\150\1\172\1\155\1\154\1\164\1\uffff\2\145\2\164\1\145\1\164\1\157\1\164\1\154\1\141\1\145\2\144\1\147\1\164\1\151\1\141\1\164\1\162\1\172\1\147\1\165\1\162\1\155\1\164\1\160\1\154\1\151\1\145\1\105\1\uffff\1\164\1\uffff\1\172\1\145\1\157\1\162\1\154\2\172\1\163\1\141\1\162\2\145\1\156\1\172\1\151\1\145\2\150\1\161\1\147\2\164\1\uffff\1\156\1\154\1\141\1\145\1\151\1\157\1\106\1\156\1\163\1\170\1\172\1\uffff\1\105\1\142\2\172\1\uffff\1\157\1\uffff\1\172\1\151\1\172\1\162\1\172\1\164\1\uffff\1\145\1\162\1\164\1\103\1\165\2\145\1\172\1\145\1\164\1\155\1\156\1\157\2\151\1\147\1\145\1\160\1\uffff\1\170\1\157\2\uffff\1\162\1\uffff\1\156\1\uffff\1\172\1\uffff\1\151\1\156\1\172\1\103\1\157\1\145\2\172\1\uffff\1\162\1\114\1\172\1\164\2\156\1\154\1\163\1\156\1\162\1\160\1\164\1\151\1\145\1\uffff\1\143\1\164\1\uffff\1\157\1\155\1\172\2\uffff\1\172\1\141\1\uffff\2\141\1\164\1\145\1\172\1\164\1\145\1\162\1\164\1\147\1\162\1\103\1\172\1\155\1\160\2\uffff\1\171\1\164\1\154\1\172\1\105\1\uffff\1\141\1\163\1\145\1\157\1\150\1\172\1\141\1\uffff\1\160\1\165\1\145\1\151\1\114\1\uffff\1\170\1\164\2\163\1\155\1\164\1\uffff\1\156\1\165\1\164\1\162\1\157\1\141\1\164\2\151\1\163\2\172\1\144\1\164\1\141\1\172\1\156\1\171\1\145\2\157\1\151\2\uffff\1\151\1\141\1\164\1\uffff\1\172\1\145\3\156\1\157\1\144\1\164\1\151\1\uffff\1\162\2\163\1\172\1\156\1\141\1\151\1\157\1\163\1\151\1\172\1\uffff\1\172\1\164\1\157\1\156\1\172\1\157\2\uffff\1\145\1\156\1\105\1\uffff\1\156\1\163\1\105\1\170\1\163\1\105\1\170\1\160\1\172\1\170\1\160\1\162\1\uffff\1\160\1\162\1\145\1\162\1\145\1\163\1\145\4\163\1\151\1\163\1\151\1\157\1\151\1\157\1\156\1\157\1\156\1\172\1\156\1\172\1\uffff\1\172\2\uffff";
    static final String DFA8_acceptS =
        "\6\uffff\1\7\3\uffff\1\13\1\14\1\15\1\16\2\uffff\1\25\1\uffff\1\31\11\uffff\1\63\1\uffff\1\72\1\73\1\74\1\75\1\76\1\77\1\uffff\1\3\1\2\11\uffff\1\26\1\10\7\uffff\1\21\1\22\1\23\1\24\26\uffff\1\46\1\53\4\uffff\1\6\14\uffff\1\51\36\uffff\1\62\1\uffff\1\30\26\uffff\1\17\13\uffff\1\50\4\uffff\1\42\1\uffff\1\64\6\uffff\1\55\22\uffff\1\66\2\uffff\1\37\1\52\1\uffff\1\41\1\uffff\1\61\1\uffff\1\44\10\uffff\1\4\16\uffff\1\65\2\uffff\1\54\3\uffff\1\1\1\60\2\uffff\1\27\17\uffff\1\67\1\5\5\uffff\1\40\7\uffff\1\47\5\uffff\1\11\6\uffff\1\43\26\uffff\1\71\1\70\3\uffff\1\35\11\uffff\1\32\13\uffff\1\34\6\uffff\1\20\1\33\3\uffff\1\36\14\uffff\1\12\27\uffff\1\57\1\uffff\1\56\1\45";
    static final String DFA8_specialS =
        "\u018b\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\43\2\uffff\1\43\22\uffff\1\43\1\uffff\1\42\4\uffff\1\41\1\20\1\34\2\uffff\1\14\1\uffff\1\2\1\36\12\40\3\uffff\1\12\1\uffff\1\22\1\17\32\37\1\13\1\uffff\1\15\2\37\1\uffff\1\5\1\31\1\26\1\4\1\25\1\21\1\30\1\32\1\3\2\37\1\24\1\11\1\37\1\35\1\1\1\37\1\16\1\27\1\23\1\37\1\10\1\33\3\37\1\6\1\uffff\1\7",
            "\1\44",
            "\1\45",
            "\1\50\2\uffff\1\51\6\uffff\1\47\1\52",
            "\1\53\3\uffff\1\54\5\uffff\1\55",
            "\1\57\16\uffff\1\56",
            "",
            "\1\60",
            "\1\62",
            "\1\64\15\uffff\1\63",
            "",
            "",
            "",
            "",
            "\1\65\1\uffff\1\67\1\uffff\1\70\5\uffff\1\66",
            "\1\73\3\uffff\1\71\3\uffff\1\74\5\uffff\1\72",
            "",
            "\1\75\2\uffff\1\76",
            "",
            "\1\77\5\uffff\1\100",
            "\1\101\3\uffff\1\103\3\uffff\1\102",
            "\1\104",
            "\1\106\11\uffff\1\105",
            "\1\110\3\uffff\1\111\12\uffff\1\107",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "\1\116",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\117\10\uffff\1\120",
            "",
            "",
            "\1\121",
            "\1\122",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\126\14\uffff\1\125",
            "\1\127",
            "\1\130",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\132",
            "",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "",
            "",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\17\37\1\145\12\37",
            "\1\150\26\uffff\1\147",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\155\1\uffff\1\154",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\23\37\1\u00b0\6\37",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u00d0",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00d2",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00d4",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "",
            "\1\u00eb",
            "",
            "\1\u00ec",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u00ee",
            "\1\u00ef",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u00f6",
            "\1\u00f7",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "",
            "\1\u0104",
            "\1\u0105",
            "",
            "\1\u0106",
            "\1\u0107",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u010a",
            "",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0118",
            "\1\u0119",
            "",
            "",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u011e",
            "",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0125",
            "",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "",
            "",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0163",
            "",
            "",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0188",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | RULE_DOCUMENTATION | RULE_ID | RULE_INT | RULE_STRING | RULE_EXPRESSION | RULE_WS );";
        }
    }
 

}