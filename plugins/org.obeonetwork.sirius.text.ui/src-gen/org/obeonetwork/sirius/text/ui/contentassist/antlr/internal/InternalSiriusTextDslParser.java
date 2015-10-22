package org.obeonetwork.sirius.text.ui.contentassist.antlr.internal; 

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
import org.obeonetwork.sirius.text.services.SiriusTextDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSiriusTextDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOCUMENTATION", "RULE_STRING", "RULE_EXPRESSION", "RULE_INT", "RULE_WS", "'left'", "'center'", "'right'", "'oblique'", "'lefttoright'", "'toptobottom'", "'solid'", "'dash'", "'dot'", "'dash_dot'", "'straight'", "'manhattan'", "'tree'", "'NoDecoration'", "'OutputArrow'", "'InputArrow'", "'OutputClosedArrow'", "'InputClosedArrow'", "'OutputFillClosedArrow'", "'InputFillClosedArrow'", "'Diamond'", "'FillDiamond'", "'InputArrowWithDiamond'", "'InputArrowWithFillDiamond'", "'none'", "'source'", "'target'", "'both'", "'package'", "'.'", "'.*'", "'import'", "'designer'", "'{'", "'}'", "'as'", "'viewpoint'", "'modelFileExtensions'", "'='", "'['", "']'", "','", "'icon'", "'representations'", "'@MetamodelUris'", "'({'", "'})'", "'diagram'", "'for'", "'?'", "'documentation'", "'titleExpression'", "'rootExpression'", "'defaultLayer'", "'additionalLayers'", "'layer'", "'mappings'", "'edges'", "'container'", "'style'", "'semanticCandidatesExpression'", "'if'", "'gradient'", "'from'", "'to'", "'label'", "'in'", "'border'", "'size'", "'heightComputationExpression'", "'widthComputationExpression'", "'relationBasedEdge'", "'sourceMappings'", "'targetMappings'", "'targetFileExpression'", "'edgeStyle'", "'line'", "'routing'", "'sourceArrow'", "'targetArrow'", "'sizeComputationExpression'", "'foldingStyle'", "'endsCentering'", "'palette'", "'color'", "'rgb('", "')'", "'@Initialized'", "'@ShowOnStartup'", "'@EnablePopupBars'", "'list'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=8;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__10=10;
    public static final int T__98=98;
    public static final int RULE_DOCUMENTATION=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_EXPRESSION=7;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalSiriusTextDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSiriusTextDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSiriusTextDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSiriusTextDsl.g"; }


     
     	private SiriusTextDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SiriusTextDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleSiriusFile"
    // InternalSiriusTextDsl.g:60:1: entryRuleSiriusFile : ruleSiriusFile EOF ;
    public final void entryRuleSiriusFile() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:61:1: ( ruleSiriusFile EOF )
            // InternalSiriusTextDsl.g:62:1: ruleSiriusFile EOF
            {
             before(grammarAccess.getSiriusFileRule()); 
            pushFollow(FOLLOW_1);
            ruleSiriusFile();

            state._fsp--;

             after(grammarAccess.getSiriusFileRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSiriusFile"


    // $ANTLR start "ruleSiriusFile"
    // InternalSiriusTextDsl.g:69:1: ruleSiriusFile : ( ( rule__SiriusFile__Group__0 ) ) ;
    public final void ruleSiriusFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:73:2: ( ( ( rule__SiriusFile__Group__0 ) ) )
            // InternalSiriusTextDsl.g:74:1: ( ( rule__SiriusFile__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:74:1: ( ( rule__SiriusFile__Group__0 ) )
            // InternalSiriusTextDsl.g:75:1: ( rule__SiriusFile__Group__0 )
            {
             before(grammarAccess.getSiriusFileAccess().getGroup()); 
            // InternalSiriusTextDsl.g:76:1: ( rule__SiriusFile__Group__0 )
            // InternalSiriusTextDsl.g:76:2: rule__SiriusFile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SiriusFile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSiriusFileAccess().getGroup()); 

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
    // $ANTLR end "ruleSiriusFile"


    // $ANTLR start "entryRuleSiriusFileBody"
    // InternalSiriusTextDsl.g:88:1: entryRuleSiriusFileBody : ruleSiriusFileBody EOF ;
    public final void entryRuleSiriusFileBody() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:89:1: ( ruleSiriusFileBody EOF )
            // InternalSiriusTextDsl.g:90:1: ruleSiriusFileBody EOF
            {
             before(grammarAccess.getSiriusFileBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleSiriusFileBody();

            state._fsp--;

             after(grammarAccess.getSiriusFileBodyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSiriusFileBody"


    // $ANTLR start "ruleSiriusFileBody"
    // InternalSiriusTextDsl.g:97:1: ruleSiriusFileBody : ( ( rule__SiriusFileBody__Alternatives ) ) ;
    public final void ruleSiriusFileBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:101:2: ( ( ( rule__SiriusFileBody__Alternatives ) ) )
            // InternalSiriusTextDsl.g:102:1: ( ( rule__SiriusFileBody__Alternatives ) )
            {
            // InternalSiriusTextDsl.g:102:1: ( ( rule__SiriusFileBody__Alternatives ) )
            // InternalSiriusTextDsl.g:103:1: ( rule__SiriusFileBody__Alternatives )
            {
             before(grammarAccess.getSiriusFileBodyAccess().getAlternatives()); 
            // InternalSiriusTextDsl.g:104:1: ( rule__SiriusFileBody__Alternatives )
            // InternalSiriusTextDsl.g:104:2: rule__SiriusFileBody__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SiriusFileBody__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSiriusFileBodyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSiriusFileBody"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSiriusTextDsl.g:116:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:117:1: ( ruleQualifiedName EOF )
            // InternalSiriusTextDsl.g:118:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSiriusTextDsl.g:125:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:129:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalSiriusTextDsl.g:130:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:130:1: ( ( rule__QualifiedName__Group__0 ) )
            // InternalSiriusTextDsl.g:131:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalSiriusTextDsl.g:132:1: ( rule__QualifiedName__Group__0 )
            // InternalSiriusTextDsl.g:132:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalSiriusTextDsl.g:144:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:145:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalSiriusTextDsl.g:146:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalSiriusTextDsl.g:153:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:157:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalSiriusTextDsl.g:158:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:158:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalSiriusTextDsl.g:159:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalSiriusTextDsl.g:160:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalSiriusTextDsl.g:160:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleImport"
    // InternalSiriusTextDsl.g:172:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:173:1: ( ruleImport EOF )
            // InternalSiriusTextDsl.g:174:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalSiriusTextDsl.g:181:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:185:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalSiriusTextDsl.g:186:1: ( ( rule__Import__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:186:1: ( ( rule__Import__Group__0 ) )
            // InternalSiriusTextDsl.g:187:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalSiriusTextDsl.g:188:1: ( rule__Import__Group__0 )
            // InternalSiriusTextDsl.g:188:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleDesigner"
    // InternalSiriusTextDsl.g:200:1: entryRuleDesigner : ruleDesigner EOF ;
    public final void entryRuleDesigner() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:201:1: ( ruleDesigner EOF )
            // InternalSiriusTextDsl.g:202:1: ruleDesigner EOF
            {
             before(grammarAccess.getDesignerRule()); 
            pushFollow(FOLLOW_1);
            ruleDesigner();

            state._fsp--;

             after(grammarAccess.getDesignerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDesigner"


    // $ANTLR start "ruleDesigner"
    // InternalSiriusTextDsl.g:209:1: ruleDesigner : ( ( rule__Designer__Group__0 ) ) ;
    public final void ruleDesigner() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:213:2: ( ( ( rule__Designer__Group__0 ) ) )
            // InternalSiriusTextDsl.g:214:1: ( ( rule__Designer__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:214:1: ( ( rule__Designer__Group__0 ) )
            // InternalSiriusTextDsl.g:215:1: ( rule__Designer__Group__0 )
            {
             before(grammarAccess.getDesignerAccess().getGroup()); 
            // InternalSiriusTextDsl.g:216:1: ( rule__Designer__Group__0 )
            // InternalSiriusTextDsl.g:216:2: rule__Designer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Designer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDesignerAccess().getGroup()); 

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
    // $ANTLR end "ruleDesigner"


    // $ANTLR start "entryRuleViewpoint"
    // InternalSiriusTextDsl.g:228:1: entryRuleViewpoint : ruleViewpoint EOF ;
    public final void entryRuleViewpoint() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:229:1: ( ruleViewpoint EOF )
            // InternalSiriusTextDsl.g:230:1: ruleViewpoint EOF
            {
             before(grammarAccess.getViewpointRule()); 
            pushFollow(FOLLOW_1);
            ruleViewpoint();

            state._fsp--;

             after(grammarAccess.getViewpointRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleViewpoint"


    // $ANTLR start "ruleViewpoint"
    // InternalSiriusTextDsl.g:237:1: ruleViewpoint : ( ( rule__Viewpoint__Group__0 ) ) ;
    public final void ruleViewpoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:241:2: ( ( ( rule__Viewpoint__Group__0 ) ) )
            // InternalSiriusTextDsl.g:242:1: ( ( rule__Viewpoint__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:242:1: ( ( rule__Viewpoint__Group__0 ) )
            // InternalSiriusTextDsl.g:243:1: ( rule__Viewpoint__Group__0 )
            {
             before(grammarAccess.getViewpointAccess().getGroup()); 
            // InternalSiriusTextDsl.g:244:1: ( rule__Viewpoint__Group__0 )
            // InternalSiriusTextDsl.g:244:2: rule__Viewpoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getViewpointAccess().getGroup()); 

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
    // $ANTLR end "ruleViewpoint"


    // $ANTLR start "entryRuleRepresentation"
    // InternalSiriusTextDsl.g:256:1: entryRuleRepresentation : ruleRepresentation EOF ;
    public final void entryRuleRepresentation() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:257:1: ( ruleRepresentation EOF )
            // InternalSiriusTextDsl.g:258:1: ruleRepresentation EOF
            {
             before(grammarAccess.getRepresentationRule()); 
            pushFollow(FOLLOW_1);
            ruleRepresentation();

            state._fsp--;

             after(grammarAccess.getRepresentationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRepresentation"


    // $ANTLR start "ruleRepresentation"
    // InternalSiriusTextDsl.g:265:1: ruleRepresentation : ( ruleDiagram ) ;
    public final void ruleRepresentation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:269:2: ( ( ruleDiagram ) )
            // InternalSiriusTextDsl.g:270:1: ( ruleDiagram )
            {
            // InternalSiriusTextDsl.g:270:1: ( ruleDiagram )
            // InternalSiriusTextDsl.g:271:1: ruleDiagram
            {
             before(grammarAccess.getRepresentationAccess().getDiagramParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleDiagram();

            state._fsp--;

             after(grammarAccess.getRepresentationAccess().getDiagramParserRuleCall()); 

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
    // $ANTLR end "ruleRepresentation"


    // $ANTLR start "entryRuleDiagram"
    // InternalSiriusTextDsl.g:284:1: entryRuleDiagram : ruleDiagram EOF ;
    public final void entryRuleDiagram() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:285:1: ( ruleDiagram EOF )
            // InternalSiriusTextDsl.g:286:1: ruleDiagram EOF
            {
             before(grammarAccess.getDiagramRule()); 
            pushFollow(FOLLOW_1);
            ruleDiagram();

            state._fsp--;

             after(grammarAccess.getDiagramRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDiagram"


    // $ANTLR start "ruleDiagram"
    // InternalSiriusTextDsl.g:293:1: ruleDiagram : ( ( rule__Diagram__Group__0 ) ) ;
    public final void ruleDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:297:2: ( ( ( rule__Diagram__Group__0 ) ) )
            // InternalSiriusTextDsl.g:298:1: ( ( rule__Diagram__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:298:1: ( ( rule__Diagram__Group__0 ) )
            // InternalSiriusTextDsl.g:299:1: ( rule__Diagram__Group__0 )
            {
             before(grammarAccess.getDiagramAccess().getGroup()); 
            // InternalSiriusTextDsl.g:300:1: ( rule__Diagram__Group__0 )
            // InternalSiriusTextDsl.g:300:2: rule__Diagram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getGroup()); 

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
    // $ANTLR end "ruleDiagram"


    // $ANTLR start "entryRuleLayer"
    // InternalSiriusTextDsl.g:312:1: entryRuleLayer : ruleLayer EOF ;
    public final void entryRuleLayer() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:313:1: ( ruleLayer EOF )
            // InternalSiriusTextDsl.g:314:1: ruleLayer EOF
            {
             before(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getLayerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalSiriusTextDsl.g:321:1: ruleLayer : ( ( rule__Layer__Group__0 ) ) ;
    public final void ruleLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:325:2: ( ( ( rule__Layer__Group__0 ) ) )
            // InternalSiriusTextDsl.g:326:1: ( ( rule__Layer__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:326:1: ( ( rule__Layer__Group__0 ) )
            // InternalSiriusTextDsl.g:327:1: ( rule__Layer__Group__0 )
            {
             before(grammarAccess.getLayerAccess().getGroup()); 
            // InternalSiriusTextDsl.g:328:1: ( rule__Layer__Group__0 )
            // InternalSiriusTextDsl.g:328:2: rule__Layer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getGroup()); 

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
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleMapping"
    // InternalSiriusTextDsl.g:340:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:341:1: ( ruleMapping EOF )
            // InternalSiriusTextDsl.g:342:1: ruleMapping EOF
            {
             before(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getMappingRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalSiriusTextDsl.g:349:1: ruleMapping : ( ruleContainer ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:353:2: ( ( ruleContainer ) )
            // InternalSiriusTextDsl.g:354:1: ( ruleContainer )
            {
            // InternalSiriusTextDsl.g:354:1: ( ruleContainer )
            // InternalSiriusTextDsl.g:355:1: ruleContainer
            {
             before(grammarAccess.getMappingAccess().getContainerParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getContainerParserRuleCall()); 

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
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleContainer"
    // InternalSiriusTextDsl.g:368:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:369:1: ( ruleContainer EOF )
            // InternalSiriusTextDsl.g:370:1: ruleContainer EOF
            {
             before(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getContainerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalSiriusTextDsl.g:377:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:381:2: ( ( ( rule__Container__Group__0 ) ) )
            // InternalSiriusTextDsl.g:382:1: ( ( rule__Container__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:382:1: ( ( rule__Container__Group__0 ) )
            // InternalSiriusTextDsl.g:383:1: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // InternalSiriusTextDsl.g:384:1: ( rule__Container__Group__0 )
            // InternalSiriusTextDsl.g:384:2: rule__Container__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getGroup()); 

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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleConditionalContainerStyleDeclaration"
    // InternalSiriusTextDsl.g:396:1: entryRuleConditionalContainerStyleDeclaration : ruleConditionalContainerStyleDeclaration EOF ;
    public final void entryRuleConditionalContainerStyleDeclaration() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:397:1: ( ruleConditionalContainerStyleDeclaration EOF )
            // InternalSiriusTextDsl.g:398:1: ruleConditionalContainerStyleDeclaration EOF
            {
             before(grammarAccess.getConditionalContainerStyleDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionalContainerStyleDeclaration();

            state._fsp--;

             after(grammarAccess.getConditionalContainerStyleDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConditionalContainerStyleDeclaration"


    // $ANTLR start "ruleConditionalContainerStyleDeclaration"
    // InternalSiriusTextDsl.g:405:1: ruleConditionalContainerStyleDeclaration : ( ( rule__ConditionalContainerStyleDeclaration__Group__0 ) ) ;
    public final void ruleConditionalContainerStyleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:409:2: ( ( ( rule__ConditionalContainerStyleDeclaration__Group__0 ) ) )
            // InternalSiriusTextDsl.g:410:1: ( ( rule__ConditionalContainerStyleDeclaration__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:410:1: ( ( rule__ConditionalContainerStyleDeclaration__Group__0 ) )
            // InternalSiriusTextDsl.g:411:1: ( rule__ConditionalContainerStyleDeclaration__Group__0 )
            {
             before(grammarAccess.getConditionalContainerStyleDeclarationAccess().getGroup()); 
            // InternalSiriusTextDsl.g:412:1: ( rule__ConditionalContainerStyleDeclaration__Group__0 )
            // InternalSiriusTextDsl.g:412:2: rule__ConditionalContainerStyleDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalContainerStyleDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalContainerStyleDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleConditionalContainerStyleDeclaration"


    // $ANTLR start "entryRuleStyle"
    // InternalSiriusTextDsl.g:424:1: entryRuleStyle : ruleStyle EOF ;
    public final void entryRuleStyle() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:425:1: ( ruleStyle EOF )
            // InternalSiriusTextDsl.g:426:1: ruleStyle EOF
            {
             before(grammarAccess.getStyleRule()); 
            pushFollow(FOLLOW_1);
            ruleStyle();

            state._fsp--;

             after(grammarAccess.getStyleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStyle"


    // $ANTLR start "ruleStyle"
    // InternalSiriusTextDsl.g:433:1: ruleStyle : ( ( rule__Style__Alternatives ) ) ;
    public final void ruleStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:437:2: ( ( ( rule__Style__Alternatives ) ) )
            // InternalSiriusTextDsl.g:438:1: ( ( rule__Style__Alternatives ) )
            {
            // InternalSiriusTextDsl.g:438:1: ( ( rule__Style__Alternatives ) )
            // InternalSiriusTextDsl.g:439:1: ( rule__Style__Alternatives )
            {
             before(grammarAccess.getStyleAccess().getAlternatives()); 
            // InternalSiriusTextDsl.g:440:1: ( rule__Style__Alternatives )
            // InternalSiriusTextDsl.g:440:2: rule__Style__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Style__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStyleAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStyle"


    // $ANTLR start "entryRuleContainerStyle"
    // InternalSiriusTextDsl.g:452:1: entryRuleContainerStyle : ruleContainerStyle EOF ;
    public final void entryRuleContainerStyle() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:453:1: ( ruleContainerStyle EOF )
            // InternalSiriusTextDsl.g:454:1: ruleContainerStyle EOF
            {
             before(grammarAccess.getContainerStyleRule()); 
            pushFollow(FOLLOW_1);
            ruleContainerStyle();

            state._fsp--;

             after(grammarAccess.getContainerStyleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContainerStyle"


    // $ANTLR start "ruleContainerStyle"
    // InternalSiriusTextDsl.g:461:1: ruleContainerStyle : ( ruleGradient ) ;
    public final void ruleContainerStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:465:2: ( ( ruleGradient ) )
            // InternalSiriusTextDsl.g:466:1: ( ruleGradient )
            {
            // InternalSiriusTextDsl.g:466:1: ( ruleGradient )
            // InternalSiriusTextDsl.g:467:1: ruleGradient
            {
             before(grammarAccess.getContainerStyleAccess().getGradientParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleGradient();

            state._fsp--;

             after(grammarAccess.getContainerStyleAccess().getGradientParserRuleCall()); 

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
    // $ANTLR end "ruleContainerStyle"


    // $ANTLR start "entryRuleGradient"
    // InternalSiriusTextDsl.g:480:1: entryRuleGradient : ruleGradient EOF ;
    public final void entryRuleGradient() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:481:1: ( ruleGradient EOF )
            // InternalSiriusTextDsl.g:482:1: ruleGradient EOF
            {
             before(grammarAccess.getGradientRule()); 
            pushFollow(FOLLOW_1);
            ruleGradient();

            state._fsp--;

             after(grammarAccess.getGradientRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGradient"


    // $ANTLR start "ruleGradient"
    // InternalSiriusTextDsl.g:489:1: ruleGradient : ( ( rule__Gradient__Group__0 ) ) ;
    public final void ruleGradient() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:493:2: ( ( ( rule__Gradient__Group__0 ) ) )
            // InternalSiriusTextDsl.g:494:1: ( ( rule__Gradient__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:494:1: ( ( rule__Gradient__Group__0 ) )
            // InternalSiriusTextDsl.g:495:1: ( rule__Gradient__Group__0 )
            {
             before(grammarAccess.getGradientAccess().getGroup()); 
            // InternalSiriusTextDsl.g:496:1: ( rule__Gradient__Group__0 )
            // InternalSiriusTextDsl.g:496:2: rule__Gradient__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getGroup()); 

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
    // $ANTLR end "ruleGradient"


    // $ANTLR start "entryRuleEdge"
    // InternalSiriusTextDsl.g:508:1: entryRuleEdge : ruleEdge EOF ;
    public final void entryRuleEdge() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:509:1: ( ruleEdge EOF )
            // InternalSiriusTextDsl.g:510:1: ruleEdge EOF
            {
             before(grammarAccess.getEdgeRule()); 
            pushFollow(FOLLOW_1);
            ruleEdge();

            state._fsp--;

             after(grammarAccess.getEdgeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEdge"


    // $ANTLR start "ruleEdge"
    // InternalSiriusTextDsl.g:517:1: ruleEdge : ( ruleRelationBasedEdge ) ;
    public final void ruleEdge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:521:2: ( ( ruleRelationBasedEdge ) )
            // InternalSiriusTextDsl.g:522:1: ( ruleRelationBasedEdge )
            {
            // InternalSiriusTextDsl.g:522:1: ( ruleRelationBasedEdge )
            // InternalSiriusTextDsl.g:523:1: ruleRelationBasedEdge
            {
             before(grammarAccess.getEdgeAccess().getRelationBasedEdgeParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleRelationBasedEdge();

            state._fsp--;

             after(grammarAccess.getEdgeAccess().getRelationBasedEdgeParserRuleCall()); 

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
    // $ANTLR end "ruleEdge"


    // $ANTLR start "entryRuleRelationBasedEdge"
    // InternalSiriusTextDsl.g:536:1: entryRuleRelationBasedEdge : ruleRelationBasedEdge EOF ;
    public final void entryRuleRelationBasedEdge() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:537:1: ( ruleRelationBasedEdge EOF )
            // InternalSiriusTextDsl.g:538:1: ruleRelationBasedEdge EOF
            {
             before(grammarAccess.getRelationBasedEdgeRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationBasedEdge();

            state._fsp--;

             after(grammarAccess.getRelationBasedEdgeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRelationBasedEdge"


    // $ANTLR start "ruleRelationBasedEdge"
    // InternalSiriusTextDsl.g:545:1: ruleRelationBasedEdge : ( ( rule__RelationBasedEdge__Group__0 ) ) ;
    public final void ruleRelationBasedEdge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:549:2: ( ( ( rule__RelationBasedEdge__Group__0 ) ) )
            // InternalSiriusTextDsl.g:550:1: ( ( rule__RelationBasedEdge__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:550:1: ( ( rule__RelationBasedEdge__Group__0 ) )
            // InternalSiriusTextDsl.g:551:1: ( rule__RelationBasedEdge__Group__0 )
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getGroup()); 
            // InternalSiriusTextDsl.g:552:1: ( rule__RelationBasedEdge__Group__0 )
            // InternalSiriusTextDsl.g:552:2: rule__RelationBasedEdge__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationBasedEdgeAccess().getGroup()); 

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
    // $ANTLR end "ruleRelationBasedEdge"


    // $ANTLR start "entryRuleEdgeStyle"
    // InternalSiriusTextDsl.g:564:1: entryRuleEdgeStyle : ruleEdgeStyle EOF ;
    public final void entryRuleEdgeStyle() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:565:1: ( ruleEdgeStyle EOF )
            // InternalSiriusTextDsl.g:566:1: ruleEdgeStyle EOF
            {
             before(grammarAccess.getEdgeStyleRule()); 
            pushFollow(FOLLOW_1);
            ruleEdgeStyle();

            state._fsp--;

             after(grammarAccess.getEdgeStyleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEdgeStyle"


    // $ANTLR start "ruleEdgeStyle"
    // InternalSiriusTextDsl.g:573:1: ruleEdgeStyle : ( ( rule__EdgeStyle__Group__0 ) ) ;
    public final void ruleEdgeStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:577:2: ( ( ( rule__EdgeStyle__Group__0 ) ) )
            // InternalSiriusTextDsl.g:578:1: ( ( rule__EdgeStyle__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:578:1: ( ( rule__EdgeStyle__Group__0 ) )
            // InternalSiriusTextDsl.g:579:1: ( rule__EdgeStyle__Group__0 )
            {
             before(grammarAccess.getEdgeStyleAccess().getGroup()); 
            // InternalSiriusTextDsl.g:580:1: ( rule__EdgeStyle__Group__0 )
            // InternalSiriusTextDsl.g:580:2: rule__EdgeStyle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEdgeStyleAccess().getGroup()); 

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
    // $ANTLR end "ruleEdgeStyle"


    // $ANTLR start "entryRulePalette"
    // InternalSiriusTextDsl.g:592:1: entryRulePalette : rulePalette EOF ;
    public final void entryRulePalette() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:593:1: ( rulePalette EOF )
            // InternalSiriusTextDsl.g:594:1: rulePalette EOF
            {
             before(grammarAccess.getPaletteRule()); 
            pushFollow(FOLLOW_1);
            rulePalette();

            state._fsp--;

             after(grammarAccess.getPaletteRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePalette"


    // $ANTLR start "rulePalette"
    // InternalSiriusTextDsl.g:601:1: rulePalette : ( ( rule__Palette__Group__0 ) ) ;
    public final void rulePalette() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:605:2: ( ( ( rule__Palette__Group__0 ) ) )
            // InternalSiriusTextDsl.g:606:1: ( ( rule__Palette__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:606:1: ( ( rule__Palette__Group__0 ) )
            // InternalSiriusTextDsl.g:607:1: ( rule__Palette__Group__0 )
            {
             before(grammarAccess.getPaletteAccess().getGroup()); 
            // InternalSiriusTextDsl.g:608:1: ( rule__Palette__Group__0 )
            // InternalSiriusTextDsl.g:608:2: rule__Palette__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Palette__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPaletteAccess().getGroup()); 

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
    // $ANTLR end "rulePalette"


    // $ANTLR start "entryRuleColor"
    // InternalSiriusTextDsl.g:620:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:621:1: ( ruleColor EOF )
            // InternalSiriusTextDsl.g:622:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalSiriusTextDsl.g:629:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:633:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalSiriusTextDsl.g:634:1: ( ( rule__Color__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:634:1: ( ( rule__Color__Group__0 ) )
            // InternalSiriusTextDsl.g:635:1: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalSiriusTextDsl.g:636:1: ( rule__Color__Group__0 )
            // InternalSiriusTextDsl.g:636:2: rule__Color__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGroup()); 

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleColorValue"
    // InternalSiriusTextDsl.g:648:1: entryRuleColorValue : ruleColorValue EOF ;
    public final void entryRuleColorValue() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:649:1: ( ruleColorValue EOF )
            // InternalSiriusTextDsl.g:650:1: ruleColorValue EOF
            {
             before(grammarAccess.getColorValueRule()); 
            pushFollow(FOLLOW_1);
            ruleColorValue();

            state._fsp--;

             after(grammarAccess.getColorValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleColorValue"


    // $ANTLR start "ruleColorValue"
    // InternalSiriusTextDsl.g:657:1: ruleColorValue : ( ruleRGB ) ;
    public final void ruleColorValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:661:2: ( ( ruleRGB ) )
            // InternalSiriusTextDsl.g:662:1: ( ruleRGB )
            {
            // InternalSiriusTextDsl.g:662:1: ( ruleRGB )
            // InternalSiriusTextDsl.g:663:1: ruleRGB
            {
             before(grammarAccess.getColorValueAccess().getRGBParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleRGB();

            state._fsp--;

             after(grammarAccess.getColorValueAccess().getRGBParserRuleCall()); 

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
    // $ANTLR end "ruleColorValue"


    // $ANTLR start "entryRuleRGB"
    // InternalSiriusTextDsl.g:676:1: entryRuleRGB : ruleRGB EOF ;
    public final void entryRuleRGB() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:677:1: ( ruleRGB EOF )
            // InternalSiriusTextDsl.g:678:1: ruleRGB EOF
            {
             before(grammarAccess.getRGBRule()); 
            pushFollow(FOLLOW_1);
            ruleRGB();

            state._fsp--;

             after(grammarAccess.getRGBRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRGB"


    // $ANTLR start "ruleRGB"
    // InternalSiriusTextDsl.g:685:1: ruleRGB : ( ( rule__RGB__Group__0 ) ) ;
    public final void ruleRGB() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:689:2: ( ( ( rule__RGB__Group__0 ) ) )
            // InternalSiriusTextDsl.g:690:1: ( ( rule__RGB__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:690:1: ( ( rule__RGB__Group__0 ) )
            // InternalSiriusTextDsl.g:691:1: ( rule__RGB__Group__0 )
            {
             before(grammarAccess.getRGBAccess().getGroup()); 
            // InternalSiriusTextDsl.g:692:1: ( rule__RGB__Group__0 )
            // InternalSiriusTextDsl.g:692:2: rule__RGB__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RGB__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRGBAccess().getGroup()); 

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
    // $ANTLR end "ruleRGB"


    // $ANTLR start "ruleLabelAlignment"
    // InternalSiriusTextDsl.g:705:1: ruleLabelAlignment : ( ( rule__LabelAlignment__Alternatives ) ) ;
    public final void ruleLabelAlignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:709:1: ( ( ( rule__LabelAlignment__Alternatives ) ) )
            // InternalSiriusTextDsl.g:710:1: ( ( rule__LabelAlignment__Alternatives ) )
            {
            // InternalSiriusTextDsl.g:710:1: ( ( rule__LabelAlignment__Alternatives ) )
            // InternalSiriusTextDsl.g:711:1: ( rule__LabelAlignment__Alternatives )
            {
             before(grammarAccess.getLabelAlignmentAccess().getAlternatives()); 
            // InternalSiriusTextDsl.g:712:1: ( rule__LabelAlignment__Alternatives )
            // InternalSiriusTextDsl.g:712:2: rule__LabelAlignment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LabelAlignment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLabelAlignmentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLabelAlignment"


    // $ANTLR start "ruleGradientDirection"
    // InternalSiriusTextDsl.g:724:1: ruleGradientDirection : ( ( rule__GradientDirection__Alternatives ) ) ;
    public final void ruleGradientDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:728:1: ( ( ( rule__GradientDirection__Alternatives ) ) )
            // InternalSiriusTextDsl.g:729:1: ( ( rule__GradientDirection__Alternatives ) )
            {
            // InternalSiriusTextDsl.g:729:1: ( ( rule__GradientDirection__Alternatives ) )
            // InternalSiriusTextDsl.g:730:1: ( rule__GradientDirection__Alternatives )
            {
             before(grammarAccess.getGradientDirectionAccess().getAlternatives()); 
            // InternalSiriusTextDsl.g:731:1: ( rule__GradientDirection__Alternatives )
            // InternalSiriusTextDsl.g:731:2: rule__GradientDirection__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GradientDirection__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGradientDirectionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleGradientDirection"


    // $ANTLR start "ruleLineStyle"
    // InternalSiriusTextDsl.g:743:1: ruleLineStyle : ( ( rule__LineStyle__Alternatives ) ) ;
    public final void ruleLineStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:747:1: ( ( ( rule__LineStyle__Alternatives ) ) )
            // InternalSiriusTextDsl.g:748:1: ( ( rule__LineStyle__Alternatives ) )
            {
            // InternalSiriusTextDsl.g:748:1: ( ( rule__LineStyle__Alternatives ) )
            // InternalSiriusTextDsl.g:749:1: ( rule__LineStyle__Alternatives )
            {
             before(grammarAccess.getLineStyleAccess().getAlternatives()); 
            // InternalSiriusTextDsl.g:750:1: ( rule__LineStyle__Alternatives )
            // InternalSiriusTextDsl.g:750:2: rule__LineStyle__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LineStyle__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLineStyleAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLineStyle"


    // $ANTLR start "ruleRoutingStyle"
    // InternalSiriusTextDsl.g:762:1: ruleRoutingStyle : ( ( rule__RoutingStyle__Alternatives ) ) ;
    public final void ruleRoutingStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:766:1: ( ( ( rule__RoutingStyle__Alternatives ) ) )
            // InternalSiriusTextDsl.g:767:1: ( ( rule__RoutingStyle__Alternatives ) )
            {
            // InternalSiriusTextDsl.g:767:1: ( ( rule__RoutingStyle__Alternatives ) )
            // InternalSiriusTextDsl.g:768:1: ( rule__RoutingStyle__Alternatives )
            {
             before(grammarAccess.getRoutingStyleAccess().getAlternatives()); 
            // InternalSiriusTextDsl.g:769:1: ( rule__RoutingStyle__Alternatives )
            // InternalSiriusTextDsl.g:769:2: rule__RoutingStyle__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RoutingStyle__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRoutingStyleAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRoutingStyle"


    // $ANTLR start "ruleArrowDecorator"
    // InternalSiriusTextDsl.g:781:1: ruleArrowDecorator : ( ( rule__ArrowDecorator__Alternatives ) ) ;
    public final void ruleArrowDecorator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:785:1: ( ( ( rule__ArrowDecorator__Alternatives ) ) )
            // InternalSiriusTextDsl.g:786:1: ( ( rule__ArrowDecorator__Alternatives ) )
            {
            // InternalSiriusTextDsl.g:786:1: ( ( rule__ArrowDecorator__Alternatives ) )
            // InternalSiriusTextDsl.g:787:1: ( rule__ArrowDecorator__Alternatives )
            {
             before(grammarAccess.getArrowDecoratorAccess().getAlternatives()); 
            // InternalSiriusTextDsl.g:788:1: ( rule__ArrowDecorator__Alternatives )
            // InternalSiriusTextDsl.g:788:2: rule__ArrowDecorator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ArrowDecorator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArrowDecoratorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleArrowDecorator"


    // $ANTLR start "ruleFoldingStyle"
    // InternalSiriusTextDsl.g:800:1: ruleFoldingStyle : ( ( rule__FoldingStyle__Alternatives ) ) ;
    public final void ruleFoldingStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:804:1: ( ( ( rule__FoldingStyle__Alternatives ) ) )
            // InternalSiriusTextDsl.g:805:1: ( ( rule__FoldingStyle__Alternatives ) )
            {
            // InternalSiriusTextDsl.g:805:1: ( ( rule__FoldingStyle__Alternatives ) )
            // InternalSiriusTextDsl.g:806:1: ( rule__FoldingStyle__Alternatives )
            {
             before(grammarAccess.getFoldingStyleAccess().getAlternatives()); 
            // InternalSiriusTextDsl.g:807:1: ( rule__FoldingStyle__Alternatives )
            // InternalSiriusTextDsl.g:807:2: rule__FoldingStyle__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FoldingStyle__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFoldingStyleAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFoldingStyle"


    // $ANTLR start "ruleEndsCentering"
    // InternalSiriusTextDsl.g:819:1: ruleEndsCentering : ( ( rule__EndsCentering__Alternatives ) ) ;
    public final void ruleEndsCentering() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:823:1: ( ( ( rule__EndsCentering__Alternatives ) ) )
            // InternalSiriusTextDsl.g:824:1: ( ( rule__EndsCentering__Alternatives ) )
            {
            // InternalSiriusTextDsl.g:824:1: ( ( rule__EndsCentering__Alternatives ) )
            // InternalSiriusTextDsl.g:825:1: ( rule__EndsCentering__Alternatives )
            {
             before(grammarAccess.getEndsCenteringAccess().getAlternatives()); 
            // InternalSiriusTextDsl.g:826:1: ( rule__EndsCentering__Alternatives )
            // InternalSiriusTextDsl.g:826:2: rule__EndsCentering__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EndsCentering__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEndsCenteringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEndsCentering"


    // $ANTLR start "rule__SiriusFileBody__Alternatives"
    // InternalSiriusTextDsl.g:837:1: rule__SiriusFileBody__Alternatives : ( ( ruleDesigner ) | ( ruleRepresentation ) | ( ruleLayer ) | ( ruleMapping ) | ( ruleStyle ) | ( rulePalette ) | ( ruleEdge ) );
    public final void rule__SiriusFileBody__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:841:1: ( ( ruleDesigner ) | ( ruleRepresentation ) | ( ruleLayer ) | ( ruleMapping ) | ( ruleStyle ) | ( rulePalette ) | ( ruleEdge ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case RULE_DOCUMENTATION:
                {
                switch ( input.LA(2) ) {
                case 72:
                    {
                    alt1=5;
                    }
                    break;
                case 93:
                    {
                    alt1=6;
                    }
                    break;
                case 81:
                    {
                    alt1=7;
                    }
                    break;
                case 42:
                    {
                    alt1=1;
                    }
                    break;
                case 54:
                case 97:
                case 98:
                case 99:
                    {
                    alt1=2;
                    }
                    break;
                case 65:
                    {
                    alt1=3;
                    }
                    break;
                case 68:
                case 100:
                    {
                    alt1=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }

                }
                break;
            case 42:
                {
                alt1=1;
                }
                break;
            case 54:
            case 97:
            case 98:
            case 99:
                {
                alt1=2;
                }
                break;
            case 65:
                {
                alt1=3;
                }
                break;
            case 68:
            case 100:
                {
                alt1=4;
                }
                break;
            case 72:
            case 85:
                {
                alt1=5;
                }
                break;
            case 93:
                {
                alt1=6;
                }
                break;
            case 81:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSiriusTextDsl.g:842:1: ( ruleDesigner )
                    {
                    // InternalSiriusTextDsl.g:842:1: ( ruleDesigner )
                    // InternalSiriusTextDsl.g:843:1: ruleDesigner
                    {
                     before(grammarAccess.getSiriusFileBodyAccess().getDesignerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDesigner();

                    state._fsp--;

                     after(grammarAccess.getSiriusFileBodyAccess().getDesignerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:848:6: ( ruleRepresentation )
                    {
                    // InternalSiriusTextDsl.g:848:6: ( ruleRepresentation )
                    // InternalSiriusTextDsl.g:849:1: ruleRepresentation
                    {
                     before(grammarAccess.getSiriusFileBodyAccess().getRepresentationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRepresentation();

                    state._fsp--;

                     after(grammarAccess.getSiriusFileBodyAccess().getRepresentationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:854:6: ( ruleLayer )
                    {
                    // InternalSiriusTextDsl.g:854:6: ( ruleLayer )
                    // InternalSiriusTextDsl.g:855:1: ruleLayer
                    {
                     before(grammarAccess.getSiriusFileBodyAccess().getLayerParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLayer();

                    state._fsp--;

                     after(grammarAccess.getSiriusFileBodyAccess().getLayerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSiriusTextDsl.g:860:6: ( ruleMapping )
                    {
                    // InternalSiriusTextDsl.g:860:6: ( ruleMapping )
                    // InternalSiriusTextDsl.g:861:1: ruleMapping
                    {
                     before(grammarAccess.getSiriusFileBodyAccess().getMappingParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMapping();

                    state._fsp--;

                     after(grammarAccess.getSiriusFileBodyAccess().getMappingParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSiriusTextDsl.g:866:6: ( ruleStyle )
                    {
                    // InternalSiriusTextDsl.g:866:6: ( ruleStyle )
                    // InternalSiriusTextDsl.g:867:1: ruleStyle
                    {
                     before(grammarAccess.getSiriusFileBodyAccess().getStyleParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleStyle();

                    state._fsp--;

                     after(grammarAccess.getSiriusFileBodyAccess().getStyleParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSiriusTextDsl.g:872:6: ( rulePalette )
                    {
                    // InternalSiriusTextDsl.g:872:6: ( rulePalette )
                    // InternalSiriusTextDsl.g:873:1: rulePalette
                    {
                     before(grammarAccess.getSiriusFileBodyAccess().getPaletteParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    rulePalette();

                    state._fsp--;

                     after(grammarAccess.getSiriusFileBodyAccess().getPaletteParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSiriusTextDsl.g:878:6: ( ruleEdge )
                    {
                    // InternalSiriusTextDsl.g:878:6: ( ruleEdge )
                    // InternalSiriusTextDsl.g:879:1: ruleEdge
                    {
                     before(grammarAccess.getSiriusFileBodyAccess().getEdgeParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleEdge();

                    state._fsp--;

                     after(grammarAccess.getSiriusFileBodyAccess().getEdgeParserRuleCall_6()); 

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
    // $ANTLR end "rule__SiriusFileBody__Alternatives"


    // $ANTLR start "rule__Style__Alternatives"
    // InternalSiriusTextDsl.g:889:1: rule__Style__Alternatives : ( ( ruleContainerStyle ) | ( ruleEdgeStyle ) );
    public final void rule__Style__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:893:1: ( ( ruleContainerStyle ) | ( ruleEdgeStyle ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_DOCUMENTATION||LA2_0==72) ) {
                alt2=1;
            }
            else if ( (LA2_0==85) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSiriusTextDsl.g:894:1: ( ruleContainerStyle )
                    {
                    // InternalSiriusTextDsl.g:894:1: ( ruleContainerStyle )
                    // InternalSiriusTextDsl.g:895:1: ruleContainerStyle
                    {
                     before(grammarAccess.getStyleAccess().getContainerStyleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleContainerStyle();

                    state._fsp--;

                     after(grammarAccess.getStyleAccess().getContainerStyleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:900:6: ( ruleEdgeStyle )
                    {
                    // InternalSiriusTextDsl.g:900:6: ( ruleEdgeStyle )
                    // InternalSiriusTextDsl.g:901:1: ruleEdgeStyle
                    {
                     before(grammarAccess.getStyleAccess().getEdgeStyleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEdgeStyle();

                    state._fsp--;

                     after(grammarAccess.getStyleAccess().getEdgeStyleParserRuleCall_1()); 

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
    // $ANTLR end "rule__Style__Alternatives"


    // $ANTLR start "rule__LabelAlignment__Alternatives"
    // InternalSiriusTextDsl.g:911:1: rule__LabelAlignment__Alternatives : ( ( ( 'left' ) ) | ( ( 'center' ) ) | ( ( 'right' ) ) );
    public final void rule__LabelAlignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:915:1: ( ( ( 'left' ) ) | ( ( 'center' ) ) | ( ( 'right' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 10:
                {
                alt3=1;
                }
                break;
            case 11:
                {
                alt3=2;
                }
                break;
            case 12:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSiriusTextDsl.g:916:1: ( ( 'left' ) )
                    {
                    // InternalSiriusTextDsl.g:916:1: ( ( 'left' ) )
                    // InternalSiriusTextDsl.g:917:1: ( 'left' )
                    {
                     before(grammarAccess.getLabelAlignmentAccess().getLeftEnumLiteralDeclaration_0()); 
                    // InternalSiriusTextDsl.g:918:1: ( 'left' )
                    // InternalSiriusTextDsl.g:918:3: 'left'
                    {
                    match(input,10,FOLLOW_2); 

                    }

                     after(grammarAccess.getLabelAlignmentAccess().getLeftEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:923:6: ( ( 'center' ) )
                    {
                    // InternalSiriusTextDsl.g:923:6: ( ( 'center' ) )
                    // InternalSiriusTextDsl.g:924:1: ( 'center' )
                    {
                     before(grammarAccess.getLabelAlignmentAccess().getCenterEnumLiteralDeclaration_1()); 
                    // InternalSiriusTextDsl.g:925:1: ( 'center' )
                    // InternalSiriusTextDsl.g:925:3: 'center'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getLabelAlignmentAccess().getCenterEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:930:6: ( ( 'right' ) )
                    {
                    // InternalSiriusTextDsl.g:930:6: ( ( 'right' ) )
                    // InternalSiriusTextDsl.g:931:1: ( 'right' )
                    {
                     before(grammarAccess.getLabelAlignmentAccess().getRightEnumLiteralDeclaration_2()); 
                    // InternalSiriusTextDsl.g:932:1: ( 'right' )
                    // InternalSiriusTextDsl.g:932:3: 'right'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getLabelAlignmentAccess().getRightEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__LabelAlignment__Alternatives"


    // $ANTLR start "rule__GradientDirection__Alternatives"
    // InternalSiriusTextDsl.g:942:1: rule__GradientDirection__Alternatives : ( ( ( 'oblique' ) ) | ( ( 'lefttoright' ) ) | ( ( 'toptobottom' ) ) );
    public final void rule__GradientDirection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:946:1: ( ( ( 'oblique' ) ) | ( ( 'lefttoright' ) ) | ( ( 'toptobottom' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSiriusTextDsl.g:947:1: ( ( 'oblique' ) )
                    {
                    // InternalSiriusTextDsl.g:947:1: ( ( 'oblique' ) )
                    // InternalSiriusTextDsl.g:948:1: ( 'oblique' )
                    {
                     before(grammarAccess.getGradientDirectionAccess().getObliqueEnumLiteralDeclaration_0()); 
                    // InternalSiriusTextDsl.g:949:1: ( 'oblique' )
                    // InternalSiriusTextDsl.g:949:3: 'oblique'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getGradientDirectionAccess().getObliqueEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:954:6: ( ( 'lefttoright' ) )
                    {
                    // InternalSiriusTextDsl.g:954:6: ( ( 'lefttoright' ) )
                    // InternalSiriusTextDsl.g:955:1: ( 'lefttoright' )
                    {
                     before(grammarAccess.getGradientDirectionAccess().getLefttorightEnumLiteralDeclaration_1()); 
                    // InternalSiriusTextDsl.g:956:1: ( 'lefttoright' )
                    // InternalSiriusTextDsl.g:956:3: 'lefttoright'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getGradientDirectionAccess().getLefttorightEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:961:6: ( ( 'toptobottom' ) )
                    {
                    // InternalSiriusTextDsl.g:961:6: ( ( 'toptobottom' ) )
                    // InternalSiriusTextDsl.g:962:1: ( 'toptobottom' )
                    {
                     before(grammarAccess.getGradientDirectionAccess().getToptobottomEnumLiteralDeclaration_2()); 
                    // InternalSiriusTextDsl.g:963:1: ( 'toptobottom' )
                    // InternalSiriusTextDsl.g:963:3: 'toptobottom'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getGradientDirectionAccess().getToptobottomEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__GradientDirection__Alternatives"


    // $ANTLR start "rule__LineStyle__Alternatives"
    // InternalSiriusTextDsl.g:973:1: rule__LineStyle__Alternatives : ( ( ( 'solid' ) ) | ( ( 'dash' ) ) | ( ( 'dot' ) ) | ( ( 'dash_dot' ) ) );
    public final void rule__LineStyle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:977:1: ( ( ( 'solid' ) ) | ( ( 'dash' ) ) | ( ( 'dot' ) ) | ( ( 'dash_dot' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 19:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSiriusTextDsl.g:978:1: ( ( 'solid' ) )
                    {
                    // InternalSiriusTextDsl.g:978:1: ( ( 'solid' ) )
                    // InternalSiriusTextDsl.g:979:1: ( 'solid' )
                    {
                     before(grammarAccess.getLineStyleAccess().getSolidEnumLiteralDeclaration_0()); 
                    // InternalSiriusTextDsl.g:980:1: ( 'solid' )
                    // InternalSiriusTextDsl.g:980:3: 'solid'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getLineStyleAccess().getSolidEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:985:6: ( ( 'dash' ) )
                    {
                    // InternalSiriusTextDsl.g:985:6: ( ( 'dash' ) )
                    // InternalSiriusTextDsl.g:986:1: ( 'dash' )
                    {
                     before(grammarAccess.getLineStyleAccess().getDashEnumLiteralDeclaration_1()); 
                    // InternalSiriusTextDsl.g:987:1: ( 'dash' )
                    // InternalSiriusTextDsl.g:987:3: 'dash'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getLineStyleAccess().getDashEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:992:6: ( ( 'dot' ) )
                    {
                    // InternalSiriusTextDsl.g:992:6: ( ( 'dot' ) )
                    // InternalSiriusTextDsl.g:993:1: ( 'dot' )
                    {
                     before(grammarAccess.getLineStyleAccess().getDotEnumLiteralDeclaration_2()); 
                    // InternalSiriusTextDsl.g:994:1: ( 'dot' )
                    // InternalSiriusTextDsl.g:994:3: 'dot'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getLineStyleAccess().getDotEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSiriusTextDsl.g:999:6: ( ( 'dash_dot' ) )
                    {
                    // InternalSiriusTextDsl.g:999:6: ( ( 'dash_dot' ) )
                    // InternalSiriusTextDsl.g:1000:1: ( 'dash_dot' )
                    {
                     before(grammarAccess.getLineStyleAccess().getDash_dotEnumLiteralDeclaration_3()); 
                    // InternalSiriusTextDsl.g:1001:1: ( 'dash_dot' )
                    // InternalSiriusTextDsl.g:1001:3: 'dash_dot'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getLineStyleAccess().getDash_dotEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__LineStyle__Alternatives"


    // $ANTLR start "rule__RoutingStyle__Alternatives"
    // InternalSiriusTextDsl.g:1011:1: rule__RoutingStyle__Alternatives : ( ( ( 'straight' ) ) | ( ( 'manhattan' ) ) | ( ( 'tree' ) ) );
    public final void rule__RoutingStyle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1015:1: ( ( ( 'straight' ) ) | ( ( 'manhattan' ) ) | ( ( 'tree' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSiriusTextDsl.g:1016:1: ( ( 'straight' ) )
                    {
                    // InternalSiriusTextDsl.g:1016:1: ( ( 'straight' ) )
                    // InternalSiriusTextDsl.g:1017:1: ( 'straight' )
                    {
                     before(grammarAccess.getRoutingStyleAccess().getStraightEnumLiteralDeclaration_0()); 
                    // InternalSiriusTextDsl.g:1018:1: ( 'straight' )
                    // InternalSiriusTextDsl.g:1018:3: 'straight'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoutingStyleAccess().getStraightEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:1023:6: ( ( 'manhattan' ) )
                    {
                    // InternalSiriusTextDsl.g:1023:6: ( ( 'manhattan' ) )
                    // InternalSiriusTextDsl.g:1024:1: ( 'manhattan' )
                    {
                     before(grammarAccess.getRoutingStyleAccess().getManhattanEnumLiteralDeclaration_1()); 
                    // InternalSiriusTextDsl.g:1025:1: ( 'manhattan' )
                    // InternalSiriusTextDsl.g:1025:3: 'manhattan'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoutingStyleAccess().getManhattanEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:1030:6: ( ( 'tree' ) )
                    {
                    // InternalSiriusTextDsl.g:1030:6: ( ( 'tree' ) )
                    // InternalSiriusTextDsl.g:1031:1: ( 'tree' )
                    {
                     before(grammarAccess.getRoutingStyleAccess().getTreeEnumLiteralDeclaration_2()); 
                    // InternalSiriusTextDsl.g:1032:1: ( 'tree' )
                    // InternalSiriusTextDsl.g:1032:3: 'tree'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoutingStyleAccess().getTreeEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__RoutingStyle__Alternatives"


    // $ANTLR start "rule__ArrowDecorator__Alternatives"
    // InternalSiriusTextDsl.g:1042:1: rule__ArrowDecorator__Alternatives : ( ( ( 'NoDecoration' ) ) | ( ( 'OutputArrow' ) ) | ( ( 'InputArrow' ) ) | ( ( 'OutputClosedArrow' ) ) | ( ( 'InputClosedArrow' ) ) | ( ( 'OutputFillClosedArrow' ) ) | ( ( 'InputFillClosedArrow' ) ) | ( ( 'Diamond' ) ) | ( ( 'FillDiamond' ) ) | ( ( 'InputArrowWithDiamond' ) ) | ( ( 'InputArrowWithFillDiamond' ) ) );
    public final void rule__ArrowDecorator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1046:1: ( ( ( 'NoDecoration' ) ) | ( ( 'OutputArrow' ) ) | ( ( 'InputArrow' ) ) | ( ( 'OutputClosedArrow' ) ) | ( ( 'InputClosedArrow' ) ) | ( ( 'OutputFillClosedArrow' ) ) | ( ( 'InputFillClosedArrow' ) ) | ( ( 'Diamond' ) ) | ( ( 'FillDiamond' ) ) | ( ( 'InputArrowWithDiamond' ) ) | ( ( 'InputArrowWithFillDiamond' ) ) )
            int alt7=11;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt7=1;
                }
                break;
            case 24:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            case 26:
                {
                alt7=4;
                }
                break;
            case 27:
                {
                alt7=5;
                }
                break;
            case 28:
                {
                alt7=6;
                }
                break;
            case 29:
                {
                alt7=7;
                }
                break;
            case 30:
                {
                alt7=8;
                }
                break;
            case 31:
                {
                alt7=9;
                }
                break;
            case 32:
                {
                alt7=10;
                }
                break;
            case 33:
                {
                alt7=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSiriusTextDsl.g:1047:1: ( ( 'NoDecoration' ) )
                    {
                    // InternalSiriusTextDsl.g:1047:1: ( ( 'NoDecoration' ) )
                    // InternalSiriusTextDsl.g:1048:1: ( 'NoDecoration' )
                    {
                     before(grammarAccess.getArrowDecoratorAccess().getNoDecorationEnumLiteralDeclaration_0()); 
                    // InternalSiriusTextDsl.g:1049:1: ( 'NoDecoration' )
                    // InternalSiriusTextDsl.g:1049:3: 'NoDecoration'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getArrowDecoratorAccess().getNoDecorationEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:1054:6: ( ( 'OutputArrow' ) )
                    {
                    // InternalSiriusTextDsl.g:1054:6: ( ( 'OutputArrow' ) )
                    // InternalSiriusTextDsl.g:1055:1: ( 'OutputArrow' )
                    {
                     before(grammarAccess.getArrowDecoratorAccess().getOutputArrowEnumLiteralDeclaration_1()); 
                    // InternalSiriusTextDsl.g:1056:1: ( 'OutputArrow' )
                    // InternalSiriusTextDsl.g:1056:3: 'OutputArrow'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getArrowDecoratorAccess().getOutputArrowEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:1061:6: ( ( 'InputArrow' ) )
                    {
                    // InternalSiriusTextDsl.g:1061:6: ( ( 'InputArrow' ) )
                    // InternalSiriusTextDsl.g:1062:1: ( 'InputArrow' )
                    {
                     before(grammarAccess.getArrowDecoratorAccess().getInputArrowEnumLiteralDeclaration_2()); 
                    // InternalSiriusTextDsl.g:1063:1: ( 'InputArrow' )
                    // InternalSiriusTextDsl.g:1063:3: 'InputArrow'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getArrowDecoratorAccess().getInputArrowEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSiriusTextDsl.g:1068:6: ( ( 'OutputClosedArrow' ) )
                    {
                    // InternalSiriusTextDsl.g:1068:6: ( ( 'OutputClosedArrow' ) )
                    // InternalSiriusTextDsl.g:1069:1: ( 'OutputClosedArrow' )
                    {
                     before(grammarAccess.getArrowDecoratorAccess().getOutputClosedArrowEnumLiteralDeclaration_3()); 
                    // InternalSiriusTextDsl.g:1070:1: ( 'OutputClosedArrow' )
                    // InternalSiriusTextDsl.g:1070:3: 'OutputClosedArrow'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getArrowDecoratorAccess().getOutputClosedArrowEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSiriusTextDsl.g:1075:6: ( ( 'InputClosedArrow' ) )
                    {
                    // InternalSiriusTextDsl.g:1075:6: ( ( 'InputClosedArrow' ) )
                    // InternalSiriusTextDsl.g:1076:1: ( 'InputClosedArrow' )
                    {
                     before(grammarAccess.getArrowDecoratorAccess().getInputClosedArrowEnumLiteralDeclaration_4()); 
                    // InternalSiriusTextDsl.g:1077:1: ( 'InputClosedArrow' )
                    // InternalSiriusTextDsl.g:1077:3: 'InputClosedArrow'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getArrowDecoratorAccess().getInputClosedArrowEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSiriusTextDsl.g:1082:6: ( ( 'OutputFillClosedArrow' ) )
                    {
                    // InternalSiriusTextDsl.g:1082:6: ( ( 'OutputFillClosedArrow' ) )
                    // InternalSiriusTextDsl.g:1083:1: ( 'OutputFillClosedArrow' )
                    {
                     before(grammarAccess.getArrowDecoratorAccess().getOutputFillClosedArrowEnumLiteralDeclaration_5()); 
                    // InternalSiriusTextDsl.g:1084:1: ( 'OutputFillClosedArrow' )
                    // InternalSiriusTextDsl.g:1084:3: 'OutputFillClosedArrow'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getArrowDecoratorAccess().getOutputFillClosedArrowEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSiriusTextDsl.g:1089:6: ( ( 'InputFillClosedArrow' ) )
                    {
                    // InternalSiriusTextDsl.g:1089:6: ( ( 'InputFillClosedArrow' ) )
                    // InternalSiriusTextDsl.g:1090:1: ( 'InputFillClosedArrow' )
                    {
                     before(grammarAccess.getArrowDecoratorAccess().getInputFillClosedArrowEnumLiteralDeclaration_6()); 
                    // InternalSiriusTextDsl.g:1091:1: ( 'InputFillClosedArrow' )
                    // InternalSiriusTextDsl.g:1091:3: 'InputFillClosedArrow'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getArrowDecoratorAccess().getInputFillClosedArrowEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSiriusTextDsl.g:1096:6: ( ( 'Diamond' ) )
                    {
                    // InternalSiriusTextDsl.g:1096:6: ( ( 'Diamond' ) )
                    // InternalSiriusTextDsl.g:1097:1: ( 'Diamond' )
                    {
                     before(grammarAccess.getArrowDecoratorAccess().getDiamondEnumLiteralDeclaration_7()); 
                    // InternalSiriusTextDsl.g:1098:1: ( 'Diamond' )
                    // InternalSiriusTextDsl.g:1098:3: 'Diamond'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getArrowDecoratorAccess().getDiamondEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSiriusTextDsl.g:1103:6: ( ( 'FillDiamond' ) )
                    {
                    // InternalSiriusTextDsl.g:1103:6: ( ( 'FillDiamond' ) )
                    // InternalSiriusTextDsl.g:1104:1: ( 'FillDiamond' )
                    {
                     before(grammarAccess.getArrowDecoratorAccess().getFillDiamondEnumLiteralDeclaration_8()); 
                    // InternalSiriusTextDsl.g:1105:1: ( 'FillDiamond' )
                    // InternalSiriusTextDsl.g:1105:3: 'FillDiamond'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getArrowDecoratorAccess().getFillDiamondEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSiriusTextDsl.g:1110:6: ( ( 'InputArrowWithDiamond' ) )
                    {
                    // InternalSiriusTextDsl.g:1110:6: ( ( 'InputArrowWithDiamond' ) )
                    // InternalSiriusTextDsl.g:1111:1: ( 'InputArrowWithDiamond' )
                    {
                     before(grammarAccess.getArrowDecoratorAccess().getInputArrowWithDiamondEnumLiteralDeclaration_9()); 
                    // InternalSiriusTextDsl.g:1112:1: ( 'InputArrowWithDiamond' )
                    // InternalSiriusTextDsl.g:1112:3: 'InputArrowWithDiamond'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getArrowDecoratorAccess().getInputArrowWithDiamondEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSiriusTextDsl.g:1117:6: ( ( 'InputArrowWithFillDiamond' ) )
                    {
                    // InternalSiriusTextDsl.g:1117:6: ( ( 'InputArrowWithFillDiamond' ) )
                    // InternalSiriusTextDsl.g:1118:1: ( 'InputArrowWithFillDiamond' )
                    {
                     before(grammarAccess.getArrowDecoratorAccess().getInputArrowWithFillDiamondEnumLiteralDeclaration_10()); 
                    // InternalSiriusTextDsl.g:1119:1: ( 'InputArrowWithFillDiamond' )
                    // InternalSiriusTextDsl.g:1119:3: 'InputArrowWithFillDiamond'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getArrowDecoratorAccess().getInputArrowWithFillDiamondEnumLiteralDeclaration_10()); 

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
    // $ANTLR end "rule__ArrowDecorator__Alternatives"


    // $ANTLR start "rule__FoldingStyle__Alternatives"
    // InternalSiriusTextDsl.g:1129:1: rule__FoldingStyle__Alternatives : ( ( ( 'none' ) ) | ( ( 'source' ) ) | ( ( 'target' ) ) );
    public final void rule__FoldingStyle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1133:1: ( ( ( 'none' ) ) | ( ( 'source' ) ) | ( ( 'target' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt8=1;
                }
                break;
            case 35:
                {
                alt8=2;
                }
                break;
            case 36:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSiriusTextDsl.g:1134:1: ( ( 'none' ) )
                    {
                    // InternalSiriusTextDsl.g:1134:1: ( ( 'none' ) )
                    // InternalSiriusTextDsl.g:1135:1: ( 'none' )
                    {
                     before(grammarAccess.getFoldingStyleAccess().getNoneEnumLiteralDeclaration_0()); 
                    // InternalSiriusTextDsl.g:1136:1: ( 'none' )
                    // InternalSiriusTextDsl.g:1136:3: 'none'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getFoldingStyleAccess().getNoneEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:1141:6: ( ( 'source' ) )
                    {
                    // InternalSiriusTextDsl.g:1141:6: ( ( 'source' ) )
                    // InternalSiriusTextDsl.g:1142:1: ( 'source' )
                    {
                     before(grammarAccess.getFoldingStyleAccess().getSourceEnumLiteralDeclaration_1()); 
                    // InternalSiriusTextDsl.g:1143:1: ( 'source' )
                    // InternalSiriusTextDsl.g:1143:3: 'source'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getFoldingStyleAccess().getSourceEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:1148:6: ( ( 'target' ) )
                    {
                    // InternalSiriusTextDsl.g:1148:6: ( ( 'target' ) )
                    // InternalSiriusTextDsl.g:1149:1: ( 'target' )
                    {
                     before(grammarAccess.getFoldingStyleAccess().getTargetEnumLiteralDeclaration_2()); 
                    // InternalSiriusTextDsl.g:1150:1: ( 'target' )
                    // InternalSiriusTextDsl.g:1150:3: 'target'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getFoldingStyleAccess().getTargetEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__FoldingStyle__Alternatives"


    // $ANTLR start "rule__EndsCentering__Alternatives"
    // InternalSiriusTextDsl.g:1160:1: rule__EndsCentering__Alternatives : ( ( ( 'none' ) ) | ( ( 'both' ) ) | ( ( 'source' ) ) | ( ( 'target' ) ) );
    public final void rule__EndsCentering__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1164:1: ( ( ( 'none' ) ) | ( ( 'both' ) ) | ( ( 'source' ) ) | ( ( 'target' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt9=1;
                }
                break;
            case 37:
                {
                alt9=2;
                }
                break;
            case 35:
                {
                alt9=3;
                }
                break;
            case 36:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSiriusTextDsl.g:1165:1: ( ( 'none' ) )
                    {
                    // InternalSiriusTextDsl.g:1165:1: ( ( 'none' ) )
                    // InternalSiriusTextDsl.g:1166:1: ( 'none' )
                    {
                     before(grammarAccess.getEndsCenteringAccess().getNoneEnumLiteralDeclaration_0()); 
                    // InternalSiriusTextDsl.g:1167:1: ( 'none' )
                    // InternalSiriusTextDsl.g:1167:3: 'none'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndsCenteringAccess().getNoneEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:1172:6: ( ( 'both' ) )
                    {
                    // InternalSiriusTextDsl.g:1172:6: ( ( 'both' ) )
                    // InternalSiriusTextDsl.g:1173:1: ( 'both' )
                    {
                     before(grammarAccess.getEndsCenteringAccess().getBothEnumLiteralDeclaration_1()); 
                    // InternalSiriusTextDsl.g:1174:1: ( 'both' )
                    // InternalSiriusTextDsl.g:1174:3: 'both'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndsCenteringAccess().getBothEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:1179:6: ( ( 'source' ) )
                    {
                    // InternalSiriusTextDsl.g:1179:6: ( ( 'source' ) )
                    // InternalSiriusTextDsl.g:1180:1: ( 'source' )
                    {
                     before(grammarAccess.getEndsCenteringAccess().getSourceEnumLiteralDeclaration_2()); 
                    // InternalSiriusTextDsl.g:1181:1: ( 'source' )
                    // InternalSiriusTextDsl.g:1181:3: 'source'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndsCenteringAccess().getSourceEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSiriusTextDsl.g:1186:6: ( ( 'target' ) )
                    {
                    // InternalSiriusTextDsl.g:1186:6: ( ( 'target' ) )
                    // InternalSiriusTextDsl.g:1187:1: ( 'target' )
                    {
                     before(grammarAccess.getEndsCenteringAccess().getTargetEnumLiteralDeclaration_3()); 
                    // InternalSiriusTextDsl.g:1188:1: ( 'target' )
                    // InternalSiriusTextDsl.g:1188:3: 'target'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndsCenteringAccess().getTargetEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__EndsCentering__Alternatives"


    // $ANTLR start "rule__SiriusFile__Group__0"
    // InternalSiriusTextDsl.g:1200:1: rule__SiriusFile__Group__0 : rule__SiriusFile__Group__0__Impl rule__SiriusFile__Group__1 ;
    public final void rule__SiriusFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1204:1: ( rule__SiriusFile__Group__0__Impl rule__SiriusFile__Group__1 )
            // InternalSiriusTextDsl.g:1205:2: rule__SiriusFile__Group__0__Impl rule__SiriusFile__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SiriusFile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusFile__Group__1();

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
    // $ANTLR end "rule__SiriusFile__Group__0"


    // $ANTLR start "rule__SiriusFile__Group__0__Impl"
    // InternalSiriusTextDsl.g:1212:1: rule__SiriusFile__Group__0__Impl : ( ( rule__SiriusFile__DocumentationAssignment_0 )? ) ;
    public final void rule__SiriusFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1216:1: ( ( ( rule__SiriusFile__DocumentationAssignment_0 )? ) )
            // InternalSiriusTextDsl.g:1217:1: ( ( rule__SiriusFile__DocumentationAssignment_0 )? )
            {
            // InternalSiriusTextDsl.g:1217:1: ( ( rule__SiriusFile__DocumentationAssignment_0 )? )
            // InternalSiriusTextDsl.g:1218:1: ( rule__SiriusFile__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getSiriusFileAccess().getDocumentationAssignment_0()); 
            // InternalSiriusTextDsl.g:1219:1: ( rule__SiriusFile__DocumentationAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_DOCUMENTATION) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSiriusTextDsl.g:1219:2: rule__SiriusFile__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SiriusFile__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSiriusFileAccess().getDocumentationAssignment_0()); 

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
    // $ANTLR end "rule__SiriusFile__Group__0__Impl"


    // $ANTLR start "rule__SiriusFile__Group__1"
    // InternalSiriusTextDsl.g:1229:1: rule__SiriusFile__Group__1 : rule__SiriusFile__Group__1__Impl rule__SiriusFile__Group__2 ;
    public final void rule__SiriusFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1233:1: ( rule__SiriusFile__Group__1__Impl rule__SiriusFile__Group__2 )
            // InternalSiriusTextDsl.g:1234:2: rule__SiriusFile__Group__1__Impl rule__SiriusFile__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SiriusFile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusFile__Group__2();

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
    // $ANTLR end "rule__SiriusFile__Group__1"


    // $ANTLR start "rule__SiriusFile__Group__1__Impl"
    // InternalSiriusTextDsl.g:1241:1: rule__SiriusFile__Group__1__Impl : ( 'package' ) ;
    public final void rule__SiriusFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1245:1: ( ( 'package' ) )
            // InternalSiriusTextDsl.g:1246:1: ( 'package' )
            {
            // InternalSiriusTextDsl.g:1246:1: ( 'package' )
            // InternalSiriusTextDsl.g:1247:1: 'package'
            {
             before(grammarAccess.getSiriusFileAccess().getPackageKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSiriusFileAccess().getPackageKeyword_1()); 

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
    // $ANTLR end "rule__SiriusFile__Group__1__Impl"


    // $ANTLR start "rule__SiriusFile__Group__2"
    // InternalSiriusTextDsl.g:1260:1: rule__SiriusFile__Group__2 : rule__SiriusFile__Group__2__Impl rule__SiriusFile__Group__3 ;
    public final void rule__SiriusFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1264:1: ( rule__SiriusFile__Group__2__Impl rule__SiriusFile__Group__3 )
            // InternalSiriusTextDsl.g:1265:2: rule__SiriusFile__Group__2__Impl rule__SiriusFile__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SiriusFile__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusFile__Group__3();

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
    // $ANTLR end "rule__SiriusFile__Group__2"


    // $ANTLR start "rule__SiriusFile__Group__2__Impl"
    // InternalSiriusTextDsl.g:1272:1: rule__SiriusFile__Group__2__Impl : ( ( rule__SiriusFile__NameAssignment_2 ) ) ;
    public final void rule__SiriusFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1276:1: ( ( ( rule__SiriusFile__NameAssignment_2 ) ) )
            // InternalSiriusTextDsl.g:1277:1: ( ( rule__SiriusFile__NameAssignment_2 ) )
            {
            // InternalSiriusTextDsl.g:1277:1: ( ( rule__SiriusFile__NameAssignment_2 ) )
            // InternalSiriusTextDsl.g:1278:1: ( rule__SiriusFile__NameAssignment_2 )
            {
             before(grammarAccess.getSiriusFileAccess().getNameAssignment_2()); 
            // InternalSiriusTextDsl.g:1279:1: ( rule__SiriusFile__NameAssignment_2 )
            // InternalSiriusTextDsl.g:1279:2: rule__SiriusFile__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SiriusFile__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSiriusFileAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__SiriusFile__Group__2__Impl"


    // $ANTLR start "rule__SiriusFile__Group__3"
    // InternalSiriusTextDsl.g:1289:1: rule__SiriusFile__Group__3 : rule__SiriusFile__Group__3__Impl rule__SiriusFile__Group__4 ;
    public final void rule__SiriusFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1293:1: ( rule__SiriusFile__Group__3__Impl rule__SiriusFile__Group__4 )
            // InternalSiriusTextDsl.g:1294:2: rule__SiriusFile__Group__3__Impl rule__SiriusFile__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__SiriusFile__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusFile__Group__4();

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
    // $ANTLR end "rule__SiriusFile__Group__3"


    // $ANTLR start "rule__SiriusFile__Group__3__Impl"
    // InternalSiriusTextDsl.g:1301:1: rule__SiriusFile__Group__3__Impl : ( ( rule__SiriusFile__ImportsAssignment_3 )* ) ;
    public final void rule__SiriusFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1305:1: ( ( ( rule__SiriusFile__ImportsAssignment_3 )* ) )
            // InternalSiriusTextDsl.g:1306:1: ( ( rule__SiriusFile__ImportsAssignment_3 )* )
            {
            // InternalSiriusTextDsl.g:1306:1: ( ( rule__SiriusFile__ImportsAssignment_3 )* )
            // InternalSiriusTextDsl.g:1307:1: ( rule__SiriusFile__ImportsAssignment_3 )*
            {
             before(grammarAccess.getSiriusFileAccess().getImportsAssignment_3()); 
            // InternalSiriusTextDsl.g:1308:1: ( rule__SiriusFile__ImportsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==41) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:1308:2: rule__SiriusFile__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__SiriusFile__ImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSiriusFileAccess().getImportsAssignment_3()); 

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
    // $ANTLR end "rule__SiriusFile__Group__3__Impl"


    // $ANTLR start "rule__SiriusFile__Group__4"
    // InternalSiriusTextDsl.g:1318:1: rule__SiriusFile__Group__4 : rule__SiriusFile__Group__4__Impl ;
    public final void rule__SiriusFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1322:1: ( rule__SiriusFile__Group__4__Impl )
            // InternalSiriusTextDsl.g:1323:2: rule__SiriusFile__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SiriusFile__Group__4__Impl();

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
    // $ANTLR end "rule__SiriusFile__Group__4"


    // $ANTLR start "rule__SiriusFile__Group__4__Impl"
    // InternalSiriusTextDsl.g:1329:1: rule__SiriusFile__Group__4__Impl : ( ( rule__SiriusFile__BodyAssignment_4 ) ) ;
    public final void rule__SiriusFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1333:1: ( ( ( rule__SiriusFile__BodyAssignment_4 ) ) )
            // InternalSiriusTextDsl.g:1334:1: ( ( rule__SiriusFile__BodyAssignment_4 ) )
            {
            // InternalSiriusTextDsl.g:1334:1: ( ( rule__SiriusFile__BodyAssignment_4 ) )
            // InternalSiriusTextDsl.g:1335:1: ( rule__SiriusFile__BodyAssignment_4 )
            {
             before(grammarAccess.getSiriusFileAccess().getBodyAssignment_4()); 
            // InternalSiriusTextDsl.g:1336:1: ( rule__SiriusFile__BodyAssignment_4 )
            // InternalSiriusTextDsl.g:1336:2: rule__SiriusFile__BodyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SiriusFile__BodyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSiriusFileAccess().getBodyAssignment_4()); 

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
    // $ANTLR end "rule__SiriusFile__Group__4__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalSiriusTextDsl.g:1356:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1360:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalSiriusTextDsl.g:1361:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalSiriusTextDsl.g:1368:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1372:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:1373:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:1373:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:1374:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalSiriusTextDsl.g:1385:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1389:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalSiriusTextDsl.g:1390:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalSiriusTextDsl.g:1396:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1400:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalSiriusTextDsl.g:1401:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalSiriusTextDsl.g:1401:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalSiriusTextDsl.g:1402:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalSiriusTextDsl.g:1403:1: ( rule__QualifiedName__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==39) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:1403:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalSiriusTextDsl.g:1417:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1421:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalSiriusTextDsl.g:1422:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalSiriusTextDsl.g:1429:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1433:1: ( ( '.' ) )
            // InternalSiriusTextDsl.g:1434:1: ( '.' )
            {
            // InternalSiriusTextDsl.g:1434:1: ( '.' )
            // InternalSiriusTextDsl.g:1435:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalSiriusTextDsl.g:1448:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1452:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalSiriusTextDsl.g:1453:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalSiriusTextDsl.g:1459:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1463:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:1464:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:1464:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:1465:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalSiriusTextDsl.g:1480:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1484:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalSiriusTextDsl.g:1485:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalSiriusTextDsl.g:1492:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1496:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:1497:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:1497:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:1498:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalSiriusTextDsl.g:1509:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1513:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalSiriusTextDsl.g:1514:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalSiriusTextDsl.g:1520:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1524:1: ( ( ( '.*' )? ) )
            // InternalSiriusTextDsl.g:1525:1: ( ( '.*' )? )
            {
            // InternalSiriusTextDsl.g:1525:1: ( ( '.*' )? )
            // InternalSiriusTextDsl.g:1526:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalSiriusTextDsl.g:1527:1: ( '.*' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==40) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSiriusTextDsl.g:1528:2: '.*'
                    {
                    match(input,40,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalSiriusTextDsl.g:1543:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1547:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalSiriusTextDsl.g:1548:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalSiriusTextDsl.g:1555:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1559:1: ( ( 'import' ) )
            // InternalSiriusTextDsl.g:1560:1: ( 'import' )
            {
            // InternalSiriusTextDsl.g:1560:1: ( 'import' )
            // InternalSiriusTextDsl.g:1561:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalSiriusTextDsl.g:1574:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1578:1: ( rule__Import__Group__1__Impl )
            // InternalSiriusTextDsl.g:1579:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalSiriusTextDsl.g:1585:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1589:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalSiriusTextDsl.g:1590:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalSiriusTextDsl.g:1590:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalSiriusTextDsl.g:1591:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalSiriusTextDsl.g:1592:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalSiriusTextDsl.g:1592:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Designer__Group__0"
    // InternalSiriusTextDsl.g:1606:1: rule__Designer__Group__0 : rule__Designer__Group__0__Impl rule__Designer__Group__1 ;
    public final void rule__Designer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1610:1: ( rule__Designer__Group__0__Impl rule__Designer__Group__1 )
            // InternalSiriusTextDsl.g:1611:2: rule__Designer__Group__0__Impl rule__Designer__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Designer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Designer__Group__1();

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
    // $ANTLR end "rule__Designer__Group__0"


    // $ANTLR start "rule__Designer__Group__0__Impl"
    // InternalSiriusTextDsl.g:1618:1: rule__Designer__Group__0__Impl : ( ( rule__Designer__DocumentationAssignment_0 )? ) ;
    public final void rule__Designer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1622:1: ( ( ( rule__Designer__DocumentationAssignment_0 )? ) )
            // InternalSiriusTextDsl.g:1623:1: ( ( rule__Designer__DocumentationAssignment_0 )? )
            {
            // InternalSiriusTextDsl.g:1623:1: ( ( rule__Designer__DocumentationAssignment_0 )? )
            // InternalSiriusTextDsl.g:1624:1: ( rule__Designer__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getDesignerAccess().getDocumentationAssignment_0()); 
            // InternalSiriusTextDsl.g:1625:1: ( rule__Designer__DocumentationAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_DOCUMENTATION) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSiriusTextDsl.g:1625:2: rule__Designer__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Designer__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDesignerAccess().getDocumentationAssignment_0()); 

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
    // $ANTLR end "rule__Designer__Group__0__Impl"


    // $ANTLR start "rule__Designer__Group__1"
    // InternalSiriusTextDsl.g:1635:1: rule__Designer__Group__1 : rule__Designer__Group__1__Impl rule__Designer__Group__2 ;
    public final void rule__Designer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1639:1: ( rule__Designer__Group__1__Impl rule__Designer__Group__2 )
            // InternalSiriusTextDsl.g:1640:2: rule__Designer__Group__1__Impl rule__Designer__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Designer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Designer__Group__2();

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
    // $ANTLR end "rule__Designer__Group__1"


    // $ANTLR start "rule__Designer__Group__1__Impl"
    // InternalSiriusTextDsl.g:1647:1: rule__Designer__Group__1__Impl : ( 'designer' ) ;
    public final void rule__Designer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1651:1: ( ( 'designer' ) )
            // InternalSiriusTextDsl.g:1652:1: ( 'designer' )
            {
            // InternalSiriusTextDsl.g:1652:1: ( 'designer' )
            // InternalSiriusTextDsl.g:1653:1: 'designer'
            {
             before(grammarAccess.getDesignerAccess().getDesignerKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDesignerAccess().getDesignerKeyword_1()); 

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
    // $ANTLR end "rule__Designer__Group__1__Impl"


    // $ANTLR start "rule__Designer__Group__2"
    // InternalSiriusTextDsl.g:1666:1: rule__Designer__Group__2 : rule__Designer__Group__2__Impl rule__Designer__Group__3 ;
    public final void rule__Designer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1670:1: ( rule__Designer__Group__2__Impl rule__Designer__Group__3 )
            // InternalSiriusTextDsl.g:1671:2: rule__Designer__Group__2__Impl rule__Designer__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Designer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Designer__Group__3();

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
    // $ANTLR end "rule__Designer__Group__2"


    // $ANTLR start "rule__Designer__Group__2__Impl"
    // InternalSiriusTextDsl.g:1678:1: rule__Designer__Group__2__Impl : ( ( rule__Designer__NameAssignment_2 ) ) ;
    public final void rule__Designer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1682:1: ( ( ( rule__Designer__NameAssignment_2 ) ) )
            // InternalSiriusTextDsl.g:1683:1: ( ( rule__Designer__NameAssignment_2 ) )
            {
            // InternalSiriusTextDsl.g:1683:1: ( ( rule__Designer__NameAssignment_2 ) )
            // InternalSiriusTextDsl.g:1684:1: ( rule__Designer__NameAssignment_2 )
            {
             before(grammarAccess.getDesignerAccess().getNameAssignment_2()); 
            // InternalSiriusTextDsl.g:1685:1: ( rule__Designer__NameAssignment_2 )
            // InternalSiriusTextDsl.g:1685:2: rule__Designer__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Designer__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDesignerAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Designer__Group__2__Impl"


    // $ANTLR start "rule__Designer__Group__3"
    // InternalSiriusTextDsl.g:1695:1: rule__Designer__Group__3 : rule__Designer__Group__3__Impl rule__Designer__Group__4 ;
    public final void rule__Designer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1699:1: ( rule__Designer__Group__3__Impl rule__Designer__Group__4 )
            // InternalSiriusTextDsl.g:1700:2: rule__Designer__Group__3__Impl rule__Designer__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Designer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Designer__Group__4();

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
    // $ANTLR end "rule__Designer__Group__3"


    // $ANTLR start "rule__Designer__Group__3__Impl"
    // InternalSiriusTextDsl.g:1707:1: rule__Designer__Group__3__Impl : ( ( rule__Designer__Group_3__0 )? ) ;
    public final void rule__Designer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1711:1: ( ( ( rule__Designer__Group_3__0 )? ) )
            // InternalSiriusTextDsl.g:1712:1: ( ( rule__Designer__Group_3__0 )? )
            {
            // InternalSiriusTextDsl.g:1712:1: ( ( rule__Designer__Group_3__0 )? )
            // InternalSiriusTextDsl.g:1713:1: ( rule__Designer__Group_3__0 )?
            {
             before(grammarAccess.getDesignerAccess().getGroup_3()); 
            // InternalSiriusTextDsl.g:1714:1: ( rule__Designer__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==45) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSiriusTextDsl.g:1714:2: rule__Designer__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Designer__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDesignerAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Designer__Group__3__Impl"


    // $ANTLR start "rule__Designer__Group__4"
    // InternalSiriusTextDsl.g:1724:1: rule__Designer__Group__4 : rule__Designer__Group__4__Impl rule__Designer__Group__5 ;
    public final void rule__Designer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1728:1: ( rule__Designer__Group__4__Impl rule__Designer__Group__5 )
            // InternalSiriusTextDsl.g:1729:2: rule__Designer__Group__4__Impl rule__Designer__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Designer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Designer__Group__5();

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
    // $ANTLR end "rule__Designer__Group__4"


    // $ANTLR start "rule__Designer__Group__4__Impl"
    // InternalSiriusTextDsl.g:1736:1: rule__Designer__Group__4__Impl : ( '{' ) ;
    public final void rule__Designer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1740:1: ( ( '{' ) )
            // InternalSiriusTextDsl.g:1741:1: ( '{' )
            {
            // InternalSiriusTextDsl.g:1741:1: ( '{' )
            // InternalSiriusTextDsl.g:1742:1: '{'
            {
             before(grammarAccess.getDesignerAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getDesignerAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Designer__Group__4__Impl"


    // $ANTLR start "rule__Designer__Group__5"
    // InternalSiriusTextDsl.g:1755:1: rule__Designer__Group__5 : rule__Designer__Group__5__Impl rule__Designer__Group__6 ;
    public final void rule__Designer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1759:1: ( rule__Designer__Group__5__Impl rule__Designer__Group__6 )
            // InternalSiriusTextDsl.g:1760:2: rule__Designer__Group__5__Impl rule__Designer__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Designer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Designer__Group__6();

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
    // $ANTLR end "rule__Designer__Group__5"


    // $ANTLR start "rule__Designer__Group__5__Impl"
    // InternalSiriusTextDsl.g:1767:1: rule__Designer__Group__5__Impl : ( ( rule__Designer__ViewpointsAssignment_5 )* ) ;
    public final void rule__Designer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1771:1: ( ( ( rule__Designer__ViewpointsAssignment_5 )* ) )
            // InternalSiriusTextDsl.g:1772:1: ( ( rule__Designer__ViewpointsAssignment_5 )* )
            {
            // InternalSiriusTextDsl.g:1772:1: ( ( rule__Designer__ViewpointsAssignment_5 )* )
            // InternalSiriusTextDsl.g:1773:1: ( rule__Designer__ViewpointsAssignment_5 )*
            {
             before(grammarAccess.getDesignerAccess().getViewpointsAssignment_5()); 
            // InternalSiriusTextDsl.g:1774:1: ( rule__Designer__ViewpointsAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_DOCUMENTATION||LA16_0==46) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:1774:2: rule__Designer__ViewpointsAssignment_5
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Designer__ViewpointsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getDesignerAccess().getViewpointsAssignment_5()); 

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
    // $ANTLR end "rule__Designer__Group__5__Impl"


    // $ANTLR start "rule__Designer__Group__6"
    // InternalSiriusTextDsl.g:1784:1: rule__Designer__Group__6 : rule__Designer__Group__6__Impl ;
    public final void rule__Designer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1788:1: ( rule__Designer__Group__6__Impl )
            // InternalSiriusTextDsl.g:1789:2: rule__Designer__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Designer__Group__6__Impl();

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
    // $ANTLR end "rule__Designer__Group__6"


    // $ANTLR start "rule__Designer__Group__6__Impl"
    // InternalSiriusTextDsl.g:1795:1: rule__Designer__Group__6__Impl : ( '}' ) ;
    public final void rule__Designer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1799:1: ( ( '}' ) )
            // InternalSiriusTextDsl.g:1800:1: ( '}' )
            {
            // InternalSiriusTextDsl.g:1800:1: ( '}' )
            // InternalSiriusTextDsl.g:1801:1: '}'
            {
             before(grammarAccess.getDesignerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getDesignerAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Designer__Group__6__Impl"


    // $ANTLR start "rule__Designer__Group_3__0"
    // InternalSiriusTextDsl.g:1828:1: rule__Designer__Group_3__0 : rule__Designer__Group_3__0__Impl rule__Designer__Group_3__1 ;
    public final void rule__Designer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1832:1: ( rule__Designer__Group_3__0__Impl rule__Designer__Group_3__1 )
            // InternalSiriusTextDsl.g:1833:2: rule__Designer__Group_3__0__Impl rule__Designer__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Designer__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Designer__Group_3__1();

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
    // $ANTLR end "rule__Designer__Group_3__0"


    // $ANTLR start "rule__Designer__Group_3__0__Impl"
    // InternalSiriusTextDsl.g:1840:1: rule__Designer__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__Designer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1844:1: ( ( 'as' ) )
            // InternalSiriusTextDsl.g:1845:1: ( 'as' )
            {
            // InternalSiriusTextDsl.g:1845:1: ( 'as' )
            // InternalSiriusTextDsl.g:1846:1: 'as'
            {
             before(grammarAccess.getDesignerAccess().getAsKeyword_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getDesignerAccess().getAsKeyword_3_0()); 

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
    // $ANTLR end "rule__Designer__Group_3__0__Impl"


    // $ANTLR start "rule__Designer__Group_3__1"
    // InternalSiriusTextDsl.g:1859:1: rule__Designer__Group_3__1 : rule__Designer__Group_3__1__Impl ;
    public final void rule__Designer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1863:1: ( rule__Designer__Group_3__1__Impl )
            // InternalSiriusTextDsl.g:1864:2: rule__Designer__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Designer__Group_3__1__Impl();

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
    // $ANTLR end "rule__Designer__Group_3__1"


    // $ANTLR start "rule__Designer__Group_3__1__Impl"
    // InternalSiriusTextDsl.g:1870:1: rule__Designer__Group_3__1__Impl : ( ( rule__Designer__LabelAssignment_3_1 ) ) ;
    public final void rule__Designer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1874:1: ( ( ( rule__Designer__LabelAssignment_3_1 ) ) )
            // InternalSiriusTextDsl.g:1875:1: ( ( rule__Designer__LabelAssignment_3_1 ) )
            {
            // InternalSiriusTextDsl.g:1875:1: ( ( rule__Designer__LabelAssignment_3_1 ) )
            // InternalSiriusTextDsl.g:1876:1: ( rule__Designer__LabelAssignment_3_1 )
            {
             before(grammarAccess.getDesignerAccess().getLabelAssignment_3_1()); 
            // InternalSiriusTextDsl.g:1877:1: ( rule__Designer__LabelAssignment_3_1 )
            // InternalSiriusTextDsl.g:1877:2: rule__Designer__LabelAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Designer__LabelAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDesignerAccess().getLabelAssignment_3_1()); 

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
    // $ANTLR end "rule__Designer__Group_3__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group__0"
    // InternalSiriusTextDsl.g:1891:1: rule__Viewpoint__Group__0 : rule__Viewpoint__Group__0__Impl rule__Viewpoint__Group__1 ;
    public final void rule__Viewpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1895:1: ( rule__Viewpoint__Group__0__Impl rule__Viewpoint__Group__1 )
            // InternalSiriusTextDsl.g:1896:2: rule__Viewpoint__Group__0__Impl rule__Viewpoint__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Viewpoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group__1();

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
    // $ANTLR end "rule__Viewpoint__Group__0"


    // $ANTLR start "rule__Viewpoint__Group__0__Impl"
    // InternalSiriusTextDsl.g:1903:1: rule__Viewpoint__Group__0__Impl : ( ( rule__Viewpoint__DocumentationAssignment_0 )? ) ;
    public final void rule__Viewpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1907:1: ( ( ( rule__Viewpoint__DocumentationAssignment_0 )? ) )
            // InternalSiriusTextDsl.g:1908:1: ( ( rule__Viewpoint__DocumentationAssignment_0 )? )
            {
            // InternalSiriusTextDsl.g:1908:1: ( ( rule__Viewpoint__DocumentationAssignment_0 )? )
            // InternalSiriusTextDsl.g:1909:1: ( rule__Viewpoint__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getViewpointAccess().getDocumentationAssignment_0()); 
            // InternalSiriusTextDsl.g:1910:1: ( rule__Viewpoint__DocumentationAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_DOCUMENTATION) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSiriusTextDsl.g:1910:2: rule__Viewpoint__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Viewpoint__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewpointAccess().getDocumentationAssignment_0()); 

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
    // $ANTLR end "rule__Viewpoint__Group__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group__1"
    // InternalSiriusTextDsl.g:1920:1: rule__Viewpoint__Group__1 : rule__Viewpoint__Group__1__Impl rule__Viewpoint__Group__2 ;
    public final void rule__Viewpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1924:1: ( rule__Viewpoint__Group__1__Impl rule__Viewpoint__Group__2 )
            // InternalSiriusTextDsl.g:1925:2: rule__Viewpoint__Group__1__Impl rule__Viewpoint__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Viewpoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group__2();

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
    // $ANTLR end "rule__Viewpoint__Group__1"


    // $ANTLR start "rule__Viewpoint__Group__1__Impl"
    // InternalSiriusTextDsl.g:1932:1: rule__Viewpoint__Group__1__Impl : ( 'viewpoint' ) ;
    public final void rule__Viewpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1936:1: ( ( 'viewpoint' ) )
            // InternalSiriusTextDsl.g:1937:1: ( 'viewpoint' )
            {
            // InternalSiriusTextDsl.g:1937:1: ( 'viewpoint' )
            // InternalSiriusTextDsl.g:1938:1: 'viewpoint'
            {
             before(grammarAccess.getViewpointAccess().getViewpointKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getViewpointKeyword_1()); 

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
    // $ANTLR end "rule__Viewpoint__Group__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group__2"
    // InternalSiriusTextDsl.g:1951:1: rule__Viewpoint__Group__2 : rule__Viewpoint__Group__2__Impl rule__Viewpoint__Group__3 ;
    public final void rule__Viewpoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1955:1: ( rule__Viewpoint__Group__2__Impl rule__Viewpoint__Group__3 )
            // InternalSiriusTextDsl.g:1956:2: rule__Viewpoint__Group__2__Impl rule__Viewpoint__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Viewpoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group__3();

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
    // $ANTLR end "rule__Viewpoint__Group__2"


    // $ANTLR start "rule__Viewpoint__Group__2__Impl"
    // InternalSiriusTextDsl.g:1963:1: rule__Viewpoint__Group__2__Impl : ( ( rule__Viewpoint__NameAssignment_2 ) ) ;
    public final void rule__Viewpoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1967:1: ( ( ( rule__Viewpoint__NameAssignment_2 ) ) )
            // InternalSiriusTextDsl.g:1968:1: ( ( rule__Viewpoint__NameAssignment_2 ) )
            {
            // InternalSiriusTextDsl.g:1968:1: ( ( rule__Viewpoint__NameAssignment_2 ) )
            // InternalSiriusTextDsl.g:1969:1: ( rule__Viewpoint__NameAssignment_2 )
            {
             before(grammarAccess.getViewpointAccess().getNameAssignment_2()); 
            // InternalSiriusTextDsl.g:1970:1: ( rule__Viewpoint__NameAssignment_2 )
            // InternalSiriusTextDsl.g:1970:2: rule__Viewpoint__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getViewpointAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Viewpoint__Group__2__Impl"


    // $ANTLR start "rule__Viewpoint__Group__3"
    // InternalSiriusTextDsl.g:1980:1: rule__Viewpoint__Group__3 : rule__Viewpoint__Group__3__Impl rule__Viewpoint__Group__4 ;
    public final void rule__Viewpoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1984:1: ( rule__Viewpoint__Group__3__Impl rule__Viewpoint__Group__4 )
            // InternalSiriusTextDsl.g:1985:2: rule__Viewpoint__Group__3__Impl rule__Viewpoint__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Viewpoint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group__4();

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
    // $ANTLR end "rule__Viewpoint__Group__3"


    // $ANTLR start "rule__Viewpoint__Group__3__Impl"
    // InternalSiriusTextDsl.g:1992:1: rule__Viewpoint__Group__3__Impl : ( ( rule__Viewpoint__Group_3__0 )? ) ;
    public final void rule__Viewpoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1996:1: ( ( ( rule__Viewpoint__Group_3__0 )? ) )
            // InternalSiriusTextDsl.g:1997:1: ( ( rule__Viewpoint__Group_3__0 )? )
            {
            // InternalSiriusTextDsl.g:1997:1: ( ( rule__Viewpoint__Group_3__0 )? )
            // InternalSiriusTextDsl.g:1998:1: ( rule__Viewpoint__Group_3__0 )?
            {
             before(grammarAccess.getViewpointAccess().getGroup_3()); 
            // InternalSiriusTextDsl.g:1999:1: ( rule__Viewpoint__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==45) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSiriusTextDsl.g:1999:2: rule__Viewpoint__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Viewpoint__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewpointAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Viewpoint__Group__3__Impl"


    // $ANTLR start "rule__Viewpoint__Group__4"
    // InternalSiriusTextDsl.g:2009:1: rule__Viewpoint__Group__4 : rule__Viewpoint__Group__4__Impl rule__Viewpoint__Group__5 ;
    public final void rule__Viewpoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2013:1: ( rule__Viewpoint__Group__4__Impl rule__Viewpoint__Group__5 )
            // InternalSiriusTextDsl.g:2014:2: rule__Viewpoint__Group__4__Impl rule__Viewpoint__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Viewpoint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group__5();

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
    // $ANTLR end "rule__Viewpoint__Group__4"


    // $ANTLR start "rule__Viewpoint__Group__4__Impl"
    // InternalSiriusTextDsl.g:2021:1: rule__Viewpoint__Group__4__Impl : ( '{' ) ;
    public final void rule__Viewpoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2025:1: ( ( '{' ) )
            // InternalSiriusTextDsl.g:2026:1: ( '{' )
            {
            // InternalSiriusTextDsl.g:2026:1: ( '{' )
            // InternalSiriusTextDsl.g:2027:1: '{'
            {
             before(grammarAccess.getViewpointAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Viewpoint__Group__4__Impl"


    // $ANTLR start "rule__Viewpoint__Group__5"
    // InternalSiriusTextDsl.g:2040:1: rule__Viewpoint__Group__5 : rule__Viewpoint__Group__5__Impl rule__Viewpoint__Group__6 ;
    public final void rule__Viewpoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2044:1: ( rule__Viewpoint__Group__5__Impl rule__Viewpoint__Group__6 )
            // InternalSiriusTextDsl.g:2045:2: rule__Viewpoint__Group__5__Impl rule__Viewpoint__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Viewpoint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group__6();

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
    // $ANTLR end "rule__Viewpoint__Group__5"


    // $ANTLR start "rule__Viewpoint__Group__5__Impl"
    // InternalSiriusTextDsl.g:2052:1: rule__Viewpoint__Group__5__Impl : ( ( rule__Viewpoint__Group_5__0 )? ) ;
    public final void rule__Viewpoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2056:1: ( ( ( rule__Viewpoint__Group_5__0 )? ) )
            // InternalSiriusTextDsl.g:2057:1: ( ( rule__Viewpoint__Group_5__0 )? )
            {
            // InternalSiriusTextDsl.g:2057:1: ( ( rule__Viewpoint__Group_5__0 )? )
            // InternalSiriusTextDsl.g:2058:1: ( rule__Viewpoint__Group_5__0 )?
            {
             before(grammarAccess.getViewpointAccess().getGroup_5()); 
            // InternalSiriusTextDsl.g:2059:1: ( rule__Viewpoint__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==47) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSiriusTextDsl.g:2059:2: rule__Viewpoint__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Viewpoint__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewpointAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Viewpoint__Group__5__Impl"


    // $ANTLR start "rule__Viewpoint__Group__6"
    // InternalSiriusTextDsl.g:2069:1: rule__Viewpoint__Group__6 : rule__Viewpoint__Group__6__Impl rule__Viewpoint__Group__7 ;
    public final void rule__Viewpoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2073:1: ( rule__Viewpoint__Group__6__Impl rule__Viewpoint__Group__7 )
            // InternalSiriusTextDsl.g:2074:2: rule__Viewpoint__Group__6__Impl rule__Viewpoint__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Viewpoint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group__7();

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
    // $ANTLR end "rule__Viewpoint__Group__6"


    // $ANTLR start "rule__Viewpoint__Group__6__Impl"
    // InternalSiriusTextDsl.g:2081:1: rule__Viewpoint__Group__6__Impl : ( ( rule__Viewpoint__Group_6__0 )? ) ;
    public final void rule__Viewpoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2085:1: ( ( ( rule__Viewpoint__Group_6__0 )? ) )
            // InternalSiriusTextDsl.g:2086:1: ( ( rule__Viewpoint__Group_6__0 )? )
            {
            // InternalSiriusTextDsl.g:2086:1: ( ( rule__Viewpoint__Group_6__0 )? )
            // InternalSiriusTextDsl.g:2087:1: ( rule__Viewpoint__Group_6__0 )?
            {
             before(grammarAccess.getViewpointAccess().getGroup_6()); 
            // InternalSiriusTextDsl.g:2088:1: ( rule__Viewpoint__Group_6__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==52) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSiriusTextDsl.g:2088:2: rule__Viewpoint__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Viewpoint__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewpointAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Viewpoint__Group__6__Impl"


    // $ANTLR start "rule__Viewpoint__Group__7"
    // InternalSiriusTextDsl.g:2098:1: rule__Viewpoint__Group__7 : rule__Viewpoint__Group__7__Impl rule__Viewpoint__Group__8 ;
    public final void rule__Viewpoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2102:1: ( rule__Viewpoint__Group__7__Impl rule__Viewpoint__Group__8 )
            // InternalSiriusTextDsl.g:2103:2: rule__Viewpoint__Group__7__Impl rule__Viewpoint__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Viewpoint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group__8();

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
    // $ANTLR end "rule__Viewpoint__Group__7"


    // $ANTLR start "rule__Viewpoint__Group__7__Impl"
    // InternalSiriusTextDsl.g:2110:1: rule__Viewpoint__Group__7__Impl : ( ( rule__Viewpoint__Group_7__0 )? ) ;
    public final void rule__Viewpoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2114:1: ( ( ( rule__Viewpoint__Group_7__0 )? ) )
            // InternalSiriusTextDsl.g:2115:1: ( ( rule__Viewpoint__Group_7__0 )? )
            {
            // InternalSiriusTextDsl.g:2115:1: ( ( rule__Viewpoint__Group_7__0 )? )
            // InternalSiriusTextDsl.g:2116:1: ( rule__Viewpoint__Group_7__0 )?
            {
             before(grammarAccess.getViewpointAccess().getGroup_7()); 
            // InternalSiriusTextDsl.g:2117:1: ( rule__Viewpoint__Group_7__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==53) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSiriusTextDsl.g:2117:2: rule__Viewpoint__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Viewpoint__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewpointAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Viewpoint__Group__7__Impl"


    // $ANTLR start "rule__Viewpoint__Group__8"
    // InternalSiriusTextDsl.g:2127:1: rule__Viewpoint__Group__8 : rule__Viewpoint__Group__8__Impl ;
    public final void rule__Viewpoint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2131:1: ( rule__Viewpoint__Group__8__Impl )
            // InternalSiriusTextDsl.g:2132:2: rule__Viewpoint__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group__8__Impl();

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
    // $ANTLR end "rule__Viewpoint__Group__8"


    // $ANTLR start "rule__Viewpoint__Group__8__Impl"
    // InternalSiriusTextDsl.g:2138:1: rule__Viewpoint__Group__8__Impl : ( '}' ) ;
    public final void rule__Viewpoint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2142:1: ( ( '}' ) )
            // InternalSiriusTextDsl.g:2143:1: ( '}' )
            {
            // InternalSiriusTextDsl.g:2143:1: ( '}' )
            // InternalSiriusTextDsl.g:2144:1: '}'
            {
             before(grammarAccess.getViewpointAccess().getRightCurlyBracketKeyword_8()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Viewpoint__Group__8__Impl"


    // $ANTLR start "rule__Viewpoint__Group_3__0"
    // InternalSiriusTextDsl.g:2175:1: rule__Viewpoint__Group_3__0 : rule__Viewpoint__Group_3__0__Impl rule__Viewpoint__Group_3__1 ;
    public final void rule__Viewpoint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2179:1: ( rule__Viewpoint__Group_3__0__Impl rule__Viewpoint__Group_3__1 )
            // InternalSiriusTextDsl.g:2180:2: rule__Viewpoint__Group_3__0__Impl rule__Viewpoint__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Viewpoint__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_3__1();

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
    // $ANTLR end "rule__Viewpoint__Group_3__0"


    // $ANTLR start "rule__Viewpoint__Group_3__0__Impl"
    // InternalSiriusTextDsl.g:2187:1: rule__Viewpoint__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__Viewpoint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2191:1: ( ( 'as' ) )
            // InternalSiriusTextDsl.g:2192:1: ( 'as' )
            {
            // InternalSiriusTextDsl.g:2192:1: ( 'as' )
            // InternalSiriusTextDsl.g:2193:1: 'as'
            {
             before(grammarAccess.getViewpointAccess().getAsKeyword_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getAsKeyword_3_0()); 

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
    // $ANTLR end "rule__Viewpoint__Group_3__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_3__1"
    // InternalSiriusTextDsl.g:2206:1: rule__Viewpoint__Group_3__1 : rule__Viewpoint__Group_3__1__Impl ;
    public final void rule__Viewpoint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2210:1: ( rule__Viewpoint__Group_3__1__Impl )
            // InternalSiriusTextDsl.g:2211:2: rule__Viewpoint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_3__1__Impl();

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
    // $ANTLR end "rule__Viewpoint__Group_3__1"


    // $ANTLR start "rule__Viewpoint__Group_3__1__Impl"
    // InternalSiriusTextDsl.g:2217:1: rule__Viewpoint__Group_3__1__Impl : ( ( rule__Viewpoint__LabelAssignment_3_1 ) ) ;
    public final void rule__Viewpoint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2221:1: ( ( ( rule__Viewpoint__LabelAssignment_3_1 ) ) )
            // InternalSiriusTextDsl.g:2222:1: ( ( rule__Viewpoint__LabelAssignment_3_1 ) )
            {
            // InternalSiriusTextDsl.g:2222:1: ( ( rule__Viewpoint__LabelAssignment_3_1 ) )
            // InternalSiriusTextDsl.g:2223:1: ( rule__Viewpoint__LabelAssignment_3_1 )
            {
             before(grammarAccess.getViewpointAccess().getLabelAssignment_3_1()); 
            // InternalSiriusTextDsl.g:2224:1: ( rule__Viewpoint__LabelAssignment_3_1 )
            // InternalSiriusTextDsl.g:2224:2: rule__Viewpoint__LabelAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__LabelAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getViewpointAccess().getLabelAssignment_3_1()); 

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
    // $ANTLR end "rule__Viewpoint__Group_3__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_5__0"
    // InternalSiriusTextDsl.g:2238:1: rule__Viewpoint__Group_5__0 : rule__Viewpoint__Group_5__0__Impl rule__Viewpoint__Group_5__1 ;
    public final void rule__Viewpoint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2242:1: ( rule__Viewpoint__Group_5__0__Impl rule__Viewpoint__Group_5__1 )
            // InternalSiriusTextDsl.g:2243:2: rule__Viewpoint__Group_5__0__Impl rule__Viewpoint__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__Viewpoint__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_5__1();

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
    // $ANTLR end "rule__Viewpoint__Group_5__0"


    // $ANTLR start "rule__Viewpoint__Group_5__0__Impl"
    // InternalSiriusTextDsl.g:2250:1: rule__Viewpoint__Group_5__0__Impl : ( 'modelFileExtensions' ) ;
    public final void rule__Viewpoint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2254:1: ( ( 'modelFileExtensions' ) )
            // InternalSiriusTextDsl.g:2255:1: ( 'modelFileExtensions' )
            {
            // InternalSiriusTextDsl.g:2255:1: ( 'modelFileExtensions' )
            // InternalSiriusTextDsl.g:2256:1: 'modelFileExtensions'
            {
             before(grammarAccess.getViewpointAccess().getModelFileExtensionsKeyword_5_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getModelFileExtensionsKeyword_5_0()); 

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
    // $ANTLR end "rule__Viewpoint__Group_5__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_5__1"
    // InternalSiriusTextDsl.g:2269:1: rule__Viewpoint__Group_5__1 : rule__Viewpoint__Group_5__1__Impl rule__Viewpoint__Group_5__2 ;
    public final void rule__Viewpoint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2273:1: ( rule__Viewpoint__Group_5__1__Impl rule__Viewpoint__Group_5__2 )
            // InternalSiriusTextDsl.g:2274:2: rule__Viewpoint__Group_5__1__Impl rule__Viewpoint__Group_5__2
            {
            pushFollow(FOLLOW_18);
            rule__Viewpoint__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_5__2();

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
    // $ANTLR end "rule__Viewpoint__Group_5__1"


    // $ANTLR start "rule__Viewpoint__Group_5__1__Impl"
    // InternalSiriusTextDsl.g:2281:1: rule__Viewpoint__Group_5__1__Impl : ( '=' ) ;
    public final void rule__Viewpoint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2285:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:2286:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:2286:1: ( '=' )
            // InternalSiriusTextDsl.g:2287:1: '='
            {
             before(grammarAccess.getViewpointAccess().getEqualsSignKeyword_5_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getEqualsSignKeyword_5_1()); 

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
    // $ANTLR end "rule__Viewpoint__Group_5__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_5__2"
    // InternalSiriusTextDsl.g:2300:1: rule__Viewpoint__Group_5__2 : rule__Viewpoint__Group_5__2__Impl rule__Viewpoint__Group_5__3 ;
    public final void rule__Viewpoint__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2304:1: ( rule__Viewpoint__Group_5__2__Impl rule__Viewpoint__Group_5__3 )
            // InternalSiriusTextDsl.g:2305:2: rule__Viewpoint__Group_5__2__Impl rule__Viewpoint__Group_5__3
            {
            pushFollow(FOLLOW_14);
            rule__Viewpoint__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_5__3();

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
    // $ANTLR end "rule__Viewpoint__Group_5__2"


    // $ANTLR start "rule__Viewpoint__Group_5__2__Impl"
    // InternalSiriusTextDsl.g:2312:1: rule__Viewpoint__Group_5__2__Impl : ( '[' ) ;
    public final void rule__Viewpoint__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2316:1: ( ( '[' ) )
            // InternalSiriusTextDsl.g:2317:1: ( '[' )
            {
            // InternalSiriusTextDsl.g:2317:1: ( '[' )
            // InternalSiriusTextDsl.g:2318:1: '['
            {
             before(grammarAccess.getViewpointAccess().getLeftSquareBracketKeyword_5_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getLeftSquareBracketKeyword_5_2()); 

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
    // $ANTLR end "rule__Viewpoint__Group_5__2__Impl"


    // $ANTLR start "rule__Viewpoint__Group_5__3"
    // InternalSiriusTextDsl.g:2331:1: rule__Viewpoint__Group_5__3 : rule__Viewpoint__Group_5__3__Impl rule__Viewpoint__Group_5__4 ;
    public final void rule__Viewpoint__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2335:1: ( rule__Viewpoint__Group_5__3__Impl rule__Viewpoint__Group_5__4 )
            // InternalSiriusTextDsl.g:2336:2: rule__Viewpoint__Group_5__3__Impl rule__Viewpoint__Group_5__4
            {
            pushFollow(FOLLOW_19);
            rule__Viewpoint__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_5__4();

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
    // $ANTLR end "rule__Viewpoint__Group_5__3"


    // $ANTLR start "rule__Viewpoint__Group_5__3__Impl"
    // InternalSiriusTextDsl.g:2343:1: rule__Viewpoint__Group_5__3__Impl : ( ( rule__Viewpoint__ModelFileExtensionsAssignment_5_3 ) ) ;
    public final void rule__Viewpoint__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2347:1: ( ( ( rule__Viewpoint__ModelFileExtensionsAssignment_5_3 ) ) )
            // InternalSiriusTextDsl.g:2348:1: ( ( rule__Viewpoint__ModelFileExtensionsAssignment_5_3 ) )
            {
            // InternalSiriusTextDsl.g:2348:1: ( ( rule__Viewpoint__ModelFileExtensionsAssignment_5_3 ) )
            // InternalSiriusTextDsl.g:2349:1: ( rule__Viewpoint__ModelFileExtensionsAssignment_5_3 )
            {
             before(grammarAccess.getViewpointAccess().getModelFileExtensionsAssignment_5_3()); 
            // InternalSiriusTextDsl.g:2350:1: ( rule__Viewpoint__ModelFileExtensionsAssignment_5_3 )
            // InternalSiriusTextDsl.g:2350:2: rule__Viewpoint__ModelFileExtensionsAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__ModelFileExtensionsAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getViewpointAccess().getModelFileExtensionsAssignment_5_3()); 

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
    // $ANTLR end "rule__Viewpoint__Group_5__3__Impl"


    // $ANTLR start "rule__Viewpoint__Group_5__4"
    // InternalSiriusTextDsl.g:2360:1: rule__Viewpoint__Group_5__4 : rule__Viewpoint__Group_5__4__Impl rule__Viewpoint__Group_5__5 ;
    public final void rule__Viewpoint__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2364:1: ( rule__Viewpoint__Group_5__4__Impl rule__Viewpoint__Group_5__5 )
            // InternalSiriusTextDsl.g:2365:2: rule__Viewpoint__Group_5__4__Impl rule__Viewpoint__Group_5__5
            {
            pushFollow(FOLLOW_19);
            rule__Viewpoint__Group_5__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_5__5();

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
    // $ANTLR end "rule__Viewpoint__Group_5__4"


    // $ANTLR start "rule__Viewpoint__Group_5__4__Impl"
    // InternalSiriusTextDsl.g:2372:1: rule__Viewpoint__Group_5__4__Impl : ( ( rule__Viewpoint__Group_5_4__0 )* ) ;
    public final void rule__Viewpoint__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2376:1: ( ( ( rule__Viewpoint__Group_5_4__0 )* ) )
            // InternalSiriusTextDsl.g:2377:1: ( ( rule__Viewpoint__Group_5_4__0 )* )
            {
            // InternalSiriusTextDsl.g:2377:1: ( ( rule__Viewpoint__Group_5_4__0 )* )
            // InternalSiriusTextDsl.g:2378:1: ( rule__Viewpoint__Group_5_4__0 )*
            {
             before(grammarAccess.getViewpointAccess().getGroup_5_4()); 
            // InternalSiriusTextDsl.g:2379:1: ( rule__Viewpoint__Group_5_4__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==51) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:2379:2: rule__Viewpoint__Group_5_4__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Viewpoint__Group_5_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getViewpointAccess().getGroup_5_4()); 

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
    // $ANTLR end "rule__Viewpoint__Group_5__4__Impl"


    // $ANTLR start "rule__Viewpoint__Group_5__5"
    // InternalSiriusTextDsl.g:2389:1: rule__Viewpoint__Group_5__5 : rule__Viewpoint__Group_5__5__Impl ;
    public final void rule__Viewpoint__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2393:1: ( rule__Viewpoint__Group_5__5__Impl )
            // InternalSiriusTextDsl.g:2394:2: rule__Viewpoint__Group_5__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_5__5__Impl();

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
    // $ANTLR end "rule__Viewpoint__Group_5__5"


    // $ANTLR start "rule__Viewpoint__Group_5__5__Impl"
    // InternalSiriusTextDsl.g:2400:1: rule__Viewpoint__Group_5__5__Impl : ( ']' ) ;
    public final void rule__Viewpoint__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2404:1: ( ( ']' ) )
            // InternalSiriusTextDsl.g:2405:1: ( ']' )
            {
            // InternalSiriusTextDsl.g:2405:1: ( ']' )
            // InternalSiriusTextDsl.g:2406:1: ']'
            {
             before(grammarAccess.getViewpointAccess().getRightSquareBracketKeyword_5_5()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getRightSquareBracketKeyword_5_5()); 

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
    // $ANTLR end "rule__Viewpoint__Group_5__5__Impl"


    // $ANTLR start "rule__Viewpoint__Group_5_4__0"
    // InternalSiriusTextDsl.g:2431:1: rule__Viewpoint__Group_5_4__0 : rule__Viewpoint__Group_5_4__0__Impl rule__Viewpoint__Group_5_4__1 ;
    public final void rule__Viewpoint__Group_5_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2435:1: ( rule__Viewpoint__Group_5_4__0__Impl rule__Viewpoint__Group_5_4__1 )
            // InternalSiriusTextDsl.g:2436:2: rule__Viewpoint__Group_5_4__0__Impl rule__Viewpoint__Group_5_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Viewpoint__Group_5_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_5_4__1();

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
    // $ANTLR end "rule__Viewpoint__Group_5_4__0"


    // $ANTLR start "rule__Viewpoint__Group_5_4__0__Impl"
    // InternalSiriusTextDsl.g:2443:1: rule__Viewpoint__Group_5_4__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_5_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2447:1: ( ( ',' ) )
            // InternalSiriusTextDsl.g:2448:1: ( ',' )
            {
            // InternalSiriusTextDsl.g:2448:1: ( ',' )
            // InternalSiriusTextDsl.g:2449:1: ','
            {
             before(grammarAccess.getViewpointAccess().getCommaKeyword_5_4_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getCommaKeyword_5_4_0()); 

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
    // $ANTLR end "rule__Viewpoint__Group_5_4__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_5_4__1"
    // InternalSiriusTextDsl.g:2462:1: rule__Viewpoint__Group_5_4__1 : rule__Viewpoint__Group_5_4__1__Impl ;
    public final void rule__Viewpoint__Group_5_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2466:1: ( rule__Viewpoint__Group_5_4__1__Impl )
            // InternalSiriusTextDsl.g:2467:2: rule__Viewpoint__Group_5_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_5_4__1__Impl();

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
    // $ANTLR end "rule__Viewpoint__Group_5_4__1"


    // $ANTLR start "rule__Viewpoint__Group_5_4__1__Impl"
    // InternalSiriusTextDsl.g:2473:1: rule__Viewpoint__Group_5_4__1__Impl : ( ( rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1 ) ) ;
    public final void rule__Viewpoint__Group_5_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2477:1: ( ( ( rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1 ) ) )
            // InternalSiriusTextDsl.g:2478:1: ( ( rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1 ) )
            {
            // InternalSiriusTextDsl.g:2478:1: ( ( rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1 ) )
            // InternalSiriusTextDsl.g:2479:1: ( rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1 )
            {
             before(grammarAccess.getViewpointAccess().getModelFileExtensionsAssignment_5_4_1()); 
            // InternalSiriusTextDsl.g:2480:1: ( rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1 )
            // InternalSiriusTextDsl.g:2480:2: rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1();

            state._fsp--;


            }

             after(grammarAccess.getViewpointAccess().getModelFileExtensionsAssignment_5_4_1()); 

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
    // $ANTLR end "rule__Viewpoint__Group_5_4__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_6__0"
    // InternalSiriusTextDsl.g:2494:1: rule__Viewpoint__Group_6__0 : rule__Viewpoint__Group_6__0__Impl rule__Viewpoint__Group_6__1 ;
    public final void rule__Viewpoint__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2498:1: ( rule__Viewpoint__Group_6__0__Impl rule__Viewpoint__Group_6__1 )
            // InternalSiriusTextDsl.g:2499:2: rule__Viewpoint__Group_6__0__Impl rule__Viewpoint__Group_6__1
            {
            pushFollow(FOLLOW_17);
            rule__Viewpoint__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_6__1();

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
    // $ANTLR end "rule__Viewpoint__Group_6__0"


    // $ANTLR start "rule__Viewpoint__Group_6__0__Impl"
    // InternalSiriusTextDsl.g:2506:1: rule__Viewpoint__Group_6__0__Impl : ( 'icon' ) ;
    public final void rule__Viewpoint__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2510:1: ( ( 'icon' ) )
            // InternalSiriusTextDsl.g:2511:1: ( 'icon' )
            {
            // InternalSiriusTextDsl.g:2511:1: ( 'icon' )
            // InternalSiriusTextDsl.g:2512:1: 'icon'
            {
             before(grammarAccess.getViewpointAccess().getIconKeyword_6_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getIconKeyword_6_0()); 

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
    // $ANTLR end "rule__Viewpoint__Group_6__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_6__1"
    // InternalSiriusTextDsl.g:2525:1: rule__Viewpoint__Group_6__1 : rule__Viewpoint__Group_6__1__Impl rule__Viewpoint__Group_6__2 ;
    public final void rule__Viewpoint__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2529:1: ( rule__Viewpoint__Group_6__1__Impl rule__Viewpoint__Group_6__2 )
            // InternalSiriusTextDsl.g:2530:2: rule__Viewpoint__Group_6__1__Impl rule__Viewpoint__Group_6__2
            {
            pushFollow(FOLLOW_14);
            rule__Viewpoint__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_6__2();

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
    // $ANTLR end "rule__Viewpoint__Group_6__1"


    // $ANTLR start "rule__Viewpoint__Group_6__1__Impl"
    // InternalSiriusTextDsl.g:2537:1: rule__Viewpoint__Group_6__1__Impl : ( '=' ) ;
    public final void rule__Viewpoint__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2541:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:2542:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:2542:1: ( '=' )
            // InternalSiriusTextDsl.g:2543:1: '='
            {
             before(grammarAccess.getViewpointAccess().getEqualsSignKeyword_6_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getEqualsSignKeyword_6_1()); 

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
    // $ANTLR end "rule__Viewpoint__Group_6__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_6__2"
    // InternalSiriusTextDsl.g:2556:1: rule__Viewpoint__Group_6__2 : rule__Viewpoint__Group_6__2__Impl ;
    public final void rule__Viewpoint__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2560:1: ( rule__Viewpoint__Group_6__2__Impl )
            // InternalSiriusTextDsl.g:2561:2: rule__Viewpoint__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_6__2__Impl();

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
    // $ANTLR end "rule__Viewpoint__Group_6__2"


    // $ANTLR start "rule__Viewpoint__Group_6__2__Impl"
    // InternalSiriusTextDsl.g:2567:1: rule__Viewpoint__Group_6__2__Impl : ( ( rule__Viewpoint__IconAssignment_6_2 ) ) ;
    public final void rule__Viewpoint__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2571:1: ( ( ( rule__Viewpoint__IconAssignment_6_2 ) ) )
            // InternalSiriusTextDsl.g:2572:1: ( ( rule__Viewpoint__IconAssignment_6_2 ) )
            {
            // InternalSiriusTextDsl.g:2572:1: ( ( rule__Viewpoint__IconAssignment_6_2 ) )
            // InternalSiriusTextDsl.g:2573:1: ( rule__Viewpoint__IconAssignment_6_2 )
            {
             before(grammarAccess.getViewpointAccess().getIconAssignment_6_2()); 
            // InternalSiriusTextDsl.g:2574:1: ( rule__Viewpoint__IconAssignment_6_2 )
            // InternalSiriusTextDsl.g:2574:2: rule__Viewpoint__IconAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__IconAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getViewpointAccess().getIconAssignment_6_2()); 

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
    // $ANTLR end "rule__Viewpoint__Group_6__2__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7__0"
    // InternalSiriusTextDsl.g:2590:1: rule__Viewpoint__Group_7__0 : rule__Viewpoint__Group_7__0__Impl rule__Viewpoint__Group_7__1 ;
    public final void rule__Viewpoint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2594:1: ( rule__Viewpoint__Group_7__0__Impl rule__Viewpoint__Group_7__1 )
            // InternalSiriusTextDsl.g:2595:2: rule__Viewpoint__Group_7__0__Impl rule__Viewpoint__Group_7__1
            {
            pushFollow(FOLLOW_17);
            rule__Viewpoint__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_7__1();

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
    // $ANTLR end "rule__Viewpoint__Group_7__0"


    // $ANTLR start "rule__Viewpoint__Group_7__0__Impl"
    // InternalSiriusTextDsl.g:2602:1: rule__Viewpoint__Group_7__0__Impl : ( 'representations' ) ;
    public final void rule__Viewpoint__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2606:1: ( ( 'representations' ) )
            // InternalSiriusTextDsl.g:2607:1: ( 'representations' )
            {
            // InternalSiriusTextDsl.g:2607:1: ( 'representations' )
            // InternalSiriusTextDsl.g:2608:1: 'representations'
            {
             before(grammarAccess.getViewpointAccess().getRepresentationsKeyword_7_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getRepresentationsKeyword_7_0()); 

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
    // $ANTLR end "rule__Viewpoint__Group_7__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7__1"
    // InternalSiriusTextDsl.g:2621:1: rule__Viewpoint__Group_7__1 : rule__Viewpoint__Group_7__1__Impl rule__Viewpoint__Group_7__2 ;
    public final void rule__Viewpoint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2625:1: ( rule__Viewpoint__Group_7__1__Impl rule__Viewpoint__Group_7__2 )
            // InternalSiriusTextDsl.g:2626:2: rule__Viewpoint__Group_7__1__Impl rule__Viewpoint__Group_7__2
            {
            pushFollow(FOLLOW_18);
            rule__Viewpoint__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_7__2();

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
    // $ANTLR end "rule__Viewpoint__Group_7__1"


    // $ANTLR start "rule__Viewpoint__Group_7__1__Impl"
    // InternalSiriusTextDsl.g:2633:1: rule__Viewpoint__Group_7__1__Impl : ( '=' ) ;
    public final void rule__Viewpoint__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2637:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:2638:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:2638:1: ( '=' )
            // InternalSiriusTextDsl.g:2639:1: '='
            {
             before(grammarAccess.getViewpointAccess().getEqualsSignKeyword_7_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getEqualsSignKeyword_7_1()); 

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
    // $ANTLR end "rule__Viewpoint__Group_7__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7__2"
    // InternalSiriusTextDsl.g:2652:1: rule__Viewpoint__Group_7__2 : rule__Viewpoint__Group_7__2__Impl rule__Viewpoint__Group_7__3 ;
    public final void rule__Viewpoint__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2656:1: ( rule__Viewpoint__Group_7__2__Impl rule__Viewpoint__Group_7__3 )
            // InternalSiriusTextDsl.g:2657:2: rule__Viewpoint__Group_7__2__Impl rule__Viewpoint__Group_7__3
            {
            pushFollow(FOLLOW_21);
            rule__Viewpoint__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_7__3();

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
    // $ANTLR end "rule__Viewpoint__Group_7__2"


    // $ANTLR start "rule__Viewpoint__Group_7__2__Impl"
    // InternalSiriusTextDsl.g:2664:1: rule__Viewpoint__Group_7__2__Impl : ( '[' ) ;
    public final void rule__Viewpoint__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2668:1: ( ( '[' ) )
            // InternalSiriusTextDsl.g:2669:1: ( '[' )
            {
            // InternalSiriusTextDsl.g:2669:1: ( '[' )
            // InternalSiriusTextDsl.g:2670:1: '['
            {
             before(grammarAccess.getViewpointAccess().getLeftSquareBracketKeyword_7_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getLeftSquareBracketKeyword_7_2()); 

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
    // $ANTLR end "rule__Viewpoint__Group_7__2__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7__3"
    // InternalSiriusTextDsl.g:2683:1: rule__Viewpoint__Group_7__3 : rule__Viewpoint__Group_7__3__Impl rule__Viewpoint__Group_7__4 ;
    public final void rule__Viewpoint__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2687:1: ( rule__Viewpoint__Group_7__3__Impl rule__Viewpoint__Group_7__4 )
            // InternalSiriusTextDsl.g:2688:2: rule__Viewpoint__Group_7__3__Impl rule__Viewpoint__Group_7__4
            {
            pushFollow(FOLLOW_21);
            rule__Viewpoint__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_7__4();

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
    // $ANTLR end "rule__Viewpoint__Group_7__3"


    // $ANTLR start "rule__Viewpoint__Group_7__3__Impl"
    // InternalSiriusTextDsl.g:2695:1: rule__Viewpoint__Group_7__3__Impl : ( ( rule__Viewpoint__Group_7_3__0 )? ) ;
    public final void rule__Viewpoint__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2699:1: ( ( ( rule__Viewpoint__Group_7_3__0 )? ) )
            // InternalSiriusTextDsl.g:2700:1: ( ( rule__Viewpoint__Group_7_3__0 )? )
            {
            // InternalSiriusTextDsl.g:2700:1: ( ( rule__Viewpoint__Group_7_3__0 )? )
            // InternalSiriusTextDsl.g:2701:1: ( rule__Viewpoint__Group_7_3__0 )?
            {
             before(grammarAccess.getViewpointAccess().getGroup_7_3()); 
            // InternalSiriusTextDsl.g:2702:1: ( rule__Viewpoint__Group_7_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSiriusTextDsl.g:2702:2: rule__Viewpoint__Group_7_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Viewpoint__Group_7_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewpointAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__Viewpoint__Group_7__3__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7__4"
    // InternalSiriusTextDsl.g:2712:1: rule__Viewpoint__Group_7__4 : rule__Viewpoint__Group_7__4__Impl ;
    public final void rule__Viewpoint__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2716:1: ( rule__Viewpoint__Group_7__4__Impl )
            // InternalSiriusTextDsl.g:2717:2: rule__Viewpoint__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_7__4__Impl();

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
    // $ANTLR end "rule__Viewpoint__Group_7__4"


    // $ANTLR start "rule__Viewpoint__Group_7__4__Impl"
    // InternalSiriusTextDsl.g:2723:1: rule__Viewpoint__Group_7__4__Impl : ( ']' ) ;
    public final void rule__Viewpoint__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2727:1: ( ( ']' ) )
            // InternalSiriusTextDsl.g:2728:1: ( ']' )
            {
            // InternalSiriusTextDsl.g:2728:1: ( ']' )
            // InternalSiriusTextDsl.g:2729:1: ']'
            {
             before(grammarAccess.getViewpointAccess().getRightSquareBracketKeyword_7_4()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getRightSquareBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__Viewpoint__Group_7__4__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7_3__0"
    // InternalSiriusTextDsl.g:2752:1: rule__Viewpoint__Group_7_3__0 : rule__Viewpoint__Group_7_3__0__Impl rule__Viewpoint__Group_7_3__1 ;
    public final void rule__Viewpoint__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2756:1: ( rule__Viewpoint__Group_7_3__0__Impl rule__Viewpoint__Group_7_3__1 )
            // InternalSiriusTextDsl.g:2757:2: rule__Viewpoint__Group_7_3__0__Impl rule__Viewpoint__Group_7_3__1
            {
            pushFollow(FOLLOW_22);
            rule__Viewpoint__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_7_3__1();

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
    // $ANTLR end "rule__Viewpoint__Group_7_3__0"


    // $ANTLR start "rule__Viewpoint__Group_7_3__0__Impl"
    // InternalSiriusTextDsl.g:2764:1: rule__Viewpoint__Group_7_3__0__Impl : ( ( rule__Viewpoint__RepresentationsAssignment_7_3_0 ) ) ;
    public final void rule__Viewpoint__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2768:1: ( ( ( rule__Viewpoint__RepresentationsAssignment_7_3_0 ) ) )
            // InternalSiriusTextDsl.g:2769:1: ( ( rule__Viewpoint__RepresentationsAssignment_7_3_0 ) )
            {
            // InternalSiriusTextDsl.g:2769:1: ( ( rule__Viewpoint__RepresentationsAssignment_7_3_0 ) )
            // InternalSiriusTextDsl.g:2770:1: ( rule__Viewpoint__RepresentationsAssignment_7_3_0 )
            {
             before(grammarAccess.getViewpointAccess().getRepresentationsAssignment_7_3_0()); 
            // InternalSiriusTextDsl.g:2771:1: ( rule__Viewpoint__RepresentationsAssignment_7_3_0 )
            // InternalSiriusTextDsl.g:2771:2: rule__Viewpoint__RepresentationsAssignment_7_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__RepresentationsAssignment_7_3_0();

            state._fsp--;


            }

             after(grammarAccess.getViewpointAccess().getRepresentationsAssignment_7_3_0()); 

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
    // $ANTLR end "rule__Viewpoint__Group_7_3__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7_3__1"
    // InternalSiriusTextDsl.g:2781:1: rule__Viewpoint__Group_7_3__1 : rule__Viewpoint__Group_7_3__1__Impl ;
    public final void rule__Viewpoint__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2785:1: ( rule__Viewpoint__Group_7_3__1__Impl )
            // InternalSiriusTextDsl.g:2786:2: rule__Viewpoint__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__Viewpoint__Group_7_3__1"


    // $ANTLR start "rule__Viewpoint__Group_7_3__1__Impl"
    // InternalSiriusTextDsl.g:2792:1: rule__Viewpoint__Group_7_3__1__Impl : ( ( rule__Viewpoint__Group_7_3_1__0 )* ) ;
    public final void rule__Viewpoint__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2796:1: ( ( ( rule__Viewpoint__Group_7_3_1__0 )* ) )
            // InternalSiriusTextDsl.g:2797:1: ( ( rule__Viewpoint__Group_7_3_1__0 )* )
            {
            // InternalSiriusTextDsl.g:2797:1: ( ( rule__Viewpoint__Group_7_3_1__0 )* )
            // InternalSiriusTextDsl.g:2798:1: ( rule__Viewpoint__Group_7_3_1__0 )*
            {
             before(grammarAccess.getViewpointAccess().getGroup_7_3_1()); 
            // InternalSiriusTextDsl.g:2799:1: ( rule__Viewpoint__Group_7_3_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==51) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:2799:2: rule__Viewpoint__Group_7_3_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Viewpoint__Group_7_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getViewpointAccess().getGroup_7_3_1()); 

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
    // $ANTLR end "rule__Viewpoint__Group_7_3__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7_3_1__0"
    // InternalSiriusTextDsl.g:2813:1: rule__Viewpoint__Group_7_3_1__0 : rule__Viewpoint__Group_7_3_1__0__Impl rule__Viewpoint__Group_7_3_1__1 ;
    public final void rule__Viewpoint__Group_7_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2817:1: ( rule__Viewpoint__Group_7_3_1__0__Impl rule__Viewpoint__Group_7_3_1__1 )
            // InternalSiriusTextDsl.g:2818:2: rule__Viewpoint__Group_7_3_1__0__Impl rule__Viewpoint__Group_7_3_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Viewpoint__Group_7_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_7_3_1__1();

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
    // $ANTLR end "rule__Viewpoint__Group_7_3_1__0"


    // $ANTLR start "rule__Viewpoint__Group_7_3_1__0__Impl"
    // InternalSiriusTextDsl.g:2825:1: rule__Viewpoint__Group_7_3_1__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_7_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2829:1: ( ( ',' ) )
            // InternalSiriusTextDsl.g:2830:1: ( ',' )
            {
            // InternalSiriusTextDsl.g:2830:1: ( ',' )
            // InternalSiriusTextDsl.g:2831:1: ','
            {
             before(grammarAccess.getViewpointAccess().getCommaKeyword_7_3_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getCommaKeyword_7_3_1_0()); 

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
    // $ANTLR end "rule__Viewpoint__Group_7_3_1__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7_3_1__1"
    // InternalSiriusTextDsl.g:2844:1: rule__Viewpoint__Group_7_3_1__1 : rule__Viewpoint__Group_7_3_1__1__Impl ;
    public final void rule__Viewpoint__Group_7_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2848:1: ( rule__Viewpoint__Group_7_3_1__1__Impl )
            // InternalSiriusTextDsl.g:2849:2: rule__Viewpoint__Group_7_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_7_3_1__1__Impl();

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
    // $ANTLR end "rule__Viewpoint__Group_7_3_1__1"


    // $ANTLR start "rule__Viewpoint__Group_7_3_1__1__Impl"
    // InternalSiriusTextDsl.g:2855:1: rule__Viewpoint__Group_7_3_1__1__Impl : ( ( rule__Viewpoint__RepresentationsAssignment_7_3_1_1 ) ) ;
    public final void rule__Viewpoint__Group_7_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2859:1: ( ( ( rule__Viewpoint__RepresentationsAssignment_7_3_1_1 ) ) )
            // InternalSiriusTextDsl.g:2860:1: ( ( rule__Viewpoint__RepresentationsAssignment_7_3_1_1 ) )
            {
            // InternalSiriusTextDsl.g:2860:1: ( ( rule__Viewpoint__RepresentationsAssignment_7_3_1_1 ) )
            // InternalSiriusTextDsl.g:2861:1: ( rule__Viewpoint__RepresentationsAssignment_7_3_1_1 )
            {
             before(grammarAccess.getViewpointAccess().getRepresentationsAssignment_7_3_1_1()); 
            // InternalSiriusTextDsl.g:2862:1: ( rule__Viewpoint__RepresentationsAssignment_7_3_1_1 )
            // InternalSiriusTextDsl.g:2862:2: rule__Viewpoint__RepresentationsAssignment_7_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__RepresentationsAssignment_7_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getViewpointAccess().getRepresentationsAssignment_7_3_1_1()); 

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
    // $ANTLR end "rule__Viewpoint__Group_7_3_1__1__Impl"


    // $ANTLR start "rule__Diagram__Group__0"
    // InternalSiriusTextDsl.g:2876:1: rule__Diagram__Group__0 : rule__Diagram__Group__0__Impl rule__Diagram__Group__1 ;
    public final void rule__Diagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2880:1: ( rule__Diagram__Group__0__Impl rule__Diagram__Group__1 )
            // InternalSiriusTextDsl.g:2881:2: rule__Diagram__Group__0__Impl rule__Diagram__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Diagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__1();

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
    // $ANTLR end "rule__Diagram__Group__0"


    // $ANTLR start "rule__Diagram__Group__0__Impl"
    // InternalSiriusTextDsl.g:2888:1: rule__Diagram__Group__0__Impl : ( ( rule__Diagram__DocumentationAssignment_0 )? ) ;
    public final void rule__Diagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2892:1: ( ( ( rule__Diagram__DocumentationAssignment_0 )? ) )
            // InternalSiriusTextDsl.g:2893:1: ( ( rule__Diagram__DocumentationAssignment_0 )? )
            {
            // InternalSiriusTextDsl.g:2893:1: ( ( rule__Diagram__DocumentationAssignment_0 )? )
            // InternalSiriusTextDsl.g:2894:1: ( rule__Diagram__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getDiagramAccess().getDocumentationAssignment_0()); 
            // InternalSiriusTextDsl.g:2895:1: ( rule__Diagram__DocumentationAssignment_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_DOCUMENTATION) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSiriusTextDsl.g:2895:2: rule__Diagram__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Diagram__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiagramAccess().getDocumentationAssignment_0()); 

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
    // $ANTLR end "rule__Diagram__Group__0__Impl"


    // $ANTLR start "rule__Diagram__Group__1"
    // InternalSiriusTextDsl.g:2905:1: rule__Diagram__Group__1 : rule__Diagram__Group__1__Impl rule__Diagram__Group__2 ;
    public final void rule__Diagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2909:1: ( rule__Diagram__Group__1__Impl rule__Diagram__Group__2 )
            // InternalSiriusTextDsl.g:2910:2: rule__Diagram__Group__1__Impl rule__Diagram__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Diagram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__2();

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
    // $ANTLR end "rule__Diagram__Group__1"


    // $ANTLR start "rule__Diagram__Group__1__Impl"
    // InternalSiriusTextDsl.g:2917:1: rule__Diagram__Group__1__Impl : ( ( rule__Diagram__InitializedAssignment_1 )? ) ;
    public final void rule__Diagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2921:1: ( ( ( rule__Diagram__InitializedAssignment_1 )? ) )
            // InternalSiriusTextDsl.g:2922:1: ( ( rule__Diagram__InitializedAssignment_1 )? )
            {
            // InternalSiriusTextDsl.g:2922:1: ( ( rule__Diagram__InitializedAssignment_1 )? )
            // InternalSiriusTextDsl.g:2923:1: ( rule__Diagram__InitializedAssignment_1 )?
            {
             before(grammarAccess.getDiagramAccess().getInitializedAssignment_1()); 
            // InternalSiriusTextDsl.g:2924:1: ( rule__Diagram__InitializedAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==97) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSiriusTextDsl.g:2924:2: rule__Diagram__InitializedAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Diagram__InitializedAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiagramAccess().getInitializedAssignment_1()); 

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
    // $ANTLR end "rule__Diagram__Group__1__Impl"


    // $ANTLR start "rule__Diagram__Group__2"
    // InternalSiriusTextDsl.g:2934:1: rule__Diagram__Group__2 : rule__Diagram__Group__2__Impl rule__Diagram__Group__3 ;
    public final void rule__Diagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2938:1: ( rule__Diagram__Group__2__Impl rule__Diagram__Group__3 )
            // InternalSiriusTextDsl.g:2939:2: rule__Diagram__Group__2__Impl rule__Diagram__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Diagram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__3();

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
    // $ANTLR end "rule__Diagram__Group__2"


    // $ANTLR start "rule__Diagram__Group__2__Impl"
    // InternalSiriusTextDsl.g:2946:1: rule__Diagram__Group__2__Impl : ( ( rule__Diagram__ShowOnStartupAssignment_2 )? ) ;
    public final void rule__Diagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2950:1: ( ( ( rule__Diagram__ShowOnStartupAssignment_2 )? ) )
            // InternalSiriusTextDsl.g:2951:1: ( ( rule__Diagram__ShowOnStartupAssignment_2 )? )
            {
            // InternalSiriusTextDsl.g:2951:1: ( ( rule__Diagram__ShowOnStartupAssignment_2 )? )
            // InternalSiriusTextDsl.g:2952:1: ( rule__Diagram__ShowOnStartupAssignment_2 )?
            {
             before(grammarAccess.getDiagramAccess().getShowOnStartupAssignment_2()); 
            // InternalSiriusTextDsl.g:2953:1: ( rule__Diagram__ShowOnStartupAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==98) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSiriusTextDsl.g:2953:2: rule__Diagram__ShowOnStartupAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Diagram__ShowOnStartupAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiagramAccess().getShowOnStartupAssignment_2()); 

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
    // $ANTLR end "rule__Diagram__Group__2__Impl"


    // $ANTLR start "rule__Diagram__Group__3"
    // InternalSiriusTextDsl.g:2963:1: rule__Diagram__Group__3 : rule__Diagram__Group__3__Impl rule__Diagram__Group__4 ;
    public final void rule__Diagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2967:1: ( rule__Diagram__Group__3__Impl rule__Diagram__Group__4 )
            // InternalSiriusTextDsl.g:2968:2: rule__Diagram__Group__3__Impl rule__Diagram__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Diagram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__4();

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
    // $ANTLR end "rule__Diagram__Group__3"


    // $ANTLR start "rule__Diagram__Group__3__Impl"
    // InternalSiriusTextDsl.g:2975:1: rule__Diagram__Group__3__Impl : ( ( rule__Diagram__EnablePopupBarsAssignment_3 )? ) ;
    public final void rule__Diagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2979:1: ( ( ( rule__Diagram__EnablePopupBarsAssignment_3 )? ) )
            // InternalSiriusTextDsl.g:2980:1: ( ( rule__Diagram__EnablePopupBarsAssignment_3 )? )
            {
            // InternalSiriusTextDsl.g:2980:1: ( ( rule__Diagram__EnablePopupBarsAssignment_3 )? )
            // InternalSiriusTextDsl.g:2981:1: ( rule__Diagram__EnablePopupBarsAssignment_3 )?
            {
             before(grammarAccess.getDiagramAccess().getEnablePopupBarsAssignment_3()); 
            // InternalSiriusTextDsl.g:2982:1: ( rule__Diagram__EnablePopupBarsAssignment_3 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==99) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSiriusTextDsl.g:2982:2: rule__Diagram__EnablePopupBarsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Diagram__EnablePopupBarsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiagramAccess().getEnablePopupBarsAssignment_3()); 

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
    // $ANTLR end "rule__Diagram__Group__3__Impl"


    // $ANTLR start "rule__Diagram__Group__4"
    // InternalSiriusTextDsl.g:2992:1: rule__Diagram__Group__4 : rule__Diagram__Group__4__Impl rule__Diagram__Group__5 ;
    public final void rule__Diagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2996:1: ( rule__Diagram__Group__4__Impl rule__Diagram__Group__5 )
            // InternalSiriusTextDsl.g:2997:2: rule__Diagram__Group__4__Impl rule__Diagram__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Diagram__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__5();

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
    // $ANTLR end "rule__Diagram__Group__4"


    // $ANTLR start "rule__Diagram__Group__4__Impl"
    // InternalSiriusTextDsl.g:3004:1: rule__Diagram__Group__4__Impl : ( ( ( '@MetamodelUris' ) ) ( ( '@MetamodelUris' )* ) ) ;
    public final void rule__Diagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3008:1: ( ( ( ( '@MetamodelUris' ) ) ( ( '@MetamodelUris' )* ) ) )
            // InternalSiriusTextDsl.g:3009:1: ( ( ( '@MetamodelUris' ) ) ( ( '@MetamodelUris' )* ) )
            {
            // InternalSiriusTextDsl.g:3009:1: ( ( ( '@MetamodelUris' ) ) ( ( '@MetamodelUris' )* ) )
            // InternalSiriusTextDsl.g:3010:1: ( ( '@MetamodelUris' ) ) ( ( '@MetamodelUris' )* )
            {
            // InternalSiriusTextDsl.g:3010:1: ( ( '@MetamodelUris' ) )
            // InternalSiriusTextDsl.g:3011:1: ( '@MetamodelUris' )
            {
             before(grammarAccess.getDiagramAccess().getMetamodelUrisKeyword_4()); 
            // InternalSiriusTextDsl.g:3012:1: ( '@MetamodelUris' )
            // InternalSiriusTextDsl.g:3013:2: '@MetamodelUris'
            {
            match(input,54,FOLLOW_25); 

            }

             after(grammarAccess.getDiagramAccess().getMetamodelUrisKeyword_4()); 

            }

            // InternalSiriusTextDsl.g:3017:1: ( ( '@MetamodelUris' )* )
            // InternalSiriusTextDsl.g:3018:1: ( '@MetamodelUris' )*
            {
             before(grammarAccess.getDiagramAccess().getMetamodelUrisKeyword_4()); 
            // InternalSiriusTextDsl.g:3019:1: ( '@MetamodelUris' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==54) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:3020:2: '@MetamodelUris'
            	    {
            	    match(input,54,FOLLOW_25); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getDiagramAccess().getMetamodelUrisKeyword_4()); 

            }


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
    // $ANTLR end "rule__Diagram__Group__4__Impl"


    // $ANTLR start "rule__Diagram__Group__5"
    // InternalSiriusTextDsl.g:3032:1: rule__Diagram__Group__5 : rule__Diagram__Group__5__Impl rule__Diagram__Group__6 ;
    public final void rule__Diagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3036:1: ( rule__Diagram__Group__5__Impl rule__Diagram__Group__6 )
            // InternalSiriusTextDsl.g:3037:2: rule__Diagram__Group__5__Impl rule__Diagram__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Diagram__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__6();

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
    // $ANTLR end "rule__Diagram__Group__5"


    // $ANTLR start "rule__Diagram__Group__5__Impl"
    // InternalSiriusTextDsl.g:3044:1: rule__Diagram__Group__5__Impl : ( '({' ) ;
    public final void rule__Diagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3048:1: ( ( '({' ) )
            // InternalSiriusTextDsl.g:3049:1: ( '({' )
            {
            // InternalSiriusTextDsl.g:3049:1: ( '({' )
            // InternalSiriusTextDsl.g:3050:1: '({'
            {
             before(grammarAccess.getDiagramAccess().getLeftParenthesisLeftCurlyBracketKeyword_5()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getLeftParenthesisLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Diagram__Group__5__Impl"


    // $ANTLR start "rule__Diagram__Group__6"
    // InternalSiriusTextDsl.g:3063:1: rule__Diagram__Group__6 : rule__Diagram__Group__6__Impl rule__Diagram__Group__7 ;
    public final void rule__Diagram__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3067:1: ( rule__Diagram__Group__6__Impl rule__Diagram__Group__7 )
            // InternalSiriusTextDsl.g:3068:2: rule__Diagram__Group__6__Impl rule__Diagram__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__Diagram__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__7();

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
    // $ANTLR end "rule__Diagram__Group__6"


    // $ANTLR start "rule__Diagram__Group__6__Impl"
    // InternalSiriusTextDsl.g:3075:1: rule__Diagram__Group__6__Impl : ( ( rule__Diagram__MetamodelUrisAssignment_6 ) ) ;
    public final void rule__Diagram__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3079:1: ( ( ( rule__Diagram__MetamodelUrisAssignment_6 ) ) )
            // InternalSiriusTextDsl.g:3080:1: ( ( rule__Diagram__MetamodelUrisAssignment_6 ) )
            {
            // InternalSiriusTextDsl.g:3080:1: ( ( rule__Diagram__MetamodelUrisAssignment_6 ) )
            // InternalSiriusTextDsl.g:3081:1: ( rule__Diagram__MetamodelUrisAssignment_6 )
            {
             before(grammarAccess.getDiagramAccess().getMetamodelUrisAssignment_6()); 
            // InternalSiriusTextDsl.g:3082:1: ( rule__Diagram__MetamodelUrisAssignment_6 )
            // InternalSiriusTextDsl.g:3082:2: rule__Diagram__MetamodelUrisAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__MetamodelUrisAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getMetamodelUrisAssignment_6()); 

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
    // $ANTLR end "rule__Diagram__Group__6__Impl"


    // $ANTLR start "rule__Diagram__Group__7"
    // InternalSiriusTextDsl.g:3092:1: rule__Diagram__Group__7 : rule__Diagram__Group__7__Impl rule__Diagram__Group__8 ;
    public final void rule__Diagram__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3096:1: ( rule__Diagram__Group__7__Impl rule__Diagram__Group__8 )
            // InternalSiriusTextDsl.g:3097:2: rule__Diagram__Group__7__Impl rule__Diagram__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__Diagram__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__8();

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
    // $ANTLR end "rule__Diagram__Group__7"


    // $ANTLR start "rule__Diagram__Group__7__Impl"
    // InternalSiriusTextDsl.g:3104:1: rule__Diagram__Group__7__Impl : ( ( rule__Diagram__Group_7__0 )* ) ;
    public final void rule__Diagram__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3108:1: ( ( ( rule__Diagram__Group_7__0 )* ) )
            // InternalSiriusTextDsl.g:3109:1: ( ( rule__Diagram__Group_7__0 )* )
            {
            // InternalSiriusTextDsl.g:3109:1: ( ( rule__Diagram__Group_7__0 )* )
            // InternalSiriusTextDsl.g:3110:1: ( rule__Diagram__Group_7__0 )*
            {
             before(grammarAccess.getDiagramAccess().getGroup_7()); 
            // InternalSiriusTextDsl.g:3111:1: ( rule__Diagram__Group_7__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==51) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:3111:2: rule__Diagram__Group_7__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Diagram__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getDiagramAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Diagram__Group__7__Impl"


    // $ANTLR start "rule__Diagram__Group__8"
    // InternalSiriusTextDsl.g:3121:1: rule__Diagram__Group__8 : rule__Diagram__Group__8__Impl rule__Diagram__Group__9 ;
    public final void rule__Diagram__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3125:1: ( rule__Diagram__Group__8__Impl rule__Diagram__Group__9 )
            // InternalSiriusTextDsl.g:3126:2: rule__Diagram__Group__8__Impl rule__Diagram__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__Diagram__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__9();

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
    // $ANTLR end "rule__Diagram__Group__8"


    // $ANTLR start "rule__Diagram__Group__8__Impl"
    // InternalSiriusTextDsl.g:3133:1: rule__Diagram__Group__8__Impl : ( '})' ) ;
    public final void rule__Diagram__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3137:1: ( ( '})' ) )
            // InternalSiriusTextDsl.g:3138:1: ( '})' )
            {
            // InternalSiriusTextDsl.g:3138:1: ( '})' )
            // InternalSiriusTextDsl.g:3139:1: '})'
            {
             before(grammarAccess.getDiagramAccess().getRightCurlyBracketRightParenthesisKeyword_8()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getRightCurlyBracketRightParenthesisKeyword_8()); 

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
    // $ANTLR end "rule__Diagram__Group__8__Impl"


    // $ANTLR start "rule__Diagram__Group__9"
    // InternalSiriusTextDsl.g:3152:1: rule__Diagram__Group__9 : rule__Diagram__Group__9__Impl rule__Diagram__Group__10 ;
    public final void rule__Diagram__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3156:1: ( rule__Diagram__Group__9__Impl rule__Diagram__Group__10 )
            // InternalSiriusTextDsl.g:3157:2: rule__Diagram__Group__9__Impl rule__Diagram__Group__10
            {
            pushFollow(FOLLOW_4);
            rule__Diagram__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__10();

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
    // $ANTLR end "rule__Diagram__Group__9"


    // $ANTLR start "rule__Diagram__Group__9__Impl"
    // InternalSiriusTextDsl.g:3164:1: rule__Diagram__Group__9__Impl : ( 'diagram' ) ;
    public final void rule__Diagram__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3168:1: ( ( 'diagram' ) )
            // InternalSiriusTextDsl.g:3169:1: ( 'diagram' )
            {
            // InternalSiriusTextDsl.g:3169:1: ( 'diagram' )
            // InternalSiriusTextDsl.g:3170:1: 'diagram'
            {
             before(grammarAccess.getDiagramAccess().getDiagramKeyword_9()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getDiagramKeyword_9()); 

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
    // $ANTLR end "rule__Diagram__Group__9__Impl"


    // $ANTLR start "rule__Diagram__Group__10"
    // InternalSiriusTextDsl.g:3183:1: rule__Diagram__Group__10 : rule__Diagram__Group__10__Impl rule__Diagram__Group__11 ;
    public final void rule__Diagram__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3187:1: ( rule__Diagram__Group__10__Impl rule__Diagram__Group__11 )
            // InternalSiriusTextDsl.g:3188:2: rule__Diagram__Group__10__Impl rule__Diagram__Group__11
            {
            pushFollow(FOLLOW_28);
            rule__Diagram__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__11();

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
    // $ANTLR end "rule__Diagram__Group__10"


    // $ANTLR start "rule__Diagram__Group__10__Impl"
    // InternalSiriusTextDsl.g:3195:1: rule__Diagram__Group__10__Impl : ( ( rule__Diagram__NameAssignment_10 ) ) ;
    public final void rule__Diagram__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3199:1: ( ( ( rule__Diagram__NameAssignment_10 ) ) )
            // InternalSiriusTextDsl.g:3200:1: ( ( rule__Diagram__NameAssignment_10 ) )
            {
            // InternalSiriusTextDsl.g:3200:1: ( ( rule__Diagram__NameAssignment_10 ) )
            // InternalSiriusTextDsl.g:3201:1: ( rule__Diagram__NameAssignment_10 )
            {
             before(grammarAccess.getDiagramAccess().getNameAssignment_10()); 
            // InternalSiriusTextDsl.g:3202:1: ( rule__Diagram__NameAssignment_10 )
            // InternalSiriusTextDsl.g:3202:2: rule__Diagram__NameAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__NameAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getNameAssignment_10()); 

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
    // $ANTLR end "rule__Diagram__Group__10__Impl"


    // $ANTLR start "rule__Diagram__Group__11"
    // InternalSiriusTextDsl.g:3212:1: rule__Diagram__Group__11 : rule__Diagram__Group__11__Impl rule__Diagram__Group__12 ;
    public final void rule__Diagram__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3216:1: ( rule__Diagram__Group__11__Impl rule__Diagram__Group__12 )
            // InternalSiriusTextDsl.g:3217:2: rule__Diagram__Group__11__Impl rule__Diagram__Group__12
            {
            pushFollow(FOLLOW_28);
            rule__Diagram__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__12();

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
    // $ANTLR end "rule__Diagram__Group__11"


    // $ANTLR start "rule__Diagram__Group__11__Impl"
    // InternalSiriusTextDsl.g:3224:1: rule__Diagram__Group__11__Impl : ( ( rule__Diagram__Group_11__0 )? ) ;
    public final void rule__Diagram__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3228:1: ( ( ( rule__Diagram__Group_11__0 )? ) )
            // InternalSiriusTextDsl.g:3229:1: ( ( rule__Diagram__Group_11__0 )? )
            {
            // InternalSiriusTextDsl.g:3229:1: ( ( rule__Diagram__Group_11__0 )? )
            // InternalSiriusTextDsl.g:3230:1: ( rule__Diagram__Group_11__0 )?
            {
             before(grammarAccess.getDiagramAccess().getGroup_11()); 
            // InternalSiriusTextDsl.g:3231:1: ( rule__Diagram__Group_11__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==45) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSiriusTextDsl.g:3231:2: rule__Diagram__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Diagram__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiagramAccess().getGroup_11()); 

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
    // $ANTLR end "rule__Diagram__Group__11__Impl"


    // $ANTLR start "rule__Diagram__Group__12"
    // InternalSiriusTextDsl.g:3241:1: rule__Diagram__Group__12 : rule__Diagram__Group__12__Impl rule__Diagram__Group__13 ;
    public final void rule__Diagram__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3245:1: ( rule__Diagram__Group__12__Impl rule__Diagram__Group__13 )
            // InternalSiriusTextDsl.g:3246:2: rule__Diagram__Group__12__Impl rule__Diagram__Group__13
            {
            pushFollow(FOLLOW_14);
            rule__Diagram__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__13();

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
    // $ANTLR end "rule__Diagram__Group__12"


    // $ANTLR start "rule__Diagram__Group__12__Impl"
    // InternalSiriusTextDsl.g:3253:1: rule__Diagram__Group__12__Impl : ( 'for' ) ;
    public final void rule__Diagram__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3257:1: ( ( 'for' ) )
            // InternalSiriusTextDsl.g:3258:1: ( 'for' )
            {
            // InternalSiriusTextDsl.g:3258:1: ( 'for' )
            // InternalSiriusTextDsl.g:3259:1: 'for'
            {
             before(grammarAccess.getDiagramAccess().getForKeyword_12()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getForKeyword_12()); 

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
    // $ANTLR end "rule__Diagram__Group__12__Impl"


    // $ANTLR start "rule__Diagram__Group__13"
    // InternalSiriusTextDsl.g:3272:1: rule__Diagram__Group__13 : rule__Diagram__Group__13__Impl rule__Diagram__Group__14 ;
    public final void rule__Diagram__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3276:1: ( rule__Diagram__Group__13__Impl rule__Diagram__Group__14 )
            // InternalSiriusTextDsl.g:3277:2: rule__Diagram__Group__13__Impl rule__Diagram__Group__14
            {
            pushFollow(FOLLOW_29);
            rule__Diagram__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__14();

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
    // $ANTLR end "rule__Diagram__Group__13"


    // $ANTLR start "rule__Diagram__Group__13__Impl"
    // InternalSiriusTextDsl.g:3284:1: rule__Diagram__Group__13__Impl : ( ( rule__Diagram__DomainClassAssignment_13 ) ) ;
    public final void rule__Diagram__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3288:1: ( ( ( rule__Diagram__DomainClassAssignment_13 ) ) )
            // InternalSiriusTextDsl.g:3289:1: ( ( rule__Diagram__DomainClassAssignment_13 ) )
            {
            // InternalSiriusTextDsl.g:3289:1: ( ( rule__Diagram__DomainClassAssignment_13 ) )
            // InternalSiriusTextDsl.g:3290:1: ( rule__Diagram__DomainClassAssignment_13 )
            {
             before(grammarAccess.getDiagramAccess().getDomainClassAssignment_13()); 
            // InternalSiriusTextDsl.g:3291:1: ( rule__Diagram__DomainClassAssignment_13 )
            // InternalSiriusTextDsl.g:3291:2: rule__Diagram__DomainClassAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__DomainClassAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getDomainClassAssignment_13()); 

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
    // $ANTLR end "rule__Diagram__Group__13__Impl"


    // $ANTLR start "rule__Diagram__Group__14"
    // InternalSiriusTextDsl.g:3301:1: rule__Diagram__Group__14 : rule__Diagram__Group__14__Impl rule__Diagram__Group__15 ;
    public final void rule__Diagram__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3305:1: ( rule__Diagram__Group__14__Impl rule__Diagram__Group__15 )
            // InternalSiriusTextDsl.g:3306:2: rule__Diagram__Group__14__Impl rule__Diagram__Group__15
            {
            pushFollow(FOLLOW_29);
            rule__Diagram__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__15();

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
    // $ANTLR end "rule__Diagram__Group__14"


    // $ANTLR start "rule__Diagram__Group__14__Impl"
    // InternalSiriusTextDsl.g:3313:1: rule__Diagram__Group__14__Impl : ( ( rule__Diagram__Group_14__0 )? ) ;
    public final void rule__Diagram__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3317:1: ( ( ( rule__Diagram__Group_14__0 )? ) )
            // InternalSiriusTextDsl.g:3318:1: ( ( rule__Diagram__Group_14__0 )? )
            {
            // InternalSiriusTextDsl.g:3318:1: ( ( rule__Diagram__Group_14__0 )? )
            // InternalSiriusTextDsl.g:3319:1: ( rule__Diagram__Group_14__0 )?
            {
             before(grammarAccess.getDiagramAccess().getGroup_14()); 
            // InternalSiriusTextDsl.g:3320:1: ( rule__Diagram__Group_14__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==59) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSiriusTextDsl.g:3320:2: rule__Diagram__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Diagram__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiagramAccess().getGroup_14()); 

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
    // $ANTLR end "rule__Diagram__Group__14__Impl"


    // $ANTLR start "rule__Diagram__Group__15"
    // InternalSiriusTextDsl.g:3330:1: rule__Diagram__Group__15 : rule__Diagram__Group__15__Impl rule__Diagram__Group__16 ;
    public final void rule__Diagram__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3334:1: ( rule__Diagram__Group__15__Impl rule__Diagram__Group__16 )
            // InternalSiriusTextDsl.g:3335:2: rule__Diagram__Group__15__Impl rule__Diagram__Group__16
            {
            pushFollow(FOLLOW_30);
            rule__Diagram__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__16();

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
    // $ANTLR end "rule__Diagram__Group__15"


    // $ANTLR start "rule__Diagram__Group__15__Impl"
    // InternalSiriusTextDsl.g:3342:1: rule__Diagram__Group__15__Impl : ( '{' ) ;
    public final void rule__Diagram__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3346:1: ( ( '{' ) )
            // InternalSiriusTextDsl.g:3347:1: ( '{' )
            {
            // InternalSiriusTextDsl.g:3347:1: ( '{' )
            // InternalSiriusTextDsl.g:3348:1: '{'
            {
             before(grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_15()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_15()); 

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
    // $ANTLR end "rule__Diagram__Group__15__Impl"


    // $ANTLR start "rule__Diagram__Group__16"
    // InternalSiriusTextDsl.g:3361:1: rule__Diagram__Group__16 : rule__Diagram__Group__16__Impl rule__Diagram__Group__17 ;
    public final void rule__Diagram__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3365:1: ( rule__Diagram__Group__16__Impl rule__Diagram__Group__17 )
            // InternalSiriusTextDsl.g:3366:2: rule__Diagram__Group__16__Impl rule__Diagram__Group__17
            {
            pushFollow(FOLLOW_30);
            rule__Diagram__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__17();

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
    // $ANTLR end "rule__Diagram__Group__16"


    // $ANTLR start "rule__Diagram__Group__16__Impl"
    // InternalSiriusTextDsl.g:3373:1: rule__Diagram__Group__16__Impl : ( ( rule__Diagram__Group_16__0 )? ) ;
    public final void rule__Diagram__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3377:1: ( ( ( rule__Diagram__Group_16__0 )? ) )
            // InternalSiriusTextDsl.g:3378:1: ( ( rule__Diagram__Group_16__0 )? )
            {
            // InternalSiriusTextDsl.g:3378:1: ( ( rule__Diagram__Group_16__0 )? )
            // InternalSiriusTextDsl.g:3379:1: ( rule__Diagram__Group_16__0 )?
            {
             before(grammarAccess.getDiagramAccess().getGroup_16()); 
            // InternalSiriusTextDsl.g:3380:1: ( rule__Diagram__Group_16__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==60) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSiriusTextDsl.g:3380:2: rule__Diagram__Group_16__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Diagram__Group_16__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiagramAccess().getGroup_16()); 

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
    // $ANTLR end "rule__Diagram__Group__16__Impl"


    // $ANTLR start "rule__Diagram__Group__17"
    // InternalSiriusTextDsl.g:3390:1: rule__Diagram__Group__17 : rule__Diagram__Group__17__Impl rule__Diagram__Group__18 ;
    public final void rule__Diagram__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3394:1: ( rule__Diagram__Group__17__Impl rule__Diagram__Group__18 )
            // InternalSiriusTextDsl.g:3395:2: rule__Diagram__Group__17__Impl rule__Diagram__Group__18
            {
            pushFollow(FOLLOW_30);
            rule__Diagram__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__18();

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
    // $ANTLR end "rule__Diagram__Group__17"


    // $ANTLR start "rule__Diagram__Group__17__Impl"
    // InternalSiriusTextDsl.g:3402:1: rule__Diagram__Group__17__Impl : ( ( rule__Diagram__Group_17__0 )? ) ;
    public final void rule__Diagram__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3406:1: ( ( ( rule__Diagram__Group_17__0 )? ) )
            // InternalSiriusTextDsl.g:3407:1: ( ( rule__Diagram__Group_17__0 )? )
            {
            // InternalSiriusTextDsl.g:3407:1: ( ( rule__Diagram__Group_17__0 )? )
            // InternalSiriusTextDsl.g:3408:1: ( rule__Diagram__Group_17__0 )?
            {
             before(grammarAccess.getDiagramAccess().getGroup_17()); 
            // InternalSiriusTextDsl.g:3409:1: ( rule__Diagram__Group_17__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==61) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSiriusTextDsl.g:3409:2: rule__Diagram__Group_17__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Diagram__Group_17__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiagramAccess().getGroup_17()); 

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
    // $ANTLR end "rule__Diagram__Group__17__Impl"


    // $ANTLR start "rule__Diagram__Group__18"
    // InternalSiriusTextDsl.g:3419:1: rule__Diagram__Group__18 : rule__Diagram__Group__18__Impl rule__Diagram__Group__19 ;
    public final void rule__Diagram__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3423:1: ( rule__Diagram__Group__18__Impl rule__Diagram__Group__19 )
            // InternalSiriusTextDsl.g:3424:2: rule__Diagram__Group__18__Impl rule__Diagram__Group__19
            {
            pushFollow(FOLLOW_30);
            rule__Diagram__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__19();

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
    // $ANTLR end "rule__Diagram__Group__18"


    // $ANTLR start "rule__Diagram__Group__18__Impl"
    // InternalSiriusTextDsl.g:3431:1: rule__Diagram__Group__18__Impl : ( ( rule__Diagram__Group_18__0 )? ) ;
    public final void rule__Diagram__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3435:1: ( ( ( rule__Diagram__Group_18__0 )? ) )
            // InternalSiriusTextDsl.g:3436:1: ( ( rule__Diagram__Group_18__0 )? )
            {
            // InternalSiriusTextDsl.g:3436:1: ( ( rule__Diagram__Group_18__0 )? )
            // InternalSiriusTextDsl.g:3437:1: ( rule__Diagram__Group_18__0 )?
            {
             before(grammarAccess.getDiagramAccess().getGroup_18()); 
            // InternalSiriusTextDsl.g:3438:1: ( rule__Diagram__Group_18__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==62) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSiriusTextDsl.g:3438:2: rule__Diagram__Group_18__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Diagram__Group_18__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiagramAccess().getGroup_18()); 

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
    // $ANTLR end "rule__Diagram__Group__18__Impl"


    // $ANTLR start "rule__Diagram__Group__19"
    // InternalSiriusTextDsl.g:3448:1: rule__Diagram__Group__19 : rule__Diagram__Group__19__Impl rule__Diagram__Group__20 ;
    public final void rule__Diagram__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3452:1: ( rule__Diagram__Group__19__Impl rule__Diagram__Group__20 )
            // InternalSiriusTextDsl.g:3453:2: rule__Diagram__Group__19__Impl rule__Diagram__Group__20
            {
            pushFollow(FOLLOW_30);
            rule__Diagram__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__20();

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
    // $ANTLR end "rule__Diagram__Group__19"


    // $ANTLR start "rule__Diagram__Group__19__Impl"
    // InternalSiriusTextDsl.g:3460:1: rule__Diagram__Group__19__Impl : ( ( rule__Diagram__Group_19__0 )? ) ;
    public final void rule__Diagram__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3464:1: ( ( ( rule__Diagram__Group_19__0 )? ) )
            // InternalSiriusTextDsl.g:3465:1: ( ( rule__Diagram__Group_19__0 )? )
            {
            // InternalSiriusTextDsl.g:3465:1: ( ( rule__Diagram__Group_19__0 )? )
            // InternalSiriusTextDsl.g:3466:1: ( rule__Diagram__Group_19__0 )?
            {
             before(grammarAccess.getDiagramAccess().getGroup_19()); 
            // InternalSiriusTextDsl.g:3467:1: ( rule__Diagram__Group_19__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==63) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSiriusTextDsl.g:3467:2: rule__Diagram__Group_19__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Diagram__Group_19__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiagramAccess().getGroup_19()); 

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
    // $ANTLR end "rule__Diagram__Group__19__Impl"


    // $ANTLR start "rule__Diagram__Group__20"
    // InternalSiriusTextDsl.g:3477:1: rule__Diagram__Group__20 : rule__Diagram__Group__20__Impl rule__Diagram__Group__21 ;
    public final void rule__Diagram__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3481:1: ( rule__Diagram__Group__20__Impl rule__Diagram__Group__21 )
            // InternalSiriusTextDsl.g:3482:2: rule__Diagram__Group__20__Impl rule__Diagram__Group__21
            {
            pushFollow(FOLLOW_30);
            rule__Diagram__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__21();

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
    // $ANTLR end "rule__Diagram__Group__20"


    // $ANTLR start "rule__Diagram__Group__20__Impl"
    // InternalSiriusTextDsl.g:3489:1: rule__Diagram__Group__20__Impl : ( ( rule__Diagram__Group_20__0 )? ) ;
    public final void rule__Diagram__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3493:1: ( ( ( rule__Diagram__Group_20__0 )? ) )
            // InternalSiriusTextDsl.g:3494:1: ( ( rule__Diagram__Group_20__0 )? )
            {
            // InternalSiriusTextDsl.g:3494:1: ( ( rule__Diagram__Group_20__0 )? )
            // InternalSiriusTextDsl.g:3495:1: ( rule__Diagram__Group_20__0 )?
            {
             before(grammarAccess.getDiagramAccess().getGroup_20()); 
            // InternalSiriusTextDsl.g:3496:1: ( rule__Diagram__Group_20__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==64) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSiriusTextDsl.g:3496:2: rule__Diagram__Group_20__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Diagram__Group_20__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiagramAccess().getGroup_20()); 

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
    // $ANTLR end "rule__Diagram__Group__20__Impl"


    // $ANTLR start "rule__Diagram__Group__21"
    // InternalSiriusTextDsl.g:3506:1: rule__Diagram__Group__21 : rule__Diagram__Group__21__Impl ;
    public final void rule__Diagram__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3510:1: ( rule__Diagram__Group__21__Impl )
            // InternalSiriusTextDsl.g:3511:2: rule__Diagram__Group__21__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group__21__Impl();

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
    // $ANTLR end "rule__Diagram__Group__21"


    // $ANTLR start "rule__Diagram__Group__21__Impl"
    // InternalSiriusTextDsl.g:3517:1: rule__Diagram__Group__21__Impl : ( '}' ) ;
    public final void rule__Diagram__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3521:1: ( ( '}' ) )
            // InternalSiriusTextDsl.g:3522:1: ( '}' )
            {
            // InternalSiriusTextDsl.g:3522:1: ( '}' )
            // InternalSiriusTextDsl.g:3523:1: '}'
            {
             before(grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_21()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_21()); 

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
    // $ANTLR end "rule__Diagram__Group__21__Impl"


    // $ANTLR start "rule__Diagram__Group_7__0"
    // InternalSiriusTextDsl.g:3580:1: rule__Diagram__Group_7__0 : rule__Diagram__Group_7__0__Impl rule__Diagram__Group_7__1 ;
    public final void rule__Diagram__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3584:1: ( rule__Diagram__Group_7__0__Impl rule__Diagram__Group_7__1 )
            // InternalSiriusTextDsl.g:3585:2: rule__Diagram__Group_7__0__Impl rule__Diagram__Group_7__1
            {
            pushFollow(FOLLOW_14);
            rule__Diagram__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_7__1();

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
    // $ANTLR end "rule__Diagram__Group_7__0"


    // $ANTLR start "rule__Diagram__Group_7__0__Impl"
    // InternalSiriusTextDsl.g:3592:1: rule__Diagram__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Diagram__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3596:1: ( ( ',' ) )
            // InternalSiriusTextDsl.g:3597:1: ( ',' )
            {
            // InternalSiriusTextDsl.g:3597:1: ( ',' )
            // InternalSiriusTextDsl.g:3598:1: ','
            {
             before(grammarAccess.getDiagramAccess().getCommaKeyword_7_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getCommaKeyword_7_0()); 

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
    // $ANTLR end "rule__Diagram__Group_7__0__Impl"


    // $ANTLR start "rule__Diagram__Group_7__1"
    // InternalSiriusTextDsl.g:3611:1: rule__Diagram__Group_7__1 : rule__Diagram__Group_7__1__Impl ;
    public final void rule__Diagram__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3615:1: ( rule__Diagram__Group_7__1__Impl )
            // InternalSiriusTextDsl.g:3616:2: rule__Diagram__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group_7__1__Impl();

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
    // $ANTLR end "rule__Diagram__Group_7__1"


    // $ANTLR start "rule__Diagram__Group_7__1__Impl"
    // InternalSiriusTextDsl.g:3622:1: rule__Diagram__Group_7__1__Impl : ( ( rule__Diagram__MetamodelUrisAssignment_7_1 ) ) ;
    public final void rule__Diagram__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3626:1: ( ( ( rule__Diagram__MetamodelUrisAssignment_7_1 ) ) )
            // InternalSiriusTextDsl.g:3627:1: ( ( rule__Diagram__MetamodelUrisAssignment_7_1 ) )
            {
            // InternalSiriusTextDsl.g:3627:1: ( ( rule__Diagram__MetamodelUrisAssignment_7_1 ) )
            // InternalSiriusTextDsl.g:3628:1: ( rule__Diagram__MetamodelUrisAssignment_7_1 )
            {
             before(grammarAccess.getDiagramAccess().getMetamodelUrisAssignment_7_1()); 
            // InternalSiriusTextDsl.g:3629:1: ( rule__Diagram__MetamodelUrisAssignment_7_1 )
            // InternalSiriusTextDsl.g:3629:2: rule__Diagram__MetamodelUrisAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__MetamodelUrisAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getMetamodelUrisAssignment_7_1()); 

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
    // $ANTLR end "rule__Diagram__Group_7__1__Impl"


    // $ANTLR start "rule__Diagram__Group_11__0"
    // InternalSiriusTextDsl.g:3643:1: rule__Diagram__Group_11__0 : rule__Diagram__Group_11__0__Impl rule__Diagram__Group_11__1 ;
    public final void rule__Diagram__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3647:1: ( rule__Diagram__Group_11__0__Impl rule__Diagram__Group_11__1 )
            // InternalSiriusTextDsl.g:3648:2: rule__Diagram__Group_11__0__Impl rule__Diagram__Group_11__1
            {
            pushFollow(FOLLOW_14);
            rule__Diagram__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_11__1();

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
    // $ANTLR end "rule__Diagram__Group_11__0"


    // $ANTLR start "rule__Diagram__Group_11__0__Impl"
    // InternalSiriusTextDsl.g:3655:1: rule__Diagram__Group_11__0__Impl : ( 'as' ) ;
    public final void rule__Diagram__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3659:1: ( ( 'as' ) )
            // InternalSiriusTextDsl.g:3660:1: ( 'as' )
            {
            // InternalSiriusTextDsl.g:3660:1: ( 'as' )
            // InternalSiriusTextDsl.g:3661:1: 'as'
            {
             before(grammarAccess.getDiagramAccess().getAsKeyword_11_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getAsKeyword_11_0()); 

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
    // $ANTLR end "rule__Diagram__Group_11__0__Impl"


    // $ANTLR start "rule__Diagram__Group_11__1"
    // InternalSiriusTextDsl.g:3674:1: rule__Diagram__Group_11__1 : rule__Diagram__Group_11__1__Impl ;
    public final void rule__Diagram__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3678:1: ( rule__Diagram__Group_11__1__Impl )
            // InternalSiriusTextDsl.g:3679:2: rule__Diagram__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group_11__1__Impl();

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
    // $ANTLR end "rule__Diagram__Group_11__1"


    // $ANTLR start "rule__Diagram__Group_11__1__Impl"
    // InternalSiriusTextDsl.g:3685:1: rule__Diagram__Group_11__1__Impl : ( ( rule__Diagram__LabelAssignment_11_1 ) ) ;
    public final void rule__Diagram__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3689:1: ( ( ( rule__Diagram__LabelAssignment_11_1 ) ) )
            // InternalSiriusTextDsl.g:3690:1: ( ( rule__Diagram__LabelAssignment_11_1 ) )
            {
            // InternalSiriusTextDsl.g:3690:1: ( ( rule__Diagram__LabelAssignment_11_1 ) )
            // InternalSiriusTextDsl.g:3691:1: ( rule__Diagram__LabelAssignment_11_1 )
            {
             before(grammarAccess.getDiagramAccess().getLabelAssignment_11_1()); 
            // InternalSiriusTextDsl.g:3692:1: ( rule__Diagram__LabelAssignment_11_1 )
            // InternalSiriusTextDsl.g:3692:2: rule__Diagram__LabelAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__LabelAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getLabelAssignment_11_1()); 

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
    // $ANTLR end "rule__Diagram__Group_11__1__Impl"


    // $ANTLR start "rule__Diagram__Group_14__0"
    // InternalSiriusTextDsl.g:3706:1: rule__Diagram__Group_14__0 : rule__Diagram__Group_14__0__Impl rule__Diagram__Group_14__1 ;
    public final void rule__Diagram__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3710:1: ( rule__Diagram__Group_14__0__Impl rule__Diagram__Group_14__1 )
            // InternalSiriusTextDsl.g:3711:2: rule__Diagram__Group_14__0__Impl rule__Diagram__Group_14__1
            {
            pushFollow(FOLLOW_31);
            rule__Diagram__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_14__1();

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
    // $ANTLR end "rule__Diagram__Group_14__0"


    // $ANTLR start "rule__Diagram__Group_14__0__Impl"
    // InternalSiriusTextDsl.g:3718:1: rule__Diagram__Group_14__0__Impl : ( '?' ) ;
    public final void rule__Diagram__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3722:1: ( ( '?' ) )
            // InternalSiriusTextDsl.g:3723:1: ( '?' )
            {
            // InternalSiriusTextDsl.g:3723:1: ( '?' )
            // InternalSiriusTextDsl.g:3724:1: '?'
            {
             before(grammarAccess.getDiagramAccess().getQuestionMarkKeyword_14_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getQuestionMarkKeyword_14_0()); 

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
    // $ANTLR end "rule__Diagram__Group_14__0__Impl"


    // $ANTLR start "rule__Diagram__Group_14__1"
    // InternalSiriusTextDsl.g:3737:1: rule__Diagram__Group_14__1 : rule__Diagram__Group_14__1__Impl ;
    public final void rule__Diagram__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3741:1: ( rule__Diagram__Group_14__1__Impl )
            // InternalSiriusTextDsl.g:3742:2: rule__Diagram__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group_14__1__Impl();

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
    // $ANTLR end "rule__Diagram__Group_14__1"


    // $ANTLR start "rule__Diagram__Group_14__1__Impl"
    // InternalSiriusTextDsl.g:3748:1: rule__Diagram__Group_14__1__Impl : ( ( rule__Diagram__PreconditionAssignment_14_1 ) ) ;
    public final void rule__Diagram__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3752:1: ( ( ( rule__Diagram__PreconditionAssignment_14_1 ) ) )
            // InternalSiriusTextDsl.g:3753:1: ( ( rule__Diagram__PreconditionAssignment_14_1 ) )
            {
            // InternalSiriusTextDsl.g:3753:1: ( ( rule__Diagram__PreconditionAssignment_14_1 ) )
            // InternalSiriusTextDsl.g:3754:1: ( rule__Diagram__PreconditionAssignment_14_1 )
            {
             before(grammarAccess.getDiagramAccess().getPreconditionAssignment_14_1()); 
            // InternalSiriusTextDsl.g:3755:1: ( rule__Diagram__PreconditionAssignment_14_1 )
            // InternalSiriusTextDsl.g:3755:2: rule__Diagram__PreconditionAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__PreconditionAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getPreconditionAssignment_14_1()); 

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
    // $ANTLR end "rule__Diagram__Group_14__1__Impl"


    // $ANTLR start "rule__Diagram__Group_16__0"
    // InternalSiriusTextDsl.g:3769:1: rule__Diagram__Group_16__0 : rule__Diagram__Group_16__0__Impl rule__Diagram__Group_16__1 ;
    public final void rule__Diagram__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3773:1: ( rule__Diagram__Group_16__0__Impl rule__Diagram__Group_16__1 )
            // InternalSiriusTextDsl.g:3774:2: rule__Diagram__Group_16__0__Impl rule__Diagram__Group_16__1
            {
            pushFollow(FOLLOW_17);
            rule__Diagram__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_16__1();

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
    // $ANTLR end "rule__Diagram__Group_16__0"


    // $ANTLR start "rule__Diagram__Group_16__0__Impl"
    // InternalSiriusTextDsl.g:3781:1: rule__Diagram__Group_16__0__Impl : ( 'documentation' ) ;
    public final void rule__Diagram__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3785:1: ( ( 'documentation' ) )
            // InternalSiriusTextDsl.g:3786:1: ( 'documentation' )
            {
            // InternalSiriusTextDsl.g:3786:1: ( 'documentation' )
            // InternalSiriusTextDsl.g:3787:1: 'documentation'
            {
             before(grammarAccess.getDiagramAccess().getDocumentationKeyword_16_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getDocumentationKeyword_16_0()); 

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
    // $ANTLR end "rule__Diagram__Group_16__0__Impl"


    // $ANTLR start "rule__Diagram__Group_16__1"
    // InternalSiriusTextDsl.g:3800:1: rule__Diagram__Group_16__1 : rule__Diagram__Group_16__1__Impl rule__Diagram__Group_16__2 ;
    public final void rule__Diagram__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3804:1: ( rule__Diagram__Group_16__1__Impl rule__Diagram__Group_16__2 )
            // InternalSiriusTextDsl.g:3805:2: rule__Diagram__Group_16__1__Impl rule__Diagram__Group_16__2
            {
            pushFollow(FOLLOW_14);
            rule__Diagram__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_16__2();

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
    // $ANTLR end "rule__Diagram__Group_16__1"


    // $ANTLR start "rule__Diagram__Group_16__1__Impl"
    // InternalSiriusTextDsl.g:3812:1: rule__Diagram__Group_16__1__Impl : ( '=' ) ;
    public final void rule__Diagram__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3816:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:3817:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:3817:1: ( '=' )
            // InternalSiriusTextDsl.g:3818:1: '='
            {
             before(grammarAccess.getDiagramAccess().getEqualsSignKeyword_16_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getEqualsSignKeyword_16_1()); 

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
    // $ANTLR end "rule__Diagram__Group_16__1__Impl"


    // $ANTLR start "rule__Diagram__Group_16__2"
    // InternalSiriusTextDsl.g:3831:1: rule__Diagram__Group_16__2 : rule__Diagram__Group_16__2__Impl ;
    public final void rule__Diagram__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3835:1: ( rule__Diagram__Group_16__2__Impl )
            // InternalSiriusTextDsl.g:3836:2: rule__Diagram__Group_16__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group_16__2__Impl();

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
    // $ANTLR end "rule__Diagram__Group_16__2"


    // $ANTLR start "rule__Diagram__Group_16__2__Impl"
    // InternalSiriusTextDsl.g:3842:1: rule__Diagram__Group_16__2__Impl : ( ( rule__Diagram__EndUserDocumentationAssignment_16_2 ) ) ;
    public final void rule__Diagram__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3846:1: ( ( ( rule__Diagram__EndUserDocumentationAssignment_16_2 ) ) )
            // InternalSiriusTextDsl.g:3847:1: ( ( rule__Diagram__EndUserDocumentationAssignment_16_2 ) )
            {
            // InternalSiriusTextDsl.g:3847:1: ( ( rule__Diagram__EndUserDocumentationAssignment_16_2 ) )
            // InternalSiriusTextDsl.g:3848:1: ( rule__Diagram__EndUserDocumentationAssignment_16_2 )
            {
             before(grammarAccess.getDiagramAccess().getEndUserDocumentationAssignment_16_2()); 
            // InternalSiriusTextDsl.g:3849:1: ( rule__Diagram__EndUserDocumentationAssignment_16_2 )
            // InternalSiriusTextDsl.g:3849:2: rule__Diagram__EndUserDocumentationAssignment_16_2
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__EndUserDocumentationAssignment_16_2();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getEndUserDocumentationAssignment_16_2()); 

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
    // $ANTLR end "rule__Diagram__Group_16__2__Impl"


    // $ANTLR start "rule__Diagram__Group_17__0"
    // InternalSiriusTextDsl.g:3865:1: rule__Diagram__Group_17__0 : rule__Diagram__Group_17__0__Impl rule__Diagram__Group_17__1 ;
    public final void rule__Diagram__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3869:1: ( rule__Diagram__Group_17__0__Impl rule__Diagram__Group_17__1 )
            // InternalSiriusTextDsl.g:3870:2: rule__Diagram__Group_17__0__Impl rule__Diagram__Group_17__1
            {
            pushFollow(FOLLOW_17);
            rule__Diagram__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_17__1();

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
    // $ANTLR end "rule__Diagram__Group_17__0"


    // $ANTLR start "rule__Diagram__Group_17__0__Impl"
    // InternalSiriusTextDsl.g:3877:1: rule__Diagram__Group_17__0__Impl : ( 'titleExpression' ) ;
    public final void rule__Diagram__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3881:1: ( ( 'titleExpression' ) )
            // InternalSiriusTextDsl.g:3882:1: ( 'titleExpression' )
            {
            // InternalSiriusTextDsl.g:3882:1: ( 'titleExpression' )
            // InternalSiriusTextDsl.g:3883:1: 'titleExpression'
            {
             before(grammarAccess.getDiagramAccess().getTitleExpressionKeyword_17_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getTitleExpressionKeyword_17_0()); 

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
    // $ANTLR end "rule__Diagram__Group_17__0__Impl"


    // $ANTLR start "rule__Diagram__Group_17__1"
    // InternalSiriusTextDsl.g:3896:1: rule__Diagram__Group_17__1 : rule__Diagram__Group_17__1__Impl rule__Diagram__Group_17__2 ;
    public final void rule__Diagram__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3900:1: ( rule__Diagram__Group_17__1__Impl rule__Diagram__Group_17__2 )
            // InternalSiriusTextDsl.g:3901:2: rule__Diagram__Group_17__1__Impl rule__Diagram__Group_17__2
            {
            pushFollow(FOLLOW_31);
            rule__Diagram__Group_17__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_17__2();

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
    // $ANTLR end "rule__Diagram__Group_17__1"


    // $ANTLR start "rule__Diagram__Group_17__1__Impl"
    // InternalSiriusTextDsl.g:3908:1: rule__Diagram__Group_17__1__Impl : ( '=' ) ;
    public final void rule__Diagram__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3912:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:3913:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:3913:1: ( '=' )
            // InternalSiriusTextDsl.g:3914:1: '='
            {
             before(grammarAccess.getDiagramAccess().getEqualsSignKeyword_17_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getEqualsSignKeyword_17_1()); 

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
    // $ANTLR end "rule__Diagram__Group_17__1__Impl"


    // $ANTLR start "rule__Diagram__Group_17__2"
    // InternalSiriusTextDsl.g:3927:1: rule__Diagram__Group_17__2 : rule__Diagram__Group_17__2__Impl ;
    public final void rule__Diagram__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3931:1: ( rule__Diagram__Group_17__2__Impl )
            // InternalSiriusTextDsl.g:3932:2: rule__Diagram__Group_17__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group_17__2__Impl();

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
    // $ANTLR end "rule__Diagram__Group_17__2"


    // $ANTLR start "rule__Diagram__Group_17__2__Impl"
    // InternalSiriusTextDsl.g:3938:1: rule__Diagram__Group_17__2__Impl : ( ( rule__Diagram__TitleExpressionAssignment_17_2 ) ) ;
    public final void rule__Diagram__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3942:1: ( ( ( rule__Diagram__TitleExpressionAssignment_17_2 ) ) )
            // InternalSiriusTextDsl.g:3943:1: ( ( rule__Diagram__TitleExpressionAssignment_17_2 ) )
            {
            // InternalSiriusTextDsl.g:3943:1: ( ( rule__Diagram__TitleExpressionAssignment_17_2 ) )
            // InternalSiriusTextDsl.g:3944:1: ( rule__Diagram__TitleExpressionAssignment_17_2 )
            {
             before(grammarAccess.getDiagramAccess().getTitleExpressionAssignment_17_2()); 
            // InternalSiriusTextDsl.g:3945:1: ( rule__Diagram__TitleExpressionAssignment_17_2 )
            // InternalSiriusTextDsl.g:3945:2: rule__Diagram__TitleExpressionAssignment_17_2
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__TitleExpressionAssignment_17_2();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getTitleExpressionAssignment_17_2()); 

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
    // $ANTLR end "rule__Diagram__Group_17__2__Impl"


    // $ANTLR start "rule__Diagram__Group_18__0"
    // InternalSiriusTextDsl.g:3961:1: rule__Diagram__Group_18__0 : rule__Diagram__Group_18__0__Impl rule__Diagram__Group_18__1 ;
    public final void rule__Diagram__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3965:1: ( rule__Diagram__Group_18__0__Impl rule__Diagram__Group_18__1 )
            // InternalSiriusTextDsl.g:3966:2: rule__Diagram__Group_18__0__Impl rule__Diagram__Group_18__1
            {
            pushFollow(FOLLOW_17);
            rule__Diagram__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_18__1();

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
    // $ANTLR end "rule__Diagram__Group_18__0"


    // $ANTLR start "rule__Diagram__Group_18__0__Impl"
    // InternalSiriusTextDsl.g:3973:1: rule__Diagram__Group_18__0__Impl : ( 'rootExpression' ) ;
    public final void rule__Diagram__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3977:1: ( ( 'rootExpression' ) )
            // InternalSiriusTextDsl.g:3978:1: ( 'rootExpression' )
            {
            // InternalSiriusTextDsl.g:3978:1: ( 'rootExpression' )
            // InternalSiriusTextDsl.g:3979:1: 'rootExpression'
            {
             before(grammarAccess.getDiagramAccess().getRootExpressionKeyword_18_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getRootExpressionKeyword_18_0()); 

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
    // $ANTLR end "rule__Diagram__Group_18__0__Impl"


    // $ANTLR start "rule__Diagram__Group_18__1"
    // InternalSiriusTextDsl.g:3992:1: rule__Diagram__Group_18__1 : rule__Diagram__Group_18__1__Impl rule__Diagram__Group_18__2 ;
    public final void rule__Diagram__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3996:1: ( rule__Diagram__Group_18__1__Impl rule__Diagram__Group_18__2 )
            // InternalSiriusTextDsl.g:3997:2: rule__Diagram__Group_18__1__Impl rule__Diagram__Group_18__2
            {
            pushFollow(FOLLOW_31);
            rule__Diagram__Group_18__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_18__2();

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
    // $ANTLR end "rule__Diagram__Group_18__1"


    // $ANTLR start "rule__Diagram__Group_18__1__Impl"
    // InternalSiriusTextDsl.g:4004:1: rule__Diagram__Group_18__1__Impl : ( '=' ) ;
    public final void rule__Diagram__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4008:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:4009:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:4009:1: ( '=' )
            // InternalSiriusTextDsl.g:4010:1: '='
            {
             before(grammarAccess.getDiagramAccess().getEqualsSignKeyword_18_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getEqualsSignKeyword_18_1()); 

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
    // $ANTLR end "rule__Diagram__Group_18__1__Impl"


    // $ANTLR start "rule__Diagram__Group_18__2"
    // InternalSiriusTextDsl.g:4023:1: rule__Diagram__Group_18__2 : rule__Diagram__Group_18__2__Impl ;
    public final void rule__Diagram__Group_18__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4027:1: ( rule__Diagram__Group_18__2__Impl )
            // InternalSiriusTextDsl.g:4028:2: rule__Diagram__Group_18__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group_18__2__Impl();

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
    // $ANTLR end "rule__Diagram__Group_18__2"


    // $ANTLR start "rule__Diagram__Group_18__2__Impl"
    // InternalSiriusTextDsl.g:4034:1: rule__Diagram__Group_18__2__Impl : ( ( rule__Diagram__RootExpressionAssignment_18_2 ) ) ;
    public final void rule__Diagram__Group_18__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4038:1: ( ( ( rule__Diagram__RootExpressionAssignment_18_2 ) ) )
            // InternalSiriusTextDsl.g:4039:1: ( ( rule__Diagram__RootExpressionAssignment_18_2 ) )
            {
            // InternalSiriusTextDsl.g:4039:1: ( ( rule__Diagram__RootExpressionAssignment_18_2 ) )
            // InternalSiriusTextDsl.g:4040:1: ( rule__Diagram__RootExpressionAssignment_18_2 )
            {
             before(grammarAccess.getDiagramAccess().getRootExpressionAssignment_18_2()); 
            // InternalSiriusTextDsl.g:4041:1: ( rule__Diagram__RootExpressionAssignment_18_2 )
            // InternalSiriusTextDsl.g:4041:2: rule__Diagram__RootExpressionAssignment_18_2
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__RootExpressionAssignment_18_2();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getRootExpressionAssignment_18_2()); 

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
    // $ANTLR end "rule__Diagram__Group_18__2__Impl"


    // $ANTLR start "rule__Diagram__Group_19__0"
    // InternalSiriusTextDsl.g:4057:1: rule__Diagram__Group_19__0 : rule__Diagram__Group_19__0__Impl rule__Diagram__Group_19__1 ;
    public final void rule__Diagram__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4061:1: ( rule__Diagram__Group_19__0__Impl rule__Diagram__Group_19__1 )
            // InternalSiriusTextDsl.g:4062:2: rule__Diagram__Group_19__0__Impl rule__Diagram__Group_19__1
            {
            pushFollow(FOLLOW_17);
            rule__Diagram__Group_19__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_19__1();

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
    // $ANTLR end "rule__Diagram__Group_19__0"


    // $ANTLR start "rule__Diagram__Group_19__0__Impl"
    // InternalSiriusTextDsl.g:4069:1: rule__Diagram__Group_19__0__Impl : ( 'defaultLayer' ) ;
    public final void rule__Diagram__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4073:1: ( ( 'defaultLayer' ) )
            // InternalSiriusTextDsl.g:4074:1: ( 'defaultLayer' )
            {
            // InternalSiriusTextDsl.g:4074:1: ( 'defaultLayer' )
            // InternalSiriusTextDsl.g:4075:1: 'defaultLayer'
            {
             before(grammarAccess.getDiagramAccess().getDefaultLayerKeyword_19_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getDefaultLayerKeyword_19_0()); 

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
    // $ANTLR end "rule__Diagram__Group_19__0__Impl"


    // $ANTLR start "rule__Diagram__Group_19__1"
    // InternalSiriusTextDsl.g:4088:1: rule__Diagram__Group_19__1 : rule__Diagram__Group_19__1__Impl rule__Diagram__Group_19__2 ;
    public final void rule__Diagram__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4092:1: ( rule__Diagram__Group_19__1__Impl rule__Diagram__Group_19__2 )
            // InternalSiriusTextDsl.g:4093:2: rule__Diagram__Group_19__1__Impl rule__Diagram__Group_19__2
            {
            pushFollow(FOLLOW_4);
            rule__Diagram__Group_19__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_19__2();

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
    // $ANTLR end "rule__Diagram__Group_19__1"


    // $ANTLR start "rule__Diagram__Group_19__1__Impl"
    // InternalSiriusTextDsl.g:4100:1: rule__Diagram__Group_19__1__Impl : ( '=' ) ;
    public final void rule__Diagram__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4104:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:4105:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:4105:1: ( '=' )
            // InternalSiriusTextDsl.g:4106:1: '='
            {
             before(grammarAccess.getDiagramAccess().getEqualsSignKeyword_19_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getEqualsSignKeyword_19_1()); 

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
    // $ANTLR end "rule__Diagram__Group_19__1__Impl"


    // $ANTLR start "rule__Diagram__Group_19__2"
    // InternalSiriusTextDsl.g:4119:1: rule__Diagram__Group_19__2 : rule__Diagram__Group_19__2__Impl ;
    public final void rule__Diagram__Group_19__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4123:1: ( rule__Diagram__Group_19__2__Impl )
            // InternalSiriusTextDsl.g:4124:2: rule__Diagram__Group_19__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group_19__2__Impl();

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
    // $ANTLR end "rule__Diagram__Group_19__2"


    // $ANTLR start "rule__Diagram__Group_19__2__Impl"
    // InternalSiriusTextDsl.g:4130:1: rule__Diagram__Group_19__2__Impl : ( ( rule__Diagram__DefaultLayerAssignment_19_2 ) ) ;
    public final void rule__Diagram__Group_19__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4134:1: ( ( ( rule__Diagram__DefaultLayerAssignment_19_2 ) ) )
            // InternalSiriusTextDsl.g:4135:1: ( ( rule__Diagram__DefaultLayerAssignment_19_2 ) )
            {
            // InternalSiriusTextDsl.g:4135:1: ( ( rule__Diagram__DefaultLayerAssignment_19_2 ) )
            // InternalSiriusTextDsl.g:4136:1: ( rule__Diagram__DefaultLayerAssignment_19_2 )
            {
             before(grammarAccess.getDiagramAccess().getDefaultLayerAssignment_19_2()); 
            // InternalSiriusTextDsl.g:4137:1: ( rule__Diagram__DefaultLayerAssignment_19_2 )
            // InternalSiriusTextDsl.g:4137:2: rule__Diagram__DefaultLayerAssignment_19_2
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__DefaultLayerAssignment_19_2();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getDefaultLayerAssignment_19_2()); 

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
    // $ANTLR end "rule__Diagram__Group_19__2__Impl"


    // $ANTLR start "rule__Diagram__Group_20__0"
    // InternalSiriusTextDsl.g:4153:1: rule__Diagram__Group_20__0 : rule__Diagram__Group_20__0__Impl rule__Diagram__Group_20__1 ;
    public final void rule__Diagram__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4157:1: ( rule__Diagram__Group_20__0__Impl rule__Diagram__Group_20__1 )
            // InternalSiriusTextDsl.g:4158:2: rule__Diagram__Group_20__0__Impl rule__Diagram__Group_20__1
            {
            pushFollow(FOLLOW_17);
            rule__Diagram__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_20__1();

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
    // $ANTLR end "rule__Diagram__Group_20__0"


    // $ANTLR start "rule__Diagram__Group_20__0__Impl"
    // InternalSiriusTextDsl.g:4165:1: rule__Diagram__Group_20__0__Impl : ( 'additionalLayers' ) ;
    public final void rule__Diagram__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4169:1: ( ( 'additionalLayers' ) )
            // InternalSiriusTextDsl.g:4170:1: ( 'additionalLayers' )
            {
            // InternalSiriusTextDsl.g:4170:1: ( 'additionalLayers' )
            // InternalSiriusTextDsl.g:4171:1: 'additionalLayers'
            {
             before(grammarAccess.getDiagramAccess().getAdditionalLayersKeyword_20_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getAdditionalLayersKeyword_20_0()); 

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
    // $ANTLR end "rule__Diagram__Group_20__0__Impl"


    // $ANTLR start "rule__Diagram__Group_20__1"
    // InternalSiriusTextDsl.g:4184:1: rule__Diagram__Group_20__1 : rule__Diagram__Group_20__1__Impl rule__Diagram__Group_20__2 ;
    public final void rule__Diagram__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4188:1: ( rule__Diagram__Group_20__1__Impl rule__Diagram__Group_20__2 )
            // InternalSiriusTextDsl.g:4189:2: rule__Diagram__Group_20__1__Impl rule__Diagram__Group_20__2
            {
            pushFollow(FOLLOW_18);
            rule__Diagram__Group_20__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_20__2();

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
    // $ANTLR end "rule__Diagram__Group_20__1"


    // $ANTLR start "rule__Diagram__Group_20__1__Impl"
    // InternalSiriusTextDsl.g:4196:1: rule__Diagram__Group_20__1__Impl : ( '=' ) ;
    public final void rule__Diagram__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4200:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:4201:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:4201:1: ( '=' )
            // InternalSiriusTextDsl.g:4202:1: '='
            {
             before(grammarAccess.getDiagramAccess().getEqualsSignKeyword_20_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getEqualsSignKeyword_20_1()); 

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
    // $ANTLR end "rule__Diagram__Group_20__1__Impl"


    // $ANTLR start "rule__Diagram__Group_20__2"
    // InternalSiriusTextDsl.g:4215:1: rule__Diagram__Group_20__2 : rule__Diagram__Group_20__2__Impl rule__Diagram__Group_20__3 ;
    public final void rule__Diagram__Group_20__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4219:1: ( rule__Diagram__Group_20__2__Impl rule__Diagram__Group_20__3 )
            // InternalSiriusTextDsl.g:4220:2: rule__Diagram__Group_20__2__Impl rule__Diagram__Group_20__3
            {
            pushFollow(FOLLOW_21);
            rule__Diagram__Group_20__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_20__3();

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
    // $ANTLR end "rule__Diagram__Group_20__2"


    // $ANTLR start "rule__Diagram__Group_20__2__Impl"
    // InternalSiriusTextDsl.g:4227:1: rule__Diagram__Group_20__2__Impl : ( '[' ) ;
    public final void rule__Diagram__Group_20__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4231:1: ( ( '[' ) )
            // InternalSiriusTextDsl.g:4232:1: ( '[' )
            {
            // InternalSiriusTextDsl.g:4232:1: ( '[' )
            // InternalSiriusTextDsl.g:4233:1: '['
            {
             before(grammarAccess.getDiagramAccess().getLeftSquareBracketKeyword_20_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getLeftSquareBracketKeyword_20_2()); 

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
    // $ANTLR end "rule__Diagram__Group_20__2__Impl"


    // $ANTLR start "rule__Diagram__Group_20__3"
    // InternalSiriusTextDsl.g:4246:1: rule__Diagram__Group_20__3 : rule__Diagram__Group_20__3__Impl rule__Diagram__Group_20__4 ;
    public final void rule__Diagram__Group_20__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4250:1: ( rule__Diagram__Group_20__3__Impl rule__Diagram__Group_20__4 )
            // InternalSiriusTextDsl.g:4251:2: rule__Diagram__Group_20__3__Impl rule__Diagram__Group_20__4
            {
            pushFollow(FOLLOW_21);
            rule__Diagram__Group_20__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_20__4();

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
    // $ANTLR end "rule__Diagram__Group_20__3"


    // $ANTLR start "rule__Diagram__Group_20__3__Impl"
    // InternalSiriusTextDsl.g:4258:1: rule__Diagram__Group_20__3__Impl : ( ( rule__Diagram__Group_20_3__0 )? ) ;
    public final void rule__Diagram__Group_20__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4262:1: ( ( ( rule__Diagram__Group_20_3__0 )? ) )
            // InternalSiriusTextDsl.g:4263:1: ( ( rule__Diagram__Group_20_3__0 )? )
            {
            // InternalSiriusTextDsl.g:4263:1: ( ( rule__Diagram__Group_20_3__0 )? )
            // InternalSiriusTextDsl.g:4264:1: ( rule__Diagram__Group_20_3__0 )?
            {
             before(grammarAccess.getDiagramAccess().getGroup_20_3()); 
            // InternalSiriusTextDsl.g:4265:1: ( rule__Diagram__Group_20_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSiriusTextDsl.g:4265:2: rule__Diagram__Group_20_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Diagram__Group_20_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiagramAccess().getGroup_20_3()); 

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
    // $ANTLR end "rule__Diagram__Group_20__3__Impl"


    // $ANTLR start "rule__Diagram__Group_20__4"
    // InternalSiriusTextDsl.g:4275:1: rule__Diagram__Group_20__4 : rule__Diagram__Group_20__4__Impl ;
    public final void rule__Diagram__Group_20__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4279:1: ( rule__Diagram__Group_20__4__Impl )
            // InternalSiriusTextDsl.g:4280:2: rule__Diagram__Group_20__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group_20__4__Impl();

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
    // $ANTLR end "rule__Diagram__Group_20__4"


    // $ANTLR start "rule__Diagram__Group_20__4__Impl"
    // InternalSiriusTextDsl.g:4286:1: rule__Diagram__Group_20__4__Impl : ( ']' ) ;
    public final void rule__Diagram__Group_20__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4290:1: ( ( ']' ) )
            // InternalSiriusTextDsl.g:4291:1: ( ']' )
            {
            // InternalSiriusTextDsl.g:4291:1: ( ']' )
            // InternalSiriusTextDsl.g:4292:1: ']'
            {
             before(grammarAccess.getDiagramAccess().getRightSquareBracketKeyword_20_4()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getRightSquareBracketKeyword_20_4()); 

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
    // $ANTLR end "rule__Diagram__Group_20__4__Impl"


    // $ANTLR start "rule__Diagram__Group_20_3__0"
    // InternalSiriusTextDsl.g:4315:1: rule__Diagram__Group_20_3__0 : rule__Diagram__Group_20_3__0__Impl rule__Diagram__Group_20_3__1 ;
    public final void rule__Diagram__Group_20_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4319:1: ( rule__Diagram__Group_20_3__0__Impl rule__Diagram__Group_20_3__1 )
            // InternalSiriusTextDsl.g:4320:2: rule__Diagram__Group_20_3__0__Impl rule__Diagram__Group_20_3__1
            {
            pushFollow(FOLLOW_22);
            rule__Diagram__Group_20_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_20_3__1();

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
    // $ANTLR end "rule__Diagram__Group_20_3__0"


    // $ANTLR start "rule__Diagram__Group_20_3__0__Impl"
    // InternalSiriusTextDsl.g:4327:1: rule__Diagram__Group_20_3__0__Impl : ( ( rule__Diagram__AdditionalLayersAssignment_20_3_0 ) ) ;
    public final void rule__Diagram__Group_20_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4331:1: ( ( ( rule__Diagram__AdditionalLayersAssignment_20_3_0 ) ) )
            // InternalSiriusTextDsl.g:4332:1: ( ( rule__Diagram__AdditionalLayersAssignment_20_3_0 ) )
            {
            // InternalSiriusTextDsl.g:4332:1: ( ( rule__Diagram__AdditionalLayersAssignment_20_3_0 ) )
            // InternalSiriusTextDsl.g:4333:1: ( rule__Diagram__AdditionalLayersAssignment_20_3_0 )
            {
             before(grammarAccess.getDiagramAccess().getAdditionalLayersAssignment_20_3_0()); 
            // InternalSiriusTextDsl.g:4334:1: ( rule__Diagram__AdditionalLayersAssignment_20_3_0 )
            // InternalSiriusTextDsl.g:4334:2: rule__Diagram__AdditionalLayersAssignment_20_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__AdditionalLayersAssignment_20_3_0();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getAdditionalLayersAssignment_20_3_0()); 

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
    // $ANTLR end "rule__Diagram__Group_20_3__0__Impl"


    // $ANTLR start "rule__Diagram__Group_20_3__1"
    // InternalSiriusTextDsl.g:4344:1: rule__Diagram__Group_20_3__1 : rule__Diagram__Group_20_3__1__Impl ;
    public final void rule__Diagram__Group_20_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4348:1: ( rule__Diagram__Group_20_3__1__Impl )
            // InternalSiriusTextDsl.g:4349:2: rule__Diagram__Group_20_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group_20_3__1__Impl();

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
    // $ANTLR end "rule__Diagram__Group_20_3__1"


    // $ANTLR start "rule__Diagram__Group_20_3__1__Impl"
    // InternalSiriusTextDsl.g:4355:1: rule__Diagram__Group_20_3__1__Impl : ( ( rule__Diagram__Group_20_3_1__0 )* ) ;
    public final void rule__Diagram__Group_20_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4359:1: ( ( ( rule__Diagram__Group_20_3_1__0 )* ) )
            // InternalSiriusTextDsl.g:4360:1: ( ( rule__Diagram__Group_20_3_1__0 )* )
            {
            // InternalSiriusTextDsl.g:4360:1: ( ( rule__Diagram__Group_20_3_1__0 )* )
            // InternalSiriusTextDsl.g:4361:1: ( rule__Diagram__Group_20_3_1__0 )*
            {
             before(grammarAccess.getDiagramAccess().getGroup_20_3_1()); 
            // InternalSiriusTextDsl.g:4362:1: ( rule__Diagram__Group_20_3_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==51) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:4362:2: rule__Diagram__Group_20_3_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Diagram__Group_20_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getDiagramAccess().getGroup_20_3_1()); 

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
    // $ANTLR end "rule__Diagram__Group_20_3__1__Impl"


    // $ANTLR start "rule__Diagram__Group_20_3_1__0"
    // InternalSiriusTextDsl.g:4376:1: rule__Diagram__Group_20_3_1__0 : rule__Diagram__Group_20_3_1__0__Impl rule__Diagram__Group_20_3_1__1 ;
    public final void rule__Diagram__Group_20_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4380:1: ( rule__Diagram__Group_20_3_1__0__Impl rule__Diagram__Group_20_3_1__1 )
            // InternalSiriusTextDsl.g:4381:2: rule__Diagram__Group_20_3_1__0__Impl rule__Diagram__Group_20_3_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Diagram__Group_20_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_20_3_1__1();

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
    // $ANTLR end "rule__Diagram__Group_20_3_1__0"


    // $ANTLR start "rule__Diagram__Group_20_3_1__0__Impl"
    // InternalSiriusTextDsl.g:4388:1: rule__Diagram__Group_20_3_1__0__Impl : ( ',' ) ;
    public final void rule__Diagram__Group_20_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4392:1: ( ( ',' ) )
            // InternalSiriusTextDsl.g:4393:1: ( ',' )
            {
            // InternalSiriusTextDsl.g:4393:1: ( ',' )
            // InternalSiriusTextDsl.g:4394:1: ','
            {
             before(grammarAccess.getDiagramAccess().getCommaKeyword_20_3_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getCommaKeyword_20_3_1_0()); 

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
    // $ANTLR end "rule__Diagram__Group_20_3_1__0__Impl"


    // $ANTLR start "rule__Diagram__Group_20_3_1__1"
    // InternalSiriusTextDsl.g:4407:1: rule__Diagram__Group_20_3_1__1 : rule__Diagram__Group_20_3_1__1__Impl ;
    public final void rule__Diagram__Group_20_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4411:1: ( rule__Diagram__Group_20_3_1__1__Impl )
            // InternalSiriusTextDsl.g:4412:2: rule__Diagram__Group_20_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group_20_3_1__1__Impl();

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
    // $ANTLR end "rule__Diagram__Group_20_3_1__1"


    // $ANTLR start "rule__Diagram__Group_20_3_1__1__Impl"
    // InternalSiriusTextDsl.g:4418:1: rule__Diagram__Group_20_3_1__1__Impl : ( ( rule__Diagram__AdditionalLayersAssignment_20_3_1_1 ) ) ;
    public final void rule__Diagram__Group_20_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4422:1: ( ( ( rule__Diagram__AdditionalLayersAssignment_20_3_1_1 ) ) )
            // InternalSiriusTextDsl.g:4423:1: ( ( rule__Diagram__AdditionalLayersAssignment_20_3_1_1 ) )
            {
            // InternalSiriusTextDsl.g:4423:1: ( ( rule__Diagram__AdditionalLayersAssignment_20_3_1_1 ) )
            // InternalSiriusTextDsl.g:4424:1: ( rule__Diagram__AdditionalLayersAssignment_20_3_1_1 )
            {
             before(grammarAccess.getDiagramAccess().getAdditionalLayersAssignment_20_3_1_1()); 
            // InternalSiriusTextDsl.g:4425:1: ( rule__Diagram__AdditionalLayersAssignment_20_3_1_1 )
            // InternalSiriusTextDsl.g:4425:2: rule__Diagram__AdditionalLayersAssignment_20_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__AdditionalLayersAssignment_20_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getAdditionalLayersAssignment_20_3_1_1()); 

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
    // $ANTLR end "rule__Diagram__Group_20_3_1__1__Impl"


    // $ANTLR start "rule__Layer__Group__0"
    // InternalSiriusTextDsl.g:4439:1: rule__Layer__Group__0 : rule__Layer__Group__0__Impl rule__Layer__Group__1 ;
    public final void rule__Layer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4443:1: ( rule__Layer__Group__0__Impl rule__Layer__Group__1 )
            // InternalSiriusTextDsl.g:4444:2: rule__Layer__Group__0__Impl rule__Layer__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Layer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__1();

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
    // $ANTLR end "rule__Layer__Group__0"


    // $ANTLR start "rule__Layer__Group__0__Impl"
    // InternalSiriusTextDsl.g:4451:1: rule__Layer__Group__0__Impl : ( ( rule__Layer__DocumentationAssignment_0 )? ) ;
    public final void rule__Layer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4455:1: ( ( ( rule__Layer__DocumentationAssignment_0 )? ) )
            // InternalSiriusTextDsl.g:4456:1: ( ( rule__Layer__DocumentationAssignment_0 )? )
            {
            // InternalSiriusTextDsl.g:4456:1: ( ( rule__Layer__DocumentationAssignment_0 )? )
            // InternalSiriusTextDsl.g:4457:1: ( rule__Layer__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getLayerAccess().getDocumentationAssignment_0()); 
            // InternalSiriusTextDsl.g:4458:1: ( rule__Layer__DocumentationAssignment_0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_DOCUMENTATION) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSiriusTextDsl.g:4458:2: rule__Layer__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Layer__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLayerAccess().getDocumentationAssignment_0()); 

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
    // $ANTLR end "rule__Layer__Group__0__Impl"


    // $ANTLR start "rule__Layer__Group__1"
    // InternalSiriusTextDsl.g:4468:1: rule__Layer__Group__1 : rule__Layer__Group__1__Impl rule__Layer__Group__2 ;
    public final void rule__Layer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4472:1: ( rule__Layer__Group__1__Impl rule__Layer__Group__2 )
            // InternalSiriusTextDsl.g:4473:2: rule__Layer__Group__1__Impl rule__Layer__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Layer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__2();

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
    // $ANTLR end "rule__Layer__Group__1"


    // $ANTLR start "rule__Layer__Group__1__Impl"
    // InternalSiriusTextDsl.g:4480:1: rule__Layer__Group__1__Impl : ( 'layer' ) ;
    public final void rule__Layer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4484:1: ( ( 'layer' ) )
            // InternalSiriusTextDsl.g:4485:1: ( 'layer' )
            {
            // InternalSiriusTextDsl.g:4485:1: ( 'layer' )
            // InternalSiriusTextDsl.g:4486:1: 'layer'
            {
             before(grammarAccess.getLayerAccess().getLayerKeyword_1()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getLayerKeyword_1()); 

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
    // $ANTLR end "rule__Layer__Group__1__Impl"


    // $ANTLR start "rule__Layer__Group__2"
    // InternalSiriusTextDsl.g:4499:1: rule__Layer__Group__2 : rule__Layer__Group__2__Impl rule__Layer__Group__3 ;
    public final void rule__Layer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4503:1: ( rule__Layer__Group__2__Impl rule__Layer__Group__3 )
            // InternalSiriusTextDsl.g:4504:2: rule__Layer__Group__2__Impl rule__Layer__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Layer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__3();

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
    // $ANTLR end "rule__Layer__Group__2"


    // $ANTLR start "rule__Layer__Group__2__Impl"
    // InternalSiriusTextDsl.g:4511:1: rule__Layer__Group__2__Impl : ( ( rule__Layer__NameAssignment_2 ) ) ;
    public final void rule__Layer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4515:1: ( ( ( rule__Layer__NameAssignment_2 ) ) )
            // InternalSiriusTextDsl.g:4516:1: ( ( rule__Layer__NameAssignment_2 ) )
            {
            // InternalSiriusTextDsl.g:4516:1: ( ( rule__Layer__NameAssignment_2 ) )
            // InternalSiriusTextDsl.g:4517:1: ( rule__Layer__NameAssignment_2 )
            {
             before(grammarAccess.getLayerAccess().getNameAssignment_2()); 
            // InternalSiriusTextDsl.g:4518:1: ( rule__Layer__NameAssignment_2 )
            // InternalSiriusTextDsl.g:4518:2: rule__Layer__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Layer__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Layer__Group__2__Impl"


    // $ANTLR start "rule__Layer__Group__3"
    // InternalSiriusTextDsl.g:4528:1: rule__Layer__Group__3 : rule__Layer__Group__3__Impl rule__Layer__Group__4 ;
    public final void rule__Layer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4532:1: ( rule__Layer__Group__3__Impl rule__Layer__Group__4 )
            // InternalSiriusTextDsl.g:4533:2: rule__Layer__Group__3__Impl rule__Layer__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__Layer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__4();

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
    // $ANTLR end "rule__Layer__Group__3"


    // $ANTLR start "rule__Layer__Group__3__Impl"
    // InternalSiriusTextDsl.g:4540:1: rule__Layer__Group__3__Impl : ( '{' ) ;
    public final void rule__Layer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4544:1: ( ( '{' ) )
            // InternalSiriusTextDsl.g:4545:1: ( '{' )
            {
            // InternalSiriusTextDsl.g:4545:1: ( '{' )
            // InternalSiriusTextDsl.g:4546:1: '{'
            {
             before(grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Layer__Group__3__Impl"


    // $ANTLR start "rule__Layer__Group__4"
    // InternalSiriusTextDsl.g:4559:1: rule__Layer__Group__4 : rule__Layer__Group__4__Impl rule__Layer__Group__5 ;
    public final void rule__Layer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4563:1: ( rule__Layer__Group__4__Impl rule__Layer__Group__5 )
            // InternalSiriusTextDsl.g:4564:2: rule__Layer__Group__4__Impl rule__Layer__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__Layer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__5();

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
    // $ANTLR end "rule__Layer__Group__4"


    // $ANTLR start "rule__Layer__Group__4__Impl"
    // InternalSiriusTextDsl.g:4571:1: rule__Layer__Group__4__Impl : ( ( rule__Layer__Group_4__0 )? ) ;
    public final void rule__Layer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4575:1: ( ( ( rule__Layer__Group_4__0 )? ) )
            // InternalSiriusTextDsl.g:4576:1: ( ( rule__Layer__Group_4__0 )? )
            {
            // InternalSiriusTextDsl.g:4576:1: ( ( rule__Layer__Group_4__0 )? )
            // InternalSiriusTextDsl.g:4577:1: ( rule__Layer__Group_4__0 )?
            {
             before(grammarAccess.getLayerAccess().getGroup_4()); 
            // InternalSiriusTextDsl.g:4578:1: ( rule__Layer__Group_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==52) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSiriusTextDsl.g:4578:2: rule__Layer__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Layer__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLayerAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Layer__Group__4__Impl"


    // $ANTLR start "rule__Layer__Group__5"
    // InternalSiriusTextDsl.g:4588:1: rule__Layer__Group__5 : rule__Layer__Group__5__Impl rule__Layer__Group__6 ;
    public final void rule__Layer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4592:1: ( rule__Layer__Group__5__Impl rule__Layer__Group__6 )
            // InternalSiriusTextDsl.g:4593:2: rule__Layer__Group__5__Impl rule__Layer__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Layer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__6();

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
    // $ANTLR end "rule__Layer__Group__5"


    // $ANTLR start "rule__Layer__Group__5__Impl"
    // InternalSiriusTextDsl.g:4600:1: rule__Layer__Group__5__Impl : ( 'mappings' ) ;
    public final void rule__Layer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4604:1: ( ( 'mappings' ) )
            // InternalSiriusTextDsl.g:4605:1: ( 'mappings' )
            {
            // InternalSiriusTextDsl.g:4605:1: ( 'mappings' )
            // InternalSiriusTextDsl.g:4606:1: 'mappings'
            {
             before(grammarAccess.getLayerAccess().getMappingsKeyword_5()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getMappingsKeyword_5()); 

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
    // $ANTLR end "rule__Layer__Group__5__Impl"


    // $ANTLR start "rule__Layer__Group__6"
    // InternalSiriusTextDsl.g:4619:1: rule__Layer__Group__6 : rule__Layer__Group__6__Impl rule__Layer__Group__7 ;
    public final void rule__Layer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4623:1: ( rule__Layer__Group__6__Impl rule__Layer__Group__7 )
            // InternalSiriusTextDsl.g:4624:2: rule__Layer__Group__6__Impl rule__Layer__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Layer__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__7();

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
    // $ANTLR end "rule__Layer__Group__6"


    // $ANTLR start "rule__Layer__Group__6__Impl"
    // InternalSiriusTextDsl.g:4631:1: rule__Layer__Group__6__Impl : ( '=' ) ;
    public final void rule__Layer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4635:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:4636:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:4636:1: ( '=' )
            // InternalSiriusTextDsl.g:4637:1: '='
            {
             before(grammarAccess.getLayerAccess().getEqualsSignKeyword_6()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getEqualsSignKeyword_6()); 

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
    // $ANTLR end "rule__Layer__Group__6__Impl"


    // $ANTLR start "rule__Layer__Group__7"
    // InternalSiriusTextDsl.g:4650:1: rule__Layer__Group__7 : rule__Layer__Group__7__Impl rule__Layer__Group__8 ;
    public final void rule__Layer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4654:1: ( rule__Layer__Group__7__Impl rule__Layer__Group__8 )
            // InternalSiriusTextDsl.g:4655:2: rule__Layer__Group__7__Impl rule__Layer__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__Layer__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__8();

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
    // $ANTLR end "rule__Layer__Group__7"


    // $ANTLR start "rule__Layer__Group__7__Impl"
    // InternalSiriusTextDsl.g:4662:1: rule__Layer__Group__7__Impl : ( '[' ) ;
    public final void rule__Layer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4666:1: ( ( '[' ) )
            // InternalSiriusTextDsl.g:4667:1: ( '[' )
            {
            // InternalSiriusTextDsl.g:4667:1: ( '[' )
            // InternalSiriusTextDsl.g:4668:1: '['
            {
             before(grammarAccess.getLayerAccess().getLeftSquareBracketKeyword_7()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getLeftSquareBracketKeyword_7()); 

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
    // $ANTLR end "rule__Layer__Group__7__Impl"


    // $ANTLR start "rule__Layer__Group__8"
    // InternalSiriusTextDsl.g:4681:1: rule__Layer__Group__8 : rule__Layer__Group__8__Impl rule__Layer__Group__9 ;
    public final void rule__Layer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4685:1: ( rule__Layer__Group__8__Impl rule__Layer__Group__9 )
            // InternalSiriusTextDsl.g:4686:2: rule__Layer__Group__8__Impl rule__Layer__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__Layer__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__9();

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
    // $ANTLR end "rule__Layer__Group__8"


    // $ANTLR start "rule__Layer__Group__8__Impl"
    // InternalSiriusTextDsl.g:4693:1: rule__Layer__Group__8__Impl : ( ( rule__Layer__Group_8__0 )? ) ;
    public final void rule__Layer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4697:1: ( ( ( rule__Layer__Group_8__0 )? ) )
            // InternalSiriusTextDsl.g:4698:1: ( ( rule__Layer__Group_8__0 )? )
            {
            // InternalSiriusTextDsl.g:4698:1: ( ( rule__Layer__Group_8__0 )? )
            // InternalSiriusTextDsl.g:4699:1: ( rule__Layer__Group_8__0 )?
            {
             before(grammarAccess.getLayerAccess().getGroup_8()); 
            // InternalSiriusTextDsl.g:4700:1: ( rule__Layer__Group_8__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSiriusTextDsl.g:4700:2: rule__Layer__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Layer__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLayerAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Layer__Group__8__Impl"


    // $ANTLR start "rule__Layer__Group__9"
    // InternalSiriusTextDsl.g:4710:1: rule__Layer__Group__9 : rule__Layer__Group__9__Impl rule__Layer__Group__10 ;
    public final void rule__Layer__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4714:1: ( rule__Layer__Group__9__Impl rule__Layer__Group__10 )
            // InternalSiriusTextDsl.g:4715:2: rule__Layer__Group__9__Impl rule__Layer__Group__10
            {
            pushFollow(FOLLOW_35);
            rule__Layer__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__10();

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
    // $ANTLR end "rule__Layer__Group__9"


    // $ANTLR start "rule__Layer__Group__9__Impl"
    // InternalSiriusTextDsl.g:4722:1: rule__Layer__Group__9__Impl : ( ']' ) ;
    public final void rule__Layer__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4726:1: ( ( ']' ) )
            // InternalSiriusTextDsl.g:4727:1: ( ']' )
            {
            // InternalSiriusTextDsl.g:4727:1: ( ']' )
            // InternalSiriusTextDsl.g:4728:1: ']'
            {
             before(grammarAccess.getLayerAccess().getRightSquareBracketKeyword_9()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getRightSquareBracketKeyword_9()); 

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
    // $ANTLR end "rule__Layer__Group__9__Impl"


    // $ANTLR start "rule__Layer__Group__10"
    // InternalSiriusTextDsl.g:4741:1: rule__Layer__Group__10 : rule__Layer__Group__10__Impl rule__Layer__Group__11 ;
    public final void rule__Layer__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4745:1: ( rule__Layer__Group__10__Impl rule__Layer__Group__11 )
            // InternalSiriusTextDsl.g:4746:2: rule__Layer__Group__10__Impl rule__Layer__Group__11
            {
            pushFollow(FOLLOW_17);
            rule__Layer__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__11();

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
    // $ANTLR end "rule__Layer__Group__10"


    // $ANTLR start "rule__Layer__Group__10__Impl"
    // InternalSiriusTextDsl.g:4753:1: rule__Layer__Group__10__Impl : ( 'edges' ) ;
    public final void rule__Layer__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4757:1: ( ( 'edges' ) )
            // InternalSiriusTextDsl.g:4758:1: ( 'edges' )
            {
            // InternalSiriusTextDsl.g:4758:1: ( 'edges' )
            // InternalSiriusTextDsl.g:4759:1: 'edges'
            {
             before(grammarAccess.getLayerAccess().getEdgesKeyword_10()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getEdgesKeyword_10()); 

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
    // $ANTLR end "rule__Layer__Group__10__Impl"


    // $ANTLR start "rule__Layer__Group__11"
    // InternalSiriusTextDsl.g:4772:1: rule__Layer__Group__11 : rule__Layer__Group__11__Impl rule__Layer__Group__12 ;
    public final void rule__Layer__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4776:1: ( rule__Layer__Group__11__Impl rule__Layer__Group__12 )
            // InternalSiriusTextDsl.g:4777:2: rule__Layer__Group__11__Impl rule__Layer__Group__12
            {
            pushFollow(FOLLOW_18);
            rule__Layer__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__12();

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
    // $ANTLR end "rule__Layer__Group__11"


    // $ANTLR start "rule__Layer__Group__11__Impl"
    // InternalSiriusTextDsl.g:4784:1: rule__Layer__Group__11__Impl : ( '=' ) ;
    public final void rule__Layer__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4788:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:4789:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:4789:1: ( '=' )
            // InternalSiriusTextDsl.g:4790:1: '='
            {
             before(grammarAccess.getLayerAccess().getEqualsSignKeyword_11()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getEqualsSignKeyword_11()); 

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
    // $ANTLR end "rule__Layer__Group__11__Impl"


    // $ANTLR start "rule__Layer__Group__12"
    // InternalSiriusTextDsl.g:4803:1: rule__Layer__Group__12 : rule__Layer__Group__12__Impl rule__Layer__Group__13 ;
    public final void rule__Layer__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4807:1: ( rule__Layer__Group__12__Impl rule__Layer__Group__13 )
            // InternalSiriusTextDsl.g:4808:2: rule__Layer__Group__12__Impl rule__Layer__Group__13
            {
            pushFollow(FOLLOW_21);
            rule__Layer__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__13();

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
    // $ANTLR end "rule__Layer__Group__12"


    // $ANTLR start "rule__Layer__Group__12__Impl"
    // InternalSiriusTextDsl.g:4815:1: rule__Layer__Group__12__Impl : ( '[' ) ;
    public final void rule__Layer__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4819:1: ( ( '[' ) )
            // InternalSiriusTextDsl.g:4820:1: ( '[' )
            {
            // InternalSiriusTextDsl.g:4820:1: ( '[' )
            // InternalSiriusTextDsl.g:4821:1: '['
            {
             before(grammarAccess.getLayerAccess().getLeftSquareBracketKeyword_12()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getLeftSquareBracketKeyword_12()); 

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
    // $ANTLR end "rule__Layer__Group__12__Impl"


    // $ANTLR start "rule__Layer__Group__13"
    // InternalSiriusTextDsl.g:4834:1: rule__Layer__Group__13 : rule__Layer__Group__13__Impl rule__Layer__Group__14 ;
    public final void rule__Layer__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4838:1: ( rule__Layer__Group__13__Impl rule__Layer__Group__14 )
            // InternalSiriusTextDsl.g:4839:2: rule__Layer__Group__13__Impl rule__Layer__Group__14
            {
            pushFollow(FOLLOW_21);
            rule__Layer__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__14();

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
    // $ANTLR end "rule__Layer__Group__13"


    // $ANTLR start "rule__Layer__Group__13__Impl"
    // InternalSiriusTextDsl.g:4846:1: rule__Layer__Group__13__Impl : ( ( rule__Layer__Group_13__0 )? ) ;
    public final void rule__Layer__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4850:1: ( ( ( rule__Layer__Group_13__0 )? ) )
            // InternalSiriusTextDsl.g:4851:1: ( ( rule__Layer__Group_13__0 )? )
            {
            // InternalSiriusTextDsl.g:4851:1: ( ( rule__Layer__Group_13__0 )? )
            // InternalSiriusTextDsl.g:4852:1: ( rule__Layer__Group_13__0 )?
            {
             before(grammarAccess.getLayerAccess().getGroup_13()); 
            // InternalSiriusTextDsl.g:4853:1: ( rule__Layer__Group_13__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSiriusTextDsl.g:4853:2: rule__Layer__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Layer__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLayerAccess().getGroup_13()); 

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
    // $ANTLR end "rule__Layer__Group__13__Impl"


    // $ANTLR start "rule__Layer__Group__14"
    // InternalSiriusTextDsl.g:4863:1: rule__Layer__Group__14 : rule__Layer__Group__14__Impl rule__Layer__Group__15 ;
    public final void rule__Layer__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4867:1: ( rule__Layer__Group__14__Impl rule__Layer__Group__15 )
            // InternalSiriusTextDsl.g:4868:2: rule__Layer__Group__14__Impl rule__Layer__Group__15
            {
            pushFollow(FOLLOW_36);
            rule__Layer__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__15();

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
    // $ANTLR end "rule__Layer__Group__14"


    // $ANTLR start "rule__Layer__Group__14__Impl"
    // InternalSiriusTextDsl.g:4875:1: rule__Layer__Group__14__Impl : ( ']' ) ;
    public final void rule__Layer__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4879:1: ( ( ']' ) )
            // InternalSiriusTextDsl.g:4880:1: ( ']' )
            {
            // InternalSiriusTextDsl.g:4880:1: ( ']' )
            // InternalSiriusTextDsl.g:4881:1: ']'
            {
             before(grammarAccess.getLayerAccess().getRightSquareBracketKeyword_14()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getRightSquareBracketKeyword_14()); 

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
    // $ANTLR end "rule__Layer__Group__14__Impl"


    // $ANTLR start "rule__Layer__Group__15"
    // InternalSiriusTextDsl.g:4894:1: rule__Layer__Group__15 : rule__Layer__Group__15__Impl ;
    public final void rule__Layer__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4898:1: ( rule__Layer__Group__15__Impl )
            // InternalSiriusTextDsl.g:4899:2: rule__Layer__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group__15__Impl();

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
    // $ANTLR end "rule__Layer__Group__15"


    // $ANTLR start "rule__Layer__Group__15__Impl"
    // InternalSiriusTextDsl.g:4905:1: rule__Layer__Group__15__Impl : ( '}' ) ;
    public final void rule__Layer__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4909:1: ( ( '}' ) )
            // InternalSiriusTextDsl.g:4910:1: ( '}' )
            {
            // InternalSiriusTextDsl.g:4910:1: ( '}' )
            // InternalSiriusTextDsl.g:4911:1: '}'
            {
             before(grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_15()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_15()); 

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
    // $ANTLR end "rule__Layer__Group__15__Impl"


    // $ANTLR start "rule__Layer__Group_4__0"
    // InternalSiriusTextDsl.g:4956:1: rule__Layer__Group_4__0 : rule__Layer__Group_4__0__Impl rule__Layer__Group_4__1 ;
    public final void rule__Layer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4960:1: ( rule__Layer__Group_4__0__Impl rule__Layer__Group_4__1 )
            // InternalSiriusTextDsl.g:4961:2: rule__Layer__Group_4__0__Impl rule__Layer__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__Layer__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group_4__1();

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
    // $ANTLR end "rule__Layer__Group_4__0"


    // $ANTLR start "rule__Layer__Group_4__0__Impl"
    // InternalSiriusTextDsl.g:4968:1: rule__Layer__Group_4__0__Impl : ( 'icon' ) ;
    public final void rule__Layer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4972:1: ( ( 'icon' ) )
            // InternalSiriusTextDsl.g:4973:1: ( 'icon' )
            {
            // InternalSiriusTextDsl.g:4973:1: ( 'icon' )
            // InternalSiriusTextDsl.g:4974:1: 'icon'
            {
             before(grammarAccess.getLayerAccess().getIconKeyword_4_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getIconKeyword_4_0()); 

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
    // $ANTLR end "rule__Layer__Group_4__0__Impl"


    // $ANTLR start "rule__Layer__Group_4__1"
    // InternalSiriusTextDsl.g:4987:1: rule__Layer__Group_4__1 : rule__Layer__Group_4__1__Impl rule__Layer__Group_4__2 ;
    public final void rule__Layer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4991:1: ( rule__Layer__Group_4__1__Impl rule__Layer__Group_4__2 )
            // InternalSiriusTextDsl.g:4992:2: rule__Layer__Group_4__1__Impl rule__Layer__Group_4__2
            {
            pushFollow(FOLLOW_14);
            rule__Layer__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group_4__2();

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
    // $ANTLR end "rule__Layer__Group_4__1"


    // $ANTLR start "rule__Layer__Group_4__1__Impl"
    // InternalSiriusTextDsl.g:4999:1: rule__Layer__Group_4__1__Impl : ( '=' ) ;
    public final void rule__Layer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5003:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:5004:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:5004:1: ( '=' )
            // InternalSiriusTextDsl.g:5005:1: '='
            {
             before(grammarAccess.getLayerAccess().getEqualsSignKeyword_4_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getEqualsSignKeyword_4_1()); 

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
    // $ANTLR end "rule__Layer__Group_4__1__Impl"


    // $ANTLR start "rule__Layer__Group_4__2"
    // InternalSiriusTextDsl.g:5018:1: rule__Layer__Group_4__2 : rule__Layer__Group_4__2__Impl ;
    public final void rule__Layer__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5022:1: ( rule__Layer__Group_4__2__Impl )
            // InternalSiriusTextDsl.g:5023:2: rule__Layer__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group_4__2__Impl();

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
    // $ANTLR end "rule__Layer__Group_4__2"


    // $ANTLR start "rule__Layer__Group_4__2__Impl"
    // InternalSiriusTextDsl.g:5029:1: rule__Layer__Group_4__2__Impl : ( ( rule__Layer__IconAssignment_4_2 ) ) ;
    public final void rule__Layer__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5033:1: ( ( ( rule__Layer__IconAssignment_4_2 ) ) )
            // InternalSiriusTextDsl.g:5034:1: ( ( rule__Layer__IconAssignment_4_2 ) )
            {
            // InternalSiriusTextDsl.g:5034:1: ( ( rule__Layer__IconAssignment_4_2 ) )
            // InternalSiriusTextDsl.g:5035:1: ( rule__Layer__IconAssignment_4_2 )
            {
             before(grammarAccess.getLayerAccess().getIconAssignment_4_2()); 
            // InternalSiriusTextDsl.g:5036:1: ( rule__Layer__IconAssignment_4_2 )
            // InternalSiriusTextDsl.g:5036:2: rule__Layer__IconAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Layer__IconAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getIconAssignment_4_2()); 

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
    // $ANTLR end "rule__Layer__Group_4__2__Impl"


    // $ANTLR start "rule__Layer__Group_8__0"
    // InternalSiriusTextDsl.g:5052:1: rule__Layer__Group_8__0 : rule__Layer__Group_8__0__Impl rule__Layer__Group_8__1 ;
    public final void rule__Layer__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5056:1: ( rule__Layer__Group_8__0__Impl rule__Layer__Group_8__1 )
            // InternalSiriusTextDsl.g:5057:2: rule__Layer__Group_8__0__Impl rule__Layer__Group_8__1
            {
            pushFollow(FOLLOW_22);
            rule__Layer__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group_8__1();

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
    // $ANTLR end "rule__Layer__Group_8__0"


    // $ANTLR start "rule__Layer__Group_8__0__Impl"
    // InternalSiriusTextDsl.g:5064:1: rule__Layer__Group_8__0__Impl : ( ( rule__Layer__MappingsAssignment_8_0 ) ) ;
    public final void rule__Layer__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5068:1: ( ( ( rule__Layer__MappingsAssignment_8_0 ) ) )
            // InternalSiriusTextDsl.g:5069:1: ( ( rule__Layer__MappingsAssignment_8_0 ) )
            {
            // InternalSiriusTextDsl.g:5069:1: ( ( rule__Layer__MappingsAssignment_8_0 ) )
            // InternalSiriusTextDsl.g:5070:1: ( rule__Layer__MappingsAssignment_8_0 )
            {
             before(grammarAccess.getLayerAccess().getMappingsAssignment_8_0()); 
            // InternalSiriusTextDsl.g:5071:1: ( rule__Layer__MappingsAssignment_8_0 )
            // InternalSiriusTextDsl.g:5071:2: rule__Layer__MappingsAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__Layer__MappingsAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getMappingsAssignment_8_0()); 

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
    // $ANTLR end "rule__Layer__Group_8__0__Impl"


    // $ANTLR start "rule__Layer__Group_8__1"
    // InternalSiriusTextDsl.g:5081:1: rule__Layer__Group_8__1 : rule__Layer__Group_8__1__Impl ;
    public final void rule__Layer__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5085:1: ( rule__Layer__Group_8__1__Impl )
            // InternalSiriusTextDsl.g:5086:2: rule__Layer__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group_8__1__Impl();

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
    // $ANTLR end "rule__Layer__Group_8__1"


    // $ANTLR start "rule__Layer__Group_8__1__Impl"
    // InternalSiriusTextDsl.g:5092:1: rule__Layer__Group_8__1__Impl : ( ( rule__Layer__Group_8_1__0 )* ) ;
    public final void rule__Layer__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5096:1: ( ( ( rule__Layer__Group_8_1__0 )* ) )
            // InternalSiriusTextDsl.g:5097:1: ( ( rule__Layer__Group_8_1__0 )* )
            {
            // InternalSiriusTextDsl.g:5097:1: ( ( rule__Layer__Group_8_1__0 )* )
            // InternalSiriusTextDsl.g:5098:1: ( rule__Layer__Group_8_1__0 )*
            {
             before(grammarAccess.getLayerAccess().getGroup_8_1()); 
            // InternalSiriusTextDsl.g:5099:1: ( rule__Layer__Group_8_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==51) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:5099:2: rule__Layer__Group_8_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Layer__Group_8_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getLayerAccess().getGroup_8_1()); 

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
    // $ANTLR end "rule__Layer__Group_8__1__Impl"


    // $ANTLR start "rule__Layer__Group_8_1__0"
    // InternalSiriusTextDsl.g:5113:1: rule__Layer__Group_8_1__0 : rule__Layer__Group_8_1__0__Impl rule__Layer__Group_8_1__1 ;
    public final void rule__Layer__Group_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5117:1: ( rule__Layer__Group_8_1__0__Impl rule__Layer__Group_8_1__1 )
            // InternalSiriusTextDsl.g:5118:2: rule__Layer__Group_8_1__0__Impl rule__Layer__Group_8_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Layer__Group_8_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group_8_1__1();

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
    // $ANTLR end "rule__Layer__Group_8_1__0"


    // $ANTLR start "rule__Layer__Group_8_1__0__Impl"
    // InternalSiriusTextDsl.g:5125:1: rule__Layer__Group_8_1__0__Impl : ( ',' ) ;
    public final void rule__Layer__Group_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5129:1: ( ( ',' ) )
            // InternalSiriusTextDsl.g:5130:1: ( ',' )
            {
            // InternalSiriusTextDsl.g:5130:1: ( ',' )
            // InternalSiriusTextDsl.g:5131:1: ','
            {
             before(grammarAccess.getLayerAccess().getCommaKeyword_8_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getCommaKeyword_8_1_0()); 

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
    // $ANTLR end "rule__Layer__Group_8_1__0__Impl"


    // $ANTLR start "rule__Layer__Group_8_1__1"
    // InternalSiriusTextDsl.g:5144:1: rule__Layer__Group_8_1__1 : rule__Layer__Group_8_1__1__Impl ;
    public final void rule__Layer__Group_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5148:1: ( rule__Layer__Group_8_1__1__Impl )
            // InternalSiriusTextDsl.g:5149:2: rule__Layer__Group_8_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group_8_1__1__Impl();

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
    // $ANTLR end "rule__Layer__Group_8_1__1"


    // $ANTLR start "rule__Layer__Group_8_1__1__Impl"
    // InternalSiriusTextDsl.g:5155:1: rule__Layer__Group_8_1__1__Impl : ( ( rule__Layer__MappingsAssignment_8_1_1 ) ) ;
    public final void rule__Layer__Group_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5159:1: ( ( ( rule__Layer__MappingsAssignment_8_1_1 ) ) )
            // InternalSiriusTextDsl.g:5160:1: ( ( rule__Layer__MappingsAssignment_8_1_1 ) )
            {
            // InternalSiriusTextDsl.g:5160:1: ( ( rule__Layer__MappingsAssignment_8_1_1 ) )
            // InternalSiriusTextDsl.g:5161:1: ( rule__Layer__MappingsAssignment_8_1_1 )
            {
             before(grammarAccess.getLayerAccess().getMappingsAssignment_8_1_1()); 
            // InternalSiriusTextDsl.g:5162:1: ( rule__Layer__MappingsAssignment_8_1_1 )
            // InternalSiriusTextDsl.g:5162:2: rule__Layer__MappingsAssignment_8_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Layer__MappingsAssignment_8_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getMappingsAssignment_8_1_1()); 

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
    // $ANTLR end "rule__Layer__Group_8_1__1__Impl"


    // $ANTLR start "rule__Layer__Group_13__0"
    // InternalSiriusTextDsl.g:5176:1: rule__Layer__Group_13__0 : rule__Layer__Group_13__0__Impl rule__Layer__Group_13__1 ;
    public final void rule__Layer__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5180:1: ( rule__Layer__Group_13__0__Impl rule__Layer__Group_13__1 )
            // InternalSiriusTextDsl.g:5181:2: rule__Layer__Group_13__0__Impl rule__Layer__Group_13__1
            {
            pushFollow(FOLLOW_22);
            rule__Layer__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group_13__1();

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
    // $ANTLR end "rule__Layer__Group_13__0"


    // $ANTLR start "rule__Layer__Group_13__0__Impl"
    // InternalSiriusTextDsl.g:5188:1: rule__Layer__Group_13__0__Impl : ( ( rule__Layer__EdgesAssignment_13_0 ) ) ;
    public final void rule__Layer__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5192:1: ( ( ( rule__Layer__EdgesAssignment_13_0 ) ) )
            // InternalSiriusTextDsl.g:5193:1: ( ( rule__Layer__EdgesAssignment_13_0 ) )
            {
            // InternalSiriusTextDsl.g:5193:1: ( ( rule__Layer__EdgesAssignment_13_0 ) )
            // InternalSiriusTextDsl.g:5194:1: ( rule__Layer__EdgesAssignment_13_0 )
            {
             before(grammarAccess.getLayerAccess().getEdgesAssignment_13_0()); 
            // InternalSiriusTextDsl.g:5195:1: ( rule__Layer__EdgesAssignment_13_0 )
            // InternalSiriusTextDsl.g:5195:2: rule__Layer__EdgesAssignment_13_0
            {
            pushFollow(FOLLOW_2);
            rule__Layer__EdgesAssignment_13_0();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getEdgesAssignment_13_0()); 

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
    // $ANTLR end "rule__Layer__Group_13__0__Impl"


    // $ANTLR start "rule__Layer__Group_13__1"
    // InternalSiriusTextDsl.g:5205:1: rule__Layer__Group_13__1 : rule__Layer__Group_13__1__Impl ;
    public final void rule__Layer__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5209:1: ( rule__Layer__Group_13__1__Impl )
            // InternalSiriusTextDsl.g:5210:2: rule__Layer__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group_13__1__Impl();

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
    // $ANTLR end "rule__Layer__Group_13__1"


    // $ANTLR start "rule__Layer__Group_13__1__Impl"
    // InternalSiriusTextDsl.g:5216:1: rule__Layer__Group_13__1__Impl : ( ( rule__Layer__Group_13_1__0 )* ) ;
    public final void rule__Layer__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5220:1: ( ( ( rule__Layer__Group_13_1__0 )* ) )
            // InternalSiriusTextDsl.g:5221:1: ( ( rule__Layer__Group_13_1__0 )* )
            {
            // InternalSiriusTextDsl.g:5221:1: ( ( rule__Layer__Group_13_1__0 )* )
            // InternalSiriusTextDsl.g:5222:1: ( rule__Layer__Group_13_1__0 )*
            {
             before(grammarAccess.getLayerAccess().getGroup_13_1()); 
            // InternalSiriusTextDsl.g:5223:1: ( rule__Layer__Group_13_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==51) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:5223:2: rule__Layer__Group_13_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Layer__Group_13_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getLayerAccess().getGroup_13_1()); 

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
    // $ANTLR end "rule__Layer__Group_13__1__Impl"


    // $ANTLR start "rule__Layer__Group_13_1__0"
    // InternalSiriusTextDsl.g:5237:1: rule__Layer__Group_13_1__0 : rule__Layer__Group_13_1__0__Impl rule__Layer__Group_13_1__1 ;
    public final void rule__Layer__Group_13_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5241:1: ( rule__Layer__Group_13_1__0__Impl rule__Layer__Group_13_1__1 )
            // InternalSiriusTextDsl.g:5242:2: rule__Layer__Group_13_1__0__Impl rule__Layer__Group_13_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Layer__Group_13_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group_13_1__1();

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
    // $ANTLR end "rule__Layer__Group_13_1__0"


    // $ANTLR start "rule__Layer__Group_13_1__0__Impl"
    // InternalSiriusTextDsl.g:5249:1: rule__Layer__Group_13_1__0__Impl : ( ',' ) ;
    public final void rule__Layer__Group_13_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5253:1: ( ( ',' ) )
            // InternalSiriusTextDsl.g:5254:1: ( ',' )
            {
            // InternalSiriusTextDsl.g:5254:1: ( ',' )
            // InternalSiriusTextDsl.g:5255:1: ','
            {
             before(grammarAccess.getLayerAccess().getCommaKeyword_13_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getCommaKeyword_13_1_0()); 

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
    // $ANTLR end "rule__Layer__Group_13_1__0__Impl"


    // $ANTLR start "rule__Layer__Group_13_1__1"
    // InternalSiriusTextDsl.g:5268:1: rule__Layer__Group_13_1__1 : rule__Layer__Group_13_1__1__Impl ;
    public final void rule__Layer__Group_13_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5272:1: ( rule__Layer__Group_13_1__1__Impl )
            // InternalSiriusTextDsl.g:5273:2: rule__Layer__Group_13_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group_13_1__1__Impl();

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
    // $ANTLR end "rule__Layer__Group_13_1__1"


    // $ANTLR start "rule__Layer__Group_13_1__1__Impl"
    // InternalSiriusTextDsl.g:5279:1: rule__Layer__Group_13_1__1__Impl : ( ( rule__Layer__EdgesAssignment_13_1_1 ) ) ;
    public final void rule__Layer__Group_13_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5283:1: ( ( ( rule__Layer__EdgesAssignment_13_1_1 ) ) )
            // InternalSiriusTextDsl.g:5284:1: ( ( rule__Layer__EdgesAssignment_13_1_1 ) )
            {
            // InternalSiriusTextDsl.g:5284:1: ( ( rule__Layer__EdgesAssignment_13_1_1 ) )
            // InternalSiriusTextDsl.g:5285:1: ( rule__Layer__EdgesAssignment_13_1_1 )
            {
             before(grammarAccess.getLayerAccess().getEdgesAssignment_13_1_1()); 
            // InternalSiriusTextDsl.g:5286:1: ( rule__Layer__EdgesAssignment_13_1_1 )
            // InternalSiriusTextDsl.g:5286:2: rule__Layer__EdgesAssignment_13_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Layer__EdgesAssignment_13_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getEdgesAssignment_13_1_1()); 

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
    // $ANTLR end "rule__Layer__Group_13_1__1__Impl"


    // $ANTLR start "rule__Container__Group__0"
    // InternalSiriusTextDsl.g:5300:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5304:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // InternalSiriusTextDsl.g:5305:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Container__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__1();

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
    // $ANTLR end "rule__Container__Group__0"


    // $ANTLR start "rule__Container__Group__0__Impl"
    // InternalSiriusTextDsl.g:5312:1: rule__Container__Group__0__Impl : ( ( rule__Container__DocumentationAssignment_0 )? ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5316:1: ( ( ( rule__Container__DocumentationAssignment_0 )? ) )
            // InternalSiriusTextDsl.g:5317:1: ( ( rule__Container__DocumentationAssignment_0 )? )
            {
            // InternalSiriusTextDsl.g:5317:1: ( ( rule__Container__DocumentationAssignment_0 )? )
            // InternalSiriusTextDsl.g:5318:1: ( rule__Container__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getContainerAccess().getDocumentationAssignment_0()); 
            // InternalSiriusTextDsl.g:5319:1: ( rule__Container__DocumentationAssignment_0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_DOCUMENTATION) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSiriusTextDsl.g:5319:2: rule__Container__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Container__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getDocumentationAssignment_0()); 

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
    // $ANTLR end "rule__Container__Group__0__Impl"


    // $ANTLR start "rule__Container__Group__1"
    // InternalSiriusTextDsl.g:5329:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5333:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // InternalSiriusTextDsl.g:5334:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__Container__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__2();

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
    // $ANTLR end "rule__Container__Group__1"


    // $ANTLR start "rule__Container__Group__1__Impl"
    // InternalSiriusTextDsl.g:5341:1: rule__Container__Group__1__Impl : ( ( rule__Container__ListAssignment_1 )? ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5345:1: ( ( ( rule__Container__ListAssignment_1 )? ) )
            // InternalSiriusTextDsl.g:5346:1: ( ( rule__Container__ListAssignment_1 )? )
            {
            // InternalSiriusTextDsl.g:5346:1: ( ( rule__Container__ListAssignment_1 )? )
            // InternalSiriusTextDsl.g:5347:1: ( rule__Container__ListAssignment_1 )?
            {
             before(grammarAccess.getContainerAccess().getListAssignment_1()); 
            // InternalSiriusTextDsl.g:5348:1: ( rule__Container__ListAssignment_1 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==100) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSiriusTextDsl.g:5348:2: rule__Container__ListAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Container__ListAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getListAssignment_1()); 

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
    // $ANTLR end "rule__Container__Group__1__Impl"


    // $ANTLR start "rule__Container__Group__2"
    // InternalSiriusTextDsl.g:5358:1: rule__Container__Group__2 : rule__Container__Group__2__Impl rule__Container__Group__3 ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5362:1: ( rule__Container__Group__2__Impl rule__Container__Group__3 )
            // InternalSiriusTextDsl.g:5363:2: rule__Container__Group__2__Impl rule__Container__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Container__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__3();

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
    // $ANTLR end "rule__Container__Group__2"


    // $ANTLR start "rule__Container__Group__2__Impl"
    // InternalSiriusTextDsl.g:5370:1: rule__Container__Group__2__Impl : ( 'container' ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5374:1: ( ( 'container' ) )
            // InternalSiriusTextDsl.g:5375:1: ( 'container' )
            {
            // InternalSiriusTextDsl.g:5375:1: ( 'container' )
            // InternalSiriusTextDsl.g:5376:1: 'container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword_2()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getContainerKeyword_2()); 

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
    // $ANTLR end "rule__Container__Group__2__Impl"


    // $ANTLR start "rule__Container__Group__3"
    // InternalSiriusTextDsl.g:5389:1: rule__Container__Group__3 : rule__Container__Group__3__Impl rule__Container__Group__4 ;
    public final void rule__Container__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5393:1: ( rule__Container__Group__3__Impl rule__Container__Group__4 )
            // InternalSiriusTextDsl.g:5394:2: rule__Container__Group__3__Impl rule__Container__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Container__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__4();

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
    // $ANTLR end "rule__Container__Group__3"


    // $ANTLR start "rule__Container__Group__3__Impl"
    // InternalSiriusTextDsl.g:5401:1: rule__Container__Group__3__Impl : ( ( rule__Container__NameAssignment_3 ) ) ;
    public final void rule__Container__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5405:1: ( ( ( rule__Container__NameAssignment_3 ) ) )
            // InternalSiriusTextDsl.g:5406:1: ( ( rule__Container__NameAssignment_3 ) )
            {
            // InternalSiriusTextDsl.g:5406:1: ( ( rule__Container__NameAssignment_3 ) )
            // InternalSiriusTextDsl.g:5407:1: ( rule__Container__NameAssignment_3 )
            {
             before(grammarAccess.getContainerAccess().getNameAssignment_3()); 
            // InternalSiriusTextDsl.g:5408:1: ( rule__Container__NameAssignment_3 )
            // InternalSiriusTextDsl.g:5408:2: rule__Container__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Container__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__Container__Group__3__Impl"


    // $ANTLR start "rule__Container__Group__4"
    // InternalSiriusTextDsl.g:5418:1: rule__Container__Group__4 : rule__Container__Group__4__Impl rule__Container__Group__5 ;
    public final void rule__Container__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5422:1: ( rule__Container__Group__4__Impl rule__Container__Group__5 )
            // InternalSiriusTextDsl.g:5423:2: rule__Container__Group__4__Impl rule__Container__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Container__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__5();

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
    // $ANTLR end "rule__Container__Group__4"


    // $ANTLR start "rule__Container__Group__4__Impl"
    // InternalSiriusTextDsl.g:5430:1: rule__Container__Group__4__Impl : ( ( rule__Container__Group_4__0 )? ) ;
    public final void rule__Container__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5434:1: ( ( ( rule__Container__Group_4__0 )? ) )
            // InternalSiriusTextDsl.g:5435:1: ( ( rule__Container__Group_4__0 )? )
            {
            // InternalSiriusTextDsl.g:5435:1: ( ( rule__Container__Group_4__0 )? )
            // InternalSiriusTextDsl.g:5436:1: ( rule__Container__Group_4__0 )?
            {
             before(grammarAccess.getContainerAccess().getGroup_4()); 
            // InternalSiriusTextDsl.g:5437:1: ( rule__Container__Group_4__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==45) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSiriusTextDsl.g:5437:2: rule__Container__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Container__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Container__Group__4__Impl"


    // $ANTLR start "rule__Container__Group__5"
    // InternalSiriusTextDsl.g:5447:1: rule__Container__Group__5 : rule__Container__Group__5__Impl rule__Container__Group__6 ;
    public final void rule__Container__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5451:1: ( rule__Container__Group__5__Impl rule__Container__Group__6 )
            // InternalSiriusTextDsl.g:5452:2: rule__Container__Group__5__Impl rule__Container__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Container__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__6();

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
    // $ANTLR end "rule__Container__Group__5"


    // $ANTLR start "rule__Container__Group__5__Impl"
    // InternalSiriusTextDsl.g:5459:1: rule__Container__Group__5__Impl : ( 'for' ) ;
    public final void rule__Container__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5463:1: ( ( 'for' ) )
            // InternalSiriusTextDsl.g:5464:1: ( 'for' )
            {
            // InternalSiriusTextDsl.g:5464:1: ( 'for' )
            // InternalSiriusTextDsl.g:5465:1: 'for'
            {
             before(grammarAccess.getContainerAccess().getForKeyword_5()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getForKeyword_5()); 

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
    // $ANTLR end "rule__Container__Group__5__Impl"


    // $ANTLR start "rule__Container__Group__6"
    // InternalSiriusTextDsl.g:5478:1: rule__Container__Group__6 : rule__Container__Group__6__Impl rule__Container__Group__7 ;
    public final void rule__Container__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5482:1: ( rule__Container__Group__6__Impl rule__Container__Group__7 )
            // InternalSiriusTextDsl.g:5483:2: rule__Container__Group__6__Impl rule__Container__Group__7
            {
            pushFollow(FOLLOW_38);
            rule__Container__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__7();

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
    // $ANTLR end "rule__Container__Group__6"


    // $ANTLR start "rule__Container__Group__6__Impl"
    // InternalSiriusTextDsl.g:5490:1: rule__Container__Group__6__Impl : ( ( rule__Container__DomainClassAssignment_6 ) ) ;
    public final void rule__Container__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5494:1: ( ( ( rule__Container__DomainClassAssignment_6 ) ) )
            // InternalSiriusTextDsl.g:5495:1: ( ( rule__Container__DomainClassAssignment_6 ) )
            {
            // InternalSiriusTextDsl.g:5495:1: ( ( rule__Container__DomainClassAssignment_6 ) )
            // InternalSiriusTextDsl.g:5496:1: ( rule__Container__DomainClassAssignment_6 )
            {
             before(grammarAccess.getContainerAccess().getDomainClassAssignment_6()); 
            // InternalSiriusTextDsl.g:5497:1: ( rule__Container__DomainClassAssignment_6 )
            // InternalSiriusTextDsl.g:5497:2: rule__Container__DomainClassAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Container__DomainClassAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getDomainClassAssignment_6()); 

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
    // $ANTLR end "rule__Container__Group__6__Impl"


    // $ANTLR start "rule__Container__Group__7"
    // InternalSiriusTextDsl.g:5507:1: rule__Container__Group__7 : rule__Container__Group__7__Impl rule__Container__Group__8 ;
    public final void rule__Container__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5511:1: ( rule__Container__Group__7__Impl rule__Container__Group__8 )
            // InternalSiriusTextDsl.g:5512:2: rule__Container__Group__7__Impl rule__Container__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Container__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__8();

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
    // $ANTLR end "rule__Container__Group__7"


    // $ANTLR start "rule__Container__Group__7__Impl"
    // InternalSiriusTextDsl.g:5519:1: rule__Container__Group__7__Impl : ( 'style' ) ;
    public final void rule__Container__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5523:1: ( ( 'style' ) )
            // InternalSiriusTextDsl.g:5524:1: ( 'style' )
            {
            // InternalSiriusTextDsl.g:5524:1: ( 'style' )
            // InternalSiriusTextDsl.g:5525:1: 'style'
            {
             before(grammarAccess.getContainerAccess().getStyleKeyword_7()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getStyleKeyword_7()); 

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
    // $ANTLR end "rule__Container__Group__7__Impl"


    // $ANTLR start "rule__Container__Group__8"
    // InternalSiriusTextDsl.g:5538:1: rule__Container__Group__8 : rule__Container__Group__8__Impl rule__Container__Group__9 ;
    public final void rule__Container__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5542:1: ( rule__Container__Group__8__Impl rule__Container__Group__9 )
            // InternalSiriusTextDsl.g:5543:2: rule__Container__Group__8__Impl rule__Container__Group__9
            {
            pushFollow(FOLLOW_29);
            rule__Container__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__9();

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
    // $ANTLR end "rule__Container__Group__8"


    // $ANTLR start "rule__Container__Group__8__Impl"
    // InternalSiriusTextDsl.g:5550:1: rule__Container__Group__8__Impl : ( ( rule__Container__StyleAssignment_8 ) ) ;
    public final void rule__Container__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5554:1: ( ( ( rule__Container__StyleAssignment_8 ) ) )
            // InternalSiriusTextDsl.g:5555:1: ( ( rule__Container__StyleAssignment_8 ) )
            {
            // InternalSiriusTextDsl.g:5555:1: ( ( rule__Container__StyleAssignment_8 ) )
            // InternalSiriusTextDsl.g:5556:1: ( rule__Container__StyleAssignment_8 )
            {
             before(grammarAccess.getContainerAccess().getStyleAssignment_8()); 
            // InternalSiriusTextDsl.g:5557:1: ( rule__Container__StyleAssignment_8 )
            // InternalSiriusTextDsl.g:5557:2: rule__Container__StyleAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Container__StyleAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getStyleAssignment_8()); 

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
    // $ANTLR end "rule__Container__Group__8__Impl"


    // $ANTLR start "rule__Container__Group__9"
    // InternalSiriusTextDsl.g:5567:1: rule__Container__Group__9 : rule__Container__Group__9__Impl rule__Container__Group__10 ;
    public final void rule__Container__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5571:1: ( rule__Container__Group__9__Impl rule__Container__Group__10 )
            // InternalSiriusTextDsl.g:5572:2: rule__Container__Group__9__Impl rule__Container__Group__10
            {
            pushFollow(FOLLOW_29);
            rule__Container__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__10();

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
    // $ANTLR end "rule__Container__Group__9"


    // $ANTLR start "rule__Container__Group__9__Impl"
    // InternalSiriusTextDsl.g:5579:1: rule__Container__Group__9__Impl : ( ( rule__Container__Group_9__0 )? ) ;
    public final void rule__Container__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5583:1: ( ( ( rule__Container__Group_9__0 )? ) )
            // InternalSiriusTextDsl.g:5584:1: ( ( rule__Container__Group_9__0 )? )
            {
            // InternalSiriusTextDsl.g:5584:1: ( ( rule__Container__Group_9__0 )? )
            // InternalSiriusTextDsl.g:5585:1: ( rule__Container__Group_9__0 )?
            {
             before(grammarAccess.getContainerAccess().getGroup_9()); 
            // InternalSiriusTextDsl.g:5586:1: ( rule__Container__Group_9__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==59) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSiriusTextDsl.g:5586:2: rule__Container__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Container__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Container__Group__9__Impl"


    // $ANTLR start "rule__Container__Group__10"
    // InternalSiriusTextDsl.g:5596:1: rule__Container__Group__10 : rule__Container__Group__10__Impl rule__Container__Group__11 ;
    public final void rule__Container__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5600:1: ( rule__Container__Group__10__Impl rule__Container__Group__11 )
            // InternalSiriusTextDsl.g:5601:2: rule__Container__Group__10__Impl rule__Container__Group__11
            {
            pushFollow(FOLLOW_39);
            rule__Container__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__11();

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
    // $ANTLR end "rule__Container__Group__10"


    // $ANTLR start "rule__Container__Group__10__Impl"
    // InternalSiriusTextDsl.g:5608:1: rule__Container__Group__10__Impl : ( '{' ) ;
    public final void rule__Container__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5612:1: ( ( '{' ) )
            // InternalSiriusTextDsl.g:5613:1: ( '{' )
            {
            // InternalSiriusTextDsl.g:5613:1: ( '{' )
            // InternalSiriusTextDsl.g:5614:1: '{'
            {
             before(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Container__Group__10__Impl"


    // $ANTLR start "rule__Container__Group__11"
    // InternalSiriusTextDsl.g:5627:1: rule__Container__Group__11 : rule__Container__Group__11__Impl rule__Container__Group__12 ;
    public final void rule__Container__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5631:1: ( rule__Container__Group__11__Impl rule__Container__Group__12 )
            // InternalSiriusTextDsl.g:5632:2: rule__Container__Group__11__Impl rule__Container__Group__12
            {
            pushFollow(FOLLOW_39);
            rule__Container__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__12();

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
    // $ANTLR end "rule__Container__Group__11"


    // $ANTLR start "rule__Container__Group__11__Impl"
    // InternalSiriusTextDsl.g:5639:1: rule__Container__Group__11__Impl : ( ( rule__Container__Group_11__0 )? ) ;
    public final void rule__Container__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5643:1: ( ( ( rule__Container__Group_11__0 )? ) )
            // InternalSiriusTextDsl.g:5644:1: ( ( rule__Container__Group_11__0 )? )
            {
            // InternalSiriusTextDsl.g:5644:1: ( ( rule__Container__Group_11__0 )? )
            // InternalSiriusTextDsl.g:5645:1: ( rule__Container__Group_11__0 )?
            {
             before(grammarAccess.getContainerAccess().getGroup_11()); 
            // InternalSiriusTextDsl.g:5646:1: ( rule__Container__Group_11__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==70) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSiriusTextDsl.g:5646:2: rule__Container__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Container__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getGroup_11()); 

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
    // $ANTLR end "rule__Container__Group__11__Impl"


    // $ANTLR start "rule__Container__Group__12"
    // InternalSiriusTextDsl.g:5656:1: rule__Container__Group__12 : rule__Container__Group__12__Impl rule__Container__Group__13 ;
    public final void rule__Container__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5660:1: ( rule__Container__Group__12__Impl rule__Container__Group__13 )
            // InternalSiriusTextDsl.g:5661:2: rule__Container__Group__12__Impl rule__Container__Group__13
            {
            pushFollow(FOLLOW_39);
            rule__Container__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__13();

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
    // $ANTLR end "rule__Container__Group__12"


    // $ANTLR start "rule__Container__Group__12__Impl"
    // InternalSiriusTextDsl.g:5668:1: rule__Container__Group__12__Impl : ( ( rule__Container__ConditionalStylesAssignment_12 )* ) ;
    public final void rule__Container__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5672:1: ( ( ( rule__Container__ConditionalStylesAssignment_12 )* ) )
            // InternalSiriusTextDsl.g:5673:1: ( ( rule__Container__ConditionalStylesAssignment_12 )* )
            {
            // InternalSiriusTextDsl.g:5673:1: ( ( rule__Container__ConditionalStylesAssignment_12 )* )
            // InternalSiriusTextDsl.g:5674:1: ( rule__Container__ConditionalStylesAssignment_12 )*
            {
             before(grammarAccess.getContainerAccess().getConditionalStylesAssignment_12()); 
            // InternalSiriusTextDsl.g:5675:1: ( rule__Container__ConditionalStylesAssignment_12 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==69) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:5675:2: rule__Container__ConditionalStylesAssignment_12
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__Container__ConditionalStylesAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getContainerAccess().getConditionalStylesAssignment_12()); 

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
    // $ANTLR end "rule__Container__Group__12__Impl"


    // $ANTLR start "rule__Container__Group__13"
    // InternalSiriusTextDsl.g:5685:1: rule__Container__Group__13 : rule__Container__Group__13__Impl ;
    public final void rule__Container__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5689:1: ( rule__Container__Group__13__Impl )
            // InternalSiriusTextDsl.g:5690:2: rule__Container__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__13__Impl();

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
    // $ANTLR end "rule__Container__Group__13"


    // $ANTLR start "rule__Container__Group__13__Impl"
    // InternalSiriusTextDsl.g:5696:1: rule__Container__Group__13__Impl : ( '}' ) ;
    public final void rule__Container__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5700:1: ( ( '}' ) )
            // InternalSiriusTextDsl.g:5701:1: ( '}' )
            {
            // InternalSiriusTextDsl.g:5701:1: ( '}' )
            // InternalSiriusTextDsl.g:5702:1: '}'
            {
             before(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_13()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__Container__Group__13__Impl"


    // $ANTLR start "rule__Container__Group_4__0"
    // InternalSiriusTextDsl.g:5743:1: rule__Container__Group_4__0 : rule__Container__Group_4__0__Impl rule__Container__Group_4__1 ;
    public final void rule__Container__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5747:1: ( rule__Container__Group_4__0__Impl rule__Container__Group_4__1 )
            // InternalSiriusTextDsl.g:5748:2: rule__Container__Group_4__0__Impl rule__Container__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Container__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_4__1();

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
    // $ANTLR end "rule__Container__Group_4__0"


    // $ANTLR start "rule__Container__Group_4__0__Impl"
    // InternalSiriusTextDsl.g:5755:1: rule__Container__Group_4__0__Impl : ( 'as' ) ;
    public final void rule__Container__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5759:1: ( ( 'as' ) )
            // InternalSiriusTextDsl.g:5760:1: ( 'as' )
            {
            // InternalSiriusTextDsl.g:5760:1: ( 'as' )
            // InternalSiriusTextDsl.g:5761:1: 'as'
            {
             before(grammarAccess.getContainerAccess().getAsKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getAsKeyword_4_0()); 

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
    // $ANTLR end "rule__Container__Group_4__0__Impl"


    // $ANTLR start "rule__Container__Group_4__1"
    // InternalSiriusTextDsl.g:5774:1: rule__Container__Group_4__1 : rule__Container__Group_4__1__Impl ;
    public final void rule__Container__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5778:1: ( rule__Container__Group_4__1__Impl )
            // InternalSiriusTextDsl.g:5779:2: rule__Container__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group_4__1__Impl();

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
    // $ANTLR end "rule__Container__Group_4__1"


    // $ANTLR start "rule__Container__Group_4__1__Impl"
    // InternalSiriusTextDsl.g:5785:1: rule__Container__Group_4__1__Impl : ( ( rule__Container__LabelAssignment_4_1 ) ) ;
    public final void rule__Container__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5789:1: ( ( ( rule__Container__LabelAssignment_4_1 ) ) )
            // InternalSiriusTextDsl.g:5790:1: ( ( rule__Container__LabelAssignment_4_1 ) )
            {
            // InternalSiriusTextDsl.g:5790:1: ( ( rule__Container__LabelAssignment_4_1 ) )
            // InternalSiriusTextDsl.g:5791:1: ( rule__Container__LabelAssignment_4_1 )
            {
             before(grammarAccess.getContainerAccess().getLabelAssignment_4_1()); 
            // InternalSiriusTextDsl.g:5792:1: ( rule__Container__LabelAssignment_4_1 )
            // InternalSiriusTextDsl.g:5792:2: rule__Container__LabelAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Container__LabelAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getLabelAssignment_4_1()); 

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
    // $ANTLR end "rule__Container__Group_4__1__Impl"


    // $ANTLR start "rule__Container__Group_9__0"
    // InternalSiriusTextDsl.g:5806:1: rule__Container__Group_9__0 : rule__Container__Group_9__0__Impl rule__Container__Group_9__1 ;
    public final void rule__Container__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5810:1: ( rule__Container__Group_9__0__Impl rule__Container__Group_9__1 )
            // InternalSiriusTextDsl.g:5811:2: rule__Container__Group_9__0__Impl rule__Container__Group_9__1
            {
            pushFollow(FOLLOW_31);
            rule__Container__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_9__1();

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
    // $ANTLR end "rule__Container__Group_9__0"


    // $ANTLR start "rule__Container__Group_9__0__Impl"
    // InternalSiriusTextDsl.g:5818:1: rule__Container__Group_9__0__Impl : ( '?' ) ;
    public final void rule__Container__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5822:1: ( ( '?' ) )
            // InternalSiriusTextDsl.g:5823:1: ( '?' )
            {
            // InternalSiriusTextDsl.g:5823:1: ( '?' )
            // InternalSiriusTextDsl.g:5824:1: '?'
            {
             before(grammarAccess.getContainerAccess().getQuestionMarkKeyword_9_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getQuestionMarkKeyword_9_0()); 

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
    // $ANTLR end "rule__Container__Group_9__0__Impl"


    // $ANTLR start "rule__Container__Group_9__1"
    // InternalSiriusTextDsl.g:5837:1: rule__Container__Group_9__1 : rule__Container__Group_9__1__Impl ;
    public final void rule__Container__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5841:1: ( rule__Container__Group_9__1__Impl )
            // InternalSiriusTextDsl.g:5842:2: rule__Container__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group_9__1__Impl();

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
    // $ANTLR end "rule__Container__Group_9__1"


    // $ANTLR start "rule__Container__Group_9__1__Impl"
    // InternalSiriusTextDsl.g:5848:1: rule__Container__Group_9__1__Impl : ( ( rule__Container__PreconditionAssignment_9_1 ) ) ;
    public final void rule__Container__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5852:1: ( ( ( rule__Container__PreconditionAssignment_9_1 ) ) )
            // InternalSiriusTextDsl.g:5853:1: ( ( rule__Container__PreconditionAssignment_9_1 ) )
            {
            // InternalSiriusTextDsl.g:5853:1: ( ( rule__Container__PreconditionAssignment_9_1 ) )
            // InternalSiriusTextDsl.g:5854:1: ( rule__Container__PreconditionAssignment_9_1 )
            {
             before(grammarAccess.getContainerAccess().getPreconditionAssignment_9_1()); 
            // InternalSiriusTextDsl.g:5855:1: ( rule__Container__PreconditionAssignment_9_1 )
            // InternalSiriusTextDsl.g:5855:2: rule__Container__PreconditionAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Container__PreconditionAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getPreconditionAssignment_9_1()); 

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
    // $ANTLR end "rule__Container__Group_9__1__Impl"


    // $ANTLR start "rule__Container__Group_11__0"
    // InternalSiriusTextDsl.g:5869:1: rule__Container__Group_11__0 : rule__Container__Group_11__0__Impl rule__Container__Group_11__1 ;
    public final void rule__Container__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5873:1: ( rule__Container__Group_11__0__Impl rule__Container__Group_11__1 )
            // InternalSiriusTextDsl.g:5874:2: rule__Container__Group_11__0__Impl rule__Container__Group_11__1
            {
            pushFollow(FOLLOW_17);
            rule__Container__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_11__1();

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
    // $ANTLR end "rule__Container__Group_11__0"


    // $ANTLR start "rule__Container__Group_11__0__Impl"
    // InternalSiriusTextDsl.g:5881:1: rule__Container__Group_11__0__Impl : ( 'semanticCandidatesExpression' ) ;
    public final void rule__Container__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5885:1: ( ( 'semanticCandidatesExpression' ) )
            // InternalSiriusTextDsl.g:5886:1: ( 'semanticCandidatesExpression' )
            {
            // InternalSiriusTextDsl.g:5886:1: ( 'semanticCandidatesExpression' )
            // InternalSiriusTextDsl.g:5887:1: 'semanticCandidatesExpression'
            {
             before(grammarAccess.getContainerAccess().getSemanticCandidatesExpressionKeyword_11_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getSemanticCandidatesExpressionKeyword_11_0()); 

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
    // $ANTLR end "rule__Container__Group_11__0__Impl"


    // $ANTLR start "rule__Container__Group_11__1"
    // InternalSiriusTextDsl.g:5900:1: rule__Container__Group_11__1 : rule__Container__Group_11__1__Impl rule__Container__Group_11__2 ;
    public final void rule__Container__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5904:1: ( rule__Container__Group_11__1__Impl rule__Container__Group_11__2 )
            // InternalSiriusTextDsl.g:5905:2: rule__Container__Group_11__1__Impl rule__Container__Group_11__2
            {
            pushFollow(FOLLOW_31);
            rule__Container__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_11__2();

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
    // $ANTLR end "rule__Container__Group_11__1"


    // $ANTLR start "rule__Container__Group_11__1__Impl"
    // InternalSiriusTextDsl.g:5912:1: rule__Container__Group_11__1__Impl : ( '=' ) ;
    public final void rule__Container__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5916:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:5917:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:5917:1: ( '=' )
            // InternalSiriusTextDsl.g:5918:1: '='
            {
             before(grammarAccess.getContainerAccess().getEqualsSignKeyword_11_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getEqualsSignKeyword_11_1()); 

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
    // $ANTLR end "rule__Container__Group_11__1__Impl"


    // $ANTLR start "rule__Container__Group_11__2"
    // InternalSiriusTextDsl.g:5931:1: rule__Container__Group_11__2 : rule__Container__Group_11__2__Impl ;
    public final void rule__Container__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5935:1: ( rule__Container__Group_11__2__Impl )
            // InternalSiriusTextDsl.g:5936:2: rule__Container__Group_11__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group_11__2__Impl();

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
    // $ANTLR end "rule__Container__Group_11__2"


    // $ANTLR start "rule__Container__Group_11__2__Impl"
    // InternalSiriusTextDsl.g:5942:1: rule__Container__Group_11__2__Impl : ( ( rule__Container__SemanticCanditatesExpressionAssignment_11_2 ) ) ;
    public final void rule__Container__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5946:1: ( ( ( rule__Container__SemanticCanditatesExpressionAssignment_11_2 ) ) )
            // InternalSiriusTextDsl.g:5947:1: ( ( rule__Container__SemanticCanditatesExpressionAssignment_11_2 ) )
            {
            // InternalSiriusTextDsl.g:5947:1: ( ( rule__Container__SemanticCanditatesExpressionAssignment_11_2 ) )
            // InternalSiriusTextDsl.g:5948:1: ( rule__Container__SemanticCanditatesExpressionAssignment_11_2 )
            {
             before(grammarAccess.getContainerAccess().getSemanticCanditatesExpressionAssignment_11_2()); 
            // InternalSiriusTextDsl.g:5949:1: ( rule__Container__SemanticCanditatesExpressionAssignment_11_2 )
            // InternalSiriusTextDsl.g:5949:2: rule__Container__SemanticCanditatesExpressionAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__Container__SemanticCanditatesExpressionAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getSemanticCanditatesExpressionAssignment_11_2()); 

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
    // $ANTLR end "rule__Container__Group_11__2__Impl"


    // $ANTLR start "rule__ConditionalContainerStyleDeclaration__Group__0"
    // InternalSiriusTextDsl.g:5965:1: rule__ConditionalContainerStyleDeclaration__Group__0 : rule__ConditionalContainerStyleDeclaration__Group__0__Impl rule__ConditionalContainerStyleDeclaration__Group__1 ;
    public final void rule__ConditionalContainerStyleDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5969:1: ( rule__ConditionalContainerStyleDeclaration__Group__0__Impl rule__ConditionalContainerStyleDeclaration__Group__1 )
            // InternalSiriusTextDsl.g:5970:2: rule__ConditionalContainerStyleDeclaration__Group__0__Impl rule__ConditionalContainerStyleDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ConditionalContainerStyleDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalContainerStyleDeclaration__Group__1();

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
    // $ANTLR end "rule__ConditionalContainerStyleDeclaration__Group__0"


    // $ANTLR start "rule__ConditionalContainerStyleDeclaration__Group__0__Impl"
    // InternalSiriusTextDsl.g:5977:1: rule__ConditionalContainerStyleDeclaration__Group__0__Impl : ( 'style' ) ;
    public final void rule__ConditionalContainerStyleDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5981:1: ( ( 'style' ) )
            // InternalSiriusTextDsl.g:5982:1: ( 'style' )
            {
            // InternalSiriusTextDsl.g:5982:1: ( 'style' )
            // InternalSiriusTextDsl.g:5983:1: 'style'
            {
             before(grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleKeyword_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleKeyword_0()); 

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
    // $ANTLR end "rule__ConditionalContainerStyleDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ConditionalContainerStyleDeclaration__Group__1"
    // InternalSiriusTextDsl.g:5996:1: rule__ConditionalContainerStyleDeclaration__Group__1 : rule__ConditionalContainerStyleDeclaration__Group__1__Impl rule__ConditionalContainerStyleDeclaration__Group__2 ;
    public final void rule__ConditionalContainerStyleDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6000:1: ( rule__ConditionalContainerStyleDeclaration__Group__1__Impl rule__ConditionalContainerStyleDeclaration__Group__2 )
            // InternalSiriusTextDsl.g:6001:2: rule__ConditionalContainerStyleDeclaration__Group__1__Impl rule__ConditionalContainerStyleDeclaration__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__ConditionalContainerStyleDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalContainerStyleDeclaration__Group__2();

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
    // $ANTLR end "rule__ConditionalContainerStyleDeclaration__Group__1"


    // $ANTLR start "rule__ConditionalContainerStyleDeclaration__Group__1__Impl"
    // InternalSiriusTextDsl.g:6008:1: rule__ConditionalContainerStyleDeclaration__Group__1__Impl : ( ( rule__ConditionalContainerStyleDeclaration__StyleAssignment_1 ) ) ;
    public final void rule__ConditionalContainerStyleDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6012:1: ( ( ( rule__ConditionalContainerStyleDeclaration__StyleAssignment_1 ) ) )
            // InternalSiriusTextDsl.g:6013:1: ( ( rule__ConditionalContainerStyleDeclaration__StyleAssignment_1 ) )
            {
            // InternalSiriusTextDsl.g:6013:1: ( ( rule__ConditionalContainerStyleDeclaration__StyleAssignment_1 ) )
            // InternalSiriusTextDsl.g:6014:1: ( rule__ConditionalContainerStyleDeclaration__StyleAssignment_1 )
            {
             before(grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleAssignment_1()); 
            // InternalSiriusTextDsl.g:6015:1: ( rule__ConditionalContainerStyleDeclaration__StyleAssignment_1 )
            // InternalSiriusTextDsl.g:6015:2: rule__ConditionalContainerStyleDeclaration__StyleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalContainerStyleDeclaration__StyleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleAssignment_1()); 

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
    // $ANTLR end "rule__ConditionalContainerStyleDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ConditionalContainerStyleDeclaration__Group__2"
    // InternalSiriusTextDsl.g:6025:1: rule__ConditionalContainerStyleDeclaration__Group__2 : rule__ConditionalContainerStyleDeclaration__Group__2__Impl rule__ConditionalContainerStyleDeclaration__Group__3 ;
    public final void rule__ConditionalContainerStyleDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6029:1: ( rule__ConditionalContainerStyleDeclaration__Group__2__Impl rule__ConditionalContainerStyleDeclaration__Group__3 )
            // InternalSiriusTextDsl.g:6030:2: rule__ConditionalContainerStyleDeclaration__Group__2__Impl rule__ConditionalContainerStyleDeclaration__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__ConditionalContainerStyleDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalContainerStyleDeclaration__Group__3();

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
    // $ANTLR end "rule__ConditionalContainerStyleDeclaration__Group__2"


    // $ANTLR start "rule__ConditionalContainerStyleDeclaration__Group__2__Impl"
    // InternalSiriusTextDsl.g:6037:1: rule__ConditionalContainerStyleDeclaration__Group__2__Impl : ( 'if' ) ;
    public final void rule__ConditionalContainerStyleDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6041:1: ( ( 'if' ) )
            // InternalSiriusTextDsl.g:6042:1: ( 'if' )
            {
            // InternalSiriusTextDsl.g:6042:1: ( 'if' )
            // InternalSiriusTextDsl.g:6043:1: 'if'
            {
             before(grammarAccess.getConditionalContainerStyleDeclarationAccess().getIfKeyword_2()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getConditionalContainerStyleDeclarationAccess().getIfKeyword_2()); 

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
    // $ANTLR end "rule__ConditionalContainerStyleDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ConditionalContainerStyleDeclaration__Group__3"
    // InternalSiriusTextDsl.g:6056:1: rule__ConditionalContainerStyleDeclaration__Group__3 : rule__ConditionalContainerStyleDeclaration__Group__3__Impl ;
    public final void rule__ConditionalContainerStyleDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6060:1: ( rule__ConditionalContainerStyleDeclaration__Group__3__Impl )
            // InternalSiriusTextDsl.g:6061:2: rule__ConditionalContainerStyleDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalContainerStyleDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__ConditionalContainerStyleDeclaration__Group__3"


    // $ANTLR start "rule__ConditionalContainerStyleDeclaration__Group__3__Impl"
    // InternalSiriusTextDsl.g:6067:1: rule__ConditionalContainerStyleDeclaration__Group__3__Impl : ( ( rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3 ) ) ;
    public final void rule__ConditionalContainerStyleDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6071:1: ( ( ( rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3 ) ) )
            // InternalSiriusTextDsl.g:6072:1: ( ( rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3 ) )
            {
            // InternalSiriusTextDsl.g:6072:1: ( ( rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3 ) )
            // InternalSiriusTextDsl.g:6073:1: ( rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3 )
            {
             before(grammarAccess.getConditionalContainerStyleDeclarationAccess().getConditionalStyleExpressionAssignment_3()); 
            // InternalSiriusTextDsl.g:6074:1: ( rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3 )
            // InternalSiriusTextDsl.g:6074:2: rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionalContainerStyleDeclarationAccess().getConditionalStyleExpressionAssignment_3()); 

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
    // $ANTLR end "rule__ConditionalContainerStyleDeclaration__Group__3__Impl"


    // $ANTLR start "rule__Gradient__Group__0"
    // InternalSiriusTextDsl.g:6092:1: rule__Gradient__Group__0 : rule__Gradient__Group__0__Impl rule__Gradient__Group__1 ;
    public final void rule__Gradient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6096:1: ( rule__Gradient__Group__0__Impl rule__Gradient__Group__1 )
            // InternalSiriusTextDsl.g:6097:2: rule__Gradient__Group__0__Impl rule__Gradient__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__Gradient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__1();

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
    // $ANTLR end "rule__Gradient__Group__0"


    // $ANTLR start "rule__Gradient__Group__0__Impl"
    // InternalSiriusTextDsl.g:6104:1: rule__Gradient__Group__0__Impl : ( ( rule__Gradient__DocumentationAssignment_0 )? ) ;
    public final void rule__Gradient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6108:1: ( ( ( rule__Gradient__DocumentationAssignment_0 )? ) )
            // InternalSiriusTextDsl.g:6109:1: ( ( rule__Gradient__DocumentationAssignment_0 )? )
            {
            // InternalSiriusTextDsl.g:6109:1: ( ( rule__Gradient__DocumentationAssignment_0 )? )
            // InternalSiriusTextDsl.g:6110:1: ( rule__Gradient__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getGradientAccess().getDocumentationAssignment_0()); 
            // InternalSiriusTextDsl.g:6111:1: ( rule__Gradient__DocumentationAssignment_0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_DOCUMENTATION) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalSiriusTextDsl.g:6111:2: rule__Gradient__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gradient__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGradientAccess().getDocumentationAssignment_0()); 

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
    // $ANTLR end "rule__Gradient__Group__0__Impl"


    // $ANTLR start "rule__Gradient__Group__1"
    // InternalSiriusTextDsl.g:6121:1: rule__Gradient__Group__1 : rule__Gradient__Group__1__Impl rule__Gradient__Group__2 ;
    public final void rule__Gradient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6125:1: ( rule__Gradient__Group__1__Impl rule__Gradient__Group__2 )
            // InternalSiriusTextDsl.g:6126:2: rule__Gradient__Group__1__Impl rule__Gradient__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__Gradient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__2();

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
    // $ANTLR end "rule__Gradient__Group__1"


    // $ANTLR start "rule__Gradient__Group__1__Impl"
    // InternalSiriusTextDsl.g:6133:1: rule__Gradient__Group__1__Impl : ( 'gradient' ) ;
    public final void rule__Gradient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6137:1: ( ( 'gradient' ) )
            // InternalSiriusTextDsl.g:6138:1: ( 'gradient' )
            {
            // InternalSiriusTextDsl.g:6138:1: ( 'gradient' )
            // InternalSiriusTextDsl.g:6139:1: 'gradient'
            {
             before(grammarAccess.getGradientAccess().getGradientKeyword_1()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getGradientKeyword_1()); 

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
    // $ANTLR end "rule__Gradient__Group__1__Impl"


    // $ANTLR start "rule__Gradient__Group__2"
    // InternalSiriusTextDsl.g:6152:1: rule__Gradient__Group__2 : rule__Gradient__Group__2__Impl rule__Gradient__Group__3 ;
    public final void rule__Gradient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6156:1: ( rule__Gradient__Group__2__Impl rule__Gradient__Group__3 )
            // InternalSiriusTextDsl.g:6157:2: rule__Gradient__Group__2__Impl rule__Gradient__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Gradient__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__3();

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
    // $ANTLR end "rule__Gradient__Group__2"


    // $ANTLR start "rule__Gradient__Group__2__Impl"
    // InternalSiriusTextDsl.g:6164:1: rule__Gradient__Group__2__Impl : ( ( rule__Gradient__DirectionAssignment_2 ) ) ;
    public final void rule__Gradient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6168:1: ( ( ( rule__Gradient__DirectionAssignment_2 ) ) )
            // InternalSiriusTextDsl.g:6169:1: ( ( rule__Gradient__DirectionAssignment_2 ) )
            {
            // InternalSiriusTextDsl.g:6169:1: ( ( rule__Gradient__DirectionAssignment_2 ) )
            // InternalSiriusTextDsl.g:6170:1: ( rule__Gradient__DirectionAssignment_2 )
            {
             before(grammarAccess.getGradientAccess().getDirectionAssignment_2()); 
            // InternalSiriusTextDsl.g:6171:1: ( rule__Gradient__DirectionAssignment_2 )
            // InternalSiriusTextDsl.g:6171:2: rule__Gradient__DirectionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__DirectionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getDirectionAssignment_2()); 

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
    // $ANTLR end "rule__Gradient__Group__2__Impl"


    // $ANTLR start "rule__Gradient__Group__3"
    // InternalSiriusTextDsl.g:6181:1: rule__Gradient__Group__3 : rule__Gradient__Group__3__Impl rule__Gradient__Group__4 ;
    public final void rule__Gradient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6185:1: ( rule__Gradient__Group__3__Impl rule__Gradient__Group__4 )
            // InternalSiriusTextDsl.g:6186:2: rule__Gradient__Group__3__Impl rule__Gradient__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__Gradient__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__4();

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
    // $ANTLR end "rule__Gradient__Group__3"


    // $ANTLR start "rule__Gradient__Group__3__Impl"
    // InternalSiriusTextDsl.g:6193:1: rule__Gradient__Group__3__Impl : ( ( rule__Gradient__NameAssignment_3 ) ) ;
    public final void rule__Gradient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6197:1: ( ( ( rule__Gradient__NameAssignment_3 ) ) )
            // InternalSiriusTextDsl.g:6198:1: ( ( rule__Gradient__NameAssignment_3 ) )
            {
            // InternalSiriusTextDsl.g:6198:1: ( ( rule__Gradient__NameAssignment_3 ) )
            // InternalSiriusTextDsl.g:6199:1: ( rule__Gradient__NameAssignment_3 )
            {
             before(grammarAccess.getGradientAccess().getNameAssignment_3()); 
            // InternalSiriusTextDsl.g:6200:1: ( rule__Gradient__NameAssignment_3 )
            // InternalSiriusTextDsl.g:6200:2: rule__Gradient__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__Gradient__Group__3__Impl"


    // $ANTLR start "rule__Gradient__Group__4"
    // InternalSiriusTextDsl.g:6210:1: rule__Gradient__Group__4 : rule__Gradient__Group__4__Impl rule__Gradient__Group__5 ;
    public final void rule__Gradient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6214:1: ( rule__Gradient__Group__4__Impl rule__Gradient__Group__5 )
            // InternalSiriusTextDsl.g:6215:2: rule__Gradient__Group__4__Impl rule__Gradient__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Gradient__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__5();

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
    // $ANTLR end "rule__Gradient__Group__4"


    // $ANTLR start "rule__Gradient__Group__4__Impl"
    // InternalSiriusTextDsl.g:6222:1: rule__Gradient__Group__4__Impl : ( 'from' ) ;
    public final void rule__Gradient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6226:1: ( ( 'from' ) )
            // InternalSiriusTextDsl.g:6227:1: ( 'from' )
            {
            // InternalSiriusTextDsl.g:6227:1: ( 'from' )
            // InternalSiriusTextDsl.g:6228:1: 'from'
            {
             before(grammarAccess.getGradientAccess().getFromKeyword_4()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getFromKeyword_4()); 

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
    // $ANTLR end "rule__Gradient__Group__4__Impl"


    // $ANTLR start "rule__Gradient__Group__5"
    // InternalSiriusTextDsl.g:6241:1: rule__Gradient__Group__5 : rule__Gradient__Group__5__Impl rule__Gradient__Group__6 ;
    public final void rule__Gradient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6245:1: ( rule__Gradient__Group__5__Impl rule__Gradient__Group__6 )
            // InternalSiriusTextDsl.g:6246:2: rule__Gradient__Group__5__Impl rule__Gradient__Group__6
            {
            pushFollow(FOLLOW_45);
            rule__Gradient__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__6();

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
    // $ANTLR end "rule__Gradient__Group__5"


    // $ANTLR start "rule__Gradient__Group__5__Impl"
    // InternalSiriusTextDsl.g:6253:1: rule__Gradient__Group__5__Impl : ( ( rule__Gradient__BackgroundColorAssignment_5 ) ) ;
    public final void rule__Gradient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6257:1: ( ( ( rule__Gradient__BackgroundColorAssignment_5 ) ) )
            // InternalSiriusTextDsl.g:6258:1: ( ( rule__Gradient__BackgroundColorAssignment_5 ) )
            {
            // InternalSiriusTextDsl.g:6258:1: ( ( rule__Gradient__BackgroundColorAssignment_5 ) )
            // InternalSiriusTextDsl.g:6259:1: ( rule__Gradient__BackgroundColorAssignment_5 )
            {
             before(grammarAccess.getGradientAccess().getBackgroundColorAssignment_5()); 
            // InternalSiriusTextDsl.g:6260:1: ( rule__Gradient__BackgroundColorAssignment_5 )
            // InternalSiriusTextDsl.g:6260:2: rule__Gradient__BackgroundColorAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__BackgroundColorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getBackgroundColorAssignment_5()); 

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
    // $ANTLR end "rule__Gradient__Group__5__Impl"


    // $ANTLR start "rule__Gradient__Group__6"
    // InternalSiriusTextDsl.g:6270:1: rule__Gradient__Group__6 : rule__Gradient__Group__6__Impl rule__Gradient__Group__7 ;
    public final void rule__Gradient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6274:1: ( rule__Gradient__Group__6__Impl rule__Gradient__Group__7 )
            // InternalSiriusTextDsl.g:6275:2: rule__Gradient__Group__6__Impl rule__Gradient__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Gradient__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__7();

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
    // $ANTLR end "rule__Gradient__Group__6"


    // $ANTLR start "rule__Gradient__Group__6__Impl"
    // InternalSiriusTextDsl.g:6282:1: rule__Gradient__Group__6__Impl : ( 'to' ) ;
    public final void rule__Gradient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6286:1: ( ( 'to' ) )
            // InternalSiriusTextDsl.g:6287:1: ( 'to' )
            {
            // InternalSiriusTextDsl.g:6287:1: ( 'to' )
            // InternalSiriusTextDsl.g:6288:1: 'to'
            {
             before(grammarAccess.getGradientAccess().getToKeyword_6()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getToKeyword_6()); 

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
    // $ANTLR end "rule__Gradient__Group__6__Impl"


    // $ANTLR start "rule__Gradient__Group__7"
    // InternalSiriusTextDsl.g:6301:1: rule__Gradient__Group__7 : rule__Gradient__Group__7__Impl rule__Gradient__Group__8 ;
    public final void rule__Gradient__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6305:1: ( rule__Gradient__Group__7__Impl rule__Gradient__Group__8 )
            // InternalSiriusTextDsl.g:6306:2: rule__Gradient__Group__7__Impl rule__Gradient__Group__8
            {
            pushFollow(FOLLOW_33);
            rule__Gradient__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__8();

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
    // $ANTLR end "rule__Gradient__Group__7"


    // $ANTLR start "rule__Gradient__Group__7__Impl"
    // InternalSiriusTextDsl.g:6313:1: rule__Gradient__Group__7__Impl : ( ( rule__Gradient__ForegroundColorAssignment_7 ) ) ;
    public final void rule__Gradient__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6317:1: ( ( ( rule__Gradient__ForegroundColorAssignment_7 ) ) )
            // InternalSiriusTextDsl.g:6318:1: ( ( rule__Gradient__ForegroundColorAssignment_7 ) )
            {
            // InternalSiriusTextDsl.g:6318:1: ( ( rule__Gradient__ForegroundColorAssignment_7 ) )
            // InternalSiriusTextDsl.g:6319:1: ( rule__Gradient__ForegroundColorAssignment_7 )
            {
             before(grammarAccess.getGradientAccess().getForegroundColorAssignment_7()); 
            // InternalSiriusTextDsl.g:6320:1: ( rule__Gradient__ForegroundColorAssignment_7 )
            // InternalSiriusTextDsl.g:6320:2: rule__Gradient__ForegroundColorAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__ForegroundColorAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getForegroundColorAssignment_7()); 

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
    // $ANTLR end "rule__Gradient__Group__7__Impl"


    // $ANTLR start "rule__Gradient__Group__8"
    // InternalSiriusTextDsl.g:6330:1: rule__Gradient__Group__8 : rule__Gradient__Group__8__Impl rule__Gradient__Group__9 ;
    public final void rule__Gradient__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6334:1: ( rule__Gradient__Group__8__Impl rule__Gradient__Group__9 )
            // InternalSiriusTextDsl.g:6335:2: rule__Gradient__Group__8__Impl rule__Gradient__Group__9
            {
            pushFollow(FOLLOW_46);
            rule__Gradient__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__9();

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
    // $ANTLR end "rule__Gradient__Group__8"


    // $ANTLR start "rule__Gradient__Group__8__Impl"
    // InternalSiriusTextDsl.g:6342:1: rule__Gradient__Group__8__Impl : ( '{' ) ;
    public final void rule__Gradient__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6346:1: ( ( '{' ) )
            // InternalSiriusTextDsl.g:6347:1: ( '{' )
            {
            // InternalSiriusTextDsl.g:6347:1: ( '{' )
            // InternalSiriusTextDsl.g:6348:1: '{'
            {
             before(grammarAccess.getGradientAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getLeftCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Gradient__Group__8__Impl"


    // $ANTLR start "rule__Gradient__Group__9"
    // InternalSiriusTextDsl.g:6361:1: rule__Gradient__Group__9 : rule__Gradient__Group__9__Impl rule__Gradient__Group__10 ;
    public final void rule__Gradient__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6365:1: ( rule__Gradient__Group__9__Impl rule__Gradient__Group__10 )
            // InternalSiriusTextDsl.g:6366:2: rule__Gradient__Group__9__Impl rule__Gradient__Group__10
            {
            pushFollow(FOLLOW_46);
            rule__Gradient__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__10();

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
    // $ANTLR end "rule__Gradient__Group__9"


    // $ANTLR start "rule__Gradient__Group__9__Impl"
    // InternalSiriusTextDsl.g:6373:1: rule__Gradient__Group__9__Impl : ( ( rule__Gradient__Group_9__0 )? ) ;
    public final void rule__Gradient__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6377:1: ( ( ( rule__Gradient__Group_9__0 )? ) )
            // InternalSiriusTextDsl.g:6378:1: ( ( rule__Gradient__Group_9__0 )? )
            {
            // InternalSiriusTextDsl.g:6378:1: ( ( rule__Gradient__Group_9__0 )? )
            // InternalSiriusTextDsl.g:6379:1: ( rule__Gradient__Group_9__0 )?
            {
             before(grammarAccess.getGradientAccess().getGroup_9()); 
            // InternalSiriusTextDsl.g:6380:1: ( rule__Gradient__Group_9__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==75) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalSiriusTextDsl.g:6380:2: rule__Gradient__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gradient__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGradientAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Gradient__Group__9__Impl"


    // $ANTLR start "rule__Gradient__Group__10"
    // InternalSiriusTextDsl.g:6390:1: rule__Gradient__Group__10 : rule__Gradient__Group__10__Impl rule__Gradient__Group__11 ;
    public final void rule__Gradient__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6394:1: ( rule__Gradient__Group__10__Impl rule__Gradient__Group__11 )
            // InternalSiriusTextDsl.g:6395:2: rule__Gradient__Group__10__Impl rule__Gradient__Group__11
            {
            pushFollow(FOLLOW_46);
            rule__Gradient__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__11();

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
    // $ANTLR end "rule__Gradient__Group__10"


    // $ANTLR start "rule__Gradient__Group__10__Impl"
    // InternalSiriusTextDsl.g:6402:1: rule__Gradient__Group__10__Impl : ( ( rule__Gradient__Group_10__0 )? ) ;
    public final void rule__Gradient__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6406:1: ( ( ( rule__Gradient__Group_10__0 )? ) )
            // InternalSiriusTextDsl.g:6407:1: ( ( rule__Gradient__Group_10__0 )? )
            {
            // InternalSiriusTextDsl.g:6407:1: ( ( rule__Gradient__Group_10__0 )? )
            // InternalSiriusTextDsl.g:6408:1: ( rule__Gradient__Group_10__0 )?
            {
             before(grammarAccess.getGradientAccess().getGroup_10()); 
            // InternalSiriusTextDsl.g:6409:1: ( rule__Gradient__Group_10__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==77) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalSiriusTextDsl.g:6409:2: rule__Gradient__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gradient__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGradientAccess().getGroup_10()); 

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
    // $ANTLR end "rule__Gradient__Group__10__Impl"


    // $ANTLR start "rule__Gradient__Group__11"
    // InternalSiriusTextDsl.g:6419:1: rule__Gradient__Group__11 : rule__Gradient__Group__11__Impl rule__Gradient__Group__12 ;
    public final void rule__Gradient__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6423:1: ( rule__Gradient__Group__11__Impl rule__Gradient__Group__12 )
            // InternalSiriusTextDsl.g:6424:2: rule__Gradient__Group__11__Impl rule__Gradient__Group__12
            {
            pushFollow(FOLLOW_46);
            rule__Gradient__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__12();

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
    // $ANTLR end "rule__Gradient__Group__11"


    // $ANTLR start "rule__Gradient__Group__11__Impl"
    // InternalSiriusTextDsl.g:6431:1: rule__Gradient__Group__11__Impl : ( ( rule__Gradient__Group_11__0 )? ) ;
    public final void rule__Gradient__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6435:1: ( ( ( rule__Gradient__Group_11__0 )? ) )
            // InternalSiriusTextDsl.g:6436:1: ( ( rule__Gradient__Group_11__0 )? )
            {
            // InternalSiriusTextDsl.g:6436:1: ( ( rule__Gradient__Group_11__0 )? )
            // InternalSiriusTextDsl.g:6437:1: ( rule__Gradient__Group_11__0 )?
            {
             before(grammarAccess.getGradientAccess().getGroup_11()); 
            // InternalSiriusTextDsl.g:6438:1: ( rule__Gradient__Group_11__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==52) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalSiriusTextDsl.g:6438:2: rule__Gradient__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gradient__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGradientAccess().getGroup_11()); 

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
    // $ANTLR end "rule__Gradient__Group__11__Impl"


    // $ANTLR start "rule__Gradient__Group__12"
    // InternalSiriusTextDsl.g:6448:1: rule__Gradient__Group__12 : rule__Gradient__Group__12__Impl rule__Gradient__Group__13 ;
    public final void rule__Gradient__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6452:1: ( rule__Gradient__Group__12__Impl rule__Gradient__Group__13 )
            // InternalSiriusTextDsl.g:6453:2: rule__Gradient__Group__12__Impl rule__Gradient__Group__13
            {
            pushFollow(FOLLOW_46);
            rule__Gradient__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__13();

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
    // $ANTLR end "rule__Gradient__Group__12"


    // $ANTLR start "rule__Gradient__Group__12__Impl"
    // InternalSiriusTextDsl.g:6460:1: rule__Gradient__Group__12__Impl : ( ( rule__Gradient__Group_12__0 )? ) ;
    public final void rule__Gradient__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6464:1: ( ( ( rule__Gradient__Group_12__0 )? ) )
            // InternalSiriusTextDsl.g:6465:1: ( ( rule__Gradient__Group_12__0 )? )
            {
            // InternalSiriusTextDsl.g:6465:1: ( ( rule__Gradient__Group_12__0 )? )
            // InternalSiriusTextDsl.g:6466:1: ( rule__Gradient__Group_12__0 )?
            {
             before(grammarAccess.getGradientAccess().getGroup_12()); 
            // InternalSiriusTextDsl.g:6467:1: ( rule__Gradient__Group_12__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==79) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalSiriusTextDsl.g:6467:2: rule__Gradient__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gradient__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGradientAccess().getGroup_12()); 

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
    // $ANTLR end "rule__Gradient__Group__12__Impl"


    // $ANTLR start "rule__Gradient__Group__13"
    // InternalSiriusTextDsl.g:6477:1: rule__Gradient__Group__13 : rule__Gradient__Group__13__Impl rule__Gradient__Group__14 ;
    public final void rule__Gradient__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6481:1: ( rule__Gradient__Group__13__Impl rule__Gradient__Group__14 )
            // InternalSiriusTextDsl.g:6482:2: rule__Gradient__Group__13__Impl rule__Gradient__Group__14
            {
            pushFollow(FOLLOW_46);
            rule__Gradient__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__14();

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
    // $ANTLR end "rule__Gradient__Group__13"


    // $ANTLR start "rule__Gradient__Group__13__Impl"
    // InternalSiriusTextDsl.g:6489:1: rule__Gradient__Group__13__Impl : ( ( rule__Gradient__Group_13__0 )? ) ;
    public final void rule__Gradient__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6493:1: ( ( ( rule__Gradient__Group_13__0 )? ) )
            // InternalSiriusTextDsl.g:6494:1: ( ( rule__Gradient__Group_13__0 )? )
            {
            // InternalSiriusTextDsl.g:6494:1: ( ( rule__Gradient__Group_13__0 )? )
            // InternalSiriusTextDsl.g:6495:1: ( rule__Gradient__Group_13__0 )?
            {
             before(grammarAccess.getGradientAccess().getGroup_13()); 
            // InternalSiriusTextDsl.g:6496:1: ( rule__Gradient__Group_13__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==80) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalSiriusTextDsl.g:6496:2: rule__Gradient__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gradient__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGradientAccess().getGroup_13()); 

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
    // $ANTLR end "rule__Gradient__Group__13__Impl"


    // $ANTLR start "rule__Gradient__Group__14"
    // InternalSiriusTextDsl.g:6506:1: rule__Gradient__Group__14 : rule__Gradient__Group__14__Impl ;
    public final void rule__Gradient__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6510:1: ( rule__Gradient__Group__14__Impl )
            // InternalSiriusTextDsl.g:6511:2: rule__Gradient__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__Group__14__Impl();

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
    // $ANTLR end "rule__Gradient__Group__14"


    // $ANTLR start "rule__Gradient__Group__14__Impl"
    // InternalSiriusTextDsl.g:6517:1: rule__Gradient__Group__14__Impl : ( '}' ) ;
    public final void rule__Gradient__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6521:1: ( ( '}' ) )
            // InternalSiriusTextDsl.g:6522:1: ( '}' )
            {
            // InternalSiriusTextDsl.g:6522:1: ( '}' )
            // InternalSiriusTextDsl.g:6523:1: '}'
            {
             before(grammarAccess.getGradientAccess().getRightCurlyBracketKeyword_14()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getRightCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__Gradient__Group__14__Impl"


    // $ANTLR start "rule__Gradient__Group_9__0"
    // InternalSiriusTextDsl.g:6566:1: rule__Gradient__Group_9__0 : rule__Gradient__Group_9__0__Impl rule__Gradient__Group_9__1 ;
    public final void rule__Gradient__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6570:1: ( rule__Gradient__Group_9__0__Impl rule__Gradient__Group_9__1 )
            // InternalSiriusTextDsl.g:6571:2: rule__Gradient__Group_9__0__Impl rule__Gradient__Group_9__1
            {
            pushFollow(FOLLOW_47);
            rule__Gradient__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_9__1();

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
    // $ANTLR end "rule__Gradient__Group_9__0"


    // $ANTLR start "rule__Gradient__Group_9__0__Impl"
    // InternalSiriusTextDsl.g:6578:1: rule__Gradient__Group_9__0__Impl : ( 'label' ) ;
    public final void rule__Gradient__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6582:1: ( ( 'label' ) )
            // InternalSiriusTextDsl.g:6583:1: ( 'label' )
            {
            // InternalSiriusTextDsl.g:6583:1: ( 'label' )
            // InternalSiriusTextDsl.g:6584:1: 'label'
            {
             before(grammarAccess.getGradientAccess().getLabelKeyword_9_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getLabelKeyword_9_0()); 

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
    // $ANTLR end "rule__Gradient__Group_9__0__Impl"


    // $ANTLR start "rule__Gradient__Group_9__1"
    // InternalSiriusTextDsl.g:6597:1: rule__Gradient__Group_9__1 : rule__Gradient__Group_9__1__Impl rule__Gradient__Group_9__2 ;
    public final void rule__Gradient__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6601:1: ( rule__Gradient__Group_9__1__Impl rule__Gradient__Group_9__2 )
            // InternalSiriusTextDsl.g:6602:2: rule__Gradient__Group_9__1__Impl rule__Gradient__Group_9__2
            {
            pushFollow(FOLLOW_31);
            rule__Gradient__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_9__2();

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
    // $ANTLR end "rule__Gradient__Group_9__1"


    // $ANTLR start "rule__Gradient__Group_9__1__Impl"
    // InternalSiriusTextDsl.g:6609:1: rule__Gradient__Group_9__1__Impl : ( ( rule__Gradient__LabelAlignmentAssignment_9_1 ) ) ;
    public final void rule__Gradient__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6613:1: ( ( ( rule__Gradient__LabelAlignmentAssignment_9_1 ) ) )
            // InternalSiriusTextDsl.g:6614:1: ( ( rule__Gradient__LabelAlignmentAssignment_9_1 ) )
            {
            // InternalSiriusTextDsl.g:6614:1: ( ( rule__Gradient__LabelAlignmentAssignment_9_1 ) )
            // InternalSiriusTextDsl.g:6615:1: ( rule__Gradient__LabelAlignmentAssignment_9_1 )
            {
             before(grammarAccess.getGradientAccess().getLabelAlignmentAssignment_9_1()); 
            // InternalSiriusTextDsl.g:6616:1: ( rule__Gradient__LabelAlignmentAssignment_9_1 )
            // InternalSiriusTextDsl.g:6616:2: rule__Gradient__LabelAlignmentAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__LabelAlignmentAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getLabelAlignmentAssignment_9_1()); 

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
    // $ANTLR end "rule__Gradient__Group_9__1__Impl"


    // $ANTLR start "rule__Gradient__Group_9__2"
    // InternalSiriusTextDsl.g:6626:1: rule__Gradient__Group_9__2 : rule__Gradient__Group_9__2__Impl rule__Gradient__Group_9__3 ;
    public final void rule__Gradient__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6630:1: ( rule__Gradient__Group_9__2__Impl rule__Gradient__Group_9__3 )
            // InternalSiriusTextDsl.g:6631:2: rule__Gradient__Group_9__2__Impl rule__Gradient__Group_9__3
            {
            pushFollow(FOLLOW_48);
            rule__Gradient__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_9__3();

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
    // $ANTLR end "rule__Gradient__Group_9__2"


    // $ANTLR start "rule__Gradient__Group_9__2__Impl"
    // InternalSiriusTextDsl.g:6638:1: rule__Gradient__Group_9__2__Impl : ( ( rule__Gradient__LabelExpressionAssignment_9_2 ) ) ;
    public final void rule__Gradient__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6642:1: ( ( ( rule__Gradient__LabelExpressionAssignment_9_2 ) ) )
            // InternalSiriusTextDsl.g:6643:1: ( ( rule__Gradient__LabelExpressionAssignment_9_2 ) )
            {
            // InternalSiriusTextDsl.g:6643:1: ( ( rule__Gradient__LabelExpressionAssignment_9_2 ) )
            // InternalSiriusTextDsl.g:6644:1: ( rule__Gradient__LabelExpressionAssignment_9_2 )
            {
             before(grammarAccess.getGradientAccess().getLabelExpressionAssignment_9_2()); 
            // InternalSiriusTextDsl.g:6645:1: ( rule__Gradient__LabelExpressionAssignment_9_2 )
            // InternalSiriusTextDsl.g:6645:2: rule__Gradient__LabelExpressionAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__LabelExpressionAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getLabelExpressionAssignment_9_2()); 

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
    // $ANTLR end "rule__Gradient__Group_9__2__Impl"


    // $ANTLR start "rule__Gradient__Group_9__3"
    // InternalSiriusTextDsl.g:6655:1: rule__Gradient__Group_9__3 : rule__Gradient__Group_9__3__Impl rule__Gradient__Group_9__4 ;
    public final void rule__Gradient__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6659:1: ( rule__Gradient__Group_9__3__Impl rule__Gradient__Group_9__4 )
            // InternalSiriusTextDsl.g:6660:2: rule__Gradient__Group_9__3__Impl rule__Gradient__Group_9__4
            {
            pushFollow(FOLLOW_4);
            rule__Gradient__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_9__4();

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
    // $ANTLR end "rule__Gradient__Group_9__3"


    // $ANTLR start "rule__Gradient__Group_9__3__Impl"
    // InternalSiriusTextDsl.g:6667:1: rule__Gradient__Group_9__3__Impl : ( 'in' ) ;
    public final void rule__Gradient__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6671:1: ( ( 'in' ) )
            // InternalSiriusTextDsl.g:6672:1: ( 'in' )
            {
            // InternalSiriusTextDsl.g:6672:1: ( 'in' )
            // InternalSiriusTextDsl.g:6673:1: 'in'
            {
             before(grammarAccess.getGradientAccess().getInKeyword_9_3()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getInKeyword_9_3()); 

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
    // $ANTLR end "rule__Gradient__Group_9__3__Impl"


    // $ANTLR start "rule__Gradient__Group_9__4"
    // InternalSiriusTextDsl.g:6686:1: rule__Gradient__Group_9__4 : rule__Gradient__Group_9__4__Impl ;
    public final void rule__Gradient__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6690:1: ( rule__Gradient__Group_9__4__Impl )
            // InternalSiriusTextDsl.g:6691:2: rule__Gradient__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__Group_9__4__Impl();

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
    // $ANTLR end "rule__Gradient__Group_9__4"


    // $ANTLR start "rule__Gradient__Group_9__4__Impl"
    // InternalSiriusTextDsl.g:6697:1: rule__Gradient__Group_9__4__Impl : ( ( rule__Gradient__LabelColorAssignment_9_4 ) ) ;
    public final void rule__Gradient__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6701:1: ( ( ( rule__Gradient__LabelColorAssignment_9_4 ) ) )
            // InternalSiriusTextDsl.g:6702:1: ( ( rule__Gradient__LabelColorAssignment_9_4 ) )
            {
            // InternalSiriusTextDsl.g:6702:1: ( ( rule__Gradient__LabelColorAssignment_9_4 ) )
            // InternalSiriusTextDsl.g:6703:1: ( rule__Gradient__LabelColorAssignment_9_4 )
            {
             before(grammarAccess.getGradientAccess().getLabelColorAssignment_9_4()); 
            // InternalSiriusTextDsl.g:6704:1: ( rule__Gradient__LabelColorAssignment_9_4 )
            // InternalSiriusTextDsl.g:6704:2: rule__Gradient__LabelColorAssignment_9_4
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__LabelColorAssignment_9_4();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getLabelColorAssignment_9_4()); 

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
    // $ANTLR end "rule__Gradient__Group_9__4__Impl"


    // $ANTLR start "rule__Gradient__Group_10__0"
    // InternalSiriusTextDsl.g:6724:1: rule__Gradient__Group_10__0 : rule__Gradient__Group_10__0__Impl rule__Gradient__Group_10__1 ;
    public final void rule__Gradient__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6728:1: ( rule__Gradient__Group_10__0__Impl rule__Gradient__Group_10__1 )
            // InternalSiriusTextDsl.g:6729:2: rule__Gradient__Group_10__0__Impl rule__Gradient__Group_10__1
            {
            pushFollow(FOLLOW_49);
            rule__Gradient__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_10__1();

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
    // $ANTLR end "rule__Gradient__Group_10__0"


    // $ANTLR start "rule__Gradient__Group_10__0__Impl"
    // InternalSiriusTextDsl.g:6736:1: rule__Gradient__Group_10__0__Impl : ( 'border' ) ;
    public final void rule__Gradient__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6740:1: ( ( 'border' ) )
            // InternalSiriusTextDsl.g:6741:1: ( 'border' )
            {
            // InternalSiriusTextDsl.g:6741:1: ( 'border' )
            // InternalSiriusTextDsl.g:6742:1: 'border'
            {
             before(grammarAccess.getGradientAccess().getBorderKeyword_10_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getBorderKeyword_10_0()); 

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
    // $ANTLR end "rule__Gradient__Group_10__0__Impl"


    // $ANTLR start "rule__Gradient__Group_10__1"
    // InternalSiriusTextDsl.g:6755:1: rule__Gradient__Group_10__1 : rule__Gradient__Group_10__1__Impl rule__Gradient__Group_10__2 ;
    public final void rule__Gradient__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6759:1: ( rule__Gradient__Group_10__1__Impl rule__Gradient__Group_10__2 )
            // InternalSiriusTextDsl.g:6760:2: rule__Gradient__Group_10__1__Impl rule__Gradient__Group_10__2
            {
            pushFollow(FOLLOW_17);
            rule__Gradient__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_10__2();

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
    // $ANTLR end "rule__Gradient__Group_10__1"


    // $ANTLR start "rule__Gradient__Group_10__1__Impl"
    // InternalSiriusTextDsl.g:6767:1: rule__Gradient__Group_10__1__Impl : ( 'size' ) ;
    public final void rule__Gradient__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6771:1: ( ( 'size' ) )
            // InternalSiriusTextDsl.g:6772:1: ( 'size' )
            {
            // InternalSiriusTextDsl.g:6772:1: ( 'size' )
            // InternalSiriusTextDsl.g:6773:1: 'size'
            {
             before(grammarAccess.getGradientAccess().getSizeKeyword_10_1()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getSizeKeyword_10_1()); 

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
    // $ANTLR end "rule__Gradient__Group_10__1__Impl"


    // $ANTLR start "rule__Gradient__Group_10__2"
    // InternalSiriusTextDsl.g:6786:1: rule__Gradient__Group_10__2 : rule__Gradient__Group_10__2__Impl rule__Gradient__Group_10__3 ;
    public final void rule__Gradient__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6790:1: ( rule__Gradient__Group_10__2__Impl rule__Gradient__Group_10__3 )
            // InternalSiriusTextDsl.g:6791:2: rule__Gradient__Group_10__2__Impl rule__Gradient__Group_10__3
            {
            pushFollow(FOLLOW_50);
            rule__Gradient__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_10__3();

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
    // $ANTLR end "rule__Gradient__Group_10__2"


    // $ANTLR start "rule__Gradient__Group_10__2__Impl"
    // InternalSiriusTextDsl.g:6798:1: rule__Gradient__Group_10__2__Impl : ( '=' ) ;
    public final void rule__Gradient__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6802:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:6803:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:6803:1: ( '=' )
            // InternalSiriusTextDsl.g:6804:1: '='
            {
             before(grammarAccess.getGradientAccess().getEqualsSignKeyword_10_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getEqualsSignKeyword_10_2()); 

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
    // $ANTLR end "rule__Gradient__Group_10__2__Impl"


    // $ANTLR start "rule__Gradient__Group_10__3"
    // InternalSiriusTextDsl.g:6817:1: rule__Gradient__Group_10__3 : rule__Gradient__Group_10__3__Impl rule__Gradient__Group_10__4 ;
    public final void rule__Gradient__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6821:1: ( rule__Gradient__Group_10__3__Impl rule__Gradient__Group_10__4 )
            // InternalSiriusTextDsl.g:6822:2: rule__Gradient__Group_10__3__Impl rule__Gradient__Group_10__4
            {
            pushFollow(FOLLOW_48);
            rule__Gradient__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_10__4();

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
    // $ANTLR end "rule__Gradient__Group_10__3"


    // $ANTLR start "rule__Gradient__Group_10__3__Impl"
    // InternalSiriusTextDsl.g:6829:1: rule__Gradient__Group_10__3__Impl : ( ( rule__Gradient__BorderSizeAssignment_10_3 ) ) ;
    public final void rule__Gradient__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6833:1: ( ( ( rule__Gradient__BorderSizeAssignment_10_3 ) ) )
            // InternalSiriusTextDsl.g:6834:1: ( ( rule__Gradient__BorderSizeAssignment_10_3 ) )
            {
            // InternalSiriusTextDsl.g:6834:1: ( ( rule__Gradient__BorderSizeAssignment_10_3 ) )
            // InternalSiriusTextDsl.g:6835:1: ( rule__Gradient__BorderSizeAssignment_10_3 )
            {
             before(grammarAccess.getGradientAccess().getBorderSizeAssignment_10_3()); 
            // InternalSiriusTextDsl.g:6836:1: ( rule__Gradient__BorderSizeAssignment_10_3 )
            // InternalSiriusTextDsl.g:6836:2: rule__Gradient__BorderSizeAssignment_10_3
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__BorderSizeAssignment_10_3();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getBorderSizeAssignment_10_3()); 

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
    // $ANTLR end "rule__Gradient__Group_10__3__Impl"


    // $ANTLR start "rule__Gradient__Group_10__4"
    // InternalSiriusTextDsl.g:6846:1: rule__Gradient__Group_10__4 : rule__Gradient__Group_10__4__Impl rule__Gradient__Group_10__5 ;
    public final void rule__Gradient__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6850:1: ( rule__Gradient__Group_10__4__Impl rule__Gradient__Group_10__5 )
            // InternalSiriusTextDsl.g:6851:2: rule__Gradient__Group_10__4__Impl rule__Gradient__Group_10__5
            {
            pushFollow(FOLLOW_4);
            rule__Gradient__Group_10__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_10__5();

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
    // $ANTLR end "rule__Gradient__Group_10__4"


    // $ANTLR start "rule__Gradient__Group_10__4__Impl"
    // InternalSiriusTextDsl.g:6858:1: rule__Gradient__Group_10__4__Impl : ( 'in' ) ;
    public final void rule__Gradient__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6862:1: ( ( 'in' ) )
            // InternalSiriusTextDsl.g:6863:1: ( 'in' )
            {
            // InternalSiriusTextDsl.g:6863:1: ( 'in' )
            // InternalSiriusTextDsl.g:6864:1: 'in'
            {
             before(grammarAccess.getGradientAccess().getInKeyword_10_4()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getInKeyword_10_4()); 

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
    // $ANTLR end "rule__Gradient__Group_10__4__Impl"


    // $ANTLR start "rule__Gradient__Group_10__5"
    // InternalSiriusTextDsl.g:6877:1: rule__Gradient__Group_10__5 : rule__Gradient__Group_10__5__Impl ;
    public final void rule__Gradient__Group_10__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6881:1: ( rule__Gradient__Group_10__5__Impl )
            // InternalSiriusTextDsl.g:6882:2: rule__Gradient__Group_10__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__Group_10__5__Impl();

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
    // $ANTLR end "rule__Gradient__Group_10__5"


    // $ANTLR start "rule__Gradient__Group_10__5__Impl"
    // InternalSiriusTextDsl.g:6888:1: rule__Gradient__Group_10__5__Impl : ( ( rule__Gradient__BorderColorAssignment_10_5 ) ) ;
    public final void rule__Gradient__Group_10__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6892:1: ( ( ( rule__Gradient__BorderColorAssignment_10_5 ) ) )
            // InternalSiriusTextDsl.g:6893:1: ( ( rule__Gradient__BorderColorAssignment_10_5 ) )
            {
            // InternalSiriusTextDsl.g:6893:1: ( ( rule__Gradient__BorderColorAssignment_10_5 ) )
            // InternalSiriusTextDsl.g:6894:1: ( rule__Gradient__BorderColorAssignment_10_5 )
            {
             before(grammarAccess.getGradientAccess().getBorderColorAssignment_10_5()); 
            // InternalSiriusTextDsl.g:6895:1: ( rule__Gradient__BorderColorAssignment_10_5 )
            // InternalSiriusTextDsl.g:6895:2: rule__Gradient__BorderColorAssignment_10_5
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__BorderColorAssignment_10_5();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getBorderColorAssignment_10_5()); 

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
    // $ANTLR end "rule__Gradient__Group_10__5__Impl"


    // $ANTLR start "rule__Gradient__Group_11__0"
    // InternalSiriusTextDsl.g:6917:1: rule__Gradient__Group_11__0 : rule__Gradient__Group_11__0__Impl rule__Gradient__Group_11__1 ;
    public final void rule__Gradient__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6921:1: ( rule__Gradient__Group_11__0__Impl rule__Gradient__Group_11__1 )
            // InternalSiriusTextDsl.g:6922:2: rule__Gradient__Group_11__0__Impl rule__Gradient__Group_11__1
            {
            pushFollow(FOLLOW_17);
            rule__Gradient__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_11__1();

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
    // $ANTLR end "rule__Gradient__Group_11__0"


    // $ANTLR start "rule__Gradient__Group_11__0__Impl"
    // InternalSiriusTextDsl.g:6929:1: rule__Gradient__Group_11__0__Impl : ( 'icon' ) ;
    public final void rule__Gradient__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6933:1: ( ( 'icon' ) )
            // InternalSiriusTextDsl.g:6934:1: ( 'icon' )
            {
            // InternalSiriusTextDsl.g:6934:1: ( 'icon' )
            // InternalSiriusTextDsl.g:6935:1: 'icon'
            {
             before(grammarAccess.getGradientAccess().getIconKeyword_11_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getIconKeyword_11_0()); 

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
    // $ANTLR end "rule__Gradient__Group_11__0__Impl"


    // $ANTLR start "rule__Gradient__Group_11__1"
    // InternalSiriusTextDsl.g:6948:1: rule__Gradient__Group_11__1 : rule__Gradient__Group_11__1__Impl rule__Gradient__Group_11__2 ;
    public final void rule__Gradient__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6952:1: ( rule__Gradient__Group_11__1__Impl rule__Gradient__Group_11__2 )
            // InternalSiriusTextDsl.g:6953:2: rule__Gradient__Group_11__1__Impl rule__Gradient__Group_11__2
            {
            pushFollow(FOLLOW_14);
            rule__Gradient__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_11__2();

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
    // $ANTLR end "rule__Gradient__Group_11__1"


    // $ANTLR start "rule__Gradient__Group_11__1__Impl"
    // InternalSiriusTextDsl.g:6960:1: rule__Gradient__Group_11__1__Impl : ( '=' ) ;
    public final void rule__Gradient__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6964:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:6965:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:6965:1: ( '=' )
            // InternalSiriusTextDsl.g:6966:1: '='
            {
             before(grammarAccess.getGradientAccess().getEqualsSignKeyword_11_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getEqualsSignKeyword_11_1()); 

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
    // $ANTLR end "rule__Gradient__Group_11__1__Impl"


    // $ANTLR start "rule__Gradient__Group_11__2"
    // InternalSiriusTextDsl.g:6979:1: rule__Gradient__Group_11__2 : rule__Gradient__Group_11__2__Impl ;
    public final void rule__Gradient__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6983:1: ( rule__Gradient__Group_11__2__Impl )
            // InternalSiriusTextDsl.g:6984:2: rule__Gradient__Group_11__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__Group_11__2__Impl();

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
    // $ANTLR end "rule__Gradient__Group_11__2"


    // $ANTLR start "rule__Gradient__Group_11__2__Impl"
    // InternalSiriusTextDsl.g:6990:1: rule__Gradient__Group_11__2__Impl : ( ( rule__Gradient__IconAssignment_11_2 ) ) ;
    public final void rule__Gradient__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6994:1: ( ( ( rule__Gradient__IconAssignment_11_2 ) ) )
            // InternalSiriusTextDsl.g:6995:1: ( ( rule__Gradient__IconAssignment_11_2 ) )
            {
            // InternalSiriusTextDsl.g:6995:1: ( ( rule__Gradient__IconAssignment_11_2 ) )
            // InternalSiriusTextDsl.g:6996:1: ( rule__Gradient__IconAssignment_11_2 )
            {
             before(grammarAccess.getGradientAccess().getIconAssignment_11_2()); 
            // InternalSiriusTextDsl.g:6997:1: ( rule__Gradient__IconAssignment_11_2 )
            // InternalSiriusTextDsl.g:6997:2: rule__Gradient__IconAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__IconAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getIconAssignment_11_2()); 

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
    // $ANTLR end "rule__Gradient__Group_11__2__Impl"


    // $ANTLR start "rule__Gradient__Group_12__0"
    // InternalSiriusTextDsl.g:7013:1: rule__Gradient__Group_12__0 : rule__Gradient__Group_12__0__Impl rule__Gradient__Group_12__1 ;
    public final void rule__Gradient__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7017:1: ( rule__Gradient__Group_12__0__Impl rule__Gradient__Group_12__1 )
            // InternalSiriusTextDsl.g:7018:2: rule__Gradient__Group_12__0__Impl rule__Gradient__Group_12__1
            {
            pushFollow(FOLLOW_17);
            rule__Gradient__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_12__1();

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
    // $ANTLR end "rule__Gradient__Group_12__0"


    // $ANTLR start "rule__Gradient__Group_12__0__Impl"
    // InternalSiriusTextDsl.g:7025:1: rule__Gradient__Group_12__0__Impl : ( 'heightComputationExpression' ) ;
    public final void rule__Gradient__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7029:1: ( ( 'heightComputationExpression' ) )
            // InternalSiriusTextDsl.g:7030:1: ( 'heightComputationExpression' )
            {
            // InternalSiriusTextDsl.g:7030:1: ( 'heightComputationExpression' )
            // InternalSiriusTextDsl.g:7031:1: 'heightComputationExpression'
            {
             before(grammarAccess.getGradientAccess().getHeightComputationExpressionKeyword_12_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getHeightComputationExpressionKeyword_12_0()); 

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
    // $ANTLR end "rule__Gradient__Group_12__0__Impl"


    // $ANTLR start "rule__Gradient__Group_12__1"
    // InternalSiriusTextDsl.g:7044:1: rule__Gradient__Group_12__1 : rule__Gradient__Group_12__1__Impl rule__Gradient__Group_12__2 ;
    public final void rule__Gradient__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7048:1: ( rule__Gradient__Group_12__1__Impl rule__Gradient__Group_12__2 )
            // InternalSiriusTextDsl.g:7049:2: rule__Gradient__Group_12__1__Impl rule__Gradient__Group_12__2
            {
            pushFollow(FOLLOW_31);
            rule__Gradient__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_12__2();

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
    // $ANTLR end "rule__Gradient__Group_12__1"


    // $ANTLR start "rule__Gradient__Group_12__1__Impl"
    // InternalSiriusTextDsl.g:7056:1: rule__Gradient__Group_12__1__Impl : ( '=' ) ;
    public final void rule__Gradient__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7060:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:7061:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:7061:1: ( '=' )
            // InternalSiriusTextDsl.g:7062:1: '='
            {
             before(grammarAccess.getGradientAccess().getEqualsSignKeyword_12_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getEqualsSignKeyword_12_1()); 

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
    // $ANTLR end "rule__Gradient__Group_12__1__Impl"


    // $ANTLR start "rule__Gradient__Group_12__2"
    // InternalSiriusTextDsl.g:7075:1: rule__Gradient__Group_12__2 : rule__Gradient__Group_12__2__Impl ;
    public final void rule__Gradient__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7079:1: ( rule__Gradient__Group_12__2__Impl )
            // InternalSiriusTextDsl.g:7080:2: rule__Gradient__Group_12__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__Group_12__2__Impl();

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
    // $ANTLR end "rule__Gradient__Group_12__2"


    // $ANTLR start "rule__Gradient__Group_12__2__Impl"
    // InternalSiriusTextDsl.g:7086:1: rule__Gradient__Group_12__2__Impl : ( ( rule__Gradient__HeightComputationExpressionAssignment_12_2 ) ) ;
    public final void rule__Gradient__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7090:1: ( ( ( rule__Gradient__HeightComputationExpressionAssignment_12_2 ) ) )
            // InternalSiriusTextDsl.g:7091:1: ( ( rule__Gradient__HeightComputationExpressionAssignment_12_2 ) )
            {
            // InternalSiriusTextDsl.g:7091:1: ( ( rule__Gradient__HeightComputationExpressionAssignment_12_2 ) )
            // InternalSiriusTextDsl.g:7092:1: ( rule__Gradient__HeightComputationExpressionAssignment_12_2 )
            {
             before(grammarAccess.getGradientAccess().getHeightComputationExpressionAssignment_12_2()); 
            // InternalSiriusTextDsl.g:7093:1: ( rule__Gradient__HeightComputationExpressionAssignment_12_2 )
            // InternalSiriusTextDsl.g:7093:2: rule__Gradient__HeightComputationExpressionAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__HeightComputationExpressionAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getHeightComputationExpressionAssignment_12_2()); 

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
    // $ANTLR end "rule__Gradient__Group_12__2__Impl"


    // $ANTLR start "rule__Gradient__Group_13__0"
    // InternalSiriusTextDsl.g:7109:1: rule__Gradient__Group_13__0 : rule__Gradient__Group_13__0__Impl rule__Gradient__Group_13__1 ;
    public final void rule__Gradient__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7113:1: ( rule__Gradient__Group_13__0__Impl rule__Gradient__Group_13__1 )
            // InternalSiriusTextDsl.g:7114:2: rule__Gradient__Group_13__0__Impl rule__Gradient__Group_13__1
            {
            pushFollow(FOLLOW_17);
            rule__Gradient__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_13__1();

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
    // $ANTLR end "rule__Gradient__Group_13__0"


    // $ANTLR start "rule__Gradient__Group_13__0__Impl"
    // InternalSiriusTextDsl.g:7121:1: rule__Gradient__Group_13__0__Impl : ( 'widthComputationExpression' ) ;
    public final void rule__Gradient__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7125:1: ( ( 'widthComputationExpression' ) )
            // InternalSiriusTextDsl.g:7126:1: ( 'widthComputationExpression' )
            {
            // InternalSiriusTextDsl.g:7126:1: ( 'widthComputationExpression' )
            // InternalSiriusTextDsl.g:7127:1: 'widthComputationExpression'
            {
             before(grammarAccess.getGradientAccess().getWidthComputationExpressionKeyword_13_0()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getWidthComputationExpressionKeyword_13_0()); 

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
    // $ANTLR end "rule__Gradient__Group_13__0__Impl"


    // $ANTLR start "rule__Gradient__Group_13__1"
    // InternalSiriusTextDsl.g:7140:1: rule__Gradient__Group_13__1 : rule__Gradient__Group_13__1__Impl rule__Gradient__Group_13__2 ;
    public final void rule__Gradient__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7144:1: ( rule__Gradient__Group_13__1__Impl rule__Gradient__Group_13__2 )
            // InternalSiriusTextDsl.g:7145:2: rule__Gradient__Group_13__1__Impl rule__Gradient__Group_13__2
            {
            pushFollow(FOLLOW_31);
            rule__Gradient__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_13__2();

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
    // $ANTLR end "rule__Gradient__Group_13__1"


    // $ANTLR start "rule__Gradient__Group_13__1__Impl"
    // InternalSiriusTextDsl.g:7152:1: rule__Gradient__Group_13__1__Impl : ( '=' ) ;
    public final void rule__Gradient__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7156:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:7157:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:7157:1: ( '=' )
            // InternalSiriusTextDsl.g:7158:1: '='
            {
             before(grammarAccess.getGradientAccess().getEqualsSignKeyword_13_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getEqualsSignKeyword_13_1()); 

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
    // $ANTLR end "rule__Gradient__Group_13__1__Impl"


    // $ANTLR start "rule__Gradient__Group_13__2"
    // InternalSiriusTextDsl.g:7171:1: rule__Gradient__Group_13__2 : rule__Gradient__Group_13__2__Impl ;
    public final void rule__Gradient__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7175:1: ( rule__Gradient__Group_13__2__Impl )
            // InternalSiriusTextDsl.g:7176:2: rule__Gradient__Group_13__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__Group_13__2__Impl();

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
    // $ANTLR end "rule__Gradient__Group_13__2"


    // $ANTLR start "rule__Gradient__Group_13__2__Impl"
    // InternalSiriusTextDsl.g:7182:1: rule__Gradient__Group_13__2__Impl : ( ( rule__Gradient__WidthComputationExpressionAssignment_13_2 ) ) ;
    public final void rule__Gradient__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7186:1: ( ( ( rule__Gradient__WidthComputationExpressionAssignment_13_2 ) ) )
            // InternalSiriusTextDsl.g:7187:1: ( ( rule__Gradient__WidthComputationExpressionAssignment_13_2 ) )
            {
            // InternalSiriusTextDsl.g:7187:1: ( ( rule__Gradient__WidthComputationExpressionAssignment_13_2 ) )
            // InternalSiriusTextDsl.g:7188:1: ( rule__Gradient__WidthComputationExpressionAssignment_13_2 )
            {
             before(grammarAccess.getGradientAccess().getWidthComputationExpressionAssignment_13_2()); 
            // InternalSiriusTextDsl.g:7189:1: ( rule__Gradient__WidthComputationExpressionAssignment_13_2 )
            // InternalSiriusTextDsl.g:7189:2: rule__Gradient__WidthComputationExpressionAssignment_13_2
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__WidthComputationExpressionAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getWidthComputationExpressionAssignment_13_2()); 

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
    // $ANTLR end "rule__Gradient__Group_13__2__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group__0"
    // InternalSiriusTextDsl.g:7205:1: rule__RelationBasedEdge__Group__0 : rule__RelationBasedEdge__Group__0__Impl rule__RelationBasedEdge__Group__1 ;
    public final void rule__RelationBasedEdge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7209:1: ( rule__RelationBasedEdge__Group__0__Impl rule__RelationBasedEdge__Group__1 )
            // InternalSiriusTextDsl.g:7210:2: rule__RelationBasedEdge__Group__0__Impl rule__RelationBasedEdge__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__RelationBasedEdge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group__1();

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
    // $ANTLR end "rule__RelationBasedEdge__Group__0"


    // $ANTLR start "rule__RelationBasedEdge__Group__0__Impl"
    // InternalSiriusTextDsl.g:7217:1: rule__RelationBasedEdge__Group__0__Impl : ( ( rule__RelationBasedEdge__DocumentationAssignment_0 )? ) ;
    public final void rule__RelationBasedEdge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7221:1: ( ( ( rule__RelationBasedEdge__DocumentationAssignment_0 )? ) )
            // InternalSiriusTextDsl.g:7222:1: ( ( rule__RelationBasedEdge__DocumentationAssignment_0 )? )
            {
            // InternalSiriusTextDsl.g:7222:1: ( ( rule__RelationBasedEdge__DocumentationAssignment_0 )? )
            // InternalSiriusTextDsl.g:7223:1: ( rule__RelationBasedEdge__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getDocumentationAssignment_0()); 
            // InternalSiriusTextDsl.g:7224:1: ( rule__RelationBasedEdge__DocumentationAssignment_0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_DOCUMENTATION) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalSiriusTextDsl.g:7224:2: rule__RelationBasedEdge__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationBasedEdge__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationBasedEdgeAccess().getDocumentationAssignment_0()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group__0__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group__1"
    // InternalSiriusTextDsl.g:7234:1: rule__RelationBasedEdge__Group__1 : rule__RelationBasedEdge__Group__1__Impl rule__RelationBasedEdge__Group__2 ;
    public final void rule__RelationBasedEdge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7238:1: ( rule__RelationBasedEdge__Group__1__Impl rule__RelationBasedEdge__Group__2 )
            // InternalSiriusTextDsl.g:7239:2: rule__RelationBasedEdge__Group__1__Impl rule__RelationBasedEdge__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RelationBasedEdge__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group__2();

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
    // $ANTLR end "rule__RelationBasedEdge__Group__1"


    // $ANTLR start "rule__RelationBasedEdge__Group__1__Impl"
    // InternalSiriusTextDsl.g:7246:1: rule__RelationBasedEdge__Group__1__Impl : ( 'relationBasedEdge' ) ;
    public final void rule__RelationBasedEdge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7250:1: ( ( 'relationBasedEdge' ) )
            // InternalSiriusTextDsl.g:7251:1: ( 'relationBasedEdge' )
            {
            // InternalSiriusTextDsl.g:7251:1: ( 'relationBasedEdge' )
            // InternalSiriusTextDsl.g:7252:1: 'relationBasedEdge'
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getRelationBasedEdgeKeyword_1()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getRelationBasedEdgeAccess().getRelationBasedEdgeKeyword_1()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group__1__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group__2"
    // InternalSiriusTextDsl.g:7265:1: rule__RelationBasedEdge__Group__2 : rule__RelationBasedEdge__Group__2__Impl rule__RelationBasedEdge__Group__3 ;
    public final void rule__RelationBasedEdge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7269:1: ( rule__RelationBasedEdge__Group__2__Impl rule__RelationBasedEdge__Group__3 )
            // InternalSiriusTextDsl.g:7270:2: rule__RelationBasedEdge__Group__2__Impl rule__RelationBasedEdge__Group__3
            {
            pushFollow(FOLLOW_51);
            rule__RelationBasedEdge__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group__3();

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
    // $ANTLR end "rule__RelationBasedEdge__Group__2"


    // $ANTLR start "rule__RelationBasedEdge__Group__2__Impl"
    // InternalSiriusTextDsl.g:7277:1: rule__RelationBasedEdge__Group__2__Impl : ( ( rule__RelationBasedEdge__NameAssignment_2 ) ) ;
    public final void rule__RelationBasedEdge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7281:1: ( ( ( rule__RelationBasedEdge__NameAssignment_2 ) ) )
            // InternalSiriusTextDsl.g:7282:1: ( ( rule__RelationBasedEdge__NameAssignment_2 ) )
            {
            // InternalSiriusTextDsl.g:7282:1: ( ( rule__RelationBasedEdge__NameAssignment_2 ) )
            // InternalSiriusTextDsl.g:7283:1: ( rule__RelationBasedEdge__NameAssignment_2 )
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getNameAssignment_2()); 
            // InternalSiriusTextDsl.g:7284:1: ( rule__RelationBasedEdge__NameAssignment_2 )
            // InternalSiriusTextDsl.g:7284:2: rule__RelationBasedEdge__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationBasedEdgeAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group__2__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group__3"
    // InternalSiriusTextDsl.g:7294:1: rule__RelationBasedEdge__Group__3 : rule__RelationBasedEdge__Group__3__Impl rule__RelationBasedEdge__Group__4 ;
    public final void rule__RelationBasedEdge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7298:1: ( rule__RelationBasedEdge__Group__3__Impl rule__RelationBasedEdge__Group__4 )
            // InternalSiriusTextDsl.g:7299:2: rule__RelationBasedEdge__Group__3__Impl rule__RelationBasedEdge__Group__4
            {
            pushFollow(FOLLOW_51);
            rule__RelationBasedEdge__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group__4();

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
    // $ANTLR end "rule__RelationBasedEdge__Group__3"


    // $ANTLR start "rule__RelationBasedEdge__Group__3__Impl"
    // InternalSiriusTextDsl.g:7306:1: rule__RelationBasedEdge__Group__3__Impl : ( ( rule__RelationBasedEdge__Group_3__0 )? ) ;
    public final void rule__RelationBasedEdge__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7310:1: ( ( ( rule__RelationBasedEdge__Group_3__0 )? ) )
            // InternalSiriusTextDsl.g:7311:1: ( ( rule__RelationBasedEdge__Group_3__0 )? )
            {
            // InternalSiriusTextDsl.g:7311:1: ( ( rule__RelationBasedEdge__Group_3__0 )? )
            // InternalSiriusTextDsl.g:7312:1: ( rule__RelationBasedEdge__Group_3__0 )?
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getGroup_3()); 
            // InternalSiriusTextDsl.g:7313:1: ( rule__RelationBasedEdge__Group_3__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==45) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalSiriusTextDsl.g:7313:2: rule__RelationBasedEdge__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationBasedEdge__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationBasedEdgeAccess().getGroup_3()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group__3__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group__4"
    // InternalSiriusTextDsl.g:7323:1: rule__RelationBasedEdge__Group__4 : rule__RelationBasedEdge__Group__4__Impl rule__RelationBasedEdge__Group__5 ;
    public final void rule__RelationBasedEdge__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7327:1: ( rule__RelationBasedEdge__Group__4__Impl rule__RelationBasedEdge__Group__5 )
            // InternalSiriusTextDsl.g:7328:2: rule__RelationBasedEdge__Group__4__Impl rule__RelationBasedEdge__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__RelationBasedEdge__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group__5();

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
    // $ANTLR end "rule__RelationBasedEdge__Group__4"


    // $ANTLR start "rule__RelationBasedEdge__Group__4__Impl"
    // InternalSiriusTextDsl.g:7335:1: rule__RelationBasedEdge__Group__4__Impl : ( 'style' ) ;
    public final void rule__RelationBasedEdge__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7339:1: ( ( 'style' ) )
            // InternalSiriusTextDsl.g:7340:1: ( 'style' )
            {
            // InternalSiriusTextDsl.g:7340:1: ( 'style' )
            // InternalSiriusTextDsl.g:7341:1: 'style'
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getStyleKeyword_4()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getRelationBasedEdgeAccess().getStyleKeyword_4()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group__4__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group__5"
    // InternalSiriusTextDsl.g:7354:1: rule__RelationBasedEdge__Group__5 : rule__RelationBasedEdge__Group__5__Impl rule__RelationBasedEdge__Group__6 ;
    public final void rule__RelationBasedEdge__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7358:1: ( rule__RelationBasedEdge__Group__5__Impl rule__RelationBasedEdge__Group__6 )
            // InternalSiriusTextDsl.g:7359:2: rule__RelationBasedEdge__Group__5__Impl rule__RelationBasedEdge__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__RelationBasedEdge__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group__6();

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
    // $ANTLR end "rule__RelationBasedEdge__Group__5"


    // $ANTLR start "rule__RelationBasedEdge__Group__5__Impl"
    // InternalSiriusTextDsl.g:7366:1: rule__RelationBasedEdge__Group__5__Impl : ( ( rule__RelationBasedEdge__StyleAssignment_5 ) ) ;
    public final void rule__RelationBasedEdge__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7370:1: ( ( ( rule__RelationBasedEdge__StyleAssignment_5 ) ) )
            // InternalSiriusTextDsl.g:7371:1: ( ( rule__RelationBasedEdge__StyleAssignment_5 ) )
            {
            // InternalSiriusTextDsl.g:7371:1: ( ( rule__RelationBasedEdge__StyleAssignment_5 ) )
            // InternalSiriusTextDsl.g:7372:1: ( rule__RelationBasedEdge__StyleAssignment_5 )
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getStyleAssignment_5()); 
            // InternalSiriusTextDsl.g:7373:1: ( rule__RelationBasedEdge__StyleAssignment_5 )
            // InternalSiriusTextDsl.g:7373:2: rule__RelationBasedEdge__StyleAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__StyleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRelationBasedEdgeAccess().getStyleAssignment_5()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group__5__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group__6"
    // InternalSiriusTextDsl.g:7383:1: rule__RelationBasedEdge__Group__6 : rule__RelationBasedEdge__Group__6__Impl rule__RelationBasedEdge__Group__7 ;
    public final void rule__RelationBasedEdge__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7387:1: ( rule__RelationBasedEdge__Group__6__Impl rule__RelationBasedEdge__Group__7 )
            // InternalSiriusTextDsl.g:7388:2: rule__RelationBasedEdge__Group__6__Impl rule__RelationBasedEdge__Group__7
            {
            pushFollow(FOLLOW_52);
            rule__RelationBasedEdge__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group__7();

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
    // $ANTLR end "rule__RelationBasedEdge__Group__6"


    // $ANTLR start "rule__RelationBasedEdge__Group__6__Impl"
    // InternalSiriusTextDsl.g:7395:1: rule__RelationBasedEdge__Group__6__Impl : ( '{' ) ;
    public final void rule__RelationBasedEdge__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7399:1: ( ( '{' ) )
            // InternalSiriusTextDsl.g:7400:1: ( '{' )
            {
            // InternalSiriusTextDsl.g:7400:1: ( '{' )
            // InternalSiriusTextDsl.g:7401:1: '{'
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getRelationBasedEdgeAccess().getLeftCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group__6__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group__7"
    // InternalSiriusTextDsl.g:7414:1: rule__RelationBasedEdge__Group__7 : rule__RelationBasedEdge__Group__7__Impl rule__RelationBasedEdge__Group__8 ;
    public final void rule__RelationBasedEdge__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7418:1: ( rule__RelationBasedEdge__Group__7__Impl rule__RelationBasedEdge__Group__8 )
            // InternalSiriusTextDsl.g:7419:2: rule__RelationBasedEdge__Group__7__Impl rule__RelationBasedEdge__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__RelationBasedEdge__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group__8();

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
    // $ANTLR end "rule__RelationBasedEdge__Group__7"


    // $ANTLR start "rule__RelationBasedEdge__Group__7__Impl"
    // InternalSiriusTextDsl.g:7426:1: rule__RelationBasedEdge__Group__7__Impl : ( 'sourceMappings' ) ;
    public final void rule__RelationBasedEdge__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7430:1: ( ( 'sourceMappings' ) )
            // InternalSiriusTextDsl.g:7431:1: ( 'sourceMappings' )
            {
            // InternalSiriusTextDsl.g:7431:1: ( 'sourceMappings' )
            // InternalSiriusTextDsl.g:7432:1: 'sourceMappings'
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getSourceMappingsKeyword_7()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getRelationBasedEdgeAccess().getSourceMappingsKeyword_7()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group__7__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group__8"
    // InternalSiriusTextDsl.g:7445:1: rule__RelationBasedEdge__Group__8 : rule__RelationBasedEdge__Group__8__Impl rule__RelationBasedEdge__Group__9 ;
    public final void rule__RelationBasedEdge__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7449:1: ( rule__RelationBasedEdge__Group__8__Impl rule__RelationBasedEdge__Group__9 )
            // InternalSiriusTextDsl.g:7450:2: rule__RelationBasedEdge__Group__8__Impl rule__RelationBasedEdge__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__RelationBasedEdge__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group__9();

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
    // $ANTLR end "rule__RelationBasedEdge__Group__8"


    // $ANTLR start "rule__RelationBasedEdge__Group__8__Impl"
    // InternalSiriusTextDsl.g:7457:1: rule__RelationBasedEdge__Group__8__Impl : ( '=' ) ;
    public final void rule__RelationBasedEdge__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7461:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:7462:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:7462:1: ( '=' )
            // InternalSiriusTextDsl.g:7463:1: '='
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getEqualsSignKeyword_8()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getRelationBasedEdgeAccess().getEqualsSignKeyword_8()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group__8__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group__9"
    // InternalSiriusTextDsl.g:7476:1: rule__RelationBasedEdge__Group__9 : rule__RelationBasedEdge__Group__9__Impl rule__RelationBasedEdge__Group__10 ;
    public final void rule__RelationBasedEdge__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7480:1: ( rule__RelationBasedEdge__Group__9__Impl rule__RelationBasedEdge__Group__10 )
            // InternalSiriusTextDsl.g:7481:2: rule__RelationBasedEdge__Group__9__Impl rule__RelationBasedEdge__Group__10
            {
            pushFollow(FOLLOW_21);
            rule__RelationBasedEdge__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group__10();

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
    // $ANTLR end "rule__RelationBasedEdge__Group__9"


    // $ANTLR start "rule__RelationBasedEdge__Group__9__Impl"
    // InternalSiriusTextDsl.g:7488:1: rule__RelationBasedEdge__Group__9__Impl : ( '[' ) ;
    public final void rule__RelationBasedEdge__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7492:1: ( ( '[' ) )
            // InternalSiriusTextDsl.g:7493:1: ( '[' )
            {
            // InternalSiriusTextDsl.g:7493:1: ( '[' )
            // InternalSiriusTextDsl.g:7494:1: '['
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getLeftSquareBracketKeyword_9()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getRelationBasedEdgeAccess().getLeftSquareBracketKeyword_9()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group__9__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group__10"
    // InternalSiriusTextDsl.g:7507:1: rule__RelationBasedEdge__Group__10 : rule__RelationBasedEdge__Group__10__Impl rule__RelationBasedEdge__Group__11 ;
    public final void rule__RelationBasedEdge__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7511:1: ( rule__RelationBasedEdge__Group__10__Impl rule__RelationBasedEdge__Group__11 )
            // InternalSiriusTextDsl.g:7512:2: rule__RelationBasedEdge__Group__10__Impl rule__RelationBasedEdge__Group__11
            {
            pushFollow(FOLLOW_21);
            rule__RelationBasedEdge__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group__11();

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
    // $ANTLR end "rule__RelationBasedEdge__Group__10"


    // $ANTLR start "rule__RelationBasedEdge__Group__10__Impl"
    // InternalSiriusTextDsl.g:7519:1: rule__RelationBasedEdge__Group__10__Impl : ( ( rule__RelationBasedEdge__Group_10__0 )? ) ;
    public final void rule__RelationBasedEdge__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7523:1: ( ( ( rule__RelationBasedEdge__Group_10__0 )? ) )
            // InternalSiriusTextDsl.g:7524:1: ( ( rule__RelationBasedEdge__Group_10__0 )? )
            {
            // InternalSiriusTextDsl.g:7524:1: ( ( rule__RelationBasedEdge__Group_10__0 )? )
            // InternalSiriusTextDsl.g:7525:1: ( rule__RelationBasedEdge__Group_10__0 )?
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getGroup_10()); 
            // InternalSiriusTextDsl.g:7526:1: ( rule__RelationBasedEdge__Group_10__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalSiriusTextDsl.g:7526:2: rule__RelationBasedEdge__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationBasedEdge__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationBasedEdgeAccess().getGroup_10()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group__10__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group__11"
    // InternalSiriusTextDsl.g:7536:1: rule__RelationBasedEdge__Group__11 : rule__RelationBasedEdge__Group__11__Impl rule__RelationBasedEdge__Group__12 ;
    public final void rule__RelationBasedEdge__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7540:1: ( rule__RelationBasedEdge__Group__11__Impl rule__RelationBasedEdge__Group__12 )
            // InternalSiriusTextDsl.g:7541:2: rule__RelationBasedEdge__Group__11__Impl rule__RelationBasedEdge__Group__12
            {
            pushFollow(FOLLOW_53);
            rule__RelationBasedEdge__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group__12();

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
    // $ANTLR end "rule__RelationBasedEdge__Group__11"


    // $ANTLR start "rule__RelationBasedEdge__Group__11__Impl"
    // InternalSiriusTextDsl.g:7548:1: rule__RelationBasedEdge__Group__11__Impl : ( ']' ) ;
    public final void rule__RelationBasedEdge__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7552:1: ( ( ']' ) )
            // InternalSiriusTextDsl.g:7553:1: ( ']' )
            {
            // InternalSiriusTextDsl.g:7553:1: ( ']' )
            // InternalSiriusTextDsl.g:7554:1: ']'
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getRightSquareBracketKeyword_11()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getRelationBasedEdgeAccess().getRightSquareBracketKeyword_11()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group__11__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group__12"
    // InternalSiriusTextDsl.g:7567:1: rule__RelationBasedEdge__Group__12 : rule__RelationBasedEdge__Group__12__Impl rule__RelationBasedEdge__Group__13 ;
    public final void rule__RelationBasedEdge__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7571:1: ( rule__RelationBasedEdge__Group__12__Impl rule__RelationBasedEdge__Group__13 )
            // InternalSiriusTextDsl.g:7572:2: rule__RelationBasedEdge__Group__12__Impl rule__RelationBasedEdge__Group__13
            {
            pushFollow(FOLLOW_17);
            rule__RelationBasedEdge__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group__13();

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
    // $ANTLR end "rule__RelationBasedEdge__Group__12"


    // $ANTLR start "rule__RelationBasedEdge__Group__12__Impl"
    // InternalSiriusTextDsl.g:7579:1: rule__RelationBasedEdge__Group__12__Impl : ( 'targetMappings' ) ;
    public final void rule__RelationBasedEdge__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7583:1: ( ( 'targetMappings' ) )
            // InternalSiriusTextDsl.g:7584:1: ( 'targetMappings' )
            {
            // InternalSiriusTextDsl.g:7584:1: ( 'targetMappings' )
            // InternalSiriusTextDsl.g:7585:1: 'targetMappings'
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getTargetMappingsKeyword_12()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getRelationBasedEdgeAccess().getTargetMappingsKeyword_12()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group__12__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group__13"
    // InternalSiriusTextDsl.g:7598:1: rule__RelationBasedEdge__Group__13 : rule__RelationBasedEdge__Group__13__Impl rule__RelationBasedEdge__Group__14 ;
    public final void rule__RelationBasedEdge__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7602:1: ( rule__RelationBasedEdge__Group__13__Impl rule__RelationBasedEdge__Group__14 )
            // InternalSiriusTextDsl.g:7603:2: rule__RelationBasedEdge__Group__13__Impl rule__RelationBasedEdge__Group__14
            {
            pushFollow(FOLLOW_18);
            rule__RelationBasedEdge__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group__14();

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
    // $ANTLR end "rule__RelationBasedEdge__Group__13"


    // $ANTLR start "rule__RelationBasedEdge__Group__13__Impl"
    // InternalSiriusTextDsl.g:7610:1: rule__RelationBasedEdge__Group__13__Impl : ( '=' ) ;
    public final void rule__RelationBasedEdge__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7614:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:7615:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:7615:1: ( '=' )
            // InternalSiriusTextDsl.g:7616:1: '='
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getEqualsSignKeyword_13()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getRelationBasedEdgeAccess().getEqualsSignKeyword_13()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group__13__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group__14"
    // InternalSiriusTextDsl.g:7629:1: rule__RelationBasedEdge__Group__14 : rule__RelationBasedEdge__Group__14__Impl rule__RelationBasedEdge__Group__15 ;
    public final void rule__RelationBasedEdge__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7633:1: ( rule__RelationBasedEdge__Group__14__Impl rule__RelationBasedEdge__Group__15 )
            // InternalSiriusTextDsl.g:7634:2: rule__RelationBasedEdge__Group__14__Impl rule__RelationBasedEdge__Group__15
            {
            pushFollow(FOLLOW_21);
            rule__RelationBasedEdge__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group__15();

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
    // $ANTLR end "rule__RelationBasedEdge__Group__14"


    // $ANTLR start "rule__RelationBasedEdge__Group__14__Impl"
    // InternalSiriusTextDsl.g:7641:1: rule__RelationBasedEdge__Group__14__Impl : ( '[' ) ;
    public final void rule__RelationBasedEdge__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7645:1: ( ( '[' ) )
            // InternalSiriusTextDsl.g:7646:1: ( '[' )
            {
            // InternalSiriusTextDsl.g:7646:1: ( '[' )
            // InternalSiriusTextDsl.g:7647:1: '['
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getLeftSquareBracketKeyword_14()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getRelationBasedEdgeAccess().getLeftSquareBracketKeyword_14()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group__14__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group__15"
    // InternalSiriusTextDsl.g:7660:1: rule__RelationBasedEdge__Group__15 : rule__RelationBasedEdge__Group__15__Impl rule__RelationBasedEdge__Group__16 ;
    public final void rule__RelationBasedEdge__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7664:1: ( rule__RelationBasedEdge__Group__15__Impl rule__RelationBasedEdge__Group__16 )
            // InternalSiriusTextDsl.g:7665:2: rule__RelationBasedEdge__Group__15__Impl rule__RelationBasedEdge__Group__16
            {
            pushFollow(FOLLOW_21);
            rule__RelationBasedEdge__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group__16();

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
    // $ANTLR end "rule__RelationBasedEdge__Group__15"


    // $ANTLR start "rule__RelationBasedEdge__Group__15__Impl"
    // InternalSiriusTextDsl.g:7672:1: rule__RelationBasedEdge__Group__15__Impl : ( ( rule__RelationBasedEdge__Group_15__0 )? ) ;
    public final void rule__RelationBasedEdge__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7676:1: ( ( ( rule__RelationBasedEdge__Group_15__0 )? ) )
            // InternalSiriusTextDsl.g:7677:1: ( ( rule__RelationBasedEdge__Group_15__0 )? )
            {
            // InternalSiriusTextDsl.g:7677:1: ( ( rule__RelationBasedEdge__Group_15__0 )? )
            // InternalSiriusTextDsl.g:7678:1: ( rule__RelationBasedEdge__Group_15__0 )?
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getGroup_15()); 
            // InternalSiriusTextDsl.g:7679:1: ( rule__RelationBasedEdge__Group_15__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalSiriusTextDsl.g:7679:2: rule__RelationBasedEdge__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationBasedEdge__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationBasedEdgeAccess().getGroup_15()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group__15__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group__16"
    // InternalSiriusTextDsl.g:7689:1: rule__RelationBasedEdge__Group__16 : rule__RelationBasedEdge__Group__16__Impl rule__RelationBasedEdge__Group__17 ;
    public final void rule__RelationBasedEdge__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7693:1: ( rule__RelationBasedEdge__Group__16__Impl rule__RelationBasedEdge__Group__17 )
            // InternalSiriusTextDsl.g:7694:2: rule__RelationBasedEdge__Group__16__Impl rule__RelationBasedEdge__Group__17
            {
            pushFollow(FOLLOW_54);
            rule__RelationBasedEdge__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group__17();

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
    // $ANTLR end "rule__RelationBasedEdge__Group__16"


    // $ANTLR start "rule__RelationBasedEdge__Group__16__Impl"
    // InternalSiriusTextDsl.g:7701:1: rule__RelationBasedEdge__Group__16__Impl : ( ']' ) ;
    public final void rule__RelationBasedEdge__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7705:1: ( ( ']' ) )
            // InternalSiriusTextDsl.g:7706:1: ( ']' )
            {
            // InternalSiriusTextDsl.g:7706:1: ( ']' )
            // InternalSiriusTextDsl.g:7707:1: ']'
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getRightSquareBracketKeyword_16()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getRelationBasedEdgeAccess().getRightSquareBracketKeyword_16()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group__16__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group__17"
    // InternalSiriusTextDsl.g:7720:1: rule__RelationBasedEdge__Group__17 : rule__RelationBasedEdge__Group__17__Impl rule__RelationBasedEdge__Group__18 ;
    public final void rule__RelationBasedEdge__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7724:1: ( rule__RelationBasedEdge__Group__17__Impl rule__RelationBasedEdge__Group__18 )
            // InternalSiriusTextDsl.g:7725:2: rule__RelationBasedEdge__Group__17__Impl rule__RelationBasedEdge__Group__18
            {
            pushFollow(FOLLOW_17);
            rule__RelationBasedEdge__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group__18();

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
    // $ANTLR end "rule__RelationBasedEdge__Group__17"


    // $ANTLR start "rule__RelationBasedEdge__Group__17__Impl"
    // InternalSiriusTextDsl.g:7732:1: rule__RelationBasedEdge__Group__17__Impl : ( 'targetFileExpression' ) ;
    public final void rule__RelationBasedEdge__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7736:1: ( ( 'targetFileExpression' ) )
            // InternalSiriusTextDsl.g:7737:1: ( 'targetFileExpression' )
            {
            // InternalSiriusTextDsl.g:7737:1: ( 'targetFileExpression' )
            // InternalSiriusTextDsl.g:7738:1: 'targetFileExpression'
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getTargetFileExpressionKeyword_17()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getRelationBasedEdgeAccess().getTargetFileExpressionKeyword_17()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group__17__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group__18"
    // InternalSiriusTextDsl.g:7751:1: rule__RelationBasedEdge__Group__18 : rule__RelationBasedEdge__Group__18__Impl rule__RelationBasedEdge__Group__19 ;
    public final void rule__RelationBasedEdge__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7755:1: ( rule__RelationBasedEdge__Group__18__Impl rule__RelationBasedEdge__Group__19 )
            // InternalSiriusTextDsl.g:7756:2: rule__RelationBasedEdge__Group__18__Impl rule__RelationBasedEdge__Group__19
            {
            pushFollow(FOLLOW_31);
            rule__RelationBasedEdge__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group__19();

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
    // $ANTLR end "rule__RelationBasedEdge__Group__18"


    // $ANTLR start "rule__RelationBasedEdge__Group__18__Impl"
    // InternalSiriusTextDsl.g:7763:1: rule__RelationBasedEdge__Group__18__Impl : ( '=' ) ;
    public final void rule__RelationBasedEdge__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7767:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:7768:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:7768:1: ( '=' )
            // InternalSiriusTextDsl.g:7769:1: '='
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getEqualsSignKeyword_18()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getRelationBasedEdgeAccess().getEqualsSignKeyword_18()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group__18__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group__19"
    // InternalSiriusTextDsl.g:7782:1: rule__RelationBasedEdge__Group__19 : rule__RelationBasedEdge__Group__19__Impl rule__RelationBasedEdge__Group__20 ;
    public final void rule__RelationBasedEdge__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7786:1: ( rule__RelationBasedEdge__Group__19__Impl rule__RelationBasedEdge__Group__20 )
            // InternalSiriusTextDsl.g:7787:2: rule__RelationBasedEdge__Group__19__Impl rule__RelationBasedEdge__Group__20
            {
            pushFollow(FOLLOW_36);
            rule__RelationBasedEdge__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group__20();

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
    // $ANTLR end "rule__RelationBasedEdge__Group__19"


    // $ANTLR start "rule__RelationBasedEdge__Group__19__Impl"
    // InternalSiriusTextDsl.g:7794:1: rule__RelationBasedEdge__Group__19__Impl : ( ( rule__RelationBasedEdge__TargetFinderExpressionAssignment_19 ) ) ;
    public final void rule__RelationBasedEdge__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7798:1: ( ( ( rule__RelationBasedEdge__TargetFinderExpressionAssignment_19 ) ) )
            // InternalSiriusTextDsl.g:7799:1: ( ( rule__RelationBasedEdge__TargetFinderExpressionAssignment_19 ) )
            {
            // InternalSiriusTextDsl.g:7799:1: ( ( rule__RelationBasedEdge__TargetFinderExpressionAssignment_19 ) )
            // InternalSiriusTextDsl.g:7800:1: ( rule__RelationBasedEdge__TargetFinderExpressionAssignment_19 )
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getTargetFinderExpressionAssignment_19()); 
            // InternalSiriusTextDsl.g:7801:1: ( rule__RelationBasedEdge__TargetFinderExpressionAssignment_19 )
            // InternalSiriusTextDsl.g:7801:2: rule__RelationBasedEdge__TargetFinderExpressionAssignment_19
            {
            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__TargetFinderExpressionAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getRelationBasedEdgeAccess().getTargetFinderExpressionAssignment_19()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group__19__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group__20"
    // InternalSiriusTextDsl.g:7811:1: rule__RelationBasedEdge__Group__20 : rule__RelationBasedEdge__Group__20__Impl ;
    public final void rule__RelationBasedEdge__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7815:1: ( rule__RelationBasedEdge__Group__20__Impl )
            // InternalSiriusTextDsl.g:7816:2: rule__RelationBasedEdge__Group__20__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group__20__Impl();

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
    // $ANTLR end "rule__RelationBasedEdge__Group__20"


    // $ANTLR start "rule__RelationBasedEdge__Group__20__Impl"
    // InternalSiriusTextDsl.g:7822:1: rule__RelationBasedEdge__Group__20__Impl : ( '}' ) ;
    public final void rule__RelationBasedEdge__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7826:1: ( ( '}' ) )
            // InternalSiriusTextDsl.g:7827:1: ( '}' )
            {
            // InternalSiriusTextDsl.g:7827:1: ( '}' )
            // InternalSiriusTextDsl.g:7828:1: '}'
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getRightCurlyBracketKeyword_20()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getRelationBasedEdgeAccess().getRightCurlyBracketKeyword_20()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group__20__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group_3__0"
    // InternalSiriusTextDsl.g:7883:1: rule__RelationBasedEdge__Group_3__0 : rule__RelationBasedEdge__Group_3__0__Impl rule__RelationBasedEdge__Group_3__1 ;
    public final void rule__RelationBasedEdge__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7887:1: ( rule__RelationBasedEdge__Group_3__0__Impl rule__RelationBasedEdge__Group_3__1 )
            // InternalSiriusTextDsl.g:7888:2: rule__RelationBasedEdge__Group_3__0__Impl rule__RelationBasedEdge__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__RelationBasedEdge__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group_3__1();

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
    // $ANTLR end "rule__RelationBasedEdge__Group_3__0"


    // $ANTLR start "rule__RelationBasedEdge__Group_3__0__Impl"
    // InternalSiriusTextDsl.g:7895:1: rule__RelationBasedEdge__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__RelationBasedEdge__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7899:1: ( ( 'as' ) )
            // InternalSiriusTextDsl.g:7900:1: ( 'as' )
            {
            // InternalSiriusTextDsl.g:7900:1: ( 'as' )
            // InternalSiriusTextDsl.g:7901:1: 'as'
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getAsKeyword_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getRelationBasedEdgeAccess().getAsKeyword_3_0()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group_3__0__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group_3__1"
    // InternalSiriusTextDsl.g:7914:1: rule__RelationBasedEdge__Group_3__1 : rule__RelationBasedEdge__Group_3__1__Impl ;
    public final void rule__RelationBasedEdge__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7918:1: ( rule__RelationBasedEdge__Group_3__1__Impl )
            // InternalSiriusTextDsl.g:7919:2: rule__RelationBasedEdge__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group_3__1__Impl();

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
    // $ANTLR end "rule__RelationBasedEdge__Group_3__1"


    // $ANTLR start "rule__RelationBasedEdge__Group_3__1__Impl"
    // InternalSiriusTextDsl.g:7925:1: rule__RelationBasedEdge__Group_3__1__Impl : ( ( rule__RelationBasedEdge__LabelAssignment_3_1 ) ) ;
    public final void rule__RelationBasedEdge__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7929:1: ( ( ( rule__RelationBasedEdge__LabelAssignment_3_1 ) ) )
            // InternalSiriusTextDsl.g:7930:1: ( ( rule__RelationBasedEdge__LabelAssignment_3_1 ) )
            {
            // InternalSiriusTextDsl.g:7930:1: ( ( rule__RelationBasedEdge__LabelAssignment_3_1 ) )
            // InternalSiriusTextDsl.g:7931:1: ( rule__RelationBasedEdge__LabelAssignment_3_1 )
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getLabelAssignment_3_1()); 
            // InternalSiriusTextDsl.g:7932:1: ( rule__RelationBasedEdge__LabelAssignment_3_1 )
            // InternalSiriusTextDsl.g:7932:2: rule__RelationBasedEdge__LabelAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__LabelAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationBasedEdgeAccess().getLabelAssignment_3_1()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group_3__1__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group_10__0"
    // InternalSiriusTextDsl.g:7946:1: rule__RelationBasedEdge__Group_10__0 : rule__RelationBasedEdge__Group_10__0__Impl rule__RelationBasedEdge__Group_10__1 ;
    public final void rule__RelationBasedEdge__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7950:1: ( rule__RelationBasedEdge__Group_10__0__Impl rule__RelationBasedEdge__Group_10__1 )
            // InternalSiriusTextDsl.g:7951:2: rule__RelationBasedEdge__Group_10__0__Impl rule__RelationBasedEdge__Group_10__1
            {
            pushFollow(FOLLOW_22);
            rule__RelationBasedEdge__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group_10__1();

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
    // $ANTLR end "rule__RelationBasedEdge__Group_10__0"


    // $ANTLR start "rule__RelationBasedEdge__Group_10__0__Impl"
    // InternalSiriusTextDsl.g:7958:1: rule__RelationBasedEdge__Group_10__0__Impl : ( ( rule__RelationBasedEdge__SourceMappingsAssignment_10_0 ) ) ;
    public final void rule__RelationBasedEdge__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7962:1: ( ( ( rule__RelationBasedEdge__SourceMappingsAssignment_10_0 ) ) )
            // InternalSiriusTextDsl.g:7963:1: ( ( rule__RelationBasedEdge__SourceMappingsAssignment_10_0 ) )
            {
            // InternalSiriusTextDsl.g:7963:1: ( ( rule__RelationBasedEdge__SourceMappingsAssignment_10_0 ) )
            // InternalSiriusTextDsl.g:7964:1: ( rule__RelationBasedEdge__SourceMappingsAssignment_10_0 )
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getSourceMappingsAssignment_10_0()); 
            // InternalSiriusTextDsl.g:7965:1: ( rule__RelationBasedEdge__SourceMappingsAssignment_10_0 )
            // InternalSiriusTextDsl.g:7965:2: rule__RelationBasedEdge__SourceMappingsAssignment_10_0
            {
            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__SourceMappingsAssignment_10_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationBasedEdgeAccess().getSourceMappingsAssignment_10_0()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group_10__0__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group_10__1"
    // InternalSiriusTextDsl.g:7975:1: rule__RelationBasedEdge__Group_10__1 : rule__RelationBasedEdge__Group_10__1__Impl ;
    public final void rule__RelationBasedEdge__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7979:1: ( rule__RelationBasedEdge__Group_10__1__Impl )
            // InternalSiriusTextDsl.g:7980:2: rule__RelationBasedEdge__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group_10__1__Impl();

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
    // $ANTLR end "rule__RelationBasedEdge__Group_10__1"


    // $ANTLR start "rule__RelationBasedEdge__Group_10__1__Impl"
    // InternalSiriusTextDsl.g:7986:1: rule__RelationBasedEdge__Group_10__1__Impl : ( ( rule__RelationBasedEdge__Group_10_1__0 )* ) ;
    public final void rule__RelationBasedEdge__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7990:1: ( ( ( rule__RelationBasedEdge__Group_10_1__0 )* ) )
            // InternalSiriusTextDsl.g:7991:1: ( ( rule__RelationBasedEdge__Group_10_1__0 )* )
            {
            // InternalSiriusTextDsl.g:7991:1: ( ( rule__RelationBasedEdge__Group_10_1__0 )* )
            // InternalSiriusTextDsl.g:7992:1: ( rule__RelationBasedEdge__Group_10_1__0 )*
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getGroup_10_1()); 
            // InternalSiriusTextDsl.g:7993:1: ( rule__RelationBasedEdge__Group_10_1__0 )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==51) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:7993:2: rule__RelationBasedEdge__Group_10_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__RelationBasedEdge__Group_10_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

             after(grammarAccess.getRelationBasedEdgeAccess().getGroup_10_1()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group_10__1__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group_10_1__0"
    // InternalSiriusTextDsl.g:8007:1: rule__RelationBasedEdge__Group_10_1__0 : rule__RelationBasedEdge__Group_10_1__0__Impl rule__RelationBasedEdge__Group_10_1__1 ;
    public final void rule__RelationBasedEdge__Group_10_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8011:1: ( rule__RelationBasedEdge__Group_10_1__0__Impl rule__RelationBasedEdge__Group_10_1__1 )
            // InternalSiriusTextDsl.g:8012:2: rule__RelationBasedEdge__Group_10_1__0__Impl rule__RelationBasedEdge__Group_10_1__1
            {
            pushFollow(FOLLOW_4);
            rule__RelationBasedEdge__Group_10_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group_10_1__1();

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
    // $ANTLR end "rule__RelationBasedEdge__Group_10_1__0"


    // $ANTLR start "rule__RelationBasedEdge__Group_10_1__0__Impl"
    // InternalSiriusTextDsl.g:8019:1: rule__RelationBasedEdge__Group_10_1__0__Impl : ( ',' ) ;
    public final void rule__RelationBasedEdge__Group_10_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8023:1: ( ( ',' ) )
            // InternalSiriusTextDsl.g:8024:1: ( ',' )
            {
            // InternalSiriusTextDsl.g:8024:1: ( ',' )
            // InternalSiriusTextDsl.g:8025:1: ','
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getCommaKeyword_10_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getRelationBasedEdgeAccess().getCommaKeyword_10_1_0()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group_10_1__0__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group_10_1__1"
    // InternalSiriusTextDsl.g:8038:1: rule__RelationBasedEdge__Group_10_1__1 : rule__RelationBasedEdge__Group_10_1__1__Impl ;
    public final void rule__RelationBasedEdge__Group_10_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8042:1: ( rule__RelationBasedEdge__Group_10_1__1__Impl )
            // InternalSiriusTextDsl.g:8043:2: rule__RelationBasedEdge__Group_10_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group_10_1__1__Impl();

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
    // $ANTLR end "rule__RelationBasedEdge__Group_10_1__1"


    // $ANTLR start "rule__RelationBasedEdge__Group_10_1__1__Impl"
    // InternalSiriusTextDsl.g:8049:1: rule__RelationBasedEdge__Group_10_1__1__Impl : ( ( rule__RelationBasedEdge__SourceMappingsAssignment_10_1_1 ) ) ;
    public final void rule__RelationBasedEdge__Group_10_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8053:1: ( ( ( rule__RelationBasedEdge__SourceMappingsAssignment_10_1_1 ) ) )
            // InternalSiriusTextDsl.g:8054:1: ( ( rule__RelationBasedEdge__SourceMappingsAssignment_10_1_1 ) )
            {
            // InternalSiriusTextDsl.g:8054:1: ( ( rule__RelationBasedEdge__SourceMappingsAssignment_10_1_1 ) )
            // InternalSiriusTextDsl.g:8055:1: ( rule__RelationBasedEdge__SourceMappingsAssignment_10_1_1 )
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getSourceMappingsAssignment_10_1_1()); 
            // InternalSiriusTextDsl.g:8056:1: ( rule__RelationBasedEdge__SourceMappingsAssignment_10_1_1 )
            // InternalSiriusTextDsl.g:8056:2: rule__RelationBasedEdge__SourceMappingsAssignment_10_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__SourceMappingsAssignment_10_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationBasedEdgeAccess().getSourceMappingsAssignment_10_1_1()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group_10_1__1__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group_15__0"
    // InternalSiriusTextDsl.g:8070:1: rule__RelationBasedEdge__Group_15__0 : rule__RelationBasedEdge__Group_15__0__Impl rule__RelationBasedEdge__Group_15__1 ;
    public final void rule__RelationBasedEdge__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8074:1: ( rule__RelationBasedEdge__Group_15__0__Impl rule__RelationBasedEdge__Group_15__1 )
            // InternalSiriusTextDsl.g:8075:2: rule__RelationBasedEdge__Group_15__0__Impl rule__RelationBasedEdge__Group_15__1
            {
            pushFollow(FOLLOW_22);
            rule__RelationBasedEdge__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group_15__1();

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
    // $ANTLR end "rule__RelationBasedEdge__Group_15__0"


    // $ANTLR start "rule__RelationBasedEdge__Group_15__0__Impl"
    // InternalSiriusTextDsl.g:8082:1: rule__RelationBasedEdge__Group_15__0__Impl : ( ( rule__RelationBasedEdge__TargetMappingsAssignment_15_0 ) ) ;
    public final void rule__RelationBasedEdge__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8086:1: ( ( ( rule__RelationBasedEdge__TargetMappingsAssignment_15_0 ) ) )
            // InternalSiriusTextDsl.g:8087:1: ( ( rule__RelationBasedEdge__TargetMappingsAssignment_15_0 ) )
            {
            // InternalSiriusTextDsl.g:8087:1: ( ( rule__RelationBasedEdge__TargetMappingsAssignment_15_0 ) )
            // InternalSiriusTextDsl.g:8088:1: ( rule__RelationBasedEdge__TargetMappingsAssignment_15_0 )
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getTargetMappingsAssignment_15_0()); 
            // InternalSiriusTextDsl.g:8089:1: ( rule__RelationBasedEdge__TargetMappingsAssignment_15_0 )
            // InternalSiriusTextDsl.g:8089:2: rule__RelationBasedEdge__TargetMappingsAssignment_15_0
            {
            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__TargetMappingsAssignment_15_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationBasedEdgeAccess().getTargetMappingsAssignment_15_0()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group_15__0__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group_15__1"
    // InternalSiriusTextDsl.g:8099:1: rule__RelationBasedEdge__Group_15__1 : rule__RelationBasedEdge__Group_15__1__Impl ;
    public final void rule__RelationBasedEdge__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8103:1: ( rule__RelationBasedEdge__Group_15__1__Impl )
            // InternalSiriusTextDsl.g:8104:2: rule__RelationBasedEdge__Group_15__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group_15__1__Impl();

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
    // $ANTLR end "rule__RelationBasedEdge__Group_15__1"


    // $ANTLR start "rule__RelationBasedEdge__Group_15__1__Impl"
    // InternalSiriusTextDsl.g:8110:1: rule__RelationBasedEdge__Group_15__1__Impl : ( ( rule__RelationBasedEdge__Group_15_1__0 )* ) ;
    public final void rule__RelationBasedEdge__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8114:1: ( ( ( rule__RelationBasedEdge__Group_15_1__0 )* ) )
            // InternalSiriusTextDsl.g:8115:1: ( ( rule__RelationBasedEdge__Group_15_1__0 )* )
            {
            // InternalSiriusTextDsl.g:8115:1: ( ( rule__RelationBasedEdge__Group_15_1__0 )* )
            // InternalSiriusTextDsl.g:8116:1: ( rule__RelationBasedEdge__Group_15_1__0 )*
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getGroup_15_1()); 
            // InternalSiriusTextDsl.g:8117:1: ( rule__RelationBasedEdge__Group_15_1__0 )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==51) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:8117:2: rule__RelationBasedEdge__Group_15_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__RelationBasedEdge__Group_15_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

             after(grammarAccess.getRelationBasedEdgeAccess().getGroup_15_1()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group_15__1__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group_15_1__0"
    // InternalSiriusTextDsl.g:8131:1: rule__RelationBasedEdge__Group_15_1__0 : rule__RelationBasedEdge__Group_15_1__0__Impl rule__RelationBasedEdge__Group_15_1__1 ;
    public final void rule__RelationBasedEdge__Group_15_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8135:1: ( rule__RelationBasedEdge__Group_15_1__0__Impl rule__RelationBasedEdge__Group_15_1__1 )
            // InternalSiriusTextDsl.g:8136:2: rule__RelationBasedEdge__Group_15_1__0__Impl rule__RelationBasedEdge__Group_15_1__1
            {
            pushFollow(FOLLOW_4);
            rule__RelationBasedEdge__Group_15_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group_15_1__1();

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
    // $ANTLR end "rule__RelationBasedEdge__Group_15_1__0"


    // $ANTLR start "rule__RelationBasedEdge__Group_15_1__0__Impl"
    // InternalSiriusTextDsl.g:8143:1: rule__RelationBasedEdge__Group_15_1__0__Impl : ( ',' ) ;
    public final void rule__RelationBasedEdge__Group_15_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8147:1: ( ( ',' ) )
            // InternalSiriusTextDsl.g:8148:1: ( ',' )
            {
            // InternalSiriusTextDsl.g:8148:1: ( ',' )
            // InternalSiriusTextDsl.g:8149:1: ','
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getCommaKeyword_15_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getRelationBasedEdgeAccess().getCommaKeyword_15_1_0()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group_15_1__0__Impl"


    // $ANTLR start "rule__RelationBasedEdge__Group_15_1__1"
    // InternalSiriusTextDsl.g:8162:1: rule__RelationBasedEdge__Group_15_1__1 : rule__RelationBasedEdge__Group_15_1__1__Impl ;
    public final void rule__RelationBasedEdge__Group_15_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8166:1: ( rule__RelationBasedEdge__Group_15_1__1__Impl )
            // InternalSiriusTextDsl.g:8167:2: rule__RelationBasedEdge__Group_15_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__Group_15_1__1__Impl();

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
    // $ANTLR end "rule__RelationBasedEdge__Group_15_1__1"


    // $ANTLR start "rule__RelationBasedEdge__Group_15_1__1__Impl"
    // InternalSiriusTextDsl.g:8173:1: rule__RelationBasedEdge__Group_15_1__1__Impl : ( ( rule__RelationBasedEdge__TargetMappingsAssignment_15_1_1 ) ) ;
    public final void rule__RelationBasedEdge__Group_15_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8177:1: ( ( ( rule__RelationBasedEdge__TargetMappingsAssignment_15_1_1 ) ) )
            // InternalSiriusTextDsl.g:8178:1: ( ( rule__RelationBasedEdge__TargetMappingsAssignment_15_1_1 ) )
            {
            // InternalSiriusTextDsl.g:8178:1: ( ( rule__RelationBasedEdge__TargetMappingsAssignment_15_1_1 ) )
            // InternalSiriusTextDsl.g:8179:1: ( rule__RelationBasedEdge__TargetMappingsAssignment_15_1_1 )
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getTargetMappingsAssignment_15_1_1()); 
            // InternalSiriusTextDsl.g:8180:1: ( rule__RelationBasedEdge__TargetMappingsAssignment_15_1_1 )
            // InternalSiriusTextDsl.g:8180:2: rule__RelationBasedEdge__TargetMappingsAssignment_15_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationBasedEdge__TargetMappingsAssignment_15_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationBasedEdgeAccess().getTargetMappingsAssignment_15_1_1()); 

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
    // $ANTLR end "rule__RelationBasedEdge__Group_15_1__1__Impl"


    // $ANTLR start "rule__EdgeStyle__Group__0"
    // InternalSiriusTextDsl.g:8194:1: rule__EdgeStyle__Group__0 : rule__EdgeStyle__Group__0__Impl rule__EdgeStyle__Group__1 ;
    public final void rule__EdgeStyle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8198:1: ( rule__EdgeStyle__Group__0__Impl rule__EdgeStyle__Group__1 )
            // InternalSiriusTextDsl.g:8199:2: rule__EdgeStyle__Group__0__Impl rule__EdgeStyle__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__EdgeStyle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group__1();

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
    // $ANTLR end "rule__EdgeStyle__Group__0"


    // $ANTLR start "rule__EdgeStyle__Group__0__Impl"
    // InternalSiriusTextDsl.g:8206:1: rule__EdgeStyle__Group__0__Impl : ( 'edgeStyle' ) ;
    public final void rule__EdgeStyle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8210:1: ( ( 'edgeStyle' ) )
            // InternalSiriusTextDsl.g:8211:1: ( 'edgeStyle' )
            {
            // InternalSiriusTextDsl.g:8211:1: ( 'edgeStyle' )
            // InternalSiriusTextDsl.g:8212:1: 'edgeStyle'
            {
             before(grammarAccess.getEdgeStyleAccess().getEdgeStyleKeyword_0()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getEdgeStyleAccess().getEdgeStyleKeyword_0()); 

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
    // $ANTLR end "rule__EdgeStyle__Group__0__Impl"


    // $ANTLR start "rule__EdgeStyle__Group__1"
    // InternalSiriusTextDsl.g:8225:1: rule__EdgeStyle__Group__1 : rule__EdgeStyle__Group__1__Impl rule__EdgeStyle__Group__2 ;
    public final void rule__EdgeStyle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8229:1: ( rule__EdgeStyle__Group__1__Impl rule__EdgeStyle__Group__2 )
            // InternalSiriusTextDsl.g:8230:2: rule__EdgeStyle__Group__1__Impl rule__EdgeStyle__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__EdgeStyle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group__2();

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
    // $ANTLR end "rule__EdgeStyle__Group__1"


    // $ANTLR start "rule__EdgeStyle__Group__1__Impl"
    // InternalSiriusTextDsl.g:8237:1: rule__EdgeStyle__Group__1__Impl : ( ( rule__EdgeStyle__NameAssignment_1 ) ) ;
    public final void rule__EdgeStyle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8241:1: ( ( ( rule__EdgeStyle__NameAssignment_1 ) ) )
            // InternalSiriusTextDsl.g:8242:1: ( ( rule__EdgeStyle__NameAssignment_1 ) )
            {
            // InternalSiriusTextDsl.g:8242:1: ( ( rule__EdgeStyle__NameAssignment_1 ) )
            // InternalSiriusTextDsl.g:8243:1: ( rule__EdgeStyle__NameAssignment_1 )
            {
             before(grammarAccess.getEdgeStyleAccess().getNameAssignment_1()); 
            // InternalSiriusTextDsl.g:8244:1: ( rule__EdgeStyle__NameAssignment_1 )
            // InternalSiriusTextDsl.g:8244:2: rule__EdgeStyle__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EdgeStyle__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEdgeStyleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__EdgeStyle__Group__1__Impl"


    // $ANTLR start "rule__EdgeStyle__Group__2"
    // InternalSiriusTextDsl.g:8254:1: rule__EdgeStyle__Group__2 : rule__EdgeStyle__Group__2__Impl rule__EdgeStyle__Group__3 ;
    public final void rule__EdgeStyle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8258:1: ( rule__EdgeStyle__Group__2__Impl rule__EdgeStyle__Group__3 )
            // InternalSiriusTextDsl.g:8259:2: rule__EdgeStyle__Group__2__Impl rule__EdgeStyle__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__EdgeStyle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group__3();

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
    // $ANTLR end "rule__EdgeStyle__Group__2"


    // $ANTLR start "rule__EdgeStyle__Group__2__Impl"
    // InternalSiriusTextDsl.g:8266:1: rule__EdgeStyle__Group__2__Impl : ( 'in' ) ;
    public final void rule__EdgeStyle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8270:1: ( ( 'in' ) )
            // InternalSiriusTextDsl.g:8271:1: ( 'in' )
            {
            // InternalSiriusTextDsl.g:8271:1: ( 'in' )
            // InternalSiriusTextDsl.g:8272:1: 'in'
            {
             before(grammarAccess.getEdgeStyleAccess().getInKeyword_2()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getEdgeStyleAccess().getInKeyword_2()); 

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
    // $ANTLR end "rule__EdgeStyle__Group__2__Impl"


    // $ANTLR start "rule__EdgeStyle__Group__3"
    // InternalSiriusTextDsl.g:8285:1: rule__EdgeStyle__Group__3 : rule__EdgeStyle__Group__3__Impl rule__EdgeStyle__Group__4 ;
    public final void rule__EdgeStyle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8289:1: ( rule__EdgeStyle__Group__3__Impl rule__EdgeStyle__Group__4 )
            // InternalSiriusTextDsl.g:8290:2: rule__EdgeStyle__Group__3__Impl rule__EdgeStyle__Group__4
            {
            pushFollow(FOLLOW_55);
            rule__EdgeStyle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group__4();

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
    // $ANTLR end "rule__EdgeStyle__Group__3"


    // $ANTLR start "rule__EdgeStyle__Group__3__Impl"
    // InternalSiriusTextDsl.g:8297:1: rule__EdgeStyle__Group__3__Impl : ( ( rule__EdgeStyle__StrokeColorAssignment_3 ) ) ;
    public final void rule__EdgeStyle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8301:1: ( ( ( rule__EdgeStyle__StrokeColorAssignment_3 ) ) )
            // InternalSiriusTextDsl.g:8302:1: ( ( rule__EdgeStyle__StrokeColorAssignment_3 ) )
            {
            // InternalSiriusTextDsl.g:8302:1: ( ( rule__EdgeStyle__StrokeColorAssignment_3 ) )
            // InternalSiriusTextDsl.g:8303:1: ( rule__EdgeStyle__StrokeColorAssignment_3 )
            {
             before(grammarAccess.getEdgeStyleAccess().getStrokeColorAssignment_3()); 
            // InternalSiriusTextDsl.g:8304:1: ( rule__EdgeStyle__StrokeColorAssignment_3 )
            // InternalSiriusTextDsl.g:8304:2: rule__EdgeStyle__StrokeColorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EdgeStyle__StrokeColorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEdgeStyleAccess().getStrokeColorAssignment_3()); 

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
    // $ANTLR end "rule__EdgeStyle__Group__3__Impl"


    // $ANTLR start "rule__EdgeStyle__Group__4"
    // InternalSiriusTextDsl.g:8314:1: rule__EdgeStyle__Group__4 : rule__EdgeStyle__Group__4__Impl rule__EdgeStyle__Group__5 ;
    public final void rule__EdgeStyle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8318:1: ( rule__EdgeStyle__Group__4__Impl rule__EdgeStyle__Group__5 )
            // InternalSiriusTextDsl.g:8319:2: rule__EdgeStyle__Group__4__Impl rule__EdgeStyle__Group__5
            {
            pushFollow(FOLLOW_55);
            rule__EdgeStyle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group__5();

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
    // $ANTLR end "rule__EdgeStyle__Group__4"


    // $ANTLR start "rule__EdgeStyle__Group__4__Impl"
    // InternalSiriusTextDsl.g:8326:1: rule__EdgeStyle__Group__4__Impl : ( ( rule__EdgeStyle__Group_4__0 )? ) ;
    public final void rule__EdgeStyle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8330:1: ( ( ( rule__EdgeStyle__Group_4__0 )? ) )
            // InternalSiriusTextDsl.g:8331:1: ( ( rule__EdgeStyle__Group_4__0 )? )
            {
            // InternalSiriusTextDsl.g:8331:1: ( ( rule__EdgeStyle__Group_4__0 )? )
            // InternalSiriusTextDsl.g:8332:1: ( rule__EdgeStyle__Group_4__0 )?
            {
             before(grammarAccess.getEdgeStyleAccess().getGroup_4()); 
            // InternalSiriusTextDsl.g:8333:1: ( rule__EdgeStyle__Group_4__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==86) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalSiriusTextDsl.g:8333:2: rule__EdgeStyle__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EdgeStyle__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEdgeStyleAccess().getGroup_4()); 

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
    // $ANTLR end "rule__EdgeStyle__Group__4__Impl"


    // $ANTLR start "rule__EdgeStyle__Group__5"
    // InternalSiriusTextDsl.g:8343:1: rule__EdgeStyle__Group__5 : rule__EdgeStyle__Group__5__Impl rule__EdgeStyle__Group__6 ;
    public final void rule__EdgeStyle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8347:1: ( rule__EdgeStyle__Group__5__Impl rule__EdgeStyle__Group__6 )
            // InternalSiriusTextDsl.g:8348:2: rule__EdgeStyle__Group__5__Impl rule__EdgeStyle__Group__6
            {
            pushFollow(FOLLOW_55);
            rule__EdgeStyle__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group__6();

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
    // $ANTLR end "rule__EdgeStyle__Group__5"


    // $ANTLR start "rule__EdgeStyle__Group__5__Impl"
    // InternalSiriusTextDsl.g:8355:1: rule__EdgeStyle__Group__5__Impl : ( ( rule__EdgeStyle__Group_5__0 )? ) ;
    public final void rule__EdgeStyle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8359:1: ( ( ( rule__EdgeStyle__Group_5__0 )? ) )
            // InternalSiriusTextDsl.g:8360:1: ( ( rule__EdgeStyle__Group_5__0 )? )
            {
            // InternalSiriusTextDsl.g:8360:1: ( ( rule__EdgeStyle__Group_5__0 )? )
            // InternalSiriusTextDsl.g:8361:1: ( rule__EdgeStyle__Group_5__0 )?
            {
             before(grammarAccess.getEdgeStyleAccess().getGroup_5()); 
            // InternalSiriusTextDsl.g:8362:1: ( rule__EdgeStyle__Group_5__0 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==87) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalSiriusTextDsl.g:8362:2: rule__EdgeStyle__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EdgeStyle__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEdgeStyleAccess().getGroup_5()); 

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
    // $ANTLR end "rule__EdgeStyle__Group__5__Impl"


    // $ANTLR start "rule__EdgeStyle__Group__6"
    // InternalSiriusTextDsl.g:8372:1: rule__EdgeStyle__Group__6 : rule__EdgeStyle__Group__6__Impl rule__EdgeStyle__Group__7 ;
    public final void rule__EdgeStyle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8376:1: ( rule__EdgeStyle__Group__6__Impl rule__EdgeStyle__Group__7 )
            // InternalSiriusTextDsl.g:8377:2: rule__EdgeStyle__Group__6__Impl rule__EdgeStyle__Group__7
            {
            pushFollow(FOLLOW_56);
            rule__EdgeStyle__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group__7();

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
    // $ANTLR end "rule__EdgeStyle__Group__6"


    // $ANTLR start "rule__EdgeStyle__Group__6__Impl"
    // InternalSiriusTextDsl.g:8384:1: rule__EdgeStyle__Group__6__Impl : ( '{' ) ;
    public final void rule__EdgeStyle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8388:1: ( ( '{' ) )
            // InternalSiriusTextDsl.g:8389:1: ( '{' )
            {
            // InternalSiriusTextDsl.g:8389:1: ( '{' )
            // InternalSiriusTextDsl.g:8390:1: '{'
            {
             before(grammarAccess.getEdgeStyleAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getEdgeStyleAccess().getLeftCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__EdgeStyle__Group__6__Impl"


    // $ANTLR start "rule__EdgeStyle__Group__7"
    // InternalSiriusTextDsl.g:8403:1: rule__EdgeStyle__Group__7 : rule__EdgeStyle__Group__7__Impl rule__EdgeStyle__Group__8 ;
    public final void rule__EdgeStyle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8407:1: ( rule__EdgeStyle__Group__7__Impl rule__EdgeStyle__Group__8 )
            // InternalSiriusTextDsl.g:8408:2: rule__EdgeStyle__Group__7__Impl rule__EdgeStyle__Group__8
            {
            pushFollow(FOLLOW_56);
            rule__EdgeStyle__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group__8();

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
    // $ANTLR end "rule__EdgeStyle__Group__7"


    // $ANTLR start "rule__EdgeStyle__Group__7__Impl"
    // InternalSiriusTextDsl.g:8415:1: rule__EdgeStyle__Group__7__Impl : ( ( rule__EdgeStyle__Group_7__0 )? ) ;
    public final void rule__EdgeStyle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8419:1: ( ( ( rule__EdgeStyle__Group_7__0 )? ) )
            // InternalSiriusTextDsl.g:8420:1: ( ( rule__EdgeStyle__Group_7__0 )? )
            {
            // InternalSiriusTextDsl.g:8420:1: ( ( rule__EdgeStyle__Group_7__0 )? )
            // InternalSiriusTextDsl.g:8421:1: ( rule__EdgeStyle__Group_7__0 )?
            {
             before(grammarAccess.getEdgeStyleAccess().getGroup_7()); 
            // InternalSiriusTextDsl.g:8422:1: ( rule__EdgeStyle__Group_7__0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==88) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalSiriusTextDsl.g:8422:2: rule__EdgeStyle__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EdgeStyle__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEdgeStyleAccess().getGroup_7()); 

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
    // $ANTLR end "rule__EdgeStyle__Group__7__Impl"


    // $ANTLR start "rule__EdgeStyle__Group__8"
    // InternalSiriusTextDsl.g:8432:1: rule__EdgeStyle__Group__8 : rule__EdgeStyle__Group__8__Impl rule__EdgeStyle__Group__9 ;
    public final void rule__EdgeStyle__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8436:1: ( rule__EdgeStyle__Group__8__Impl rule__EdgeStyle__Group__9 )
            // InternalSiriusTextDsl.g:8437:2: rule__EdgeStyle__Group__8__Impl rule__EdgeStyle__Group__9
            {
            pushFollow(FOLLOW_56);
            rule__EdgeStyle__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group__9();

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
    // $ANTLR end "rule__EdgeStyle__Group__8"


    // $ANTLR start "rule__EdgeStyle__Group__8__Impl"
    // InternalSiriusTextDsl.g:8444:1: rule__EdgeStyle__Group__8__Impl : ( ( rule__EdgeStyle__Group_8__0 )? ) ;
    public final void rule__EdgeStyle__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8448:1: ( ( ( rule__EdgeStyle__Group_8__0 )? ) )
            // InternalSiriusTextDsl.g:8449:1: ( ( rule__EdgeStyle__Group_8__0 )? )
            {
            // InternalSiriusTextDsl.g:8449:1: ( ( rule__EdgeStyle__Group_8__0 )? )
            // InternalSiriusTextDsl.g:8450:1: ( rule__EdgeStyle__Group_8__0 )?
            {
             before(grammarAccess.getEdgeStyleAccess().getGroup_8()); 
            // InternalSiriusTextDsl.g:8451:1: ( rule__EdgeStyle__Group_8__0 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==89) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalSiriusTextDsl.g:8451:2: rule__EdgeStyle__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EdgeStyle__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEdgeStyleAccess().getGroup_8()); 

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
    // $ANTLR end "rule__EdgeStyle__Group__8__Impl"


    // $ANTLR start "rule__EdgeStyle__Group__9"
    // InternalSiriusTextDsl.g:8461:1: rule__EdgeStyle__Group__9 : rule__EdgeStyle__Group__9__Impl rule__EdgeStyle__Group__10 ;
    public final void rule__EdgeStyle__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8465:1: ( rule__EdgeStyle__Group__9__Impl rule__EdgeStyle__Group__10 )
            // InternalSiriusTextDsl.g:8466:2: rule__EdgeStyle__Group__9__Impl rule__EdgeStyle__Group__10
            {
            pushFollow(FOLLOW_56);
            rule__EdgeStyle__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group__10();

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
    // $ANTLR end "rule__EdgeStyle__Group__9"


    // $ANTLR start "rule__EdgeStyle__Group__9__Impl"
    // InternalSiriusTextDsl.g:8473:1: rule__EdgeStyle__Group__9__Impl : ( ( rule__EdgeStyle__Group_9__0 )? ) ;
    public final void rule__EdgeStyle__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8477:1: ( ( ( rule__EdgeStyle__Group_9__0 )? ) )
            // InternalSiriusTextDsl.g:8478:1: ( ( rule__EdgeStyle__Group_9__0 )? )
            {
            // InternalSiriusTextDsl.g:8478:1: ( ( rule__EdgeStyle__Group_9__0 )? )
            // InternalSiriusTextDsl.g:8479:1: ( rule__EdgeStyle__Group_9__0 )?
            {
             before(grammarAccess.getEdgeStyleAccess().getGroup_9()); 
            // InternalSiriusTextDsl.g:8480:1: ( rule__EdgeStyle__Group_9__0 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==90) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalSiriusTextDsl.g:8480:2: rule__EdgeStyle__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EdgeStyle__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEdgeStyleAccess().getGroup_9()); 

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
    // $ANTLR end "rule__EdgeStyle__Group__9__Impl"


    // $ANTLR start "rule__EdgeStyle__Group__10"
    // InternalSiriusTextDsl.g:8490:1: rule__EdgeStyle__Group__10 : rule__EdgeStyle__Group__10__Impl rule__EdgeStyle__Group__11 ;
    public final void rule__EdgeStyle__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8494:1: ( rule__EdgeStyle__Group__10__Impl rule__EdgeStyle__Group__11 )
            // InternalSiriusTextDsl.g:8495:2: rule__EdgeStyle__Group__10__Impl rule__EdgeStyle__Group__11
            {
            pushFollow(FOLLOW_56);
            rule__EdgeStyle__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group__11();

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
    // $ANTLR end "rule__EdgeStyle__Group__10"


    // $ANTLR start "rule__EdgeStyle__Group__10__Impl"
    // InternalSiriusTextDsl.g:8502:1: rule__EdgeStyle__Group__10__Impl : ( ( rule__EdgeStyle__Group_10__0 )? ) ;
    public final void rule__EdgeStyle__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8506:1: ( ( ( rule__EdgeStyle__Group_10__0 )? ) )
            // InternalSiriusTextDsl.g:8507:1: ( ( rule__EdgeStyle__Group_10__0 )? )
            {
            // InternalSiriusTextDsl.g:8507:1: ( ( rule__EdgeStyle__Group_10__0 )? )
            // InternalSiriusTextDsl.g:8508:1: ( rule__EdgeStyle__Group_10__0 )?
            {
             before(grammarAccess.getEdgeStyleAccess().getGroup_10()); 
            // InternalSiriusTextDsl.g:8509:1: ( rule__EdgeStyle__Group_10__0 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==91) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalSiriusTextDsl.g:8509:2: rule__EdgeStyle__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EdgeStyle__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEdgeStyleAccess().getGroup_10()); 

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
    // $ANTLR end "rule__EdgeStyle__Group__10__Impl"


    // $ANTLR start "rule__EdgeStyle__Group__11"
    // InternalSiriusTextDsl.g:8519:1: rule__EdgeStyle__Group__11 : rule__EdgeStyle__Group__11__Impl rule__EdgeStyle__Group__12 ;
    public final void rule__EdgeStyle__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8523:1: ( rule__EdgeStyle__Group__11__Impl rule__EdgeStyle__Group__12 )
            // InternalSiriusTextDsl.g:8524:2: rule__EdgeStyle__Group__11__Impl rule__EdgeStyle__Group__12
            {
            pushFollow(FOLLOW_56);
            rule__EdgeStyle__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group__12();

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
    // $ANTLR end "rule__EdgeStyle__Group__11"


    // $ANTLR start "rule__EdgeStyle__Group__11__Impl"
    // InternalSiriusTextDsl.g:8531:1: rule__EdgeStyle__Group__11__Impl : ( ( rule__EdgeStyle__Group_11__0 )? ) ;
    public final void rule__EdgeStyle__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8535:1: ( ( ( rule__EdgeStyle__Group_11__0 )? ) )
            // InternalSiriusTextDsl.g:8536:1: ( ( rule__EdgeStyle__Group_11__0 )? )
            {
            // InternalSiriusTextDsl.g:8536:1: ( ( rule__EdgeStyle__Group_11__0 )? )
            // InternalSiriusTextDsl.g:8537:1: ( rule__EdgeStyle__Group_11__0 )?
            {
             before(grammarAccess.getEdgeStyleAccess().getGroup_11()); 
            // InternalSiriusTextDsl.g:8538:1: ( rule__EdgeStyle__Group_11__0 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==92) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalSiriusTextDsl.g:8538:2: rule__EdgeStyle__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EdgeStyle__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEdgeStyleAccess().getGroup_11()); 

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
    // $ANTLR end "rule__EdgeStyle__Group__11__Impl"


    // $ANTLR start "rule__EdgeStyle__Group__12"
    // InternalSiriusTextDsl.g:8548:1: rule__EdgeStyle__Group__12 : rule__EdgeStyle__Group__12__Impl ;
    public final void rule__EdgeStyle__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8552:1: ( rule__EdgeStyle__Group__12__Impl )
            // InternalSiriusTextDsl.g:8553:2: rule__EdgeStyle__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group__12__Impl();

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
    // $ANTLR end "rule__EdgeStyle__Group__12"


    // $ANTLR start "rule__EdgeStyle__Group__12__Impl"
    // InternalSiriusTextDsl.g:8559:1: rule__EdgeStyle__Group__12__Impl : ( '}' ) ;
    public final void rule__EdgeStyle__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8563:1: ( ( '}' ) )
            // InternalSiriusTextDsl.g:8564:1: ( '}' )
            {
            // InternalSiriusTextDsl.g:8564:1: ( '}' )
            // InternalSiriusTextDsl.g:8565:1: '}'
            {
             before(grammarAccess.getEdgeStyleAccess().getRightCurlyBracketKeyword_12()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getEdgeStyleAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__EdgeStyle__Group__12__Impl"


    // $ANTLR start "rule__EdgeStyle__Group_4__0"
    // InternalSiriusTextDsl.g:8604:1: rule__EdgeStyle__Group_4__0 : rule__EdgeStyle__Group_4__0__Impl rule__EdgeStyle__Group_4__1 ;
    public final void rule__EdgeStyle__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8608:1: ( rule__EdgeStyle__Group_4__0__Impl rule__EdgeStyle__Group_4__1 )
            // InternalSiriusTextDsl.g:8609:2: rule__EdgeStyle__Group_4__0__Impl rule__EdgeStyle__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__EdgeStyle__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group_4__1();

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
    // $ANTLR end "rule__EdgeStyle__Group_4__0"


    // $ANTLR start "rule__EdgeStyle__Group_4__0__Impl"
    // InternalSiriusTextDsl.g:8616:1: rule__EdgeStyle__Group_4__0__Impl : ( 'line' ) ;
    public final void rule__EdgeStyle__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8620:1: ( ( 'line' ) )
            // InternalSiriusTextDsl.g:8621:1: ( 'line' )
            {
            // InternalSiriusTextDsl.g:8621:1: ( 'line' )
            // InternalSiriusTextDsl.g:8622:1: 'line'
            {
             before(grammarAccess.getEdgeStyleAccess().getLineKeyword_4_0()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getEdgeStyleAccess().getLineKeyword_4_0()); 

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
    // $ANTLR end "rule__EdgeStyle__Group_4__0__Impl"


    // $ANTLR start "rule__EdgeStyle__Group_4__1"
    // InternalSiriusTextDsl.g:8635:1: rule__EdgeStyle__Group_4__1 : rule__EdgeStyle__Group_4__1__Impl rule__EdgeStyle__Group_4__2 ;
    public final void rule__EdgeStyle__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8639:1: ( rule__EdgeStyle__Group_4__1__Impl rule__EdgeStyle__Group_4__2 )
            // InternalSiriusTextDsl.g:8640:2: rule__EdgeStyle__Group_4__1__Impl rule__EdgeStyle__Group_4__2
            {
            pushFollow(FOLLOW_57);
            rule__EdgeStyle__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group_4__2();

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
    // $ANTLR end "rule__EdgeStyle__Group_4__1"


    // $ANTLR start "rule__EdgeStyle__Group_4__1__Impl"
    // InternalSiriusTextDsl.g:8647:1: rule__EdgeStyle__Group_4__1__Impl : ( '=' ) ;
    public final void rule__EdgeStyle__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8651:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:8652:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:8652:1: ( '=' )
            // InternalSiriusTextDsl.g:8653:1: '='
            {
             before(grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_4_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_4_1()); 

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
    // $ANTLR end "rule__EdgeStyle__Group_4__1__Impl"


    // $ANTLR start "rule__EdgeStyle__Group_4__2"
    // InternalSiriusTextDsl.g:8666:1: rule__EdgeStyle__Group_4__2 : rule__EdgeStyle__Group_4__2__Impl ;
    public final void rule__EdgeStyle__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8670:1: ( rule__EdgeStyle__Group_4__2__Impl )
            // InternalSiriusTextDsl.g:8671:2: rule__EdgeStyle__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group_4__2__Impl();

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
    // $ANTLR end "rule__EdgeStyle__Group_4__2"


    // $ANTLR start "rule__EdgeStyle__Group_4__2__Impl"
    // InternalSiriusTextDsl.g:8677:1: rule__EdgeStyle__Group_4__2__Impl : ( ( rule__EdgeStyle__LineStyleAssignment_4_2 ) ) ;
    public final void rule__EdgeStyle__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8681:1: ( ( ( rule__EdgeStyle__LineStyleAssignment_4_2 ) ) )
            // InternalSiriusTextDsl.g:8682:1: ( ( rule__EdgeStyle__LineStyleAssignment_4_2 ) )
            {
            // InternalSiriusTextDsl.g:8682:1: ( ( rule__EdgeStyle__LineStyleAssignment_4_2 ) )
            // InternalSiriusTextDsl.g:8683:1: ( rule__EdgeStyle__LineStyleAssignment_4_2 )
            {
             before(grammarAccess.getEdgeStyleAccess().getLineStyleAssignment_4_2()); 
            // InternalSiriusTextDsl.g:8684:1: ( rule__EdgeStyle__LineStyleAssignment_4_2 )
            // InternalSiriusTextDsl.g:8684:2: rule__EdgeStyle__LineStyleAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__EdgeStyle__LineStyleAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getEdgeStyleAccess().getLineStyleAssignment_4_2()); 

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
    // $ANTLR end "rule__EdgeStyle__Group_4__2__Impl"


    // $ANTLR start "rule__EdgeStyle__Group_5__0"
    // InternalSiriusTextDsl.g:8700:1: rule__EdgeStyle__Group_5__0 : rule__EdgeStyle__Group_5__0__Impl rule__EdgeStyle__Group_5__1 ;
    public final void rule__EdgeStyle__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8704:1: ( rule__EdgeStyle__Group_5__0__Impl rule__EdgeStyle__Group_5__1 )
            // InternalSiriusTextDsl.g:8705:2: rule__EdgeStyle__Group_5__0__Impl rule__EdgeStyle__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__EdgeStyle__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group_5__1();

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
    // $ANTLR end "rule__EdgeStyle__Group_5__0"


    // $ANTLR start "rule__EdgeStyle__Group_5__0__Impl"
    // InternalSiriusTextDsl.g:8712:1: rule__EdgeStyle__Group_5__0__Impl : ( 'routing' ) ;
    public final void rule__EdgeStyle__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8716:1: ( ( 'routing' ) )
            // InternalSiriusTextDsl.g:8717:1: ( 'routing' )
            {
            // InternalSiriusTextDsl.g:8717:1: ( 'routing' )
            // InternalSiriusTextDsl.g:8718:1: 'routing'
            {
             before(grammarAccess.getEdgeStyleAccess().getRoutingKeyword_5_0()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getEdgeStyleAccess().getRoutingKeyword_5_0()); 

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
    // $ANTLR end "rule__EdgeStyle__Group_5__0__Impl"


    // $ANTLR start "rule__EdgeStyle__Group_5__1"
    // InternalSiriusTextDsl.g:8731:1: rule__EdgeStyle__Group_5__1 : rule__EdgeStyle__Group_5__1__Impl rule__EdgeStyle__Group_5__2 ;
    public final void rule__EdgeStyle__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8735:1: ( rule__EdgeStyle__Group_5__1__Impl rule__EdgeStyle__Group_5__2 )
            // InternalSiriusTextDsl.g:8736:2: rule__EdgeStyle__Group_5__1__Impl rule__EdgeStyle__Group_5__2
            {
            pushFollow(FOLLOW_58);
            rule__EdgeStyle__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group_5__2();

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
    // $ANTLR end "rule__EdgeStyle__Group_5__1"


    // $ANTLR start "rule__EdgeStyle__Group_5__1__Impl"
    // InternalSiriusTextDsl.g:8743:1: rule__EdgeStyle__Group_5__1__Impl : ( '=' ) ;
    public final void rule__EdgeStyle__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8747:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:8748:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:8748:1: ( '=' )
            // InternalSiriusTextDsl.g:8749:1: '='
            {
             before(grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_5_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_5_1()); 

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
    // $ANTLR end "rule__EdgeStyle__Group_5__1__Impl"


    // $ANTLR start "rule__EdgeStyle__Group_5__2"
    // InternalSiriusTextDsl.g:8762:1: rule__EdgeStyle__Group_5__2 : rule__EdgeStyle__Group_5__2__Impl ;
    public final void rule__EdgeStyle__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8766:1: ( rule__EdgeStyle__Group_5__2__Impl )
            // InternalSiriusTextDsl.g:8767:2: rule__EdgeStyle__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group_5__2__Impl();

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
    // $ANTLR end "rule__EdgeStyle__Group_5__2"


    // $ANTLR start "rule__EdgeStyle__Group_5__2__Impl"
    // InternalSiriusTextDsl.g:8773:1: rule__EdgeStyle__Group_5__2__Impl : ( ( rule__EdgeStyle__RoutingStyleAssignment_5_2 ) ) ;
    public final void rule__EdgeStyle__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8777:1: ( ( ( rule__EdgeStyle__RoutingStyleAssignment_5_2 ) ) )
            // InternalSiriusTextDsl.g:8778:1: ( ( rule__EdgeStyle__RoutingStyleAssignment_5_2 ) )
            {
            // InternalSiriusTextDsl.g:8778:1: ( ( rule__EdgeStyle__RoutingStyleAssignment_5_2 ) )
            // InternalSiriusTextDsl.g:8779:1: ( rule__EdgeStyle__RoutingStyleAssignment_5_2 )
            {
             before(grammarAccess.getEdgeStyleAccess().getRoutingStyleAssignment_5_2()); 
            // InternalSiriusTextDsl.g:8780:1: ( rule__EdgeStyle__RoutingStyleAssignment_5_2 )
            // InternalSiriusTextDsl.g:8780:2: rule__EdgeStyle__RoutingStyleAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__EdgeStyle__RoutingStyleAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getEdgeStyleAccess().getRoutingStyleAssignment_5_2()); 

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
    // $ANTLR end "rule__EdgeStyle__Group_5__2__Impl"


    // $ANTLR start "rule__EdgeStyle__Group_7__0"
    // InternalSiriusTextDsl.g:8796:1: rule__EdgeStyle__Group_7__0 : rule__EdgeStyle__Group_7__0__Impl rule__EdgeStyle__Group_7__1 ;
    public final void rule__EdgeStyle__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8800:1: ( rule__EdgeStyle__Group_7__0__Impl rule__EdgeStyle__Group_7__1 )
            // InternalSiriusTextDsl.g:8801:2: rule__EdgeStyle__Group_7__0__Impl rule__EdgeStyle__Group_7__1
            {
            pushFollow(FOLLOW_17);
            rule__EdgeStyle__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group_7__1();

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
    // $ANTLR end "rule__EdgeStyle__Group_7__0"


    // $ANTLR start "rule__EdgeStyle__Group_7__0__Impl"
    // InternalSiriusTextDsl.g:8808:1: rule__EdgeStyle__Group_7__0__Impl : ( 'sourceArrow' ) ;
    public final void rule__EdgeStyle__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8812:1: ( ( 'sourceArrow' ) )
            // InternalSiriusTextDsl.g:8813:1: ( 'sourceArrow' )
            {
            // InternalSiriusTextDsl.g:8813:1: ( 'sourceArrow' )
            // InternalSiriusTextDsl.g:8814:1: 'sourceArrow'
            {
             before(grammarAccess.getEdgeStyleAccess().getSourceArrowKeyword_7_0()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getEdgeStyleAccess().getSourceArrowKeyword_7_0()); 

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
    // $ANTLR end "rule__EdgeStyle__Group_7__0__Impl"


    // $ANTLR start "rule__EdgeStyle__Group_7__1"
    // InternalSiriusTextDsl.g:8827:1: rule__EdgeStyle__Group_7__1 : rule__EdgeStyle__Group_7__1__Impl rule__EdgeStyle__Group_7__2 ;
    public final void rule__EdgeStyle__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8831:1: ( rule__EdgeStyle__Group_7__1__Impl rule__EdgeStyle__Group_7__2 )
            // InternalSiriusTextDsl.g:8832:2: rule__EdgeStyle__Group_7__1__Impl rule__EdgeStyle__Group_7__2
            {
            pushFollow(FOLLOW_59);
            rule__EdgeStyle__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group_7__2();

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
    // $ANTLR end "rule__EdgeStyle__Group_7__1"


    // $ANTLR start "rule__EdgeStyle__Group_7__1__Impl"
    // InternalSiriusTextDsl.g:8839:1: rule__EdgeStyle__Group_7__1__Impl : ( '=' ) ;
    public final void rule__EdgeStyle__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8843:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:8844:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:8844:1: ( '=' )
            // InternalSiriusTextDsl.g:8845:1: '='
            {
             before(grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_7_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_7_1()); 

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
    // $ANTLR end "rule__EdgeStyle__Group_7__1__Impl"


    // $ANTLR start "rule__EdgeStyle__Group_7__2"
    // InternalSiriusTextDsl.g:8858:1: rule__EdgeStyle__Group_7__2 : rule__EdgeStyle__Group_7__2__Impl ;
    public final void rule__EdgeStyle__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8862:1: ( rule__EdgeStyle__Group_7__2__Impl )
            // InternalSiriusTextDsl.g:8863:2: rule__EdgeStyle__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group_7__2__Impl();

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
    // $ANTLR end "rule__EdgeStyle__Group_7__2"


    // $ANTLR start "rule__EdgeStyle__Group_7__2__Impl"
    // InternalSiriusTextDsl.g:8869:1: rule__EdgeStyle__Group_7__2__Impl : ( ( rule__EdgeStyle__SourceArrowAssignment_7_2 ) ) ;
    public final void rule__EdgeStyle__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8873:1: ( ( ( rule__EdgeStyle__SourceArrowAssignment_7_2 ) ) )
            // InternalSiriusTextDsl.g:8874:1: ( ( rule__EdgeStyle__SourceArrowAssignment_7_2 ) )
            {
            // InternalSiriusTextDsl.g:8874:1: ( ( rule__EdgeStyle__SourceArrowAssignment_7_2 ) )
            // InternalSiriusTextDsl.g:8875:1: ( rule__EdgeStyle__SourceArrowAssignment_7_2 )
            {
             before(grammarAccess.getEdgeStyleAccess().getSourceArrowAssignment_7_2()); 
            // InternalSiriusTextDsl.g:8876:1: ( rule__EdgeStyle__SourceArrowAssignment_7_2 )
            // InternalSiriusTextDsl.g:8876:2: rule__EdgeStyle__SourceArrowAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__EdgeStyle__SourceArrowAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getEdgeStyleAccess().getSourceArrowAssignment_7_2()); 

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
    // $ANTLR end "rule__EdgeStyle__Group_7__2__Impl"


    // $ANTLR start "rule__EdgeStyle__Group_8__0"
    // InternalSiriusTextDsl.g:8892:1: rule__EdgeStyle__Group_8__0 : rule__EdgeStyle__Group_8__0__Impl rule__EdgeStyle__Group_8__1 ;
    public final void rule__EdgeStyle__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8896:1: ( rule__EdgeStyle__Group_8__0__Impl rule__EdgeStyle__Group_8__1 )
            // InternalSiriusTextDsl.g:8897:2: rule__EdgeStyle__Group_8__0__Impl rule__EdgeStyle__Group_8__1
            {
            pushFollow(FOLLOW_17);
            rule__EdgeStyle__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group_8__1();

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
    // $ANTLR end "rule__EdgeStyle__Group_8__0"


    // $ANTLR start "rule__EdgeStyle__Group_8__0__Impl"
    // InternalSiriusTextDsl.g:8904:1: rule__EdgeStyle__Group_8__0__Impl : ( 'targetArrow' ) ;
    public final void rule__EdgeStyle__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8908:1: ( ( 'targetArrow' ) )
            // InternalSiriusTextDsl.g:8909:1: ( 'targetArrow' )
            {
            // InternalSiriusTextDsl.g:8909:1: ( 'targetArrow' )
            // InternalSiriusTextDsl.g:8910:1: 'targetArrow'
            {
             before(grammarAccess.getEdgeStyleAccess().getTargetArrowKeyword_8_0()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getEdgeStyleAccess().getTargetArrowKeyword_8_0()); 

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
    // $ANTLR end "rule__EdgeStyle__Group_8__0__Impl"


    // $ANTLR start "rule__EdgeStyle__Group_8__1"
    // InternalSiriusTextDsl.g:8923:1: rule__EdgeStyle__Group_8__1 : rule__EdgeStyle__Group_8__1__Impl rule__EdgeStyle__Group_8__2 ;
    public final void rule__EdgeStyle__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8927:1: ( rule__EdgeStyle__Group_8__1__Impl rule__EdgeStyle__Group_8__2 )
            // InternalSiriusTextDsl.g:8928:2: rule__EdgeStyle__Group_8__1__Impl rule__EdgeStyle__Group_8__2
            {
            pushFollow(FOLLOW_59);
            rule__EdgeStyle__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group_8__2();

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
    // $ANTLR end "rule__EdgeStyle__Group_8__1"


    // $ANTLR start "rule__EdgeStyle__Group_8__1__Impl"
    // InternalSiriusTextDsl.g:8935:1: rule__EdgeStyle__Group_8__1__Impl : ( '=' ) ;
    public final void rule__EdgeStyle__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8939:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:8940:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:8940:1: ( '=' )
            // InternalSiriusTextDsl.g:8941:1: '='
            {
             before(grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_8_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_8_1()); 

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
    // $ANTLR end "rule__EdgeStyle__Group_8__1__Impl"


    // $ANTLR start "rule__EdgeStyle__Group_8__2"
    // InternalSiriusTextDsl.g:8954:1: rule__EdgeStyle__Group_8__2 : rule__EdgeStyle__Group_8__2__Impl ;
    public final void rule__EdgeStyle__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8958:1: ( rule__EdgeStyle__Group_8__2__Impl )
            // InternalSiriusTextDsl.g:8959:2: rule__EdgeStyle__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group_8__2__Impl();

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
    // $ANTLR end "rule__EdgeStyle__Group_8__2"


    // $ANTLR start "rule__EdgeStyle__Group_8__2__Impl"
    // InternalSiriusTextDsl.g:8965:1: rule__EdgeStyle__Group_8__2__Impl : ( ( rule__EdgeStyle__TargetArrowAssignment_8_2 ) ) ;
    public final void rule__EdgeStyle__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8969:1: ( ( ( rule__EdgeStyle__TargetArrowAssignment_8_2 ) ) )
            // InternalSiriusTextDsl.g:8970:1: ( ( rule__EdgeStyle__TargetArrowAssignment_8_2 ) )
            {
            // InternalSiriusTextDsl.g:8970:1: ( ( rule__EdgeStyle__TargetArrowAssignment_8_2 ) )
            // InternalSiriusTextDsl.g:8971:1: ( rule__EdgeStyle__TargetArrowAssignment_8_2 )
            {
             before(grammarAccess.getEdgeStyleAccess().getTargetArrowAssignment_8_2()); 
            // InternalSiriusTextDsl.g:8972:1: ( rule__EdgeStyle__TargetArrowAssignment_8_2 )
            // InternalSiriusTextDsl.g:8972:2: rule__EdgeStyle__TargetArrowAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__EdgeStyle__TargetArrowAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getEdgeStyleAccess().getTargetArrowAssignment_8_2()); 

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
    // $ANTLR end "rule__EdgeStyle__Group_8__2__Impl"


    // $ANTLR start "rule__EdgeStyle__Group_9__0"
    // InternalSiriusTextDsl.g:8988:1: rule__EdgeStyle__Group_9__0 : rule__EdgeStyle__Group_9__0__Impl rule__EdgeStyle__Group_9__1 ;
    public final void rule__EdgeStyle__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8992:1: ( rule__EdgeStyle__Group_9__0__Impl rule__EdgeStyle__Group_9__1 )
            // InternalSiriusTextDsl.g:8993:2: rule__EdgeStyle__Group_9__0__Impl rule__EdgeStyle__Group_9__1
            {
            pushFollow(FOLLOW_17);
            rule__EdgeStyle__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group_9__1();

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
    // $ANTLR end "rule__EdgeStyle__Group_9__0"


    // $ANTLR start "rule__EdgeStyle__Group_9__0__Impl"
    // InternalSiriusTextDsl.g:9000:1: rule__EdgeStyle__Group_9__0__Impl : ( 'sizeComputationExpression' ) ;
    public final void rule__EdgeStyle__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9004:1: ( ( 'sizeComputationExpression' ) )
            // InternalSiriusTextDsl.g:9005:1: ( 'sizeComputationExpression' )
            {
            // InternalSiriusTextDsl.g:9005:1: ( 'sizeComputationExpression' )
            // InternalSiriusTextDsl.g:9006:1: 'sizeComputationExpression'
            {
             before(grammarAccess.getEdgeStyleAccess().getSizeComputationExpressionKeyword_9_0()); 
            match(input,90,FOLLOW_2); 
             after(grammarAccess.getEdgeStyleAccess().getSizeComputationExpressionKeyword_9_0()); 

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
    // $ANTLR end "rule__EdgeStyle__Group_9__0__Impl"


    // $ANTLR start "rule__EdgeStyle__Group_9__1"
    // InternalSiriusTextDsl.g:9019:1: rule__EdgeStyle__Group_9__1 : rule__EdgeStyle__Group_9__1__Impl rule__EdgeStyle__Group_9__2 ;
    public final void rule__EdgeStyle__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9023:1: ( rule__EdgeStyle__Group_9__1__Impl rule__EdgeStyle__Group_9__2 )
            // InternalSiriusTextDsl.g:9024:2: rule__EdgeStyle__Group_9__1__Impl rule__EdgeStyle__Group_9__2
            {
            pushFollow(FOLLOW_31);
            rule__EdgeStyle__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group_9__2();

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
    // $ANTLR end "rule__EdgeStyle__Group_9__1"


    // $ANTLR start "rule__EdgeStyle__Group_9__1__Impl"
    // InternalSiriusTextDsl.g:9031:1: rule__EdgeStyle__Group_9__1__Impl : ( '=' ) ;
    public final void rule__EdgeStyle__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9035:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:9036:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:9036:1: ( '=' )
            // InternalSiriusTextDsl.g:9037:1: '='
            {
             before(grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_9_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_9_1()); 

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
    // $ANTLR end "rule__EdgeStyle__Group_9__1__Impl"


    // $ANTLR start "rule__EdgeStyle__Group_9__2"
    // InternalSiriusTextDsl.g:9050:1: rule__EdgeStyle__Group_9__2 : rule__EdgeStyle__Group_9__2__Impl ;
    public final void rule__EdgeStyle__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9054:1: ( rule__EdgeStyle__Group_9__2__Impl )
            // InternalSiriusTextDsl.g:9055:2: rule__EdgeStyle__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group_9__2__Impl();

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
    // $ANTLR end "rule__EdgeStyle__Group_9__2"


    // $ANTLR start "rule__EdgeStyle__Group_9__2__Impl"
    // InternalSiriusTextDsl.g:9061:1: rule__EdgeStyle__Group_9__2__Impl : ( ( rule__EdgeStyle__SizeComputationExpressionAssignment_9_2 ) ) ;
    public final void rule__EdgeStyle__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9065:1: ( ( ( rule__EdgeStyle__SizeComputationExpressionAssignment_9_2 ) ) )
            // InternalSiriusTextDsl.g:9066:1: ( ( rule__EdgeStyle__SizeComputationExpressionAssignment_9_2 ) )
            {
            // InternalSiriusTextDsl.g:9066:1: ( ( rule__EdgeStyle__SizeComputationExpressionAssignment_9_2 ) )
            // InternalSiriusTextDsl.g:9067:1: ( rule__EdgeStyle__SizeComputationExpressionAssignment_9_2 )
            {
             before(grammarAccess.getEdgeStyleAccess().getSizeComputationExpressionAssignment_9_2()); 
            // InternalSiriusTextDsl.g:9068:1: ( rule__EdgeStyle__SizeComputationExpressionAssignment_9_2 )
            // InternalSiriusTextDsl.g:9068:2: rule__EdgeStyle__SizeComputationExpressionAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__EdgeStyle__SizeComputationExpressionAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getEdgeStyleAccess().getSizeComputationExpressionAssignment_9_2()); 

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
    // $ANTLR end "rule__EdgeStyle__Group_9__2__Impl"


    // $ANTLR start "rule__EdgeStyle__Group_10__0"
    // InternalSiriusTextDsl.g:9084:1: rule__EdgeStyle__Group_10__0 : rule__EdgeStyle__Group_10__0__Impl rule__EdgeStyle__Group_10__1 ;
    public final void rule__EdgeStyle__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9088:1: ( rule__EdgeStyle__Group_10__0__Impl rule__EdgeStyle__Group_10__1 )
            // InternalSiriusTextDsl.g:9089:2: rule__EdgeStyle__Group_10__0__Impl rule__EdgeStyle__Group_10__1
            {
            pushFollow(FOLLOW_17);
            rule__EdgeStyle__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group_10__1();

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
    // $ANTLR end "rule__EdgeStyle__Group_10__0"


    // $ANTLR start "rule__EdgeStyle__Group_10__0__Impl"
    // InternalSiriusTextDsl.g:9096:1: rule__EdgeStyle__Group_10__0__Impl : ( 'foldingStyle' ) ;
    public final void rule__EdgeStyle__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9100:1: ( ( 'foldingStyle' ) )
            // InternalSiriusTextDsl.g:9101:1: ( 'foldingStyle' )
            {
            // InternalSiriusTextDsl.g:9101:1: ( 'foldingStyle' )
            // InternalSiriusTextDsl.g:9102:1: 'foldingStyle'
            {
             before(grammarAccess.getEdgeStyleAccess().getFoldingStyleKeyword_10_0()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getEdgeStyleAccess().getFoldingStyleKeyword_10_0()); 

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
    // $ANTLR end "rule__EdgeStyle__Group_10__0__Impl"


    // $ANTLR start "rule__EdgeStyle__Group_10__1"
    // InternalSiriusTextDsl.g:9115:1: rule__EdgeStyle__Group_10__1 : rule__EdgeStyle__Group_10__1__Impl rule__EdgeStyle__Group_10__2 ;
    public final void rule__EdgeStyle__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9119:1: ( rule__EdgeStyle__Group_10__1__Impl rule__EdgeStyle__Group_10__2 )
            // InternalSiriusTextDsl.g:9120:2: rule__EdgeStyle__Group_10__1__Impl rule__EdgeStyle__Group_10__2
            {
            pushFollow(FOLLOW_60);
            rule__EdgeStyle__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group_10__2();

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
    // $ANTLR end "rule__EdgeStyle__Group_10__1"


    // $ANTLR start "rule__EdgeStyle__Group_10__1__Impl"
    // InternalSiriusTextDsl.g:9127:1: rule__EdgeStyle__Group_10__1__Impl : ( '=' ) ;
    public final void rule__EdgeStyle__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9131:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:9132:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:9132:1: ( '=' )
            // InternalSiriusTextDsl.g:9133:1: '='
            {
             before(grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_10_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_10_1()); 

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
    // $ANTLR end "rule__EdgeStyle__Group_10__1__Impl"


    // $ANTLR start "rule__EdgeStyle__Group_10__2"
    // InternalSiriusTextDsl.g:9146:1: rule__EdgeStyle__Group_10__2 : rule__EdgeStyle__Group_10__2__Impl ;
    public final void rule__EdgeStyle__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9150:1: ( rule__EdgeStyle__Group_10__2__Impl )
            // InternalSiriusTextDsl.g:9151:2: rule__EdgeStyle__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group_10__2__Impl();

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
    // $ANTLR end "rule__EdgeStyle__Group_10__2"


    // $ANTLR start "rule__EdgeStyle__Group_10__2__Impl"
    // InternalSiriusTextDsl.g:9157:1: rule__EdgeStyle__Group_10__2__Impl : ( ( rule__EdgeStyle__FoldingStyleAssignment_10_2 ) ) ;
    public final void rule__EdgeStyle__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9161:1: ( ( ( rule__EdgeStyle__FoldingStyleAssignment_10_2 ) ) )
            // InternalSiriusTextDsl.g:9162:1: ( ( rule__EdgeStyle__FoldingStyleAssignment_10_2 ) )
            {
            // InternalSiriusTextDsl.g:9162:1: ( ( rule__EdgeStyle__FoldingStyleAssignment_10_2 ) )
            // InternalSiriusTextDsl.g:9163:1: ( rule__EdgeStyle__FoldingStyleAssignment_10_2 )
            {
             before(grammarAccess.getEdgeStyleAccess().getFoldingStyleAssignment_10_2()); 
            // InternalSiriusTextDsl.g:9164:1: ( rule__EdgeStyle__FoldingStyleAssignment_10_2 )
            // InternalSiriusTextDsl.g:9164:2: rule__EdgeStyle__FoldingStyleAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__EdgeStyle__FoldingStyleAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getEdgeStyleAccess().getFoldingStyleAssignment_10_2()); 

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
    // $ANTLR end "rule__EdgeStyle__Group_10__2__Impl"


    // $ANTLR start "rule__EdgeStyle__Group_11__0"
    // InternalSiriusTextDsl.g:9180:1: rule__EdgeStyle__Group_11__0 : rule__EdgeStyle__Group_11__0__Impl rule__EdgeStyle__Group_11__1 ;
    public final void rule__EdgeStyle__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9184:1: ( rule__EdgeStyle__Group_11__0__Impl rule__EdgeStyle__Group_11__1 )
            // InternalSiriusTextDsl.g:9185:2: rule__EdgeStyle__Group_11__0__Impl rule__EdgeStyle__Group_11__1
            {
            pushFollow(FOLLOW_17);
            rule__EdgeStyle__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group_11__1();

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
    // $ANTLR end "rule__EdgeStyle__Group_11__0"


    // $ANTLR start "rule__EdgeStyle__Group_11__0__Impl"
    // InternalSiriusTextDsl.g:9192:1: rule__EdgeStyle__Group_11__0__Impl : ( 'endsCentering' ) ;
    public final void rule__EdgeStyle__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9196:1: ( ( 'endsCentering' ) )
            // InternalSiriusTextDsl.g:9197:1: ( 'endsCentering' )
            {
            // InternalSiriusTextDsl.g:9197:1: ( 'endsCentering' )
            // InternalSiriusTextDsl.g:9198:1: 'endsCentering'
            {
             before(grammarAccess.getEdgeStyleAccess().getEndsCenteringKeyword_11_0()); 
            match(input,92,FOLLOW_2); 
             after(grammarAccess.getEdgeStyleAccess().getEndsCenteringKeyword_11_0()); 

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
    // $ANTLR end "rule__EdgeStyle__Group_11__0__Impl"


    // $ANTLR start "rule__EdgeStyle__Group_11__1"
    // InternalSiriusTextDsl.g:9211:1: rule__EdgeStyle__Group_11__1 : rule__EdgeStyle__Group_11__1__Impl rule__EdgeStyle__Group_11__2 ;
    public final void rule__EdgeStyle__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9215:1: ( rule__EdgeStyle__Group_11__1__Impl rule__EdgeStyle__Group_11__2 )
            // InternalSiriusTextDsl.g:9216:2: rule__EdgeStyle__Group_11__1__Impl rule__EdgeStyle__Group_11__2
            {
            pushFollow(FOLLOW_61);
            rule__EdgeStyle__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group_11__2();

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
    // $ANTLR end "rule__EdgeStyle__Group_11__1"


    // $ANTLR start "rule__EdgeStyle__Group_11__1__Impl"
    // InternalSiriusTextDsl.g:9223:1: rule__EdgeStyle__Group_11__1__Impl : ( '=' ) ;
    public final void rule__EdgeStyle__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9227:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:9228:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:9228:1: ( '=' )
            // InternalSiriusTextDsl.g:9229:1: '='
            {
             before(grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_11_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_11_1()); 

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
    // $ANTLR end "rule__EdgeStyle__Group_11__1__Impl"


    // $ANTLR start "rule__EdgeStyle__Group_11__2"
    // InternalSiriusTextDsl.g:9242:1: rule__EdgeStyle__Group_11__2 : rule__EdgeStyle__Group_11__2__Impl ;
    public final void rule__EdgeStyle__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9246:1: ( rule__EdgeStyle__Group_11__2__Impl )
            // InternalSiriusTextDsl.g:9247:2: rule__EdgeStyle__Group_11__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeStyle__Group_11__2__Impl();

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
    // $ANTLR end "rule__EdgeStyle__Group_11__2"


    // $ANTLR start "rule__EdgeStyle__Group_11__2__Impl"
    // InternalSiriusTextDsl.g:9253:1: rule__EdgeStyle__Group_11__2__Impl : ( ( rule__EdgeStyle__EndsCenteringAssignment_11_2 ) ) ;
    public final void rule__EdgeStyle__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9257:1: ( ( ( rule__EdgeStyle__EndsCenteringAssignment_11_2 ) ) )
            // InternalSiriusTextDsl.g:9258:1: ( ( rule__EdgeStyle__EndsCenteringAssignment_11_2 ) )
            {
            // InternalSiriusTextDsl.g:9258:1: ( ( rule__EdgeStyle__EndsCenteringAssignment_11_2 ) )
            // InternalSiriusTextDsl.g:9259:1: ( rule__EdgeStyle__EndsCenteringAssignment_11_2 )
            {
             before(grammarAccess.getEdgeStyleAccess().getEndsCenteringAssignment_11_2()); 
            // InternalSiriusTextDsl.g:9260:1: ( rule__EdgeStyle__EndsCenteringAssignment_11_2 )
            // InternalSiriusTextDsl.g:9260:2: rule__EdgeStyle__EndsCenteringAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__EdgeStyle__EndsCenteringAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getEdgeStyleAccess().getEndsCenteringAssignment_11_2()); 

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
    // $ANTLR end "rule__EdgeStyle__Group_11__2__Impl"


    // $ANTLR start "rule__Palette__Group__0"
    // InternalSiriusTextDsl.g:9276:1: rule__Palette__Group__0 : rule__Palette__Group__0__Impl rule__Palette__Group__1 ;
    public final void rule__Palette__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9280:1: ( rule__Palette__Group__0__Impl rule__Palette__Group__1 )
            // InternalSiriusTextDsl.g:9281:2: rule__Palette__Group__0__Impl rule__Palette__Group__1
            {
            pushFollow(FOLLOW_62);
            rule__Palette__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Palette__Group__1();

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
    // $ANTLR end "rule__Palette__Group__0"


    // $ANTLR start "rule__Palette__Group__0__Impl"
    // InternalSiriusTextDsl.g:9288:1: rule__Palette__Group__0__Impl : ( ( rule__Palette__DocumentationAssignment_0 )? ) ;
    public final void rule__Palette__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9292:1: ( ( ( rule__Palette__DocumentationAssignment_0 )? ) )
            // InternalSiriusTextDsl.g:9293:1: ( ( rule__Palette__DocumentationAssignment_0 )? )
            {
            // InternalSiriusTextDsl.g:9293:1: ( ( rule__Palette__DocumentationAssignment_0 )? )
            // InternalSiriusTextDsl.g:9294:1: ( rule__Palette__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getPaletteAccess().getDocumentationAssignment_0()); 
            // InternalSiriusTextDsl.g:9295:1: ( rule__Palette__DocumentationAssignment_0 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_DOCUMENTATION) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalSiriusTextDsl.g:9295:2: rule__Palette__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Palette__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPaletteAccess().getDocumentationAssignment_0()); 

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
    // $ANTLR end "rule__Palette__Group__0__Impl"


    // $ANTLR start "rule__Palette__Group__1"
    // InternalSiriusTextDsl.g:9305:1: rule__Palette__Group__1 : rule__Palette__Group__1__Impl rule__Palette__Group__2 ;
    public final void rule__Palette__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9309:1: ( rule__Palette__Group__1__Impl rule__Palette__Group__2 )
            // InternalSiriusTextDsl.g:9310:2: rule__Palette__Group__1__Impl rule__Palette__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Palette__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Palette__Group__2();

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
    // $ANTLR end "rule__Palette__Group__1"


    // $ANTLR start "rule__Palette__Group__1__Impl"
    // InternalSiriusTextDsl.g:9317:1: rule__Palette__Group__1__Impl : ( 'palette' ) ;
    public final void rule__Palette__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9321:1: ( ( 'palette' ) )
            // InternalSiriusTextDsl.g:9322:1: ( 'palette' )
            {
            // InternalSiriusTextDsl.g:9322:1: ( 'palette' )
            // InternalSiriusTextDsl.g:9323:1: 'palette'
            {
             before(grammarAccess.getPaletteAccess().getPaletteKeyword_1()); 
            match(input,93,FOLLOW_2); 
             after(grammarAccess.getPaletteAccess().getPaletteKeyword_1()); 

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
    // $ANTLR end "rule__Palette__Group__1__Impl"


    // $ANTLR start "rule__Palette__Group__2"
    // InternalSiriusTextDsl.g:9336:1: rule__Palette__Group__2 : rule__Palette__Group__2__Impl rule__Palette__Group__3 ;
    public final void rule__Palette__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9340:1: ( rule__Palette__Group__2__Impl rule__Palette__Group__3 )
            // InternalSiriusTextDsl.g:9341:2: rule__Palette__Group__2__Impl rule__Palette__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Palette__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Palette__Group__3();

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
    // $ANTLR end "rule__Palette__Group__2"


    // $ANTLR start "rule__Palette__Group__2__Impl"
    // InternalSiriusTextDsl.g:9348:1: rule__Palette__Group__2__Impl : ( ( rule__Palette__NameAssignment_2 ) ) ;
    public final void rule__Palette__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9352:1: ( ( ( rule__Palette__NameAssignment_2 ) ) )
            // InternalSiriusTextDsl.g:9353:1: ( ( rule__Palette__NameAssignment_2 ) )
            {
            // InternalSiriusTextDsl.g:9353:1: ( ( rule__Palette__NameAssignment_2 ) )
            // InternalSiriusTextDsl.g:9354:1: ( rule__Palette__NameAssignment_2 )
            {
             before(grammarAccess.getPaletteAccess().getNameAssignment_2()); 
            // InternalSiriusTextDsl.g:9355:1: ( rule__Palette__NameAssignment_2 )
            // InternalSiriusTextDsl.g:9355:2: rule__Palette__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Palette__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPaletteAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Palette__Group__2__Impl"


    // $ANTLR start "rule__Palette__Group__3"
    // InternalSiriusTextDsl.g:9365:1: rule__Palette__Group__3 : rule__Palette__Group__3__Impl rule__Palette__Group__4 ;
    public final void rule__Palette__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9369:1: ( rule__Palette__Group__3__Impl rule__Palette__Group__4 )
            // InternalSiriusTextDsl.g:9370:2: rule__Palette__Group__3__Impl rule__Palette__Group__4
            {
            pushFollow(FOLLOW_63);
            rule__Palette__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Palette__Group__4();

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
    // $ANTLR end "rule__Palette__Group__3"


    // $ANTLR start "rule__Palette__Group__3__Impl"
    // InternalSiriusTextDsl.g:9377:1: rule__Palette__Group__3__Impl : ( '{' ) ;
    public final void rule__Palette__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9381:1: ( ( '{' ) )
            // InternalSiriusTextDsl.g:9382:1: ( '{' )
            {
            // InternalSiriusTextDsl.g:9382:1: ( '{' )
            // InternalSiriusTextDsl.g:9383:1: '{'
            {
             before(grammarAccess.getPaletteAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPaletteAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Palette__Group__3__Impl"


    // $ANTLR start "rule__Palette__Group__4"
    // InternalSiriusTextDsl.g:9396:1: rule__Palette__Group__4 : rule__Palette__Group__4__Impl rule__Palette__Group__5 ;
    public final void rule__Palette__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9400:1: ( rule__Palette__Group__4__Impl rule__Palette__Group__5 )
            // InternalSiriusTextDsl.g:9401:2: rule__Palette__Group__4__Impl rule__Palette__Group__5
            {
            pushFollow(FOLLOW_63);
            rule__Palette__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Palette__Group__5();

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
    // $ANTLR end "rule__Palette__Group__4"


    // $ANTLR start "rule__Palette__Group__4__Impl"
    // InternalSiriusTextDsl.g:9408:1: rule__Palette__Group__4__Impl : ( ( rule__Palette__ColorsAssignment_4 )* ) ;
    public final void rule__Palette__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9412:1: ( ( ( rule__Palette__ColorsAssignment_4 )* ) )
            // InternalSiriusTextDsl.g:9413:1: ( ( rule__Palette__ColorsAssignment_4 )* )
            {
            // InternalSiriusTextDsl.g:9413:1: ( ( rule__Palette__ColorsAssignment_4 )* )
            // InternalSiriusTextDsl.g:9414:1: ( rule__Palette__ColorsAssignment_4 )*
            {
             before(grammarAccess.getPaletteAccess().getColorsAssignment_4()); 
            // InternalSiriusTextDsl.g:9415:1: ( rule__Palette__ColorsAssignment_4 )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==94) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:9415:2: rule__Palette__ColorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_64);
            	    rule__Palette__ColorsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

             after(grammarAccess.getPaletteAccess().getColorsAssignment_4()); 

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
    // $ANTLR end "rule__Palette__Group__4__Impl"


    // $ANTLR start "rule__Palette__Group__5"
    // InternalSiriusTextDsl.g:9425:1: rule__Palette__Group__5 : rule__Palette__Group__5__Impl ;
    public final void rule__Palette__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9429:1: ( rule__Palette__Group__5__Impl )
            // InternalSiriusTextDsl.g:9430:2: rule__Palette__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Palette__Group__5__Impl();

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
    // $ANTLR end "rule__Palette__Group__5"


    // $ANTLR start "rule__Palette__Group__5__Impl"
    // InternalSiriusTextDsl.g:9436:1: rule__Palette__Group__5__Impl : ( '}' ) ;
    public final void rule__Palette__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9440:1: ( ( '}' ) )
            // InternalSiriusTextDsl.g:9441:1: ( '}' )
            {
            // InternalSiriusTextDsl.g:9441:1: ( '}' )
            // InternalSiriusTextDsl.g:9442:1: '}'
            {
             before(grammarAccess.getPaletteAccess().getRightCurlyBracketKeyword_5()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPaletteAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Palette__Group__5__Impl"


    // $ANTLR start "rule__Color__Group__0"
    // InternalSiriusTextDsl.g:9467:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9471:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalSiriusTextDsl.g:9472:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Color__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__1();

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
    // $ANTLR end "rule__Color__Group__0"


    // $ANTLR start "rule__Color__Group__0__Impl"
    // InternalSiriusTextDsl.g:9479:1: rule__Color__Group__0__Impl : ( 'color' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9483:1: ( ( 'color' ) )
            // InternalSiriusTextDsl.g:9484:1: ( 'color' )
            {
            // InternalSiriusTextDsl.g:9484:1: ( 'color' )
            // InternalSiriusTextDsl.g:9485:1: 'color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_0()); 
            match(input,94,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColorKeyword_0()); 

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
    // $ANTLR end "rule__Color__Group__0__Impl"


    // $ANTLR start "rule__Color__Group__1"
    // InternalSiriusTextDsl.g:9498:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9502:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // InternalSiriusTextDsl.g:9503:2: rule__Color__Group__1__Impl rule__Color__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Color__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__2();

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
    // $ANTLR end "rule__Color__Group__1"


    // $ANTLR start "rule__Color__Group__1__Impl"
    // InternalSiriusTextDsl.g:9510:1: rule__Color__Group__1__Impl : ( ( rule__Color__NameAssignment_1 ) ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9514:1: ( ( ( rule__Color__NameAssignment_1 ) ) )
            // InternalSiriusTextDsl.g:9515:1: ( ( rule__Color__NameAssignment_1 ) )
            {
            // InternalSiriusTextDsl.g:9515:1: ( ( rule__Color__NameAssignment_1 ) )
            // InternalSiriusTextDsl.g:9516:1: ( rule__Color__NameAssignment_1 )
            {
             before(grammarAccess.getColorAccess().getNameAssignment_1()); 
            // InternalSiriusTextDsl.g:9517:1: ( rule__Color__NameAssignment_1 )
            // InternalSiriusTextDsl.g:9517:2: rule__Color__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Color__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Color__Group__1__Impl"


    // $ANTLR start "rule__Color__Group__2"
    // InternalSiriusTextDsl.g:9527:1: rule__Color__Group__2 : rule__Color__Group__2__Impl rule__Color__Group__3 ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9531:1: ( rule__Color__Group__2__Impl rule__Color__Group__3 )
            // InternalSiriusTextDsl.g:9532:2: rule__Color__Group__2__Impl rule__Color__Group__3
            {
            pushFollow(FOLLOW_65);
            rule__Color__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__3();

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
    // $ANTLR end "rule__Color__Group__2"


    // $ANTLR start "rule__Color__Group__2__Impl"
    // InternalSiriusTextDsl.g:9539:1: rule__Color__Group__2__Impl : ( '=' ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9543:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:9544:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:9544:1: ( '=' )
            // InternalSiriusTextDsl.g:9545:1: '='
            {
             before(grammarAccess.getColorAccess().getEqualsSignKeyword_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Color__Group__2__Impl"


    // $ANTLR start "rule__Color__Group__3"
    // InternalSiriusTextDsl.g:9558:1: rule__Color__Group__3 : rule__Color__Group__3__Impl ;
    public final void rule__Color__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9562:1: ( rule__Color__Group__3__Impl )
            // InternalSiriusTextDsl.g:9563:2: rule__Color__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__3__Impl();

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
    // $ANTLR end "rule__Color__Group__3"


    // $ANTLR start "rule__Color__Group__3__Impl"
    // InternalSiriusTextDsl.g:9569:1: rule__Color__Group__3__Impl : ( ( rule__Color__ValueAssignment_3 ) ) ;
    public final void rule__Color__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9573:1: ( ( ( rule__Color__ValueAssignment_3 ) ) )
            // InternalSiriusTextDsl.g:9574:1: ( ( rule__Color__ValueAssignment_3 ) )
            {
            // InternalSiriusTextDsl.g:9574:1: ( ( rule__Color__ValueAssignment_3 ) )
            // InternalSiriusTextDsl.g:9575:1: ( rule__Color__ValueAssignment_3 )
            {
             before(grammarAccess.getColorAccess().getValueAssignment_3()); 
            // InternalSiriusTextDsl.g:9576:1: ( rule__Color__ValueAssignment_3 )
            // InternalSiriusTextDsl.g:9576:2: rule__Color__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Color__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__Color__Group__3__Impl"


    // $ANTLR start "rule__RGB__Group__0"
    // InternalSiriusTextDsl.g:9594:1: rule__RGB__Group__0 : rule__RGB__Group__0__Impl rule__RGB__Group__1 ;
    public final void rule__RGB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9598:1: ( rule__RGB__Group__0__Impl rule__RGB__Group__1 )
            // InternalSiriusTextDsl.g:9599:2: rule__RGB__Group__0__Impl rule__RGB__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__RGB__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RGB__Group__1();

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
    // $ANTLR end "rule__RGB__Group__0"


    // $ANTLR start "rule__RGB__Group__0__Impl"
    // InternalSiriusTextDsl.g:9606:1: rule__RGB__Group__0__Impl : ( 'rgb(' ) ;
    public final void rule__RGB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9610:1: ( ( 'rgb(' ) )
            // InternalSiriusTextDsl.g:9611:1: ( 'rgb(' )
            {
            // InternalSiriusTextDsl.g:9611:1: ( 'rgb(' )
            // InternalSiriusTextDsl.g:9612:1: 'rgb('
            {
             before(grammarAccess.getRGBAccess().getRgbKeyword_0()); 
            match(input,95,FOLLOW_2); 
             after(grammarAccess.getRGBAccess().getRgbKeyword_0()); 

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
    // $ANTLR end "rule__RGB__Group__0__Impl"


    // $ANTLR start "rule__RGB__Group__1"
    // InternalSiriusTextDsl.g:9625:1: rule__RGB__Group__1 : rule__RGB__Group__1__Impl rule__RGB__Group__2 ;
    public final void rule__RGB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9629:1: ( rule__RGB__Group__1__Impl rule__RGB__Group__2 )
            // InternalSiriusTextDsl.g:9630:2: rule__RGB__Group__1__Impl rule__RGB__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__RGB__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RGB__Group__2();

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
    // $ANTLR end "rule__RGB__Group__1"


    // $ANTLR start "rule__RGB__Group__1__Impl"
    // InternalSiriusTextDsl.g:9637:1: rule__RGB__Group__1__Impl : ( ( rule__RGB__RedAssignment_1 ) ) ;
    public final void rule__RGB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9641:1: ( ( ( rule__RGB__RedAssignment_1 ) ) )
            // InternalSiriusTextDsl.g:9642:1: ( ( rule__RGB__RedAssignment_1 ) )
            {
            // InternalSiriusTextDsl.g:9642:1: ( ( rule__RGB__RedAssignment_1 ) )
            // InternalSiriusTextDsl.g:9643:1: ( rule__RGB__RedAssignment_1 )
            {
             before(grammarAccess.getRGBAccess().getRedAssignment_1()); 
            // InternalSiriusTextDsl.g:9644:1: ( rule__RGB__RedAssignment_1 )
            // InternalSiriusTextDsl.g:9644:2: rule__RGB__RedAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RGB__RedAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRGBAccess().getRedAssignment_1()); 

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
    // $ANTLR end "rule__RGB__Group__1__Impl"


    // $ANTLR start "rule__RGB__Group__2"
    // InternalSiriusTextDsl.g:9654:1: rule__RGB__Group__2 : rule__RGB__Group__2__Impl rule__RGB__Group__3 ;
    public final void rule__RGB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9658:1: ( rule__RGB__Group__2__Impl rule__RGB__Group__3 )
            // InternalSiriusTextDsl.g:9659:2: rule__RGB__Group__2__Impl rule__RGB__Group__3
            {
            pushFollow(FOLLOW_50);
            rule__RGB__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RGB__Group__3();

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
    // $ANTLR end "rule__RGB__Group__2"


    // $ANTLR start "rule__RGB__Group__2__Impl"
    // InternalSiriusTextDsl.g:9666:1: rule__RGB__Group__2__Impl : ( ',' ) ;
    public final void rule__RGB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9670:1: ( ( ',' ) )
            // InternalSiriusTextDsl.g:9671:1: ( ',' )
            {
            // InternalSiriusTextDsl.g:9671:1: ( ',' )
            // InternalSiriusTextDsl.g:9672:1: ','
            {
             before(grammarAccess.getRGBAccess().getCommaKeyword_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getRGBAccess().getCommaKeyword_2()); 

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
    // $ANTLR end "rule__RGB__Group__2__Impl"


    // $ANTLR start "rule__RGB__Group__3"
    // InternalSiriusTextDsl.g:9685:1: rule__RGB__Group__3 : rule__RGB__Group__3__Impl rule__RGB__Group__4 ;
    public final void rule__RGB__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9689:1: ( rule__RGB__Group__3__Impl rule__RGB__Group__4 )
            // InternalSiriusTextDsl.g:9690:2: rule__RGB__Group__3__Impl rule__RGB__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__RGB__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RGB__Group__4();

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
    // $ANTLR end "rule__RGB__Group__3"


    // $ANTLR start "rule__RGB__Group__3__Impl"
    // InternalSiriusTextDsl.g:9697:1: rule__RGB__Group__3__Impl : ( ( rule__RGB__GreenAssignment_3 ) ) ;
    public final void rule__RGB__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9701:1: ( ( ( rule__RGB__GreenAssignment_3 ) ) )
            // InternalSiriusTextDsl.g:9702:1: ( ( rule__RGB__GreenAssignment_3 ) )
            {
            // InternalSiriusTextDsl.g:9702:1: ( ( rule__RGB__GreenAssignment_3 ) )
            // InternalSiriusTextDsl.g:9703:1: ( rule__RGB__GreenAssignment_3 )
            {
             before(grammarAccess.getRGBAccess().getGreenAssignment_3()); 
            // InternalSiriusTextDsl.g:9704:1: ( rule__RGB__GreenAssignment_3 )
            // InternalSiriusTextDsl.g:9704:2: rule__RGB__GreenAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RGB__GreenAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRGBAccess().getGreenAssignment_3()); 

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
    // $ANTLR end "rule__RGB__Group__3__Impl"


    // $ANTLR start "rule__RGB__Group__4"
    // InternalSiriusTextDsl.g:9714:1: rule__RGB__Group__4 : rule__RGB__Group__4__Impl rule__RGB__Group__5 ;
    public final void rule__RGB__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9718:1: ( rule__RGB__Group__4__Impl rule__RGB__Group__5 )
            // InternalSiriusTextDsl.g:9719:2: rule__RGB__Group__4__Impl rule__RGB__Group__5
            {
            pushFollow(FOLLOW_50);
            rule__RGB__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RGB__Group__5();

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
    // $ANTLR end "rule__RGB__Group__4"


    // $ANTLR start "rule__RGB__Group__4__Impl"
    // InternalSiriusTextDsl.g:9726:1: rule__RGB__Group__4__Impl : ( ',' ) ;
    public final void rule__RGB__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9730:1: ( ( ',' ) )
            // InternalSiriusTextDsl.g:9731:1: ( ',' )
            {
            // InternalSiriusTextDsl.g:9731:1: ( ',' )
            // InternalSiriusTextDsl.g:9732:1: ','
            {
             before(grammarAccess.getRGBAccess().getCommaKeyword_4()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getRGBAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__RGB__Group__4__Impl"


    // $ANTLR start "rule__RGB__Group__5"
    // InternalSiriusTextDsl.g:9745:1: rule__RGB__Group__5 : rule__RGB__Group__5__Impl rule__RGB__Group__6 ;
    public final void rule__RGB__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9749:1: ( rule__RGB__Group__5__Impl rule__RGB__Group__6 )
            // InternalSiriusTextDsl.g:9750:2: rule__RGB__Group__5__Impl rule__RGB__Group__6
            {
            pushFollow(FOLLOW_66);
            rule__RGB__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RGB__Group__6();

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
    // $ANTLR end "rule__RGB__Group__5"


    // $ANTLR start "rule__RGB__Group__5__Impl"
    // InternalSiriusTextDsl.g:9757:1: rule__RGB__Group__5__Impl : ( ( rule__RGB__BlueAssignment_5 ) ) ;
    public final void rule__RGB__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9761:1: ( ( ( rule__RGB__BlueAssignment_5 ) ) )
            // InternalSiriusTextDsl.g:9762:1: ( ( rule__RGB__BlueAssignment_5 ) )
            {
            // InternalSiriusTextDsl.g:9762:1: ( ( rule__RGB__BlueAssignment_5 ) )
            // InternalSiriusTextDsl.g:9763:1: ( rule__RGB__BlueAssignment_5 )
            {
             before(grammarAccess.getRGBAccess().getBlueAssignment_5()); 
            // InternalSiriusTextDsl.g:9764:1: ( rule__RGB__BlueAssignment_5 )
            // InternalSiriusTextDsl.g:9764:2: rule__RGB__BlueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RGB__BlueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRGBAccess().getBlueAssignment_5()); 

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
    // $ANTLR end "rule__RGB__Group__5__Impl"


    // $ANTLR start "rule__RGB__Group__6"
    // InternalSiriusTextDsl.g:9774:1: rule__RGB__Group__6 : rule__RGB__Group__6__Impl ;
    public final void rule__RGB__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9778:1: ( rule__RGB__Group__6__Impl )
            // InternalSiriusTextDsl.g:9779:2: rule__RGB__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RGB__Group__6__Impl();

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
    // $ANTLR end "rule__RGB__Group__6"


    // $ANTLR start "rule__RGB__Group__6__Impl"
    // InternalSiriusTextDsl.g:9785:1: rule__RGB__Group__6__Impl : ( ')' ) ;
    public final void rule__RGB__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9789:1: ( ( ')' ) )
            // InternalSiriusTextDsl.g:9790:1: ( ')' )
            {
            // InternalSiriusTextDsl.g:9790:1: ( ')' )
            // InternalSiriusTextDsl.g:9791:1: ')'
            {
             before(grammarAccess.getRGBAccess().getRightParenthesisKeyword_6()); 
            match(input,96,FOLLOW_2); 
             after(grammarAccess.getRGBAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__RGB__Group__6__Impl"


    // $ANTLR start "rule__SiriusFile__DocumentationAssignment_0"
    // InternalSiriusTextDsl.g:9819:1: rule__SiriusFile__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__SiriusFile__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9823:1: ( ( RULE_DOCUMENTATION ) )
            // InternalSiriusTextDsl.g:9824:1: ( RULE_DOCUMENTATION )
            {
            // InternalSiriusTextDsl.g:9824:1: ( RULE_DOCUMENTATION )
            // InternalSiriusTextDsl.g:9825:1: RULE_DOCUMENTATION
            {
             before(grammarAccess.getSiriusFileAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
            match(input,RULE_DOCUMENTATION,FOLLOW_2); 
             after(grammarAccess.getSiriusFileAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__SiriusFile__DocumentationAssignment_0"


    // $ANTLR start "rule__SiriusFile__NameAssignment_2"
    // InternalSiriusTextDsl.g:9834:1: rule__SiriusFile__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__SiriusFile__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9838:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:9839:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:9839:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:9840:1: ruleQualifiedName
            {
             before(grammarAccess.getSiriusFileAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSiriusFileAccess().getNameQualifiedNameParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SiriusFile__NameAssignment_2"


    // $ANTLR start "rule__SiriusFile__ImportsAssignment_3"
    // InternalSiriusTextDsl.g:9849:1: rule__SiriusFile__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__SiriusFile__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9853:1: ( ( ruleImport ) )
            // InternalSiriusTextDsl.g:9854:1: ( ruleImport )
            {
            // InternalSiriusTextDsl.g:9854:1: ( ruleImport )
            // InternalSiriusTextDsl.g:9855:1: ruleImport
            {
             before(grammarAccess.getSiriusFileAccess().getImportsImportParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getSiriusFileAccess().getImportsImportParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SiriusFile__ImportsAssignment_3"


    // $ANTLR start "rule__SiriusFile__BodyAssignment_4"
    // InternalSiriusTextDsl.g:9864:1: rule__SiriusFile__BodyAssignment_4 : ( ruleSiriusFileBody ) ;
    public final void rule__SiriusFile__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9868:1: ( ( ruleSiriusFileBody ) )
            // InternalSiriusTextDsl.g:9869:1: ( ruleSiriusFileBody )
            {
            // InternalSiriusTextDsl.g:9869:1: ( ruleSiriusFileBody )
            // InternalSiriusTextDsl.g:9870:1: ruleSiriusFileBody
            {
             before(grammarAccess.getSiriusFileAccess().getBodySiriusFileBodyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSiriusFileBody();

            state._fsp--;

             after(grammarAccess.getSiriusFileAccess().getBodySiriusFileBodyParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SiriusFile__BodyAssignment_4"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalSiriusTextDsl.g:9879:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9883:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalSiriusTextDsl.g:9884:1: ( ruleQualifiedNameWithWildcard )
            {
            // InternalSiriusTextDsl.g:9884:1: ( ruleQualifiedNameWithWildcard )
            // InternalSiriusTextDsl.g:9885:1: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Designer__DocumentationAssignment_0"
    // InternalSiriusTextDsl.g:9894:1: rule__Designer__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__Designer__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9898:1: ( ( RULE_DOCUMENTATION ) )
            // InternalSiriusTextDsl.g:9899:1: ( RULE_DOCUMENTATION )
            {
            // InternalSiriusTextDsl.g:9899:1: ( RULE_DOCUMENTATION )
            // InternalSiriusTextDsl.g:9900:1: RULE_DOCUMENTATION
            {
             before(grammarAccess.getDesignerAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
            match(input,RULE_DOCUMENTATION,FOLLOW_2); 
             after(grammarAccess.getDesignerAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Designer__DocumentationAssignment_0"


    // $ANTLR start "rule__Designer__NameAssignment_2"
    // InternalSiriusTextDsl.g:9909:1: rule__Designer__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Designer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9913:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:9914:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:9914:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:9915:1: RULE_ID
            {
             before(grammarAccess.getDesignerAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDesignerAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Designer__NameAssignment_2"


    // $ANTLR start "rule__Designer__LabelAssignment_3_1"
    // InternalSiriusTextDsl.g:9924:1: rule__Designer__LabelAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Designer__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9928:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:9929:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:9929:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:9930:1: RULE_STRING
            {
             before(grammarAccess.getDesignerAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDesignerAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Designer__LabelAssignment_3_1"


    // $ANTLR start "rule__Designer__ViewpointsAssignment_5"
    // InternalSiriusTextDsl.g:9939:1: rule__Designer__ViewpointsAssignment_5 : ( ruleViewpoint ) ;
    public final void rule__Designer__ViewpointsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9943:1: ( ( ruleViewpoint ) )
            // InternalSiriusTextDsl.g:9944:1: ( ruleViewpoint )
            {
            // InternalSiriusTextDsl.g:9944:1: ( ruleViewpoint )
            // InternalSiriusTextDsl.g:9945:1: ruleViewpoint
            {
             before(grammarAccess.getDesignerAccess().getViewpointsViewpointParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleViewpoint();

            state._fsp--;

             after(grammarAccess.getDesignerAccess().getViewpointsViewpointParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Designer__ViewpointsAssignment_5"


    // $ANTLR start "rule__Viewpoint__DocumentationAssignment_0"
    // InternalSiriusTextDsl.g:9954:1: rule__Viewpoint__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__Viewpoint__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9958:1: ( ( RULE_DOCUMENTATION ) )
            // InternalSiriusTextDsl.g:9959:1: ( RULE_DOCUMENTATION )
            {
            // InternalSiriusTextDsl.g:9959:1: ( RULE_DOCUMENTATION )
            // InternalSiriusTextDsl.g:9960:1: RULE_DOCUMENTATION
            {
             before(grammarAccess.getViewpointAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
            match(input,RULE_DOCUMENTATION,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Viewpoint__DocumentationAssignment_0"


    // $ANTLR start "rule__Viewpoint__NameAssignment_2"
    // InternalSiriusTextDsl.g:9969:1: rule__Viewpoint__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Viewpoint__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9973:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:9974:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:9974:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:9975:1: RULE_ID
            {
             before(grammarAccess.getViewpointAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Viewpoint__NameAssignment_2"


    // $ANTLR start "rule__Viewpoint__LabelAssignment_3_1"
    // InternalSiriusTextDsl.g:9984:1: rule__Viewpoint__LabelAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Viewpoint__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:9988:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:9989:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:9989:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:9990:1: RULE_STRING
            {
             before(grammarAccess.getViewpointAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Viewpoint__LabelAssignment_3_1"


    // $ANTLR start "rule__Viewpoint__ModelFileExtensionsAssignment_5_3"
    // InternalSiriusTextDsl.g:9999:1: rule__Viewpoint__ModelFileExtensionsAssignment_5_3 : ( RULE_STRING ) ;
    public final void rule__Viewpoint__ModelFileExtensionsAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10003:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:10004:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:10004:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:10005:1: RULE_STRING
            {
             before(grammarAccess.getViewpointAccess().getModelFileExtensionsSTRINGTerminalRuleCall_5_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getModelFileExtensionsSTRINGTerminalRuleCall_5_3_0()); 

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
    // $ANTLR end "rule__Viewpoint__ModelFileExtensionsAssignment_5_3"


    // $ANTLR start "rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1"
    // InternalSiriusTextDsl.g:10014:1: rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1 : ( RULE_STRING ) ;
    public final void rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10018:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:10019:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:10019:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:10020:1: RULE_STRING
            {
             before(grammarAccess.getViewpointAccess().getModelFileExtensionsSTRINGTerminalRuleCall_5_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getModelFileExtensionsSTRINGTerminalRuleCall_5_4_1_0()); 

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
    // $ANTLR end "rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1"


    // $ANTLR start "rule__Viewpoint__IconAssignment_6_2"
    // InternalSiriusTextDsl.g:10029:1: rule__Viewpoint__IconAssignment_6_2 : ( RULE_STRING ) ;
    public final void rule__Viewpoint__IconAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10033:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:10034:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:10034:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:10035:1: RULE_STRING
            {
             before(grammarAccess.getViewpointAccess().getIconSTRINGTerminalRuleCall_6_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getIconSTRINGTerminalRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__Viewpoint__IconAssignment_6_2"


    // $ANTLR start "rule__Viewpoint__RepresentationsAssignment_7_3_0"
    // InternalSiriusTextDsl.g:10044:1: rule__Viewpoint__RepresentationsAssignment_7_3_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Viewpoint__RepresentationsAssignment_7_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10048:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:10049:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:10049:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:10050:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getViewpointAccess().getRepresentationsRepresentationCrossReference_7_3_0_0()); 
            // InternalSiriusTextDsl.g:10051:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:10052:1: ruleQualifiedName
            {
             before(grammarAccess.getViewpointAccess().getRepresentationsRepresentationQualifiedNameParserRuleCall_7_3_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getViewpointAccess().getRepresentationsRepresentationQualifiedNameParserRuleCall_7_3_0_0_1()); 

            }

             after(grammarAccess.getViewpointAccess().getRepresentationsRepresentationCrossReference_7_3_0_0()); 

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
    // $ANTLR end "rule__Viewpoint__RepresentationsAssignment_7_3_0"


    // $ANTLR start "rule__Viewpoint__RepresentationsAssignment_7_3_1_1"
    // InternalSiriusTextDsl.g:10063:1: rule__Viewpoint__RepresentationsAssignment_7_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Viewpoint__RepresentationsAssignment_7_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10067:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:10068:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:10068:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:10069:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getViewpointAccess().getRepresentationsRepresentationCrossReference_7_3_1_1_0()); 
            // InternalSiriusTextDsl.g:10070:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:10071:1: ruleQualifiedName
            {
             before(grammarAccess.getViewpointAccess().getRepresentationsRepresentationQualifiedNameParserRuleCall_7_3_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getViewpointAccess().getRepresentationsRepresentationQualifiedNameParserRuleCall_7_3_1_1_0_1()); 

            }

             after(grammarAccess.getViewpointAccess().getRepresentationsRepresentationCrossReference_7_3_1_1_0()); 

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
    // $ANTLR end "rule__Viewpoint__RepresentationsAssignment_7_3_1_1"


    // $ANTLR start "rule__Diagram__DocumentationAssignment_0"
    // InternalSiriusTextDsl.g:10082:1: rule__Diagram__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__Diagram__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10086:1: ( ( RULE_DOCUMENTATION ) )
            // InternalSiriusTextDsl.g:10087:1: ( RULE_DOCUMENTATION )
            {
            // InternalSiriusTextDsl.g:10087:1: ( RULE_DOCUMENTATION )
            // InternalSiriusTextDsl.g:10088:1: RULE_DOCUMENTATION
            {
             before(grammarAccess.getDiagramAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
            match(input,RULE_DOCUMENTATION,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Diagram__DocumentationAssignment_0"


    // $ANTLR start "rule__Diagram__InitializedAssignment_1"
    // InternalSiriusTextDsl.g:10097:1: rule__Diagram__InitializedAssignment_1 : ( ( '@Initialized' ) ) ;
    public final void rule__Diagram__InitializedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10101:1: ( ( ( '@Initialized' ) ) )
            // InternalSiriusTextDsl.g:10102:1: ( ( '@Initialized' ) )
            {
            // InternalSiriusTextDsl.g:10102:1: ( ( '@Initialized' ) )
            // InternalSiriusTextDsl.g:10103:1: ( '@Initialized' )
            {
             before(grammarAccess.getDiagramAccess().getInitializedInitializedKeyword_1_0()); 
            // InternalSiriusTextDsl.g:10104:1: ( '@Initialized' )
            // InternalSiriusTextDsl.g:10105:1: '@Initialized'
            {
             before(grammarAccess.getDiagramAccess().getInitializedInitializedKeyword_1_0()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getInitializedInitializedKeyword_1_0()); 

            }

             after(grammarAccess.getDiagramAccess().getInitializedInitializedKeyword_1_0()); 

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
    // $ANTLR end "rule__Diagram__InitializedAssignment_1"


    // $ANTLR start "rule__Diagram__ShowOnStartupAssignment_2"
    // InternalSiriusTextDsl.g:10120:1: rule__Diagram__ShowOnStartupAssignment_2 : ( ( '@ShowOnStartup' ) ) ;
    public final void rule__Diagram__ShowOnStartupAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10124:1: ( ( ( '@ShowOnStartup' ) ) )
            // InternalSiriusTextDsl.g:10125:1: ( ( '@ShowOnStartup' ) )
            {
            // InternalSiriusTextDsl.g:10125:1: ( ( '@ShowOnStartup' ) )
            // InternalSiriusTextDsl.g:10126:1: ( '@ShowOnStartup' )
            {
             before(grammarAccess.getDiagramAccess().getShowOnStartupShowOnStartupKeyword_2_0()); 
            // InternalSiriusTextDsl.g:10127:1: ( '@ShowOnStartup' )
            // InternalSiriusTextDsl.g:10128:1: '@ShowOnStartup'
            {
             before(grammarAccess.getDiagramAccess().getShowOnStartupShowOnStartupKeyword_2_0()); 
            match(input,98,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getShowOnStartupShowOnStartupKeyword_2_0()); 

            }

             after(grammarAccess.getDiagramAccess().getShowOnStartupShowOnStartupKeyword_2_0()); 

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
    // $ANTLR end "rule__Diagram__ShowOnStartupAssignment_2"


    // $ANTLR start "rule__Diagram__EnablePopupBarsAssignment_3"
    // InternalSiriusTextDsl.g:10143:1: rule__Diagram__EnablePopupBarsAssignment_3 : ( ( '@EnablePopupBars' ) ) ;
    public final void rule__Diagram__EnablePopupBarsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10147:1: ( ( ( '@EnablePopupBars' ) ) )
            // InternalSiriusTextDsl.g:10148:1: ( ( '@EnablePopupBars' ) )
            {
            // InternalSiriusTextDsl.g:10148:1: ( ( '@EnablePopupBars' ) )
            // InternalSiriusTextDsl.g:10149:1: ( '@EnablePopupBars' )
            {
             before(grammarAccess.getDiagramAccess().getEnablePopupBarsEnablePopupBarsKeyword_3_0()); 
            // InternalSiriusTextDsl.g:10150:1: ( '@EnablePopupBars' )
            // InternalSiriusTextDsl.g:10151:1: '@EnablePopupBars'
            {
             before(grammarAccess.getDiagramAccess().getEnablePopupBarsEnablePopupBarsKeyword_3_0()); 
            match(input,99,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getEnablePopupBarsEnablePopupBarsKeyword_3_0()); 

            }

             after(grammarAccess.getDiagramAccess().getEnablePopupBarsEnablePopupBarsKeyword_3_0()); 

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
    // $ANTLR end "rule__Diagram__EnablePopupBarsAssignment_3"


    // $ANTLR start "rule__Diagram__MetamodelUrisAssignment_6"
    // InternalSiriusTextDsl.g:10166:1: rule__Diagram__MetamodelUrisAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Diagram__MetamodelUrisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10170:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:10171:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:10171:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:10172:1: RULE_STRING
            {
             before(grammarAccess.getDiagramAccess().getMetamodelUrisSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getMetamodelUrisSTRINGTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Diagram__MetamodelUrisAssignment_6"


    // $ANTLR start "rule__Diagram__MetamodelUrisAssignment_7_1"
    // InternalSiriusTextDsl.g:10181:1: rule__Diagram__MetamodelUrisAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Diagram__MetamodelUrisAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10185:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:10186:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:10186:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:10187:1: RULE_STRING
            {
             before(grammarAccess.getDiagramAccess().getMetamodelUrisSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getMetamodelUrisSTRINGTerminalRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Diagram__MetamodelUrisAssignment_7_1"


    // $ANTLR start "rule__Diagram__NameAssignment_10"
    // InternalSiriusTextDsl.g:10196:1: rule__Diagram__NameAssignment_10 : ( RULE_ID ) ;
    public final void rule__Diagram__NameAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10200:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:10201:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:10201:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:10202:1: RULE_ID
            {
             before(grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_10_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_10_0()); 

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
    // $ANTLR end "rule__Diagram__NameAssignment_10"


    // $ANTLR start "rule__Diagram__LabelAssignment_11_1"
    // InternalSiriusTextDsl.g:10211:1: rule__Diagram__LabelAssignment_11_1 : ( RULE_STRING ) ;
    public final void rule__Diagram__LabelAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10215:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:10216:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:10216:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:10217:1: RULE_STRING
            {
             before(grammarAccess.getDiagramAccess().getLabelSTRINGTerminalRuleCall_11_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getLabelSTRINGTerminalRuleCall_11_1_0()); 

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
    // $ANTLR end "rule__Diagram__LabelAssignment_11_1"


    // $ANTLR start "rule__Diagram__DomainClassAssignment_13"
    // InternalSiriusTextDsl.g:10226:1: rule__Diagram__DomainClassAssignment_13 : ( RULE_STRING ) ;
    public final void rule__Diagram__DomainClassAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10230:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:10231:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:10231:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:10232:1: RULE_STRING
            {
             before(grammarAccess.getDiagramAccess().getDomainClassSTRINGTerminalRuleCall_13_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getDomainClassSTRINGTerminalRuleCall_13_0()); 

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
    // $ANTLR end "rule__Diagram__DomainClassAssignment_13"


    // $ANTLR start "rule__Diagram__PreconditionAssignment_14_1"
    // InternalSiriusTextDsl.g:10241:1: rule__Diagram__PreconditionAssignment_14_1 : ( RULE_EXPRESSION ) ;
    public final void rule__Diagram__PreconditionAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10245:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:10246:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:10246:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:10247:1: RULE_EXPRESSION
            {
             before(grammarAccess.getDiagramAccess().getPreconditionEXPRESSIONTerminalRuleCall_14_1_0()); 
            match(input,RULE_EXPRESSION,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getPreconditionEXPRESSIONTerminalRuleCall_14_1_0()); 

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
    // $ANTLR end "rule__Diagram__PreconditionAssignment_14_1"


    // $ANTLR start "rule__Diagram__EndUserDocumentationAssignment_16_2"
    // InternalSiriusTextDsl.g:10256:1: rule__Diagram__EndUserDocumentationAssignment_16_2 : ( RULE_STRING ) ;
    public final void rule__Diagram__EndUserDocumentationAssignment_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10260:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:10261:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:10261:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:10262:1: RULE_STRING
            {
             before(grammarAccess.getDiagramAccess().getEndUserDocumentationSTRINGTerminalRuleCall_16_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getEndUserDocumentationSTRINGTerminalRuleCall_16_2_0()); 

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
    // $ANTLR end "rule__Diagram__EndUserDocumentationAssignment_16_2"


    // $ANTLR start "rule__Diagram__TitleExpressionAssignment_17_2"
    // InternalSiriusTextDsl.g:10271:1: rule__Diagram__TitleExpressionAssignment_17_2 : ( RULE_EXPRESSION ) ;
    public final void rule__Diagram__TitleExpressionAssignment_17_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10275:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:10276:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:10276:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:10277:1: RULE_EXPRESSION
            {
             before(grammarAccess.getDiagramAccess().getTitleExpressionEXPRESSIONTerminalRuleCall_17_2_0()); 
            match(input,RULE_EXPRESSION,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getTitleExpressionEXPRESSIONTerminalRuleCall_17_2_0()); 

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
    // $ANTLR end "rule__Diagram__TitleExpressionAssignment_17_2"


    // $ANTLR start "rule__Diagram__RootExpressionAssignment_18_2"
    // InternalSiriusTextDsl.g:10286:1: rule__Diagram__RootExpressionAssignment_18_2 : ( RULE_EXPRESSION ) ;
    public final void rule__Diagram__RootExpressionAssignment_18_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10290:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:10291:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:10291:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:10292:1: RULE_EXPRESSION
            {
             before(grammarAccess.getDiagramAccess().getRootExpressionEXPRESSIONTerminalRuleCall_18_2_0()); 
            match(input,RULE_EXPRESSION,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getRootExpressionEXPRESSIONTerminalRuleCall_18_2_0()); 

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
    // $ANTLR end "rule__Diagram__RootExpressionAssignment_18_2"


    // $ANTLR start "rule__Diagram__DefaultLayerAssignment_19_2"
    // InternalSiriusTextDsl.g:10301:1: rule__Diagram__DefaultLayerAssignment_19_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Diagram__DefaultLayerAssignment_19_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10305:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:10306:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:10306:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:10307:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getDiagramAccess().getDefaultLayerLayerCrossReference_19_2_0()); 
            // InternalSiriusTextDsl.g:10308:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:10309:1: ruleQualifiedName
            {
             before(grammarAccess.getDiagramAccess().getDefaultLayerLayerQualifiedNameParserRuleCall_19_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDiagramAccess().getDefaultLayerLayerQualifiedNameParserRuleCall_19_2_0_1()); 

            }

             after(grammarAccess.getDiagramAccess().getDefaultLayerLayerCrossReference_19_2_0()); 

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
    // $ANTLR end "rule__Diagram__DefaultLayerAssignment_19_2"


    // $ANTLR start "rule__Diagram__AdditionalLayersAssignment_20_3_0"
    // InternalSiriusTextDsl.g:10320:1: rule__Diagram__AdditionalLayersAssignment_20_3_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Diagram__AdditionalLayersAssignment_20_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10324:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:10325:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:10325:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:10326:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getDiagramAccess().getAdditionalLayersLayerCrossReference_20_3_0_0()); 
            // InternalSiriusTextDsl.g:10327:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:10328:1: ruleQualifiedName
            {
             before(grammarAccess.getDiagramAccess().getAdditionalLayersLayerQualifiedNameParserRuleCall_20_3_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDiagramAccess().getAdditionalLayersLayerQualifiedNameParserRuleCall_20_3_0_0_1()); 

            }

             after(grammarAccess.getDiagramAccess().getAdditionalLayersLayerCrossReference_20_3_0_0()); 

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
    // $ANTLR end "rule__Diagram__AdditionalLayersAssignment_20_3_0"


    // $ANTLR start "rule__Diagram__AdditionalLayersAssignment_20_3_1_1"
    // InternalSiriusTextDsl.g:10339:1: rule__Diagram__AdditionalLayersAssignment_20_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Diagram__AdditionalLayersAssignment_20_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10343:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:10344:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:10344:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:10345:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getDiagramAccess().getAdditionalLayersLayerCrossReference_20_3_1_1_0()); 
            // InternalSiriusTextDsl.g:10346:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:10347:1: ruleQualifiedName
            {
             before(grammarAccess.getDiagramAccess().getAdditionalLayersLayerQualifiedNameParserRuleCall_20_3_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDiagramAccess().getAdditionalLayersLayerQualifiedNameParserRuleCall_20_3_1_1_0_1()); 

            }

             after(grammarAccess.getDiagramAccess().getAdditionalLayersLayerCrossReference_20_3_1_1_0()); 

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
    // $ANTLR end "rule__Diagram__AdditionalLayersAssignment_20_3_1_1"


    // $ANTLR start "rule__Layer__DocumentationAssignment_0"
    // InternalSiriusTextDsl.g:10358:1: rule__Layer__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__Layer__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10362:1: ( ( RULE_DOCUMENTATION ) )
            // InternalSiriusTextDsl.g:10363:1: ( RULE_DOCUMENTATION )
            {
            // InternalSiriusTextDsl.g:10363:1: ( RULE_DOCUMENTATION )
            // InternalSiriusTextDsl.g:10364:1: RULE_DOCUMENTATION
            {
             before(grammarAccess.getLayerAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
            match(input,RULE_DOCUMENTATION,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Layer__DocumentationAssignment_0"


    // $ANTLR start "rule__Layer__NameAssignment_2"
    // InternalSiriusTextDsl.g:10373:1: rule__Layer__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Layer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10377:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:10378:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:10378:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:10379:1: RULE_ID
            {
             before(grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Layer__NameAssignment_2"


    // $ANTLR start "rule__Layer__IconAssignment_4_2"
    // InternalSiriusTextDsl.g:10388:1: rule__Layer__IconAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Layer__IconAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10392:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:10393:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:10393:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:10394:1: RULE_STRING
            {
             before(grammarAccess.getLayerAccess().getIconSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getIconSTRINGTerminalRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Layer__IconAssignment_4_2"


    // $ANTLR start "rule__Layer__MappingsAssignment_8_0"
    // InternalSiriusTextDsl.g:10403:1: rule__Layer__MappingsAssignment_8_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Layer__MappingsAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10407:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:10408:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:10408:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:10409:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getLayerAccess().getMappingsMappingCrossReference_8_0_0()); 
            // InternalSiriusTextDsl.g:10410:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:10411:1: ruleQualifiedName
            {
             before(grammarAccess.getLayerAccess().getMappingsMappingQualifiedNameParserRuleCall_8_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getLayerAccess().getMappingsMappingQualifiedNameParserRuleCall_8_0_0_1()); 

            }

             after(grammarAccess.getLayerAccess().getMappingsMappingCrossReference_8_0_0()); 

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
    // $ANTLR end "rule__Layer__MappingsAssignment_8_0"


    // $ANTLR start "rule__Layer__MappingsAssignment_8_1_1"
    // InternalSiriusTextDsl.g:10422:1: rule__Layer__MappingsAssignment_8_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Layer__MappingsAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10426:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:10427:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:10427:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:10428:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getLayerAccess().getMappingsMappingCrossReference_8_1_1_0()); 
            // InternalSiriusTextDsl.g:10429:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:10430:1: ruleQualifiedName
            {
             before(grammarAccess.getLayerAccess().getMappingsMappingQualifiedNameParserRuleCall_8_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getLayerAccess().getMappingsMappingQualifiedNameParserRuleCall_8_1_1_0_1()); 

            }

             after(grammarAccess.getLayerAccess().getMappingsMappingCrossReference_8_1_1_0()); 

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
    // $ANTLR end "rule__Layer__MappingsAssignment_8_1_1"


    // $ANTLR start "rule__Layer__EdgesAssignment_13_0"
    // InternalSiriusTextDsl.g:10441:1: rule__Layer__EdgesAssignment_13_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Layer__EdgesAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10445:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:10446:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:10446:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:10447:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getLayerAccess().getEdgesEdgeCrossReference_13_0_0()); 
            // InternalSiriusTextDsl.g:10448:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:10449:1: ruleQualifiedName
            {
             before(grammarAccess.getLayerAccess().getEdgesEdgeQualifiedNameParserRuleCall_13_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getLayerAccess().getEdgesEdgeQualifiedNameParserRuleCall_13_0_0_1()); 

            }

             after(grammarAccess.getLayerAccess().getEdgesEdgeCrossReference_13_0_0()); 

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
    // $ANTLR end "rule__Layer__EdgesAssignment_13_0"


    // $ANTLR start "rule__Layer__EdgesAssignment_13_1_1"
    // InternalSiriusTextDsl.g:10460:1: rule__Layer__EdgesAssignment_13_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Layer__EdgesAssignment_13_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10464:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:10465:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:10465:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:10466:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getLayerAccess().getEdgesEdgeCrossReference_13_1_1_0()); 
            // InternalSiriusTextDsl.g:10467:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:10468:1: ruleQualifiedName
            {
             before(grammarAccess.getLayerAccess().getEdgesEdgeQualifiedNameParserRuleCall_13_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getLayerAccess().getEdgesEdgeQualifiedNameParserRuleCall_13_1_1_0_1()); 

            }

             after(grammarAccess.getLayerAccess().getEdgesEdgeCrossReference_13_1_1_0()); 

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
    // $ANTLR end "rule__Layer__EdgesAssignment_13_1_1"


    // $ANTLR start "rule__Container__DocumentationAssignment_0"
    // InternalSiriusTextDsl.g:10479:1: rule__Container__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__Container__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10483:1: ( ( RULE_DOCUMENTATION ) )
            // InternalSiriusTextDsl.g:10484:1: ( RULE_DOCUMENTATION )
            {
            // InternalSiriusTextDsl.g:10484:1: ( RULE_DOCUMENTATION )
            // InternalSiriusTextDsl.g:10485:1: RULE_DOCUMENTATION
            {
             before(grammarAccess.getContainerAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
            match(input,RULE_DOCUMENTATION,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Container__DocumentationAssignment_0"


    // $ANTLR start "rule__Container__ListAssignment_1"
    // InternalSiriusTextDsl.g:10494:1: rule__Container__ListAssignment_1 : ( ( 'list' ) ) ;
    public final void rule__Container__ListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10498:1: ( ( ( 'list' ) ) )
            // InternalSiriusTextDsl.g:10499:1: ( ( 'list' ) )
            {
            // InternalSiriusTextDsl.g:10499:1: ( ( 'list' ) )
            // InternalSiriusTextDsl.g:10500:1: ( 'list' )
            {
             before(grammarAccess.getContainerAccess().getListListKeyword_1_0()); 
            // InternalSiriusTextDsl.g:10501:1: ( 'list' )
            // InternalSiriusTextDsl.g:10502:1: 'list'
            {
             before(grammarAccess.getContainerAccess().getListListKeyword_1_0()); 
            match(input,100,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getListListKeyword_1_0()); 

            }

             after(grammarAccess.getContainerAccess().getListListKeyword_1_0()); 

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
    // $ANTLR end "rule__Container__ListAssignment_1"


    // $ANTLR start "rule__Container__NameAssignment_3"
    // InternalSiriusTextDsl.g:10517:1: rule__Container__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Container__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10521:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:10522:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:10522:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:10523:1: RULE_ID
            {
             before(grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Container__NameAssignment_3"


    // $ANTLR start "rule__Container__LabelAssignment_4_1"
    // InternalSiriusTextDsl.g:10532:1: rule__Container__LabelAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Container__LabelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10536:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:10537:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:10537:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:10538:1: RULE_STRING
            {
             before(grammarAccess.getContainerAccess().getLabelSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getLabelSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Container__LabelAssignment_4_1"


    // $ANTLR start "rule__Container__DomainClassAssignment_6"
    // InternalSiriusTextDsl.g:10547:1: rule__Container__DomainClassAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Container__DomainClassAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10551:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:10552:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:10552:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:10553:1: RULE_STRING
            {
             before(grammarAccess.getContainerAccess().getDomainClassSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getDomainClassSTRINGTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Container__DomainClassAssignment_6"


    // $ANTLR start "rule__Container__StyleAssignment_8"
    // InternalSiriusTextDsl.g:10562:1: rule__Container__StyleAssignment_8 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Container__StyleAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10566:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:10567:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:10567:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:10568:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getContainerAccess().getStyleContainerStyleCrossReference_8_0()); 
            // InternalSiriusTextDsl.g:10569:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:10570:1: ruleQualifiedName
            {
             before(grammarAccess.getContainerAccess().getStyleContainerStyleQualifiedNameParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getStyleContainerStyleQualifiedNameParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getContainerAccess().getStyleContainerStyleCrossReference_8_0()); 

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
    // $ANTLR end "rule__Container__StyleAssignment_8"


    // $ANTLR start "rule__Container__PreconditionAssignment_9_1"
    // InternalSiriusTextDsl.g:10581:1: rule__Container__PreconditionAssignment_9_1 : ( RULE_EXPRESSION ) ;
    public final void rule__Container__PreconditionAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10585:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:10586:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:10586:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:10587:1: RULE_EXPRESSION
            {
             before(grammarAccess.getContainerAccess().getPreconditionEXPRESSIONTerminalRuleCall_9_1_0()); 
            match(input,RULE_EXPRESSION,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getPreconditionEXPRESSIONTerminalRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Container__PreconditionAssignment_9_1"


    // $ANTLR start "rule__Container__SemanticCanditatesExpressionAssignment_11_2"
    // InternalSiriusTextDsl.g:10596:1: rule__Container__SemanticCanditatesExpressionAssignment_11_2 : ( RULE_EXPRESSION ) ;
    public final void rule__Container__SemanticCanditatesExpressionAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10600:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:10601:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:10601:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:10602:1: RULE_EXPRESSION
            {
             before(grammarAccess.getContainerAccess().getSemanticCanditatesExpressionEXPRESSIONTerminalRuleCall_11_2_0()); 
            match(input,RULE_EXPRESSION,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getSemanticCanditatesExpressionEXPRESSIONTerminalRuleCall_11_2_0()); 

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
    // $ANTLR end "rule__Container__SemanticCanditatesExpressionAssignment_11_2"


    // $ANTLR start "rule__Container__ConditionalStylesAssignment_12"
    // InternalSiriusTextDsl.g:10611:1: rule__Container__ConditionalStylesAssignment_12 : ( ruleConditionalContainerStyleDeclaration ) ;
    public final void rule__Container__ConditionalStylesAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10615:1: ( ( ruleConditionalContainerStyleDeclaration ) )
            // InternalSiriusTextDsl.g:10616:1: ( ruleConditionalContainerStyleDeclaration )
            {
            // InternalSiriusTextDsl.g:10616:1: ( ruleConditionalContainerStyleDeclaration )
            // InternalSiriusTextDsl.g:10617:1: ruleConditionalContainerStyleDeclaration
            {
             before(grammarAccess.getContainerAccess().getConditionalStylesConditionalContainerStyleDeclarationParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalContainerStyleDeclaration();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getConditionalStylesConditionalContainerStyleDeclarationParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__Container__ConditionalStylesAssignment_12"


    // $ANTLR start "rule__ConditionalContainerStyleDeclaration__StyleAssignment_1"
    // InternalSiriusTextDsl.g:10626:1: rule__ConditionalContainerStyleDeclaration__StyleAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ConditionalContainerStyleDeclaration__StyleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10630:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:10631:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:10631:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:10632:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleContainerStyleCrossReference_1_0()); 
            // InternalSiriusTextDsl.g:10633:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:10634:1: ruleQualifiedName
            {
             before(grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleContainerStyleQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleContainerStyleQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleContainerStyleCrossReference_1_0()); 

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
    // $ANTLR end "rule__ConditionalContainerStyleDeclaration__StyleAssignment_1"


    // $ANTLR start "rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3"
    // InternalSiriusTextDsl.g:10645:1: rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3 : ( RULE_EXPRESSION ) ;
    public final void rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10649:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:10650:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:10650:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:10651:1: RULE_EXPRESSION
            {
             before(grammarAccess.getConditionalContainerStyleDeclarationAccess().getConditionalStyleExpressionEXPRESSIONTerminalRuleCall_3_0()); 
            match(input,RULE_EXPRESSION,FOLLOW_2); 
             after(grammarAccess.getConditionalContainerStyleDeclarationAccess().getConditionalStyleExpressionEXPRESSIONTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3"


    // $ANTLR start "rule__Gradient__DocumentationAssignment_0"
    // InternalSiriusTextDsl.g:10660:1: rule__Gradient__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__Gradient__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10664:1: ( ( RULE_DOCUMENTATION ) )
            // InternalSiriusTextDsl.g:10665:1: ( RULE_DOCUMENTATION )
            {
            // InternalSiriusTextDsl.g:10665:1: ( RULE_DOCUMENTATION )
            // InternalSiriusTextDsl.g:10666:1: RULE_DOCUMENTATION
            {
             before(grammarAccess.getGradientAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
            match(input,RULE_DOCUMENTATION,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Gradient__DocumentationAssignment_0"


    // $ANTLR start "rule__Gradient__DirectionAssignment_2"
    // InternalSiriusTextDsl.g:10675:1: rule__Gradient__DirectionAssignment_2 : ( ruleGradientDirection ) ;
    public final void rule__Gradient__DirectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10679:1: ( ( ruleGradientDirection ) )
            // InternalSiriusTextDsl.g:10680:1: ( ruleGradientDirection )
            {
            // InternalSiriusTextDsl.g:10680:1: ( ruleGradientDirection )
            // InternalSiriusTextDsl.g:10681:1: ruleGradientDirection
            {
             before(grammarAccess.getGradientAccess().getDirectionGradientDirectionEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGradientDirection();

            state._fsp--;

             after(grammarAccess.getGradientAccess().getDirectionGradientDirectionEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Gradient__DirectionAssignment_2"


    // $ANTLR start "rule__Gradient__NameAssignment_3"
    // InternalSiriusTextDsl.g:10690:1: rule__Gradient__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Gradient__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10694:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:10695:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:10695:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:10696:1: RULE_ID
            {
             before(grammarAccess.getGradientAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Gradient__NameAssignment_3"


    // $ANTLR start "rule__Gradient__BackgroundColorAssignment_5"
    // InternalSiriusTextDsl.g:10705:1: rule__Gradient__BackgroundColorAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Gradient__BackgroundColorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10709:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:10710:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:10710:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:10711:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getGradientAccess().getBackgroundColorColorCrossReference_5_0()); 
            // InternalSiriusTextDsl.g:10712:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:10713:1: ruleQualifiedName
            {
             before(grammarAccess.getGradientAccess().getBackgroundColorColorQualifiedNameParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGradientAccess().getBackgroundColorColorQualifiedNameParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getGradientAccess().getBackgroundColorColorCrossReference_5_0()); 

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
    // $ANTLR end "rule__Gradient__BackgroundColorAssignment_5"


    // $ANTLR start "rule__Gradient__ForegroundColorAssignment_7"
    // InternalSiriusTextDsl.g:10724:1: rule__Gradient__ForegroundColorAssignment_7 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Gradient__ForegroundColorAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10728:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:10729:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:10729:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:10730:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getGradientAccess().getForegroundColorColorCrossReference_7_0()); 
            // InternalSiriusTextDsl.g:10731:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:10732:1: ruleQualifiedName
            {
             before(grammarAccess.getGradientAccess().getForegroundColorColorQualifiedNameParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGradientAccess().getForegroundColorColorQualifiedNameParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getGradientAccess().getForegroundColorColorCrossReference_7_0()); 

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
    // $ANTLR end "rule__Gradient__ForegroundColorAssignment_7"


    // $ANTLR start "rule__Gradient__LabelAlignmentAssignment_9_1"
    // InternalSiriusTextDsl.g:10743:1: rule__Gradient__LabelAlignmentAssignment_9_1 : ( ruleLabelAlignment ) ;
    public final void rule__Gradient__LabelAlignmentAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10747:1: ( ( ruleLabelAlignment ) )
            // InternalSiriusTextDsl.g:10748:1: ( ruleLabelAlignment )
            {
            // InternalSiriusTextDsl.g:10748:1: ( ruleLabelAlignment )
            // InternalSiriusTextDsl.g:10749:1: ruleLabelAlignment
            {
             before(grammarAccess.getGradientAccess().getLabelAlignmentLabelAlignmentEnumRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLabelAlignment();

            state._fsp--;

             after(grammarAccess.getGradientAccess().getLabelAlignmentLabelAlignmentEnumRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Gradient__LabelAlignmentAssignment_9_1"


    // $ANTLR start "rule__Gradient__LabelExpressionAssignment_9_2"
    // InternalSiriusTextDsl.g:10758:1: rule__Gradient__LabelExpressionAssignment_9_2 : ( RULE_EXPRESSION ) ;
    public final void rule__Gradient__LabelExpressionAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10762:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:10763:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:10763:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:10764:1: RULE_EXPRESSION
            {
             before(grammarAccess.getGradientAccess().getLabelExpressionEXPRESSIONTerminalRuleCall_9_2_0()); 
            match(input,RULE_EXPRESSION,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getLabelExpressionEXPRESSIONTerminalRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__Gradient__LabelExpressionAssignment_9_2"


    // $ANTLR start "rule__Gradient__LabelColorAssignment_9_4"
    // InternalSiriusTextDsl.g:10773:1: rule__Gradient__LabelColorAssignment_9_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Gradient__LabelColorAssignment_9_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10777:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:10778:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:10778:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:10779:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getGradientAccess().getLabelColorColorCrossReference_9_4_0()); 
            // InternalSiriusTextDsl.g:10780:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:10781:1: ruleQualifiedName
            {
             before(grammarAccess.getGradientAccess().getLabelColorColorQualifiedNameParserRuleCall_9_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGradientAccess().getLabelColorColorQualifiedNameParserRuleCall_9_4_0_1()); 

            }

             after(grammarAccess.getGradientAccess().getLabelColorColorCrossReference_9_4_0()); 

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
    // $ANTLR end "rule__Gradient__LabelColorAssignment_9_4"


    // $ANTLR start "rule__Gradient__BorderSizeAssignment_10_3"
    // InternalSiriusTextDsl.g:10792:1: rule__Gradient__BorderSizeAssignment_10_3 : ( RULE_INT ) ;
    public final void rule__Gradient__BorderSizeAssignment_10_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10796:1: ( ( RULE_INT ) )
            // InternalSiriusTextDsl.g:10797:1: ( RULE_INT )
            {
            // InternalSiriusTextDsl.g:10797:1: ( RULE_INT )
            // InternalSiriusTextDsl.g:10798:1: RULE_INT
            {
             before(grammarAccess.getGradientAccess().getBorderSizeINTTerminalRuleCall_10_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getBorderSizeINTTerminalRuleCall_10_3_0()); 

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
    // $ANTLR end "rule__Gradient__BorderSizeAssignment_10_3"


    // $ANTLR start "rule__Gradient__BorderColorAssignment_10_5"
    // InternalSiriusTextDsl.g:10807:1: rule__Gradient__BorderColorAssignment_10_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Gradient__BorderColorAssignment_10_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10811:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:10812:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:10812:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:10813:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getGradientAccess().getBorderColorColorCrossReference_10_5_0()); 
            // InternalSiriusTextDsl.g:10814:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:10815:1: ruleQualifiedName
            {
             before(grammarAccess.getGradientAccess().getBorderColorColorQualifiedNameParserRuleCall_10_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGradientAccess().getBorderColorColorQualifiedNameParserRuleCall_10_5_0_1()); 

            }

             after(grammarAccess.getGradientAccess().getBorderColorColorCrossReference_10_5_0()); 

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
    // $ANTLR end "rule__Gradient__BorderColorAssignment_10_5"


    // $ANTLR start "rule__Gradient__IconAssignment_11_2"
    // InternalSiriusTextDsl.g:10826:1: rule__Gradient__IconAssignment_11_2 : ( RULE_STRING ) ;
    public final void rule__Gradient__IconAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10830:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:10831:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:10831:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:10832:1: RULE_STRING
            {
             before(grammarAccess.getGradientAccess().getIconSTRINGTerminalRuleCall_11_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getIconSTRINGTerminalRuleCall_11_2_0()); 

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
    // $ANTLR end "rule__Gradient__IconAssignment_11_2"


    // $ANTLR start "rule__Gradient__HeightComputationExpressionAssignment_12_2"
    // InternalSiriusTextDsl.g:10841:1: rule__Gradient__HeightComputationExpressionAssignment_12_2 : ( RULE_EXPRESSION ) ;
    public final void rule__Gradient__HeightComputationExpressionAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10845:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:10846:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:10846:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:10847:1: RULE_EXPRESSION
            {
             before(grammarAccess.getGradientAccess().getHeightComputationExpressionEXPRESSIONTerminalRuleCall_12_2_0()); 
            match(input,RULE_EXPRESSION,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getHeightComputationExpressionEXPRESSIONTerminalRuleCall_12_2_0()); 

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
    // $ANTLR end "rule__Gradient__HeightComputationExpressionAssignment_12_2"


    // $ANTLR start "rule__Gradient__WidthComputationExpressionAssignment_13_2"
    // InternalSiriusTextDsl.g:10856:1: rule__Gradient__WidthComputationExpressionAssignment_13_2 : ( RULE_EXPRESSION ) ;
    public final void rule__Gradient__WidthComputationExpressionAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10860:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:10861:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:10861:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:10862:1: RULE_EXPRESSION
            {
             before(grammarAccess.getGradientAccess().getWidthComputationExpressionEXPRESSIONTerminalRuleCall_13_2_0()); 
            match(input,RULE_EXPRESSION,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getWidthComputationExpressionEXPRESSIONTerminalRuleCall_13_2_0()); 

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
    // $ANTLR end "rule__Gradient__WidthComputationExpressionAssignment_13_2"


    // $ANTLR start "rule__RelationBasedEdge__DocumentationAssignment_0"
    // InternalSiriusTextDsl.g:10871:1: rule__RelationBasedEdge__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__RelationBasedEdge__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10875:1: ( ( RULE_DOCUMENTATION ) )
            // InternalSiriusTextDsl.g:10876:1: ( RULE_DOCUMENTATION )
            {
            // InternalSiriusTextDsl.g:10876:1: ( RULE_DOCUMENTATION )
            // InternalSiriusTextDsl.g:10877:1: RULE_DOCUMENTATION
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
            match(input,RULE_DOCUMENTATION,FOLLOW_2); 
             after(grammarAccess.getRelationBasedEdgeAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__RelationBasedEdge__DocumentationAssignment_0"


    // $ANTLR start "rule__RelationBasedEdge__NameAssignment_2"
    // InternalSiriusTextDsl.g:10886:1: rule__RelationBasedEdge__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RelationBasedEdge__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10890:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:10891:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:10891:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:10892:1: RULE_ID
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationBasedEdgeAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__RelationBasedEdge__NameAssignment_2"


    // $ANTLR start "rule__RelationBasedEdge__LabelAssignment_3_1"
    // InternalSiriusTextDsl.g:10901:1: rule__RelationBasedEdge__LabelAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__RelationBasedEdge__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10905:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:10906:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:10906:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:10907:1: RULE_STRING
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRelationBasedEdgeAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__RelationBasedEdge__LabelAssignment_3_1"


    // $ANTLR start "rule__RelationBasedEdge__StyleAssignment_5"
    // InternalSiriusTextDsl.g:10916:1: rule__RelationBasedEdge__StyleAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RelationBasedEdge__StyleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10920:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:10921:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:10921:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:10922:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getStyleEdgeStyleCrossReference_5_0()); 
            // InternalSiriusTextDsl.g:10923:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:10924:1: ruleQualifiedName
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getStyleEdgeStyleQualifiedNameParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRelationBasedEdgeAccess().getStyleEdgeStyleQualifiedNameParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRelationBasedEdgeAccess().getStyleEdgeStyleCrossReference_5_0()); 

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
    // $ANTLR end "rule__RelationBasedEdge__StyleAssignment_5"


    // $ANTLR start "rule__RelationBasedEdge__SourceMappingsAssignment_10_0"
    // InternalSiriusTextDsl.g:10935:1: rule__RelationBasedEdge__SourceMappingsAssignment_10_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RelationBasedEdge__SourceMappingsAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10939:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:10940:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:10940:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:10941:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getSourceMappingsMappingCrossReference_10_0_0()); 
            // InternalSiriusTextDsl.g:10942:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:10943:1: ruleQualifiedName
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getSourceMappingsMappingQualifiedNameParserRuleCall_10_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRelationBasedEdgeAccess().getSourceMappingsMappingQualifiedNameParserRuleCall_10_0_0_1()); 

            }

             after(grammarAccess.getRelationBasedEdgeAccess().getSourceMappingsMappingCrossReference_10_0_0()); 

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
    // $ANTLR end "rule__RelationBasedEdge__SourceMappingsAssignment_10_0"


    // $ANTLR start "rule__RelationBasedEdge__SourceMappingsAssignment_10_1_1"
    // InternalSiriusTextDsl.g:10954:1: rule__RelationBasedEdge__SourceMappingsAssignment_10_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RelationBasedEdge__SourceMappingsAssignment_10_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10958:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:10959:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:10959:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:10960:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getSourceMappingsMappingCrossReference_10_1_1_0()); 
            // InternalSiriusTextDsl.g:10961:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:10962:1: ruleQualifiedName
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getSourceMappingsMappingQualifiedNameParserRuleCall_10_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRelationBasedEdgeAccess().getSourceMappingsMappingQualifiedNameParserRuleCall_10_1_1_0_1()); 

            }

             after(grammarAccess.getRelationBasedEdgeAccess().getSourceMappingsMappingCrossReference_10_1_1_0()); 

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
    // $ANTLR end "rule__RelationBasedEdge__SourceMappingsAssignment_10_1_1"


    // $ANTLR start "rule__RelationBasedEdge__TargetMappingsAssignment_15_0"
    // InternalSiriusTextDsl.g:10973:1: rule__RelationBasedEdge__TargetMappingsAssignment_15_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RelationBasedEdge__TargetMappingsAssignment_15_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10977:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:10978:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:10978:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:10979:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getTargetMappingsMappingCrossReference_15_0_0()); 
            // InternalSiriusTextDsl.g:10980:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:10981:1: ruleQualifiedName
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getTargetMappingsMappingQualifiedNameParserRuleCall_15_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRelationBasedEdgeAccess().getTargetMappingsMappingQualifiedNameParserRuleCall_15_0_0_1()); 

            }

             after(grammarAccess.getRelationBasedEdgeAccess().getTargetMappingsMappingCrossReference_15_0_0()); 

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
    // $ANTLR end "rule__RelationBasedEdge__TargetMappingsAssignment_15_0"


    // $ANTLR start "rule__RelationBasedEdge__TargetMappingsAssignment_15_1_1"
    // InternalSiriusTextDsl.g:10992:1: rule__RelationBasedEdge__TargetMappingsAssignment_15_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RelationBasedEdge__TargetMappingsAssignment_15_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:10996:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:10997:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:10997:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:10998:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getTargetMappingsMappingCrossReference_15_1_1_0()); 
            // InternalSiriusTextDsl.g:10999:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:11000:1: ruleQualifiedName
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getTargetMappingsMappingQualifiedNameParserRuleCall_15_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRelationBasedEdgeAccess().getTargetMappingsMappingQualifiedNameParserRuleCall_15_1_1_0_1()); 

            }

             after(grammarAccess.getRelationBasedEdgeAccess().getTargetMappingsMappingCrossReference_15_1_1_0()); 

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
    // $ANTLR end "rule__RelationBasedEdge__TargetMappingsAssignment_15_1_1"


    // $ANTLR start "rule__RelationBasedEdge__TargetFinderExpressionAssignment_19"
    // InternalSiriusTextDsl.g:11011:1: rule__RelationBasedEdge__TargetFinderExpressionAssignment_19 : ( RULE_EXPRESSION ) ;
    public final void rule__RelationBasedEdge__TargetFinderExpressionAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:11015:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:11016:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:11016:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:11017:1: RULE_EXPRESSION
            {
             before(grammarAccess.getRelationBasedEdgeAccess().getTargetFinderExpressionEXPRESSIONTerminalRuleCall_19_0()); 
            match(input,RULE_EXPRESSION,FOLLOW_2); 
             after(grammarAccess.getRelationBasedEdgeAccess().getTargetFinderExpressionEXPRESSIONTerminalRuleCall_19_0()); 

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
    // $ANTLR end "rule__RelationBasedEdge__TargetFinderExpressionAssignment_19"


    // $ANTLR start "rule__EdgeStyle__NameAssignment_1"
    // InternalSiriusTextDsl.g:11026:1: rule__EdgeStyle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EdgeStyle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:11030:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:11031:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:11031:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:11032:1: RULE_ID
            {
             before(grammarAccess.getEdgeStyleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEdgeStyleAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__EdgeStyle__NameAssignment_1"


    // $ANTLR start "rule__EdgeStyle__StrokeColorAssignment_3"
    // InternalSiriusTextDsl.g:11041:1: rule__EdgeStyle__StrokeColorAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EdgeStyle__StrokeColorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:11045:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:11046:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:11046:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:11047:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getEdgeStyleAccess().getStrokeColorColorCrossReference_3_0()); 
            // InternalSiriusTextDsl.g:11048:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:11049:1: ruleQualifiedName
            {
             before(grammarAccess.getEdgeStyleAccess().getStrokeColorColorQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEdgeStyleAccess().getStrokeColorColorQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getEdgeStyleAccess().getStrokeColorColorCrossReference_3_0()); 

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
    // $ANTLR end "rule__EdgeStyle__StrokeColorAssignment_3"


    // $ANTLR start "rule__EdgeStyle__LineStyleAssignment_4_2"
    // InternalSiriusTextDsl.g:11060:1: rule__EdgeStyle__LineStyleAssignment_4_2 : ( ruleLineStyle ) ;
    public final void rule__EdgeStyle__LineStyleAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:11064:1: ( ( ruleLineStyle ) )
            // InternalSiriusTextDsl.g:11065:1: ( ruleLineStyle )
            {
            // InternalSiriusTextDsl.g:11065:1: ( ruleLineStyle )
            // InternalSiriusTextDsl.g:11066:1: ruleLineStyle
            {
             before(grammarAccess.getEdgeStyleAccess().getLineStyleLineStyleEnumRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLineStyle();

            state._fsp--;

             after(grammarAccess.getEdgeStyleAccess().getLineStyleLineStyleEnumRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__EdgeStyle__LineStyleAssignment_4_2"


    // $ANTLR start "rule__EdgeStyle__RoutingStyleAssignment_5_2"
    // InternalSiriusTextDsl.g:11075:1: rule__EdgeStyle__RoutingStyleAssignment_5_2 : ( ruleRoutingStyle ) ;
    public final void rule__EdgeStyle__RoutingStyleAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:11079:1: ( ( ruleRoutingStyle ) )
            // InternalSiriusTextDsl.g:11080:1: ( ruleRoutingStyle )
            {
            // InternalSiriusTextDsl.g:11080:1: ( ruleRoutingStyle )
            // InternalSiriusTextDsl.g:11081:1: ruleRoutingStyle
            {
             before(grammarAccess.getEdgeStyleAccess().getRoutingStyleRoutingStyleEnumRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRoutingStyle();

            state._fsp--;

             after(grammarAccess.getEdgeStyleAccess().getRoutingStyleRoutingStyleEnumRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__EdgeStyle__RoutingStyleAssignment_5_2"


    // $ANTLR start "rule__EdgeStyle__SourceArrowAssignment_7_2"
    // InternalSiriusTextDsl.g:11090:1: rule__EdgeStyle__SourceArrowAssignment_7_2 : ( ruleArrowDecorator ) ;
    public final void rule__EdgeStyle__SourceArrowAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:11094:1: ( ( ruleArrowDecorator ) )
            // InternalSiriusTextDsl.g:11095:1: ( ruleArrowDecorator )
            {
            // InternalSiriusTextDsl.g:11095:1: ( ruleArrowDecorator )
            // InternalSiriusTextDsl.g:11096:1: ruleArrowDecorator
            {
             before(grammarAccess.getEdgeStyleAccess().getSourceArrowArrowDecoratorEnumRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArrowDecorator();

            state._fsp--;

             after(grammarAccess.getEdgeStyleAccess().getSourceArrowArrowDecoratorEnumRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__EdgeStyle__SourceArrowAssignment_7_2"


    // $ANTLR start "rule__EdgeStyle__TargetArrowAssignment_8_2"
    // InternalSiriusTextDsl.g:11105:1: rule__EdgeStyle__TargetArrowAssignment_8_2 : ( ruleArrowDecorator ) ;
    public final void rule__EdgeStyle__TargetArrowAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:11109:1: ( ( ruleArrowDecorator ) )
            // InternalSiriusTextDsl.g:11110:1: ( ruleArrowDecorator )
            {
            // InternalSiriusTextDsl.g:11110:1: ( ruleArrowDecorator )
            // InternalSiriusTextDsl.g:11111:1: ruleArrowDecorator
            {
             before(grammarAccess.getEdgeStyleAccess().getTargetArrowArrowDecoratorEnumRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArrowDecorator();

            state._fsp--;

             after(grammarAccess.getEdgeStyleAccess().getTargetArrowArrowDecoratorEnumRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__EdgeStyle__TargetArrowAssignment_8_2"


    // $ANTLR start "rule__EdgeStyle__SizeComputationExpressionAssignment_9_2"
    // InternalSiriusTextDsl.g:11120:1: rule__EdgeStyle__SizeComputationExpressionAssignment_9_2 : ( RULE_EXPRESSION ) ;
    public final void rule__EdgeStyle__SizeComputationExpressionAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:11124:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:11125:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:11125:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:11126:1: RULE_EXPRESSION
            {
             before(grammarAccess.getEdgeStyleAccess().getSizeComputationExpressionEXPRESSIONTerminalRuleCall_9_2_0()); 
            match(input,RULE_EXPRESSION,FOLLOW_2); 
             after(grammarAccess.getEdgeStyleAccess().getSizeComputationExpressionEXPRESSIONTerminalRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__EdgeStyle__SizeComputationExpressionAssignment_9_2"


    // $ANTLR start "rule__EdgeStyle__FoldingStyleAssignment_10_2"
    // InternalSiriusTextDsl.g:11135:1: rule__EdgeStyle__FoldingStyleAssignment_10_2 : ( ruleFoldingStyle ) ;
    public final void rule__EdgeStyle__FoldingStyleAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:11139:1: ( ( ruleFoldingStyle ) )
            // InternalSiriusTextDsl.g:11140:1: ( ruleFoldingStyle )
            {
            // InternalSiriusTextDsl.g:11140:1: ( ruleFoldingStyle )
            // InternalSiriusTextDsl.g:11141:1: ruleFoldingStyle
            {
             before(grammarAccess.getEdgeStyleAccess().getFoldingStyleFoldingStyleEnumRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFoldingStyle();

            state._fsp--;

             after(grammarAccess.getEdgeStyleAccess().getFoldingStyleFoldingStyleEnumRuleCall_10_2_0()); 

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
    // $ANTLR end "rule__EdgeStyle__FoldingStyleAssignment_10_2"


    // $ANTLR start "rule__EdgeStyle__EndsCenteringAssignment_11_2"
    // InternalSiriusTextDsl.g:11150:1: rule__EdgeStyle__EndsCenteringAssignment_11_2 : ( ruleEndsCentering ) ;
    public final void rule__EdgeStyle__EndsCenteringAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:11154:1: ( ( ruleEndsCentering ) )
            // InternalSiriusTextDsl.g:11155:1: ( ruleEndsCentering )
            {
            // InternalSiriusTextDsl.g:11155:1: ( ruleEndsCentering )
            // InternalSiriusTextDsl.g:11156:1: ruleEndsCentering
            {
             before(grammarAccess.getEdgeStyleAccess().getEndsCenteringEndsCenteringEnumRuleCall_11_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEndsCentering();

            state._fsp--;

             after(grammarAccess.getEdgeStyleAccess().getEndsCenteringEndsCenteringEnumRuleCall_11_2_0()); 

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
    // $ANTLR end "rule__EdgeStyle__EndsCenteringAssignment_11_2"


    // $ANTLR start "rule__Palette__DocumentationAssignment_0"
    // InternalSiriusTextDsl.g:11165:1: rule__Palette__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__Palette__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:11169:1: ( ( RULE_DOCUMENTATION ) )
            // InternalSiriusTextDsl.g:11170:1: ( RULE_DOCUMENTATION )
            {
            // InternalSiriusTextDsl.g:11170:1: ( RULE_DOCUMENTATION )
            // InternalSiriusTextDsl.g:11171:1: RULE_DOCUMENTATION
            {
             before(grammarAccess.getPaletteAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
            match(input,RULE_DOCUMENTATION,FOLLOW_2); 
             after(grammarAccess.getPaletteAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Palette__DocumentationAssignment_0"


    // $ANTLR start "rule__Palette__NameAssignment_2"
    // InternalSiriusTextDsl.g:11180:1: rule__Palette__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Palette__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:11184:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:11185:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:11185:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:11186:1: RULE_ID
            {
             before(grammarAccess.getPaletteAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPaletteAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Palette__NameAssignment_2"


    // $ANTLR start "rule__Palette__ColorsAssignment_4"
    // InternalSiriusTextDsl.g:11195:1: rule__Palette__ColorsAssignment_4 : ( ruleColor ) ;
    public final void rule__Palette__ColorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:11199:1: ( ( ruleColor ) )
            // InternalSiriusTextDsl.g:11200:1: ( ruleColor )
            {
            // InternalSiriusTextDsl.g:11200:1: ( ruleColor )
            // InternalSiriusTextDsl.g:11201:1: ruleColor
            {
             before(grammarAccess.getPaletteAccess().getColorsColorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getPaletteAccess().getColorsColorParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Palette__ColorsAssignment_4"


    // $ANTLR start "rule__Color__NameAssignment_1"
    // InternalSiriusTextDsl.g:11210:1: rule__Color__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Color__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:11214:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:11215:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:11215:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:11216:1: RULE_ID
            {
             before(grammarAccess.getColorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Color__NameAssignment_1"


    // $ANTLR start "rule__Color__ValueAssignment_3"
    // InternalSiriusTextDsl.g:11225:1: rule__Color__ValueAssignment_3 : ( ruleColorValue ) ;
    public final void rule__Color__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:11229:1: ( ( ruleColorValue ) )
            // InternalSiriusTextDsl.g:11230:1: ( ruleColorValue )
            {
            // InternalSiriusTextDsl.g:11230:1: ( ruleColorValue )
            // InternalSiriusTextDsl.g:11231:1: ruleColorValue
            {
             before(grammarAccess.getColorAccess().getValueColorValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleColorValue();

            state._fsp--;

             after(grammarAccess.getColorAccess().getValueColorValueParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Color__ValueAssignment_3"


    // $ANTLR start "rule__RGB__RedAssignment_1"
    // InternalSiriusTextDsl.g:11240:1: rule__RGB__RedAssignment_1 : ( RULE_INT ) ;
    public final void rule__RGB__RedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:11244:1: ( ( RULE_INT ) )
            // InternalSiriusTextDsl.g:11245:1: ( RULE_INT )
            {
            // InternalSiriusTextDsl.g:11245:1: ( RULE_INT )
            // InternalSiriusTextDsl.g:11246:1: RULE_INT
            {
             before(grammarAccess.getRGBAccess().getRedINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRGBAccess().getRedINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__RGB__RedAssignment_1"


    // $ANTLR start "rule__RGB__GreenAssignment_3"
    // InternalSiriusTextDsl.g:11255:1: rule__RGB__GreenAssignment_3 : ( RULE_INT ) ;
    public final void rule__RGB__GreenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:11259:1: ( ( RULE_INT ) )
            // InternalSiriusTextDsl.g:11260:1: ( RULE_INT )
            {
            // InternalSiriusTextDsl.g:11260:1: ( RULE_INT )
            // InternalSiriusTextDsl.g:11261:1: RULE_INT
            {
             before(grammarAccess.getRGBAccess().getGreenINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRGBAccess().getGreenINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__RGB__GreenAssignment_3"


    // $ANTLR start "rule__RGB__BlueAssignment_5"
    // InternalSiriusTextDsl.g:11270:1: rule__RGB__BlueAssignment_5 : ( RULE_INT ) ;
    public final void rule__RGB__BlueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:11274:1: ( ( RULE_INT ) )
            // InternalSiriusTextDsl.g:11275:1: ( RULE_INT )
            {
            // InternalSiriusTextDsl.g:11275:1: ( RULE_INT )
            // InternalSiriusTextDsl.g:11276:1: RULE_INT
            {
             before(grammarAccess.getRGBAccess().getBlueINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRGBAccess().getBlueINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__RGB__BlueAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0040060000000020L,0x0000001E20220112L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000500000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000400000000022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000400000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0030900000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0040000000000020L,0x0000000E00000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0108000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0400200000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0800080000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xF000100000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000020L,0x0000001000000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000100L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0010100000000000L,0x000000000001A800L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000080000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000100000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x00000003FF800000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000003C00000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000020L,0x0000000020000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000100000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});

}